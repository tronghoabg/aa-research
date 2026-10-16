package com.waze.sharedui.utils;

import androidx.camera.video.AudioStats;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public d f39084a;

    /* renamed from: b, reason: collision with root package name */
    public double f39085b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f39086c;

    public c(e eVar, int i2, boolean z, boolean z2) {
        this.f39086c = z2;
        double d2 = i2;
        if (e.f39094a == eVar) {
            if (z) {
                double d3 = d(d2);
                if (d3 < 1000.0d) {
                    this.f39084a = d.METER;
                    this.f39085b = d3;
                    return;
                }
            }
            this.f39084a = d.KILOMETER;
            this.f39085b = d2 / 1000.0d;
            return;
        }
        double d4 = d2 / 1609.34d;
        this.f39085b = d4;
        if (z) {
            double d5 = d4 * 5280.0d;
            double d6 = true != z2 ? 528.0d : 1056.0d;
            double d7 = d(d5);
            if (d7 < d6) {
                this.f39085b = d7;
                this.f39084a = d.FOOT;
                return;
            }
        }
        this.f39084a = d.MILE;
    }

    private static double d(double d2) {
        if (d2 <= AudioStats.AUDIO_AMPLITUDE_NONE) {
            return 10.0d;
        }
        return Math.ceil(d2 / 10.0d) * 10.0d;
    }

    public final String a() {
        double d2 = this.f39085b;
        boolean z = this.f39086c;
        if (d2 >= 0.095d) {
            return d2 < 9.5d ? String.format("%.1f", Double.valueOf(d2)) : String.format("%.0f", Double.valueOf(d2));
        }
        String str = String.format("%.2f", Double.valueOf(d2));
        if (str.equals("0.00")) {
            return str.substring(0, str.length() - (true == z ? 3 : 1));
        }
        return str.substring(1);
    }

    public final String b(com.waze.shared_infra.o.a aVar) {
        return String.format("%s %s", a(), c(aVar));
    }

    public final String c(com.waze.shared_infra.o.a aVar) {
        String strC = aVar.c(this.f39084a.f39092e, new Object[0]);
        return strC.length() <= 8 ? strC : aVar.c(this.f39084a.f39093f, new Object[0]);
    }

    public c(int i2, boolean z) {
        this(f.c(), i2, z);
    }

    public c(e eVar, int i2, boolean z) {
        this(eVar, i2, z, false);
    }

    public c(int i2) {
        this(i2, false);
    }
}
