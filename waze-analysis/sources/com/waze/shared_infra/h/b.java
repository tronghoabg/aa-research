package com.waze.shared_infra.h;

import android.location.Location;
import androidx.camera.video.AudioStats;
import com.waze.shared_infra.r.h;
import com.waze.shared_infra.r.y;
import h.a.i;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class b {
    public /* synthetic */ b(byte[] bArr) {
    }

    public static c a(int i2, c cVar) {
        x.f(cVar, "location");
        double d2 = i2;
        return new c(8.997741133498494E-6d * d2, d2 * (8.997741133498494E-6d / Math.cos(Math.toRadians(cVar.a()))));
    }

    public static double b(List list) {
        x.f(list, "<this>");
        int size = list.size();
        double dB = AudioStats.AUDIO_AMPLITUDE_NONE;
        if (size <= 2) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        if (!x.n(i.P(arrayList), i.T(arrayList))) {
            arrayList.add(i.P(list));
        }
        int size2 = arrayList.size() - 1;
        int i2 = 0;
        double dA = 0.0d;
        while (i2 < size2) {
            c cVar = (c) arrayList.get(i2);
            i2++;
            c cVar2 = (c) arrayList.get(i2);
            dB += cVar.b() * cVar2.a();
            dA += cVar.a() * cVar2.b();
        }
        return j(Math.abs(dB - dA) / 2.0d);
    }

    public static float c(c cVar, c cVar2) {
        x.f(cVar, "<this>");
        x.f(cVar2, "other");
        float[] fArr = new float[1];
        Location.distanceBetween(cVar.a(), cVar.b(), cVar2.a(), cVar2.b(), fArr);
        return fArr[0];
    }

    public static double d(int i2) {
        return i2 / 1000000.0d;
    }

    public static int e(double d2) {
        return (int) (d2 * 1000000.0d);
    }

    public static k g(y yVar) {
        x.f(yVar, "<this>");
        return ai.y(new h(yVar.a(), 4));
    }

    public static boolean h(y yVar) {
        x.f(yVar, "<this>");
        return ((b) yVar.a().d()).i();
    }

    private static double j(double d2) {
        return h.h.a.a(d2 * r0) / Math.pow(10.0d, 6.0d);
    }

    public boolean i() {
        return false;
    }

    private b() {
        throw null;
    }
}
