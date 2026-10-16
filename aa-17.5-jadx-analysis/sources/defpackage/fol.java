package defpackage;

import android.net.NetworkRequest;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes2.dex */
public final class fol extends eyn {
    @Override // defpackage.eyn
    protected final String a() {
        return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // defpackage.eyn
    public final /* bridge */ /* synthetic */ void b(fbk fbkVar, Object obj) throws IOException {
        int[] iArrCp;
        int[] iArrCp2;
        byte[] byteArray;
        byte[] byteArray2;
        fod fodVar = (fod) obj;
        int i = 1;
        fbkVar.h(1, fodVar.a);
        fbkVar.f(2, dtb.e(fodVar.b));
        fbkVar.h(3, fodVar.c);
        fbkVar.h(4, fodVar.d);
        fjc fjcVar = fjc.a;
        fbkVar.e(5, dsr.n(fodVar.e));
        fbkVar.e(6, dsr.n(fodVar.f));
        fbkVar.f(7, fodVar.g);
        fbkVar.f(8, fodVar.h);
        fbkVar.f(9, fodVar.i);
        fbkVar.f(10, fodVar.k);
        int i2 = fodVar.x;
        if (i2 == 0) {
            throw null;
        }
        fbkVar.f(11, i2 + (-1) != 0 ? 1 : 0);
        fbkVar.f(12, fodVar.l);
        fbkVar.f(13, fodVar.m);
        fbkVar.f(14, fodVar.n);
        fbkVar.f(15, fodVar.o);
        fbkVar.f(16, fodVar.p ? 1L : 0L);
        int i3 = fodVar.y;
        if (i3 == 0) {
            throw null;
        }
        fbkVar.f(17, i3 + (-1) != 0 ? 1 : 0);
        fbkVar.f(18, fodVar.q);
        fbkVar.f(19, fodVar.r);
        fbkVar.f(20, fodVar.s);
        fbkVar.f(21, fodVar.t);
        fbkVar.f(22, fodVar.u);
        String str = fodVar.v;
        if (str == null) {
            fbkVar.g(23);
        } else {
            fbkVar.h(23, str);
        }
        Boolean bool = fodVar.w;
        if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
            fbkVar.g(24);
        } else {
            fbkVar.f(24, r6.intValue());
        }
        fja fjaVar = fodVar.j;
        int i4 = fjaVar.j;
        int i5 = i4 - 1;
        if (i5 == 0) {
            i = 0;
        } else if (i5 != 1) {
            if (i5 == 2) {
                i = 2;
            } else if (i5 == 3) {
                i = 3;
            } else if (i5 == 4) {
                i = 4;
            } else {
                if (Build.VERSION.SDK_INT < 30 || i4 != 6) {
                    throw new IllegalArgumentException("Could not convert " + ((Object) dsu.h(i4)) + " to int");
                }
                i = 5;
            }
        }
        fbkVar.f(25, i);
        Object obj2 = fjaVar.b.b;
        if (obj2 == null) {
            byteArray = new byte[0];
        } else {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    int[] iArr = fos.a;
                    if (Build.VERSION.SDK_INT >= 31) {
                        iArrCp = ((NetworkRequest) obj2).getTransportTypes();
                        iArrCp.getClass();
                    } else {
                        int[] iArr2 = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
                        ArrayList arrayList = new ArrayList();
                        for (int i6 = 0; i6 < 10; i6++) {
                            int i7 = iArr2[i6];
                            if (((NetworkRequest) obj2).hasTransport(i7)) {
                                arrayList.add(Integer.valueOf(i7));
                            }
                        }
                        iArrCp = woy.cp(arrayList);
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        iArrCp2 = ((NetworkRequest) obj2).getCapabilities();
                        iArrCp2.getClass();
                    } else {
                        int[] iArr3 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
                        ArrayList arrayList2 = new ArrayList();
                        for (int i8 = 0; i8 < 30; i8++) {
                            int i9 = iArr3[i8];
                            if (((NetworkRequest) obj2).hasCapability(i9)) {
                                arrayList2.add(Integer.valueOf(i9));
                            }
                        }
                        iArrCp2 = woy.cp(arrayList2);
                    }
                    objectOutputStream.writeInt(iArrCp.length);
                    for (int i10 : iArrCp) {
                        objectOutputStream.writeInt(i10);
                    }
                    objectOutputStream.writeInt(iArrCp2.length);
                    for (int i11 : iArrCp2) {
                        objectOutputStream.writeInt(i11);
                    }
                    affa.n(objectOutputStream, null);
                    affa.n(byteArrayOutputStream, null);
                    byteArray = byteArrayOutputStream.toByteArray();
                    byteArray.getClass();
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
        fbkVar.e(26, byteArray);
        fbkVar.f(27, fjaVar.c ? 1L : 0L);
        fbkVar.f(28, fjaVar.d ? 1L : 0L);
        fbkVar.f(29, fjaVar.e ? 1L : 0L);
        fbkVar.f(30, fjaVar.f ? 1L : 0L);
        fbkVar.f(31, fjaVar.g);
        fbkVar.f(32, fjaVar.h);
        Set<fiz> set = fjaVar.i;
        if (set.isEmpty()) {
            byteArray2 = new byte[0];
        } else {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream2);
                try {
                    objectOutputStream2.writeInt(set.size());
                    for (fiz fizVar : set) {
                        objectOutputStream2.writeUTF(fizVar.a.toString());
                        objectOutputStream2.writeBoolean(fizVar.b);
                    }
                    affa.n(objectOutputStream2, null);
                    affa.n(byteArrayOutputStream2, null);
                    byteArray2 = byteArrayOutputStream2.toByteArray();
                    byteArray2.getClass();
                } finally {
                }
            } finally {
            }
        }
        fbkVar.e(33, byteArray2);
    }
}
