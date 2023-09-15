import csv

def get_csv(filename):
    dat=[]
    with open(filename) as fobj:
        for row in csv.DictReader(fobj,delimiter=','):
            dat.append(row)
    return dat;    

def write_csv(lst,filename):
    if len(lst) == 0:
        return False
    with open(filename,'w') as fobj:
        for key in lst[0].keys():
            fobj.write(key)
            fobj.write(',')
        fobj.write('\n')
        for i in range(len(lst)):
            for key,value in lst[i].items():
                fobj.write(value)
                fobj.write(',')
            fobj.write('\n')

    return True 