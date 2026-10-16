package com.google.d.b;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ak<T> implements Serializable, aj {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    final aj f7212a;

    /* renamed from: b, reason: collision with root package name */
    volatile transient boolean f7213b;

    /* renamed from: c, reason: collision with root package name */
    transient Object f7214c;

    /* renamed from: d, reason: collision with root package name */
    private transient com.waze.car_lib.b.v f7215d = new com.waze.car_lib.b.v((char[]) null);

    ak(aj ajVar) {
        an.B(ajVar);
        this.f7212a = ajVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f7215d = new com.waze.car_lib.b.v((char[]) null);
    }

    @Override // com.google.d.b.aj
    public final T get() {
        if (!this.f7213b) {
            synchronized (this.f7215d) {
                if (!this.f7213b) {
                    T t = (T) this.f7212a.get();
                    this.f7214c = t;
                    this.f7213b = true;
                    return t;
                }
            }
        }
        return (T) this.f7214c;
    }

    public final String toString() {
        Object obj;
        if (this.f7213b) {
            obj = "<supplier that returned " + String.valueOf(this.f7214c) + ">";
        } else {
            obj = this.f7212a;
        }
        return "Suppliers.memoize(" + obj.toString() + ")";
    }
}
