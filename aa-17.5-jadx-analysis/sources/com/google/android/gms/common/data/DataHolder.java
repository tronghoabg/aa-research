package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.sht;
import defpackage.spu;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new sht(10);
    final int a;
    public final String[] b;
    public Bundle c;
    public final CursorWindow[] d;
    public final int e;
    public final Bundle f;
    public int[] g;
    int h = 1;
    private final boolean i = true;

    static {
        new ArrayList();
        new HashMap();
    }

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.a = i;
        this.b = strArr;
        this.d = cursorWindowArr;
        this.e = i2;
        this.f = bundle;
    }

    public final void a() {
        synchronized (this) {
            int i = this.h - 1;
            this.h = i;
            if (i == 0) {
                for (CursorWindow cursorWindow : this.d) {
                    cursorWindow.releaseReference();
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    protected final void finalize() throws Throwable {
        int i;
        try {
            if (this.i && this.d.length > 0) {
                synchronized (this) {
                    i = this.h;
                }
                if (i > 0) {
                    synchronized (this) {
                        if (this.h > 1) {
                            this.h = 1;
                        }
                        a();
                    }
                    Log.e("DataBuffer", a.bW(this, "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ", ")"));
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String[] strArr = this.b;
        int iL = spu.l(parcel, 20293);
        spu.G(parcel, 1, strArr);
        spu.I(parcel, 2, this.d, i);
        spu.r(parcel, 3, this.e);
        spu.u(parcel, 4, this.f);
        spu.r(parcel, 1000, this.a);
        spu.m(parcel, iL);
        if ((i & 1) != 0) {
            a();
        }
    }
}
