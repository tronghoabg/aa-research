package S3;

import A.AbstractC0213f;
import A7.AbstractC0279p0;
import E5.Q;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.Set;
import k3.AbstractC3173e;
import k3.AbstractC3181m;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class b extends AbstractC3173e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10934d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(AbstractC3181m abstractC3181m, int i5) {
        super(abstractC3181m);
        this.f10934d = i5;
    }

    @Override // E9.c
    public final String d() {
        switch (this.f10934d) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    @Override // k3.AbstractC3173e
    public final void w(o3.g gVar, Object obj) throws Throwable {
        int i5;
        int i10;
        byte[] byteArray;
        switch (this.f10934d) {
            case 0:
                a aVar = (a) obj;
                gVar.x(1, aVar.f10932a);
                String str = aVar.f10933b;
                if (str == null) {
                    gVar.N(2);
                    return;
                } else {
                    gVar.x(2, str);
                    return;
                }
            case 1:
                d dVar = (d) obj;
                gVar.x(1, dVar.f10938a);
                gVar.G(2, dVar.f10939b.longValue());
                return;
            case 2:
                String str2 = ((g) obj).f10957a;
                if (str2 == null) {
                    gVar.N(1);
                } else {
                    gVar.x(1, str2);
                }
                gVar.G(2, r2.f10958b);
                gVar.G(3, r2.f10959c);
                return;
            case 3:
                throw null;
            case 4:
                m mVar = (m) obj;
                String str3 = mVar.f10968a;
                if (str3 == null) {
                    gVar.N(1);
                } else {
                    gVar.x(1, str3);
                }
                byte[] bArrC = J3.h.c(mVar.f10969b);
                if (bArrC == null) {
                    gVar.N(2);
                    return;
                } else {
                    gVar.H(2, bArrC);
                    return;
                }
            case 5:
                p pVar = (p) obj;
                String str4 = pVar.f10977a;
                int i11 = 1;
                if (str4 == null) {
                    gVar.N(1);
                } else {
                    gVar.x(1, str4);
                }
                gVar.G(2, Fe.e.T(pVar.f10978b));
                String str5 = pVar.f10979c;
                if (str5 == null) {
                    gVar.N(3);
                } else {
                    gVar.x(3, str5);
                }
                String str6 = pVar.f10980d;
                if (str6 == null) {
                    gVar.N(4);
                } else {
                    gVar.x(4, str6);
                }
                byte[] bArrC2 = J3.h.c(pVar.f10981e);
                if (bArrC2 == null) {
                    gVar.N(5);
                } else {
                    gVar.H(5, bArrC2);
                }
                byte[] bArrC3 = J3.h.c(pVar.f10982f);
                if (bArrC3 == null) {
                    gVar.N(6);
                } else {
                    gVar.H(6, bArrC3);
                }
                gVar.G(7, pVar.f10983g);
                gVar.G(8, pVar.f10984h);
                gVar.G(9, pVar.f10985i);
                gVar.G(10, pVar.k);
                int i12 = pVar.f10987l;
                AbstractC3256n.m(i12, "backoffPolicy");
                int iF = AbstractC0213f.f(i12);
                if (iF == 0) {
                    i5 = 0;
                } else {
                    if (iF != 1) {
                        throw new Q((byte) 0, 9);
                    }
                    i5 = 1;
                }
                gVar.G(11, i5);
                gVar.G(12, pVar.f10988m);
                gVar.G(13, pVar.f10989n);
                gVar.G(14, pVar.f10990o);
                gVar.G(15, pVar.f10991p);
                gVar.G(16, pVar.f10992q ? 1L : 0L);
                int i13 = pVar.f10993r;
                AbstractC3256n.m(i13, "policy");
                int iF2 = AbstractC0213f.f(i13);
                if (iF2 == 0) {
                    i10 = 0;
                } else {
                    if (iF2 != 1) {
                        throw new Q((byte) 0, 9);
                    }
                    i10 = 1;
                }
                gVar.G(17, i10);
                gVar.G(18, pVar.f10994s);
                gVar.G(19, pVar.f10995t);
                J3.d dVar2 = pVar.f10986j;
                if (dVar2 == null) {
                    gVar.N(20);
                    gVar.N(21);
                    gVar.N(22);
                    gVar.N(23);
                    gVar.N(24);
                    gVar.N(25);
                    gVar.N(26);
                    gVar.N(27);
                    return;
                }
                int i14 = dVar2.f5555a;
                AbstractC3256n.m(i14, "networkType");
                int iF3 = AbstractC0213f.f(i14);
                if (iF3 == 0) {
                    i11 = 0;
                } else if (iF3 != 1) {
                    if (iF3 == 2) {
                        i11 = 2;
                    } else if (iF3 == 3) {
                        i11 = 3;
                    } else if (iF3 == 4) {
                        i11 = 4;
                    } else {
                        if (Build.VERSION.SDK_INT < 30 || i14 != 6) {
                            throw new IllegalArgumentException("Could not convert " + AbstractC0279p0.A(i14) + " to int");
                        }
                        i11 = 5;
                    }
                }
                gVar.G(20, i11);
                gVar.G(21, dVar2.f5556b ? 1L : 0L);
                gVar.G(22, dVar2.f5557c ? 1L : 0L);
                gVar.G(23, dVar2.f5558d ? 1L : 0L);
                gVar.G(24, dVar2.f5559e ? 1L : 0L);
                gVar.G(25, dVar2.f5560f);
                gVar.G(26, dVar2.f5561g);
                Set<J3.c> triggers = dVar2.f5562h;
                AbstractC3340k.e(triggers, "triggers");
                if (triggers.isEmpty()) {
                    byteArray = new byte[0];
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                        try {
                            objectOutputStream.writeInt(triggers.size());
                            for (J3.c cVar : triggers) {
                                objectOutputStream.writeUTF(cVar.f5552a.toString());
                                objectOutputStream.writeBoolean(cVar.f5553b);
                            }
                            objectOutputStream.close();
                            byteArrayOutputStream.close();
                            byteArray = byteArrayOutputStream.toByteArray();
                            AbstractC3340k.d(byteArray, "outputStream.toByteArray()");
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            Ba.c.n(byteArrayOutputStream, th);
                            throw th2;
                        }
                    }
                }
                gVar.H(27, byteArray);
                return;
            default:
                r rVar = (r) obj;
                String str7 = rVar.f11006a;
                if (str7 == null) {
                    gVar.N(1);
                } else {
                    gVar.x(1, str7);
                }
                gVar.x(2, rVar.f11007b);
                return;
        }
    }
}
