import json

def get_json(filename):
    with open(filename) as fobj:
        val = json.load(fobj)
        return val

def write_json(obj,filename):
    try:
        with open(filename,'w') as fobj:
            json.dump(obj,fobj)
    except FileNotFoundError:
        return False
    return True 