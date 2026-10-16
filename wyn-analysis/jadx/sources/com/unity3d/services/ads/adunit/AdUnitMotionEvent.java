package com.unity3d.services.ads.adunit;

/* loaded from: classes4.dex */
public class AdUnitMotionEvent {
    private int _action;
    private int _deviceId;
    private long _eventTime;
    private boolean _isObscured;
    private float _pressure;
    private float _size;
    private int _source;
    private int _toolType;
    private float _x;
    private float _y;

    public AdUnitMotionEvent(int i5, boolean z2, int i10, int i11, int i12, float f10, float f11, long j8, float f12, float f13) {
        this._action = i5;
        this._isObscured = z2;
        this._toolType = i10;
        this._source = i11;
        this._deviceId = i12;
        this._x = f10;
        this._y = f11;
        this._eventTime = j8;
        this._pressure = f12;
        this._size = f13;
    }

    public int getAction() {
        return this._action;
    }

    public int getDeviceId() {
        return this._deviceId;
    }

    public long getEventTime() {
        return this._eventTime;
    }

    public float getPressure() {
        return this._pressure;
    }

    public float getSize() {
        return this._size;
    }

    public int getSource() {
        return this._source;
    }

    public int getToolType() {
        return this._toolType;
    }

    public float getX() {
        return this._x;
    }

    public float getY() {
        return this._y;
    }

    public boolean isObscured() {
        return this._isObscured;
    }
}
