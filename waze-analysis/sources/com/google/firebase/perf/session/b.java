package com.google.firebase.perf.session;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.e.m;
import com.google.firebase.perf.f.ag;
import com.google.firebase.perf.f.ah;
import com.google.firebase.perf.f.ak;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f10559a;

    /* renamed from: b, reason: collision with root package name */
    private final m f10560b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f10561c;

    /* synthetic */ b(Parcel parcel) {
        this.f10561c = false;
        this.f10559a = parcel.readString();
        this.f10561c = parcel.readByte() != 0;
        this.f10560b = (m) parcel.readParcelable(m.class.getClassLoader());
    }

    public static b a(String str) {
        b bVar = new b(str.replace("-", ""));
        com.google.firebase.perf.config.a aVarO = com.google.firebase.perf.config.a.o();
        boolean z = false;
        if (aVarO.u() && Math.random() < aVarO.c()) {
            z = true;
        }
        bVar.f10561c = z;
        return bVar;
    }

    public static ah[] g(List list) {
        if (list.isEmpty()) {
            return null;
        }
        ah[] ahVarArr = new ah[list.size()];
        ah ahVarC = ((b) list.get(0)).c();
        boolean z = false;
        for (int i2 = 1; i2 < list.size(); i2++) {
            ah ahVarC2 = ((b) list.get(i2)).c();
            if (z) {
                z = true;
            } else if (((b) list.get(i2)).f10561c) {
                ahVarArr[0] = ahVarC2;
                ahVarArr[i2] = ahVarC;
                z = true;
            } else {
                z = false;
            }
            ahVarArr[i2] = ahVarC2;
        }
        if (!z) {
            ahVarArr[0] = ahVarC;
        }
        return ahVarArr;
    }

    public final m b() {
        return this.f10560b;
    }

    public final ah c() {
        ag agVarNewBuilder = ah.newBuilder();
        agVarNewBuilder.b(this.f10559a);
        if (this.f10561c) {
            agVarNewBuilder.a(ak.GAUGES_AND_SYSTEM_EVENTS);
        }
        return agVarNewBuilder.build();
    }

    public final String d() {
        return this.f10559a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.f10561c;
    }

    public final boolean f() {
        m mVar = this.f10560b;
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        return mVar.b() / 60000000 > com.google.firebase.perf.config.a.o().j();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f10559a);
        parcel.writeByte(this.f10561c ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f10560b, 0);
    }

    public b(String str) {
        this.f10561c = false;
        this.f10559a = str;
        this.f10560b = new m();
    }
}
