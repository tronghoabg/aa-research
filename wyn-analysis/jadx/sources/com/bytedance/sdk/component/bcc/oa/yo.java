package com.bytedance.sdk.component.bcc.oa;

/* loaded from: classes.dex */
public abstract class yo implements Comparable<yo>, Runnable {
    public static final int EIGHTH_PRIORITY = 8;
    public static final int FIFTH_PRIORITY = 5;
    public static final int FOURTH_PRIORITY = 4;
    public static final int MAX_PRIORITY = 10;
    public static final int MIN_PRIORITY = 1;
    public static final int NINTH_PRIORITY = 9;
    public static final int SECOND_PRIORITY = 2;
    public static final int SEVENTH_PRIORITY = 7;
    public static final int SIXTH_PRIORITY = 6;
    public static final int THIRD_PRIORITY = 3;
    private long ivm;
    private long lw;
    private long moa;

    /* renamed from: oa, reason: collision with root package name */
    private String f24960oa;
    private int uef;
    private Runnable yo;

    public yo(String str) {
        this.uef = 5;
        this.f24960oa = str;
    }

    public long getAfterTimestamp() {
        return this.ivm;
    }

    public long getBeforeTimestamp() {
        return this.lw;
    }

    public String getName() {
        return this.f24960oa;
    }

    public int getPriority() {
        return this.uef;
    }

    public long getRunTime() {
        return this.ivm - this.lw;
    }

    public long getSubmitTimestamp() {
        return this.moa;
    }

    public Runnable getTarget() {
        return this.yo;
    }

    public long getWaitTime() {
        return this.lw - this.moa;
    }

    public void setAfterTimestamp(long j8) {
        this.ivm = j8;
    }

    public void setBeforeTimestamp(long j8) {
        this.lw = j8;
    }

    public void setPriority(int i5) {
        this.uef = i5;
    }

    public void setSubmitTimestamp(long j8) {
        this.moa = j8;
    }

    public void setTarget(Runnable runnable) {
        this.yo = runnable;
    }

    @Override // java.lang.Comparable
    public int compareTo(yo yoVar) {
        if (getPriority() < yoVar.getPriority()) {
            return 1;
        }
        return getPriority() >= yoVar.getPriority() ? -1 : 0;
    }

    public yo(String str, int i5) {
        this.uef = i5;
        this.f24960oa = str;
    }

    public yo(int i5, String str, Runnable runnable) {
        this.uef = i5;
        this.f24960oa = str;
        this.yo = runnable;
    }

    public yo(String str, Runnable runnable) {
        this.uef = 5;
        this.f24960oa = str;
        this.yo = runnable;
    }
}
