package com.google.android.gms.car.senderprotocol;

import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import defpackage.abnp;
import defpackage.ols;
import defpackage.omc;
import defpackage.rlc;
import defpackage.rrn;
import defpackage.rsp;
import defpackage.rsq;
import defpackage.rss;
import defpackage.rta;
import defpackage.rtb;
import defpackage.rtc;
import defpackage.rvj;
import defpackage.rvz;
import defpackage.vqk;
import defpackage.xiq;
import defpackage.ypf;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class Channel implements rtc {
    public static final ypf a = ols.R("CAR.GAL.GAL");
    private static final vqk m = new vqk("debug.car.channel_lock_latency");
    private static final vqk n = new vqk("debug.car.channel_send_latency");
    public final int b;
    public final rsq c;
    public final rsp d;
    public final int e;
    public final rvz f;
    public final rta g;
    public boolean i;
    public final Handler l;
    public final Object k = new Object();
    public final rss j = new rss(this);
    public int h = 4;

    /* loaded from: classes2.dex */
    public static abstract class FlattenedChannel implements Parcelable {
        public static final Parcelable.Creator<FlattenedChannel> CREATOR = new rrn(18);

        public abstract int a();

        public abstract int b();

        public abstract int c();

        public abstract rvz d();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(a());
            parcel.writeInt(b());
            parcel.writeInt(c());
            parcel.writeString(d().name());
        }
    }

    public Channel(int i, int i2, rvz rvzVar, rta rtaVar, rsq rsqVar, rsp rspVar, Handler handler) {
        this.b = i;
        this.e = i2;
        this.f = rvzVar;
        this.d = rspVar;
        this.g = rtaVar;
        this.c = rsqVar;
        this.l = handler;
    }

    @Override // defpackage.rtc
    public final int a() {
        return this.b;
    }

    public final void b() {
        synchronized (this.k) {
            if (this.h != 0) {
                return;
            }
            this.h = 1;
            rta rtaVar = this.g;
            int i = this.b;
            int i2 = this.e;
            abnp abnpVarN = xiq.a.n();
            int iH = omc.h(Integer.valueOf(i2));
            abnpVarN.t();
            xiq xiqVar = (xiq) abnpVarN.b;
            xiqVar.b |= 1;
            xiqVar.c = iH;
            int iH2 = omc.h(Integer.valueOf(i));
            abnpVarN.t();
            xiq xiqVar2 = (xiq) abnpVarN.b;
            xiqVar2.b |= 2;
            xiqVar2.d = iH2;
            xiq xiqVar3 = (xiq) abnpVarN.q();
            ByteBuffer byteBufferA = rvj.a.a(xiqVar3.e(null) + 2);
            byteBufferA.putShort((short) 7);
            byteBufferA.put(xiqVar3.h());
            rtaVar.h(i, byteBufferA, false, true, new rtb(true, false, 0));
        }
    }

    public final void c() {
        this.h = 2;
    }

    public final void d() {
        int i;
        synchronized (this.k) {
            a.l().ai(8250).w("Force closing channel %d", this.b);
            i = this.h;
            this.h = 4;
        }
        if (i == 2) {
            this.d.u(1);
        }
    }

    @Override // defpackage.rtc
    public final void e(ByteBuffer byteBuffer, rtb rtbVar) {
        ByteBuffer byteBuffer2;
        vqk vqkVar = m;
        long jElapsedRealtime = (rlc.a(vqkVar) || rlc.a(n)) ? SystemClock.elapsedRealtime() : 0L;
        synchronized (this.k) {
            if (rlc.a(vqkVar)) {
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                if (jElapsedRealtime2 > 5) {
                    a.l().ai(8253).x("sendMessage lock delayed %d", jElapsedRealtime2);
                }
            }
            if (this.h != 2) {
                throw new IllegalStateException("Channel must be open before sending a message.");
            }
            rta rtaVar = this.g;
            int i = this.b;
            if (rtaVar.f) {
                byteBuffer2 = byteBuffer;
            } else {
                byteBuffer2 = byteBuffer;
                rtaVar.h(i, byteBuffer2, true, false, rtbVar);
            }
            if (rlc.a(n)) {
                long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                if (jElapsedRealtime3 > 10) {
                    a.l().ai(8252).F("sendMessage sending delayed %d size %d", jElapsedRealtime3, byteBuffer2.position());
                }
            }
        }
    }
}
