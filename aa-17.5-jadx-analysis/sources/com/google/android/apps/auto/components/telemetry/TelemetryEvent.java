package com.google.android.apps.auto.components.telemetry;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gearhead.sdk.assistant.AbstractBundleable;
import defpackage.abnj;
import defpackage.abnv;
import defpackage.abon;
import defpackage.acai;
import defpackage.qiz;
import defpackage.yxb;
import defpackage.yxc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class TelemetryEvent extends AbstractBundleable {
    public static final Parcelable.Creator<TelemetryEvent> CREATOR = new qiz(TelemetryEvent.class);
    public yxc a;
    public yxb b;
    public ArrayList c;
    public int d;

    public TelemetryEvent(yxc yxcVar, yxb yxbVar) {
        this.a = yxc.UNKNOWN_EVENT_TYPE;
        this.c = new ArrayList();
        this.a = yxcVar;
        this.b = yxbVar;
    }

    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    public final void a(Bundle bundle) {
        this.a = yxc.b(bundle.getInt("EVENT_TYPE"));
        try {
            byte[] byteArray = bundle.getByteArray("GENERATED_MILLIS");
            abnv abnvVarD = abnv.D(yxb.a, byteArray, 0, byteArray.length, abnj.a);
            abnv.U(abnvVarD);
            this.b = (yxb) abnvVarD;
        } catch (abon unused) {
            this.b = yxb.a;
        }
        this.c = bundle.getIntegerArrayList("TESTCODES");
        this.d = bundle.getInt("LINKED_SESSION");
    }

    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    protected final void b(Bundle bundle) {
        bundle.putInt("EVENT_TYPE", this.a.aw);
        bundle.putByteArray("GENERATED_MILLIS", this.b.h());
        bundle.putIntegerArrayList("TESTCODES", this.c);
        bundle.putInt("LINKED_SESSION", this.d);
    }

    public final void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.c.add(Integer.valueOf(((acai) it.next()).a()));
        }
    }

    public final void d() {
        this.d = 1;
    }

    public TelemetryEvent() {
        this.a = yxc.UNKNOWN_EVENT_TYPE;
        this.c = new ArrayList();
    }
}
