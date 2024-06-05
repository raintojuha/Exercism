export function Size(width, height){
    this._width = width;
    this._height = height;
}

Size.prototype.resize = function(width, height) {
    this._width = width;
    this._height = height;
};

Size.prototype.getWidth = function(){
    return this._width;
};

Size.prototype.getHeight = function(){
    return this._height;
}