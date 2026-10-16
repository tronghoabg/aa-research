package ad;

import Va.M6;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import bd.EnumC1524a;
import cb.AbstractC1593a;
import com.google.android.gms.ads.AdSize;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import rd.C3969d;
import uc.C4286w;
import x6.C4488s;

/* renamed from: ad.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1356a extends C4286w {

    /* renamed from: d, reason: collision with root package name */
    public Context f17558d;

    /* renamed from: e, reason: collision with root package name */
    public final r f17559e = new r();

    /* renamed from: f, reason: collision with root package name */
    public final Y1.t f17560f;

    public C1356a(Context context, Y1.t tVar) {
        this.f17558d = context;
        this.f17560f = tVar;
    }

    @Override // uc.C4286w
    public final Object f(byte b5, ByteBuffer byteBuffer) {
        Y1.t tVar = this.f17560f;
        r rVar = this.f17559e;
        switch (b5) {
            case -128:
                return new C1377w(new AdSize(((Integer) f(byteBuffer.get(), byteBuffer)).intValue(), ((Integer) f(byteBuffer.get(), byteBuffer)).intValue()));
            case -127:
                List list = (List) f(byteBuffer.get(), byteBuffer);
                String str = (String) f(byteBuffer.get(), byteBuffer);
                Object objF = f(byteBuffer.get(), byteBuffer);
                return new C1372q(list, str, objF != null ? (Boolean) objF : null, (List) f(byteBuffer.get(), byteBuffer), (Integer) f(byteBuffer.get(), byteBuffer), (String) f(byteBuffer.get(), byteBuffer), (Map) f(byteBuffer.get(), byteBuffer), tVar.a(), (List) f(byteBuffer.get(), byteBuffer));
            case -126:
                return new C1374t(AdSize.f26291m);
            case -125:
            case -109:
            default:
                return super.f(b5, byteBuffer);
            case -124:
                return new P((Integer) f(byteBuffer.get(), byteBuffer), (String) f(byteBuffer.get(), byteBuffer));
            case -123:
                return new C1361f(((Integer) f(byteBuffer.get(), byteBuffer)).intValue(), (String) f(byteBuffer.get(), byteBuffer), (String) f(byteBuffer.get(), byteBuffer), (C1363h) f(byteBuffer.get(), byteBuffer));
            case -122:
                return new C1367l((List) f(byteBuffer.get(), byteBuffer), (String) f(byteBuffer.get(), byteBuffer), (Map) f(byteBuffer.get(), byteBuffer), (Map) f(byteBuffer.get(), byteBuffer), (Boolean) f(byteBuffer.get(), byteBuffer), (List) f(byteBuffer.get(), byteBuffer), (Integer) f(byteBuffer.get(), byteBuffer), (String) f(byteBuffer.get(), byteBuffer), (String) f(byteBuffer.get(), byteBuffer), (Map) f(byteBuffer.get(), byteBuffer), tVar.a(), (List) f(byteBuffer.get(), byteBuffer));
            case -121:
                String str2 = (String) f(byteBuffer.get(), byteBuffer);
                str2.getClass();
                if (str2.equals("ready")) {
                    return EnumC1379y.f17618b;
                }
                if (str2.equals("notReady")) {
                    return EnumC1379y.f17617a;
                }
                throw new IllegalArgumentException("Unable to handle state: ".concat(str2));
            case -120:
                return new C1380z((EnumC1379y) f(byteBuffer.get(), byteBuffer), (String) f(byteBuffer.get(), byteBuffer), (Number) f(byteBuffer.get(), byteBuffer));
            case -119:
                return new C1352F((Map) f(byteBuffer.get(), byteBuffer));
            case -118:
                return new U((String) f(byteBuffer.get(), byteBuffer), (String) f(byteBuffer.get(), byteBuffer));
            case -117:
                return new C1359d(((Integer) f(byteBuffer.get(), byteBuffer)).intValue(), (String) f(byteBuffer.get(), byteBuffer), (String) f(byteBuffer.get(), byteBuffer));
            case -116:
                return new C1363h((String) f(byteBuffer.get(), byteBuffer), (String) f(byteBuffer.get(), byteBuffer), (List) f(byteBuffer.get(), byteBuffer), (C1360e) f(byteBuffer.get(), byteBuffer), (Map) f(byteBuffer.get(), byteBuffer));
            case -115:
                return new C1360e((String) f(byteBuffer.get(), byteBuffer), ((Long) f(byteBuffer.get(), byteBuffer)).longValue(), (String) f(byteBuffer.get(), byteBuffer), (Map) f(byteBuffer.get(), byteBuffer), (C1359d) f(byteBuffer.get(), byteBuffer), (String) f(byteBuffer.get(), byteBuffer), (String) f(byteBuffer.get(), byteBuffer), (String) f(byteBuffer.get(), byteBuffer), (String) f(byteBuffer.get(), byteBuffer));
            case -114:
                return new C1373s(this.f17558d, rVar, (String) f(byteBuffer.get(), byteBuffer), ((Integer) f(byteBuffer.get(), byteBuffer)).intValue());
            case -113:
                return new C1376v(AdSize.f26290l);
            case -112:
                return new M((Integer) f(byteBuffer.get(), byteBuffer), (Integer) f(byteBuffer.get(), byteBuffer), (V) f(byteBuffer.get(), byteBuffer), (Boolean) f(byteBuffer.get(), byteBuffer), (Boolean) f(byteBuffer.get(), byteBuffer), (Boolean) f(byteBuffer.get(), byteBuffer));
            case -111:
                return new V((Boolean) f(byteBuffer.get(), byteBuffer), (Boolean) f(byteBuffer.get(), byteBuffer), (Boolean) f(byteBuffer.get(), byteBuffer));
            case -110:
                return new C1375u(rVar, this.f17558d, ((Integer) f(byteBuffer.get(), byteBuffer)).intValue(), (Integer) f(byteBuffer.get(), byteBuffer), (Integer) f(byteBuffer.get(), byteBuffer));
            case -108:
                C3969d c3969d = new C3969d();
                c3969d.b((String) f(byteBuffer.get(), byteBuffer));
                c3969d.c(((Integer) f(byteBuffer.get(), byteBuffer)).intValue());
                c3969d.d(((Integer) f(byteBuffer.get(), byteBuffer)).intValue());
                List list2 = (List) f(byteBuffer.get(), byteBuffer);
                ArrayList arrayList = (ArrayList) c3969d.f44774e;
                arrayList.clear();
                if (list2 != null) {
                    arrayList.addAll(list2);
                }
                return new C4488s(c3969d.f44770a, c3969d.f44771b, (String) c3969d.f44773d, arrayList, c3969d.f44772c);
            case -107:
                return new bd.b((bd.d) f(byteBuffer.get(), byteBuffer), (ColorDrawable) f(byteBuffer.get(), byteBuffer), (bd.c) f(byteBuffer.get(), byteBuffer), (bd.c) f(byteBuffer.get(), byteBuffer), (bd.c) f(byteBuffer.get(), byteBuffer), (bd.c) f(byteBuffer.get(), byteBuffer));
            case -106:
                return new bd.c((ColorDrawable) f(byteBuffer.get(), byteBuffer), (ColorDrawable) f(byteBuffer.get(), byteBuffer), (EnumC1524a) f(byteBuffer.get(), byteBuffer), (Double) f(byteBuffer.get(), byteBuffer));
            case -105:
                int iIntValue = ((Integer) f(byteBuffer.get(), byteBuffer)).intValue();
                if (iIntValue >= 0 && iIntValue < EnumC1524a.values().length) {
                    return EnumC1524a.values()[iIntValue];
                }
                Log.w("NativeTemplateFontStyle", "Invalid index for NativeTemplateFontStyle: " + iIntValue);
                return EnumC1524a.f19444a;
            case -104:
                int iIntValue2 = ((Integer) f(byteBuffer.get(), byteBuffer)).intValue();
                if (iIntValue2 >= 0 && iIntValue2 < bd.d.values().length) {
                    return bd.d.values()[iIntValue2];
                }
                Log.w("NativeTemplateType", "Invalid template type index: " + iIntValue2);
                return bd.d.MEDIUM;
            case -103:
                return new ColorDrawable(Color.argb(((Integer) f(byteBuffer.get(), byteBuffer)).intValue(), ((Integer) f(byteBuffer.get(), byteBuffer)).intValue(), ((Integer) f(byteBuffer.get(), byteBuffer)).intValue(), ((Integer) f(byteBuffer.get(), byteBuffer)).intValue()));
            case -102:
                String str3 = (String) f(byteBuffer.get(), byteBuffer);
                try {
                    M6.z(Class.forName(str3).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    throw null;
                } catch (ClassNotFoundException unused) {
                    AbstractC1593a.t("Class not found: ", str3, "FlutterMediationExtras");
                    return null;
                } catch (IllegalAccessException unused2) {
                    AbstractC1593a.t("Illegal Access to ", str3, "FlutterMediationExtras");
                    return null;
                } catch (InstantiationException unused3) {
                    AbstractC1593a.t("Unable to instantiate class ", str3, "FlutterMediationExtras");
                    return null;
                } catch (NoSuchMethodException unused4) {
                    Log.e("FlutterMediationExtras", "No such method found: " + str3 + ".getDeclaredConstructor()");
                    return null;
                } catch (InvocationTargetException unused5) {
                    AbstractC1593a.t("Invocation Target Exception for: ", str3, "FlutterMediationExtras");
                    return null;
                }
        }
    }

    @Override // uc.C4286w
    public final void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof C1377w) {
            C1377w c1377w = (C1377w) obj;
            if (c1377w instanceof C1375u) {
                C1375u c1375u = (C1375u) c1377w;
                byteArrayOutputStream.write(-110);
                k(byteArrayOutputStream, Integer.valueOf(c1375u.f17614b));
                k(byteArrayOutputStream, c1375u.f17612e);
                k(byteArrayOutputStream, c1375u.f17611d);
                return;
            }
            if (c1377w instanceof C1373s) {
                byteArrayOutputStream.write(-114);
                C1373s c1373s = (C1373s) c1377w;
                k(byteArrayOutputStream, c1373s.f17610d);
                k(byteArrayOutputStream, Integer.valueOf(c1373s.f17614b));
                return;
            }
            if (c1377w instanceof C1376v) {
                byteArrayOutputStream.write(-113);
                return;
            } else {
                if (c1377w instanceof C1374t) {
                    byteArrayOutputStream.write(-126);
                    return;
                }
                byteArrayOutputStream.write(-128);
                k(byteArrayOutputStream, Integer.valueOf(c1377w.f17614b));
                k(byteArrayOutputStream, Integer.valueOf(c1377w.f17615c));
                return;
            }
        }
        if (obj instanceof C1367l) {
            byteArrayOutputStream.write(-122);
            C1367l c1367l = (C1367l) obj;
            k(byteArrayOutputStream, c1367l.f17601a);
            k(byteArrayOutputStream, c1367l.f17602b);
            k(byteArrayOutputStream, c1367l.f17589j);
            k(byteArrayOutputStream, c1367l.k);
            k(byteArrayOutputStream, c1367l.f17603c);
            k(byteArrayOutputStream, c1367l.f17604d);
            k(byteArrayOutputStream, c1367l.f17605e);
            k(byteArrayOutputStream, c1367l.f17590l);
            k(byteArrayOutputStream, c1367l.f17606f);
            k(byteArrayOutputStream, c1367l.f17607g);
            k(byteArrayOutputStream, c1367l.f17609i);
            return;
        }
        if (obj instanceof C1372q) {
            byteArrayOutputStream.write(-127);
            C1372q c1372q = (C1372q) obj;
            k(byteArrayOutputStream, c1372q.f17601a);
            k(byteArrayOutputStream, c1372q.f17602b);
            k(byteArrayOutputStream, c1372q.f17603c);
            k(byteArrayOutputStream, c1372q.f17604d);
            k(byteArrayOutputStream, c1372q.f17605e);
            k(byteArrayOutputStream, c1372q.f17606f);
            k(byteArrayOutputStream, c1372q.f17607g);
            k(byteArrayOutputStream, c1372q.f17609i);
            return;
        }
        if (obj instanceof P) {
            byteArrayOutputStream.write(-124);
            P p10 = (P) obj;
            k(byteArrayOutputStream, p10.f17525a);
            k(byteArrayOutputStream, p10.f17526b);
            return;
        }
        if (obj instanceof C1360e) {
            byteArrayOutputStream.write(-115);
            C1360e c1360e = (C1360e) obj;
            k(byteArrayOutputStream, c1360e.f17568a);
            k(byteArrayOutputStream, Long.valueOf(c1360e.f17569b));
            k(byteArrayOutputStream, c1360e.f17570c);
            k(byteArrayOutputStream, c1360e.f17571d);
            k(byteArrayOutputStream, c1360e.f17572e);
            k(byteArrayOutputStream, c1360e.f17573f);
            k(byteArrayOutputStream, c1360e.f17574g);
            k(byteArrayOutputStream, c1360e.f17575h);
            k(byteArrayOutputStream, c1360e.f17576i);
            return;
        }
        if (obj instanceof C1363h) {
            byteArrayOutputStream.write(-116);
            C1363h c1363h = (C1363h) obj;
            k(byteArrayOutputStream, c1363h.f17581a);
            k(byteArrayOutputStream, c1363h.f17582b);
            k(byteArrayOutputStream, c1363h.f17583c);
            k(byteArrayOutputStream, c1363h.f17584d);
            k(byteArrayOutputStream, c1363h.f17585e);
            return;
        }
        if (obj instanceof C1361f) {
            byteArrayOutputStream.write(-123);
            C1361f c1361f = (C1361f) obj;
            k(byteArrayOutputStream, Integer.valueOf(c1361f.f17577a));
            k(byteArrayOutputStream, c1361f.f17578b);
            k(byteArrayOutputStream, c1361f.f17579c);
            k(byteArrayOutputStream, c1361f.f17580d);
            return;
        }
        if (obj instanceof C1359d) {
            byteArrayOutputStream.write(-117);
            C1359d c1359d = (C1359d) obj;
            k(byteArrayOutputStream, Integer.valueOf(c1359d.f17565a));
            k(byteArrayOutputStream, c1359d.f17566b);
            k(byteArrayOutputStream, c1359d.f17567c);
            return;
        }
        if (obj instanceof EnumC1379y) {
            byteArrayOutputStream.write(-121);
            EnumC1379y enumC1379y = (EnumC1379y) obj;
            int iOrdinal = enumC1379y.ordinal();
            if (iOrdinal == 0) {
                k(byteArrayOutputStream, "notReady");
                return;
            } else if (iOrdinal == 1) {
                k(byteArrayOutputStream, "ready");
                return;
            } else {
                throw new IllegalArgumentException("Unable to handle state: " + enumC1379y);
            }
        }
        if (obj instanceof C1380z) {
            byteArrayOutputStream.write(-120);
            C1380z c1380z = (C1380z) obj;
            k(byteArrayOutputStream, c1380z.f17620a);
            k(byteArrayOutputStream, c1380z.f17621b);
            k(byteArrayOutputStream, c1380z.f17622c);
            return;
        }
        if (obj instanceof C1352F) {
            byteArrayOutputStream.write(-119);
            k(byteArrayOutputStream, ((C1352F) obj).f17499a);
            return;
        }
        if (obj instanceof U) {
            byteArrayOutputStream.write(-118);
            U u10 = (U) obj;
            k(byteArrayOutputStream, u10.f17540a);
            k(byteArrayOutputStream, u10.f17541b);
            return;
        }
        if (obj instanceof M) {
            byteArrayOutputStream.write(-112);
            M m10 = (M) obj;
            k(byteArrayOutputStream, m10.f17516a);
            k(byteArrayOutputStream, m10.f17517b);
            k(byteArrayOutputStream, m10.f17518c);
            k(byteArrayOutputStream, m10.f17519d);
            k(byteArrayOutputStream, m10.f17520e);
            k(byteArrayOutputStream, m10.f17521f);
            return;
        }
        if (obj instanceof C4488s) {
            byteArrayOutputStream.write(-108);
            C4488s c4488s = (C4488s) obj;
            String str = c4488s.f47744c;
            if (str == null) {
                str = "";
            }
            k(byteArrayOutputStream, str);
            k(byteArrayOutputStream, Integer.valueOf(c4488s.f47742a));
            k(byteArrayOutputStream, Integer.valueOf(c4488s.f47743b));
            k(byteArrayOutputStream, new ArrayList(c4488s.f47745d));
            return;
        }
        if (obj instanceof V) {
            byteArrayOutputStream.write(-111);
            V v2 = (V) obj;
            k(byteArrayOutputStream, v2.f17542a);
            k(byteArrayOutputStream, v2.f17543b);
            k(byteArrayOutputStream, v2.f17544c);
            return;
        }
        if (obj instanceof bd.b) {
            byteArrayOutputStream.write(-107);
            bd.b bVar = (bd.b) obj;
            k(byteArrayOutputStream, bVar.f19446a);
            k(byteArrayOutputStream, bVar.f19447b);
            k(byteArrayOutputStream, bVar.f19448c);
            k(byteArrayOutputStream, bVar.f19449d);
            k(byteArrayOutputStream, bVar.f19450e);
            k(byteArrayOutputStream, bVar.f19451f);
            return;
        }
        if (obj instanceof EnumC1524a) {
            byteArrayOutputStream.write(-105);
            k(byteArrayOutputStream, Integer.valueOf(((EnumC1524a) obj).ordinal()));
            return;
        }
        if (obj instanceof bd.d) {
            byteArrayOutputStream.write(-104);
            k(byteArrayOutputStream, Integer.valueOf(((bd.d) obj).ordinal()));
            return;
        }
        if (obj instanceof bd.c) {
            byteArrayOutputStream.write(-106);
            bd.c cVar = (bd.c) obj;
            k(byteArrayOutputStream, cVar.f19452a);
            k(byteArrayOutputStream, cVar.f19453b);
            k(byteArrayOutputStream, cVar.f19454c);
            k(byteArrayOutputStream, cVar.a());
            return;
        }
        if (!(obj instanceof ColorDrawable)) {
            super.k(byteArrayOutputStream, obj);
            return;
        }
        byteArrayOutputStream.write(-103);
        int color = ((ColorDrawable) obj).getColor();
        k(byteArrayOutputStream, Integer.valueOf(Color.alpha(color)));
        k(byteArrayOutputStream, Integer.valueOf(Color.red(color)));
        k(byteArrayOutputStream, Integer.valueOf(Color.green(color)));
        k(byteArrayOutputStream, Integer.valueOf(Color.blue(color)));
    }
}
