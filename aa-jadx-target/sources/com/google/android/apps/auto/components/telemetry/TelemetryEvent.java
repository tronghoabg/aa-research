package com.google.android.apps.auto.components.telemetry;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class TelemetryEvent extends com.google.android.gearhead.sdk.assistant.AbstractBundleable {
    public static final android.os.Parcelable.Creator<com.google.android.apps.auto.components.telemetry.TelemetryEvent> CREATOR = new defpackage.qjv(com.google.android.apps.auto.components.telemetry.TelemetryEvent.class);
    public defpackage.yyh a;
    public defpackage.yyg b;
    public java.util.ArrayList c;
    public int d;

    public TelemetryEvent(defpackage.yyh yyhVar, defpackage.yyg yygVar) {
        this.a = defpackage.yyh.UNKNOWN_EVENT_TYPE;
        this.c = new java.util.ArrayList();
        this.a = yyhVar;
        this.b = yygVar;
    }

    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    public final void a(android.os.Bundle bundle) {
        this.a = defpackage.yyh.b(bundle.getInt("EVENT_TYPE"));
        try {
            byte[] byteArray = bundle.getByteArray("GENERATED_MILLIS");
            defpackage.abox aboxVarD = defpackage.abox.D(defpackage.yyg.a, byteArray, 0, byteArray.length, defpackage.abol.a);
            defpackage.abox.U(aboxVarD);
            this.b = (defpackage.yyg) aboxVarD;
        } catch (defpackage.abpp unused) {
            this.b = defpackage.yyg.a;
        }
        this.c = bundle.getIntegerArrayList("TESTCODES");
        this.d = bundle.getInt("LINKED_SESSION");
    }

    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    protected final void b(android.os.Bundle bundle) {
        bundle.putInt("EVENT_TYPE", this.a.aw);
        bundle.putByteArray("GENERATED_MILLIS", this.b.h());
        bundle.putIntegerArrayList("TESTCODES", this.c);
        bundle.putInt("LINKED_SESSION", this.d);
    }

    public final void c(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            this.c.add(java.lang.Integer.valueOf(((defpackage.acbk) it.next()).a()));
        }
    }

    public final void d() {
        this.d = 1;
    }

    public TelemetryEvent() {
        this.a = defpackage.yyh.UNKNOWN_EVENT_TYPE;
        this.c = new java.util.ArrayList();
    }
}
