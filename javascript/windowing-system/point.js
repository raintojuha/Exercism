export function Point(){
    this._x = 0;
    this._y = 0;
}

Point.prototype.move = function(x, y){
    this._x = x;
    this._y = y;
}

Point.prototype.getX = function(){
    return this._x;
}

Point.prototype.getY = function(){
    return this._y;
}