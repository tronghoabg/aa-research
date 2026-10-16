package com.google.android.gearhead.feedback.hats;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class HatsLapseDetector {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.HatsLapseDetector");
    public final android.content.Context b;
    public final android.app.job.JobScheduler c;

    public HatsLapseDetector(android.content.Context context) {
        this.b = context;
        this.c = (android.app.job.JobScheduler) context.getSystemService("jobscheduler");
    }
}
