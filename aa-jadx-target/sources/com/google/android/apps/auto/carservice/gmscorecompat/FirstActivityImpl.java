package com.google.android.apps.auto.carservice.gmscorecompat;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class FirstActivityImpl extends com.google.android.gms.carsetup.FirstActivityImpl {
    @Override // com.google.android.gms.carsetup.FirstActivityImpl
    protected final defpackage.ryk o() {
        return defpackage.ryk.b(this, new defpackage.xys(new defpackage.jne(2)), new defpackage.jnf(2));
    }

    @Override // com.google.android.gms.carsetup.FirstActivityImpl
    protected final void p(android.content.Intent intent) {
        intent.putExtra("start_foreground_immediately", true);
        a$.ExternalSyntheticApiModelOutline1.m(this, intent);
    }
}
