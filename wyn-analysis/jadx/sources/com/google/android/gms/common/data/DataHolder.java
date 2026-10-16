package com.google.android.gms.common.data;

import a.AbstractC1304a;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import c6.C1559a;
import com.google.android.gms.common.annotation.KeepName;
import f7.AbstractC2614a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

@KeepName
/* loaded from: classes3.dex */
public final class DataHolder extends AbstractC2614a implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new C1559a(29);

    /* renamed from: a, reason: collision with root package name */
    public final int f26569a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f26570b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f26571c;

    /* renamed from: d, reason: collision with root package name */
    public final CursorWindow[] f26572d;

    /* renamed from: e, reason: collision with root package name */
    public final int f26573e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f26574f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f26575g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f26576h = false;

    static {
        new ArrayList();
        new HashMap();
    }

    public DataHolder(int i5, String[] strArr, CursorWindow[] cursorWindowArr, int i10, Bundle bundle) {
        this.f26569a = i5;
        this.f26570b = strArr;
        this.f26572d = cursorWindowArr;
        this.f26573e = i10;
        this.f26574f = bundle;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            try {
                if (!this.f26576h) {
                    this.f26576h = true;
                    int i5 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.f26572d;
                        if (i5 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i5].close();
                        i5++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void finalize() throws Throwable {
        boolean z2;
        try {
            if (this.f26572d.length > 0) {
                synchronized (this) {
                    z2 = this.f26576h;
                }
                if (!z2) {
                    close();
                    Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + toString() + ")");
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.b0(parcel, 1, this.f26570b, false);
        AbstractC1304a.d0(parcel, 2, this.f26572d, i5);
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(this.f26573e);
        AbstractC1304a.S(parcel, 4, this.f26574f, false);
        AbstractC1304a.k0(parcel, 1000, 4);
        parcel.writeInt(this.f26569a);
        AbstractC1304a.m0(iL0, parcel);
        if ((i5 & 1) != 0) {
            close();
        }
    }
}
