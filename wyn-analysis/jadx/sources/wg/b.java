package wg;

import A7.V1;
import N.C0718d;
import N.C0740o;
import N.u0;
import Pc.C0799o;
import Pc.C0800p;
import Pc.C0801q;
import V.d;
import Va.X7;
import X0.AbstractC1274b;
import android.app.Activity;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.location.LocationManager;
import android.util.Log;
import android.util.Range;
import ba.C1521a;
import com.applovin.impl.Y;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kd.RunnableC3307c;
import o1.C3641c;
import q.s1;
import rc.InterfaceC3965b;
import s8.C4026b;
import t0.C4053a;
import u0.InterfaceC4193p0;
import u0.w0;
import uc.C4273j;
import uc.InterfaceC4265b;
import uc.InterfaceC4269f;
import yc.p;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class b {
    public static boolean a(Context context) {
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
    }

    public static u0 b(C0740o c0740o, InterfaceC4193p0 interfaceC4193p0, C4053a c4053a, C0740o c0740o2) {
        C0718d.M(c0740o, interfaceC4193p0, c4053a);
        c0740o.o();
        return new u0(c0740o2);
    }

    public static String c(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static void d(int i5, d dVar, u0 u0Var, C0740o c0740o, int i10) {
        dVar.invoke(u0Var, c0740o, Integer.valueOf(i5));
        c0740o.M(i10);
    }

    public static void e(C0740o c0740o, boolean z2, boolean z10, boolean z11, boolean z12) {
        c0740o.p(z2);
        c0740o.p(z10);
        c0740o.p(z11);
        c0740o.p(z12);
    }

    public static void f(InterfaceC4269f interfaceC4269f, final s1 s1Var) {
        p pVar = p.f48158d;
        Object obj = null;
        X7 x72 = new X7(interfaceC4269f, pVar, obj, "dev.flutter.pigeon.camera_android.CameraApi.getAvailableCameras");
        if (s1Var != null) {
            final int i5 = 0;
            x72.n(new InterfaceC4265b() { // from class: yc.n
                private final void a(Object obj2, C1521a c1521a) {
                    ArrayList arrayList = new ArrayList();
                    u uVar = (u) ((ArrayList) obj2).get(0);
                    C0800p c0800p = new C0800p(arrayList, c1521a, 23);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    int iOrdinal = uVar.ordinal();
                    int i10 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i10 = 2;
                    }
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        Bc.a aVar = (Bc.a) c4584g.f48112a.f5569a.get("EXPOSURE_LOCK");
                        aVar.f1667b = i10;
                        aVar.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0800p, 26), new C3641c(c0800p, 18));
                    } catch (Exception e7) {
                        s1.h(e7, c0800p);
                    }
                }

                private final void b(Object obj2, C1521a c1521a) {
                    w0 w0Var;
                    ArrayList arrayList = new ArrayList();
                    z zVar = (z) ((ArrayList) obj2).get(0);
                    C0801q c0801q = new C0801q(arrayList, c1521a, 22);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        w0 w0Var2 = null;
                        if (zVar == null) {
                            w0Var = null;
                        } else {
                            w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                        }
                        Dc.a aVarC = c4584g.f48112a.c();
                        if (w0Var != null && ((Double) w0Var.f46405a) != null && ((Double) w0Var.f46406b) != null) {
                            w0Var2 = w0Var;
                        }
                        aVarC.f2631c = w0Var2;
                        aVarC.b();
                        aVarC.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0801q, 22), new C3641c(c0801q, 14));
                    } catch (Exception e7) {
                        s1.h(e7, c0801q);
                    }
                }

                private final void c(Object obj2, C1521a c1521a) {
                    s1 s1Var2 = s1Var;
                    ArrayList arrayList = new ArrayList();
                    try {
                        Cc.a aVarB = ((C4584g) s1Var2.f43902g).f48112a.b();
                        arrayList.add(0, Double.valueOf(aVarB.b() * (((Range) ((CameraCharacteristics) aVarB.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r1.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = Fe.b.V(th);
                    }
                    c1521a.c(arrayList);
                }

                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listU;
                    int i10;
                    int i11 = 23;
                    int i12 = 21;
                    int i13 = 24;
                    int i14 = 3;
                    int i15 = 2;
                    int i16 = 1;
                    w0 w0Var = null;
                    s1 s1Var2 = s1Var;
                    int i17 = 0;
                    switch (i5) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                Activity activity = (Activity) s1Var2.f43896a;
                                if (activity == null) {
                                    listU = Collections.EMPTY_LIST;
                                } else {
                                    try {
                                        listU = Ba.c.u(activity);
                                    } catch (CameraAccessException e7) {
                                        throw new RuntimeException(e7);
                                    }
                                }
                                arrayList.add(0, listU);
                            } catch (Throwable th) {
                                arrayList = Fe.b.V(th);
                            }
                            c1521a.c(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            C0799o c0799o = new C0799o(arrayList2, c1521a, 22);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g = (C4584g) s1Var2.f43902g;
                                double dDoubleValue = d3.doubleValue();
                                Cc.a aVarB = c4584g.f48112a.b();
                                aVarB.f1982b = dDoubleValue / aVarB.b();
                                aVarB.a(c4584g.f48129s);
                                c4584g.h(new RunnableC4579b(i17, c0799o, aVarB), new C3641c(c0799o, 17));
                                return;
                            } catch (Exception e10) {
                                s1.g(e10, c0799o);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            y yVar = (y) arrayList4.get(1);
                            C0800p c0800p = new C0800p(arrayList3, c1521a, 22);
                            C4584g c4584g2 = (C4584g) s1Var2.f43902g;
                            if (c4584g2 != null) {
                                c4584g2.a();
                            }
                            boolean zBooleanValue = yVar.f48194e.booleanValue();
                            Y y10 = new Y(s1Var2, c0800p, str, yVar);
                            C4026b c4026b = (C4026b) s1Var2.f43898c;
                            if (c4026b.f45322b) {
                                y10.c("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            Activity activity2 = (Activity) s1Var2.f43896a;
                            if (Y0.e.checkSelfPermission(activity2, "android.permission.CAMERA") == 0 && (!zBooleanValue || Y0.e.checkSelfPermission(activity2, "android.permission.RECORD_AUDIO") == 0)) {
                                y10.c(null, null);
                                return;
                            }
                            ((s1) ((InterfaceC3965b) ((C3641c) s1Var2.f43899d).f41267b)).d(new Yc.g(new aa.f(27, c4026b, y10)));
                            c4026b.f45322b = true;
                            AbstractC1274b.a(activity2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            w wVar = (w) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g3 = (C4584g) s1Var2.f43902g;
                                int iOrdinal = wVar.ordinal();
                                if (iOrdinal == 0) {
                                    i15 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c4584g3.l(i15);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = Fe.b.V(th2);
                            }
                            c1521a.c(arrayList5);
                            return;
                        case 4:
                            ArrayList arrayList6 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            C0800p c0800p2 = new C0800p(arrayList6, c1521a, i13);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g4 = (C4584g) s1Var2.f43902g;
                                if (zVar != null) {
                                    w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                                }
                                c4584g4.m(c0800p2, w0Var);
                                return;
                            } catch (Exception e11) {
                                s1.h(e11, c0800p2);
                                return;
                            }
                        case 5:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6730f.floatValue()));
                            } catch (Throwable th3) {
                                arrayList7 = Fe.b.V(th3);
                            }
                            c1521a.c(arrayList7);
                            return;
                        case 6:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6729e.floatValue()));
                            } catch (Throwable th4) {
                                arrayList8 = Fe.b.V(th4);
                            }
                            c1521a.c(arrayList8);
                            return;
                        case 7:
                            ArrayList arrayList9 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj2).get(0);
                            C0801q c0801q = new C0801q(arrayList9, c1521a, i11);
                            C4584g c4584g5 = (C4584g) s1Var2.f43902g;
                            float fFloatValue = d5.floatValue();
                            Kc.a aVarG = c4584g5.f48112a.g();
                            Float f10 = aVarG.f6730f;
                            float fFloatValue2 = f10.floatValue();
                            Float f11 = aVarG.f6729e;
                            float fFloatValue3 = f11.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                c0801q.c(new C4592o("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f11, f10), null));
                                return;
                            }
                            aVarG.f6728d = Float.valueOf(fFloatValue);
                            aVarG.a(c4584g5.f48129s);
                            c4584g5.h(new RunnableC3307c(c0801q, i11), new C3641c(c0801q, 15));
                            return;
                        case 8:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th5) {
                                arrayList10 = Fe.b.V(th5);
                            }
                            try {
                                C4584g c4584g6 = (C4584g) s1Var2.f43902g;
                                if (!c4584g6.f48132v) {
                                    c4584g6.f48132v = true;
                                    CameraCaptureSession cameraCaptureSession = c4584g6.f48126p;
                                    if (cameraCaptureSession != null) {
                                        cameraCaptureSession.stopRepeating();
                                    }
                                }
                                arrayList10.add(0, null);
                                c1521a.c(arrayList10);
                                return;
                            } catch (CameraAccessException e12) {
                                throw new C4592o("CameraAccessException", e12.getMessage(), null);
                            }
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C4584g c4584g7 = (C4584g) s1Var2.f43902g;
                                c4584g7.f48132v = false;
                                c4584g7.h(null, new C4580c(c4584g7, i17));
                                arrayList11.add(0, null);
                            } catch (Throwable th6) {
                                arrayList11 = Fe.b.V(th6);
                            }
                            c1521a.c(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                s1Var2.getClass();
                                try {
                                    ((C4584g) s1Var2.f43902g).j(new t6.q(str2, (CameraManager) ((Activity) s1Var2.f43896a).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e13) {
                                    throw new C4592o("CameraAccessException", e13.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = Fe.b.V(th7);
                            }
                            c1521a.c(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C4584g c4584g8 = (C4584g) s1Var2.f43902g;
                                if (c4584g8.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i16 = 0;
                                        }
                                        if (i16 == 0) {
                                            throw new C4592o("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g8.f48130t.resume();
                                    } catch (IllegalStateException e14) {
                                        throw new C4592o("videoRecordingFailed", e14.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = Fe.b.V(th8);
                            }
                            c1521a.c(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                s1Var2.i((x) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                            } catch (Throwable th9) {
                                arrayList14 = Fe.b.V(th9);
                            }
                            c1521a.c(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C4584g c4584g9 = (C4584g) s1Var2.f43902g;
                                if (c4584g9 != null) {
                                    Log.i("Camera", "dispose");
                                    c4584g9.a();
                                    c4584g9.f48116e.release();
                                    Jc.a aVar = c4584g9.f48112a.f().f6005c;
                                    V1 v1 = aVar.f6003f;
                                    if (v1 != null) {
                                        aVar.f5998a.unregisterReceiver(v1);
                                        aVar.f6003f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                            } catch (Throwable th10) {
                                arrayList15 = Fe.b.V(th10);
                            }
                            c1521a.c(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g10 = (C4584g) s1Var2.f43902g;
                                int iOrdinal2 = tVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        i16 = 2;
                                    } else if (iOrdinal2 == 2) {
                                        i16 = 3;
                                    } else {
                                        if (iOrdinal2 != 3) {
                                            throw new IllegalStateException("Unreachable code");
                                        }
                                        i16 = 4;
                                    }
                                }
                                c4584g10.f48112a.f().f6006d = i16;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = Fe.b.V(th11);
                            }
                            c1521a.c(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C4584g) s1Var2.f43902g).f48112a.f().f6006d = 0;
                                arrayList17.add(0, null);
                            } catch (Throwable th12) {
                                arrayList17 = Fe.b.V(th12);
                            }
                            c1521a.c(arrayList17);
                            return;
                        case 16:
                            C0801q c0801q2 = new C0801q(new ArrayList(), c1521a, i12);
                            C4584g c4584g11 = (C4584g) s1Var2.f43902g;
                            C4585h c4585h = c4584g11.f48122l;
                            if (c4585h.f48138b != 1) {
                                c0801q2.c(new C4592o("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c4584g11.f48136z = c0801q2;
                            try {
                                c4584g11.f48133w = File.createTempFile("CAP", ".jpg", c4584g11.f48118g.getCacheDir());
                                S3.s sVar = c4584g11.f48134x;
                                sVar.getClass();
                                sVar.f11009b = new J5.n(2);
                                sVar.f11010c = new J5.n(2);
                                c4584g11.f48127q.setOnImageAvailableListener(c4584g11, c4584g11.f48123m);
                                Ac.a aVar2 = (Ac.a) c4584g11.f48112a.f5569a.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1257b != 1) {
                                    c4584g11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c4585h.f48138b = 2;
                                c4584g11.d();
                                return;
                            } catch (IOException | SecurityException e15) {
                                c4584g11.f48119h.l(c4584g11.f48136z, "cannotCreateFile", e15.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                s1Var2.n((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                            } catch (Throwable th13) {
                                arrayList18 = Fe.b.V(th13);
                            }
                            c1521a.c(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, s1Var2.o());
                            } catch (Throwable th14) {
                                arrayList19 = Fe.b.V(th14);
                            }
                            c1521a.c(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C4584g c4584g12 = (C4584g) s1Var2.f43902g;
                                if (c4584g12.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i16 = 0;
                                        }
                                        if (i16 == 0) {
                                            throw new C4592o("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g12.f48130t.pause();
                                    } catch (IllegalStateException e16) {
                                        throw new C4592o("videoRecordingFailed", e16.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = Fe.b.V(th15);
                            }
                            c1521a.c(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th16) {
                                arrayList21 = Fe.b.V(th16);
                            }
                            try {
                                C4584g c4584g13 = (C4584g) s1Var2.f43902g;
                                C4273j c4273j = (C4273j) s1Var2.f43901f;
                                c4584g13.getClass();
                                c4273j.a(new Wa.d(c4584g13, i14));
                                c4584g13.o(false, true);
                                Log.i("Camera", "startPreviewWithImageStream");
                                arrayList21.add(0, null);
                                c1521a.c(arrayList21);
                                return;
                            } catch (CameraAccessException e17) {
                                throw new C4592o("CameraAccessException", e17.getMessage(), null);
                            }
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th17) {
                                arrayList22 = Fe.b.V(th17);
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).p(null);
                                arrayList22.add(0, null);
                                c1521a.c(arrayList22);
                                return;
                            } catch (Exception e18) {
                                throw new C4592o(e18.getClass().getName(), e18.getMessage(), null);
                            }
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj2).get(0);
                            C0799o c0799o2 = new C0799o(arrayList23, c1521a, i12);
                            s1Var2.getClass();
                            int iOrdinal3 = vVar.ordinal();
                            if (iOrdinal3 == 0) {
                                i10 = 1;
                            } else if (iOrdinal3 == 1) {
                                i10 = 2;
                            } else if (iOrdinal3 == 2) {
                                i10 = 3;
                            } else {
                                if (iOrdinal3 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                i10 = 4;
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).k(c0799o2, i10);
                                return;
                            } catch (Exception e19) {
                                s1.h(e19, c0799o2);
                                return;
                            }
                        case 23:
                            a(obj2, c1521a);
                            return;
                        case 24:
                            b(obj2, c1521a);
                            return;
                        case 25:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                Cc.a aVarB2 = ((C4584g) s1Var2.f43902g).f48112a.b();
                                arrayList24.add(0, Double.valueOf(aVarB2.b() * (((Range) ((CameraCharacteristics) aVarB2.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r4.getLower()).intValue())));
                            } catch (Throwable th18) {
                                arrayList24 = Fe.b.V(th18);
                            }
                            c1521a.c(arrayList24);
                            return;
                        case 26:
                            c(obj2, c1521a);
                            return;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            try {
                                arrayList25.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.b().b()));
                            } catch (Throwable th19) {
                                arrayList25 = Fe.b.V(th19);
                            }
                            c1521a.c(arrayList25);
                            return;
                    }
                }
            });
        } else {
            x72.n(null);
        }
        X7 x73 = new X7(interfaceC4269f, pVar, obj, "dev.flutter.pigeon.camera_android.CameraApi.create");
        if (s1Var != null) {
            final int i10 = 2;
            x73.n(new InterfaceC4265b() { // from class: yc.n
                private final void a(Object obj2, C1521a c1521a) {
                    ArrayList arrayList = new ArrayList();
                    u uVar = (u) ((ArrayList) obj2).get(0);
                    C0800p c0800p = new C0800p(arrayList, c1521a, 23);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    int iOrdinal = uVar.ordinal();
                    int i102 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i102 = 2;
                    }
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        Bc.a aVar = (Bc.a) c4584g.f48112a.f5569a.get("EXPOSURE_LOCK");
                        aVar.f1667b = i102;
                        aVar.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0800p, 26), new C3641c(c0800p, 18));
                    } catch (Exception e7) {
                        s1.h(e7, c0800p);
                    }
                }

                private final void b(Object obj2, C1521a c1521a) {
                    w0 w0Var;
                    ArrayList arrayList = new ArrayList();
                    z zVar = (z) ((ArrayList) obj2).get(0);
                    C0801q c0801q = new C0801q(arrayList, c1521a, 22);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        w0 w0Var2 = null;
                        if (zVar == null) {
                            w0Var = null;
                        } else {
                            w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                        }
                        Dc.a aVarC = c4584g.f48112a.c();
                        if (w0Var != null && ((Double) w0Var.f46405a) != null && ((Double) w0Var.f46406b) != null) {
                            w0Var2 = w0Var;
                        }
                        aVarC.f2631c = w0Var2;
                        aVarC.b();
                        aVarC.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0801q, 22), new C3641c(c0801q, 14));
                    } catch (Exception e7) {
                        s1.h(e7, c0801q);
                    }
                }

                private final void c(Object obj2, C1521a c1521a) {
                    s1 s1Var2 = s1Var;
                    ArrayList arrayList = new ArrayList();
                    try {
                        Cc.a aVarB = ((C4584g) s1Var2.f43902g).f48112a.b();
                        arrayList.add(0, Double.valueOf(aVarB.b() * (((Range) ((CameraCharacteristics) aVarB.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r1.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = Fe.b.V(th);
                    }
                    c1521a.c(arrayList);
                }

                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listU;
                    int i102;
                    int i11 = 23;
                    int i12 = 21;
                    int i13 = 24;
                    int i14 = 3;
                    int i15 = 2;
                    int i16 = 1;
                    w0 w0Var = null;
                    s1 s1Var2 = s1Var;
                    int i17 = 0;
                    switch (i10) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                Activity activity = (Activity) s1Var2.f43896a;
                                if (activity == null) {
                                    listU = Collections.EMPTY_LIST;
                                } else {
                                    try {
                                        listU = Ba.c.u(activity);
                                    } catch (CameraAccessException e7) {
                                        throw new RuntimeException(e7);
                                    }
                                }
                                arrayList.add(0, listU);
                            } catch (Throwable th) {
                                arrayList = Fe.b.V(th);
                            }
                            c1521a.c(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            C0799o c0799o = new C0799o(arrayList2, c1521a, 22);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g = (C4584g) s1Var2.f43902g;
                                double dDoubleValue = d3.doubleValue();
                                Cc.a aVarB = c4584g.f48112a.b();
                                aVarB.f1982b = dDoubleValue / aVarB.b();
                                aVarB.a(c4584g.f48129s);
                                c4584g.h(new RunnableC4579b(i17, c0799o, aVarB), new C3641c(c0799o, 17));
                                return;
                            } catch (Exception e10) {
                                s1.g(e10, c0799o);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            y yVar = (y) arrayList4.get(1);
                            C0800p c0800p = new C0800p(arrayList3, c1521a, 22);
                            C4584g c4584g2 = (C4584g) s1Var2.f43902g;
                            if (c4584g2 != null) {
                                c4584g2.a();
                            }
                            boolean zBooleanValue = yVar.f48194e.booleanValue();
                            Y y10 = new Y(s1Var2, c0800p, str, yVar);
                            C4026b c4026b = (C4026b) s1Var2.f43898c;
                            if (c4026b.f45322b) {
                                y10.c("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            Activity activity2 = (Activity) s1Var2.f43896a;
                            if (Y0.e.checkSelfPermission(activity2, "android.permission.CAMERA") == 0 && (!zBooleanValue || Y0.e.checkSelfPermission(activity2, "android.permission.RECORD_AUDIO") == 0)) {
                                y10.c(null, null);
                                return;
                            }
                            ((s1) ((InterfaceC3965b) ((C3641c) s1Var2.f43899d).f41267b)).d(new Yc.g(new aa.f(27, c4026b, y10)));
                            c4026b.f45322b = true;
                            AbstractC1274b.a(activity2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            w wVar = (w) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g3 = (C4584g) s1Var2.f43902g;
                                int iOrdinal = wVar.ordinal();
                                if (iOrdinal == 0) {
                                    i15 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c4584g3.l(i15);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = Fe.b.V(th2);
                            }
                            c1521a.c(arrayList5);
                            return;
                        case 4:
                            ArrayList arrayList6 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            C0800p c0800p2 = new C0800p(arrayList6, c1521a, i13);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g4 = (C4584g) s1Var2.f43902g;
                                if (zVar != null) {
                                    w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                                }
                                c4584g4.m(c0800p2, w0Var);
                                return;
                            } catch (Exception e11) {
                                s1.h(e11, c0800p2);
                                return;
                            }
                        case 5:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6730f.floatValue()));
                            } catch (Throwable th3) {
                                arrayList7 = Fe.b.V(th3);
                            }
                            c1521a.c(arrayList7);
                            return;
                        case 6:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6729e.floatValue()));
                            } catch (Throwable th4) {
                                arrayList8 = Fe.b.V(th4);
                            }
                            c1521a.c(arrayList8);
                            return;
                        case 7:
                            ArrayList arrayList9 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj2).get(0);
                            C0801q c0801q = new C0801q(arrayList9, c1521a, i11);
                            C4584g c4584g5 = (C4584g) s1Var2.f43902g;
                            float fFloatValue = d5.floatValue();
                            Kc.a aVarG = c4584g5.f48112a.g();
                            Float f10 = aVarG.f6730f;
                            float fFloatValue2 = f10.floatValue();
                            Float f11 = aVarG.f6729e;
                            float fFloatValue3 = f11.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                c0801q.c(new C4592o("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f11, f10), null));
                                return;
                            }
                            aVarG.f6728d = Float.valueOf(fFloatValue);
                            aVarG.a(c4584g5.f48129s);
                            c4584g5.h(new RunnableC3307c(c0801q, i11), new C3641c(c0801q, 15));
                            return;
                        case 8:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th5) {
                                arrayList10 = Fe.b.V(th5);
                            }
                            try {
                                C4584g c4584g6 = (C4584g) s1Var2.f43902g;
                                if (!c4584g6.f48132v) {
                                    c4584g6.f48132v = true;
                                    CameraCaptureSession cameraCaptureSession = c4584g6.f48126p;
                                    if (cameraCaptureSession != null) {
                                        cameraCaptureSession.stopRepeating();
                                    }
                                }
                                arrayList10.add(0, null);
                                c1521a.c(arrayList10);
                                return;
                            } catch (CameraAccessException e12) {
                                throw new C4592o("CameraAccessException", e12.getMessage(), null);
                            }
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C4584g c4584g7 = (C4584g) s1Var2.f43902g;
                                c4584g7.f48132v = false;
                                c4584g7.h(null, new C4580c(c4584g7, i17));
                                arrayList11.add(0, null);
                            } catch (Throwable th6) {
                                arrayList11 = Fe.b.V(th6);
                            }
                            c1521a.c(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                s1Var2.getClass();
                                try {
                                    ((C4584g) s1Var2.f43902g).j(new t6.q(str2, (CameraManager) ((Activity) s1Var2.f43896a).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e13) {
                                    throw new C4592o("CameraAccessException", e13.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = Fe.b.V(th7);
                            }
                            c1521a.c(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C4584g c4584g8 = (C4584g) s1Var2.f43902g;
                                if (c4584g8.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i16 = 0;
                                        }
                                        if (i16 == 0) {
                                            throw new C4592o("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g8.f48130t.resume();
                                    } catch (IllegalStateException e14) {
                                        throw new C4592o("videoRecordingFailed", e14.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = Fe.b.V(th8);
                            }
                            c1521a.c(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                s1Var2.i((x) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                            } catch (Throwable th9) {
                                arrayList14 = Fe.b.V(th9);
                            }
                            c1521a.c(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C4584g c4584g9 = (C4584g) s1Var2.f43902g;
                                if (c4584g9 != null) {
                                    Log.i("Camera", "dispose");
                                    c4584g9.a();
                                    c4584g9.f48116e.release();
                                    Jc.a aVar = c4584g9.f48112a.f().f6005c;
                                    V1 v1 = aVar.f6003f;
                                    if (v1 != null) {
                                        aVar.f5998a.unregisterReceiver(v1);
                                        aVar.f6003f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                            } catch (Throwable th10) {
                                arrayList15 = Fe.b.V(th10);
                            }
                            c1521a.c(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g10 = (C4584g) s1Var2.f43902g;
                                int iOrdinal2 = tVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        i16 = 2;
                                    } else if (iOrdinal2 == 2) {
                                        i16 = 3;
                                    } else {
                                        if (iOrdinal2 != 3) {
                                            throw new IllegalStateException("Unreachable code");
                                        }
                                        i16 = 4;
                                    }
                                }
                                c4584g10.f48112a.f().f6006d = i16;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = Fe.b.V(th11);
                            }
                            c1521a.c(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C4584g) s1Var2.f43902g).f48112a.f().f6006d = 0;
                                arrayList17.add(0, null);
                            } catch (Throwable th12) {
                                arrayList17 = Fe.b.V(th12);
                            }
                            c1521a.c(arrayList17);
                            return;
                        case 16:
                            C0801q c0801q2 = new C0801q(new ArrayList(), c1521a, i12);
                            C4584g c4584g11 = (C4584g) s1Var2.f43902g;
                            C4585h c4585h = c4584g11.f48122l;
                            if (c4585h.f48138b != 1) {
                                c0801q2.c(new C4592o("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c4584g11.f48136z = c0801q2;
                            try {
                                c4584g11.f48133w = File.createTempFile("CAP", ".jpg", c4584g11.f48118g.getCacheDir());
                                S3.s sVar = c4584g11.f48134x;
                                sVar.getClass();
                                sVar.f11009b = new J5.n(2);
                                sVar.f11010c = new J5.n(2);
                                c4584g11.f48127q.setOnImageAvailableListener(c4584g11, c4584g11.f48123m);
                                Ac.a aVar2 = (Ac.a) c4584g11.f48112a.f5569a.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1257b != 1) {
                                    c4584g11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c4585h.f48138b = 2;
                                c4584g11.d();
                                return;
                            } catch (IOException | SecurityException e15) {
                                c4584g11.f48119h.l(c4584g11.f48136z, "cannotCreateFile", e15.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                s1Var2.n((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                            } catch (Throwable th13) {
                                arrayList18 = Fe.b.V(th13);
                            }
                            c1521a.c(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, s1Var2.o());
                            } catch (Throwable th14) {
                                arrayList19 = Fe.b.V(th14);
                            }
                            c1521a.c(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C4584g c4584g12 = (C4584g) s1Var2.f43902g;
                                if (c4584g12.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i16 = 0;
                                        }
                                        if (i16 == 0) {
                                            throw new C4592o("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g12.f48130t.pause();
                                    } catch (IllegalStateException e16) {
                                        throw new C4592o("videoRecordingFailed", e16.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = Fe.b.V(th15);
                            }
                            c1521a.c(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th16) {
                                arrayList21 = Fe.b.V(th16);
                            }
                            try {
                                C4584g c4584g13 = (C4584g) s1Var2.f43902g;
                                C4273j c4273j = (C4273j) s1Var2.f43901f;
                                c4584g13.getClass();
                                c4273j.a(new Wa.d(c4584g13, i14));
                                c4584g13.o(false, true);
                                Log.i("Camera", "startPreviewWithImageStream");
                                arrayList21.add(0, null);
                                c1521a.c(arrayList21);
                                return;
                            } catch (CameraAccessException e17) {
                                throw new C4592o("CameraAccessException", e17.getMessage(), null);
                            }
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th17) {
                                arrayList22 = Fe.b.V(th17);
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).p(null);
                                arrayList22.add(0, null);
                                c1521a.c(arrayList22);
                                return;
                            } catch (Exception e18) {
                                throw new C4592o(e18.getClass().getName(), e18.getMessage(), null);
                            }
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj2).get(0);
                            C0799o c0799o2 = new C0799o(arrayList23, c1521a, i12);
                            s1Var2.getClass();
                            int iOrdinal3 = vVar.ordinal();
                            if (iOrdinal3 == 0) {
                                i102 = 1;
                            } else if (iOrdinal3 == 1) {
                                i102 = 2;
                            } else if (iOrdinal3 == 2) {
                                i102 = 3;
                            } else {
                                if (iOrdinal3 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                i102 = 4;
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).k(c0799o2, i102);
                                return;
                            } catch (Exception e19) {
                                s1.h(e19, c0799o2);
                                return;
                            }
                        case 23:
                            a(obj2, c1521a);
                            return;
                        case 24:
                            b(obj2, c1521a);
                            return;
                        case 25:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                Cc.a aVarB2 = ((C4584g) s1Var2.f43902g).f48112a.b();
                                arrayList24.add(0, Double.valueOf(aVarB2.b() * (((Range) ((CameraCharacteristics) aVarB2.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r4.getLower()).intValue())));
                            } catch (Throwable th18) {
                                arrayList24 = Fe.b.V(th18);
                            }
                            c1521a.c(arrayList24);
                            return;
                        case 26:
                            c(obj2, c1521a);
                            return;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            try {
                                arrayList25.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.b().b()));
                            } catch (Throwable th19) {
                                arrayList25 = Fe.b.V(th19);
                            }
                            c1521a.c(arrayList25);
                            return;
                    }
                }
            });
        } else {
            x73.n(null);
        }
        X7 x74 = new X7(interfaceC4269f, pVar, obj, "dev.flutter.pigeon.camera_android.CameraApi.initialize");
        if (s1Var != null) {
            final int i11 = 12;
            x74.n(new InterfaceC4265b() { // from class: yc.n
                private final void a(Object obj2, C1521a c1521a) {
                    ArrayList arrayList = new ArrayList();
                    u uVar = (u) ((ArrayList) obj2).get(0);
                    C0800p c0800p = new C0800p(arrayList, c1521a, 23);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    int iOrdinal = uVar.ordinal();
                    int i102 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i102 = 2;
                    }
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        Bc.a aVar = (Bc.a) c4584g.f48112a.f5569a.get("EXPOSURE_LOCK");
                        aVar.f1667b = i102;
                        aVar.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0800p, 26), new C3641c(c0800p, 18));
                    } catch (Exception e7) {
                        s1.h(e7, c0800p);
                    }
                }

                private final void b(Object obj2, C1521a c1521a) {
                    w0 w0Var;
                    ArrayList arrayList = new ArrayList();
                    z zVar = (z) ((ArrayList) obj2).get(0);
                    C0801q c0801q = new C0801q(arrayList, c1521a, 22);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        w0 w0Var2 = null;
                        if (zVar == null) {
                            w0Var = null;
                        } else {
                            w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                        }
                        Dc.a aVarC = c4584g.f48112a.c();
                        if (w0Var != null && ((Double) w0Var.f46405a) != null && ((Double) w0Var.f46406b) != null) {
                            w0Var2 = w0Var;
                        }
                        aVarC.f2631c = w0Var2;
                        aVarC.b();
                        aVarC.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0801q, 22), new C3641c(c0801q, 14));
                    } catch (Exception e7) {
                        s1.h(e7, c0801q);
                    }
                }

                private final void c(Object obj2, C1521a c1521a) {
                    s1 s1Var2 = s1Var;
                    ArrayList arrayList = new ArrayList();
                    try {
                        Cc.a aVarB = ((C4584g) s1Var2.f43902g).f48112a.b();
                        arrayList.add(0, Double.valueOf(aVarB.b() * (((Range) ((CameraCharacteristics) aVarB.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r1.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = Fe.b.V(th);
                    }
                    c1521a.c(arrayList);
                }

                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listU;
                    int i102;
                    int i112 = 23;
                    int i12 = 21;
                    int i13 = 24;
                    int i14 = 3;
                    int i15 = 2;
                    int i16 = 1;
                    w0 w0Var = null;
                    s1 s1Var2 = s1Var;
                    int i17 = 0;
                    switch (i11) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                Activity activity = (Activity) s1Var2.f43896a;
                                if (activity == null) {
                                    listU = Collections.EMPTY_LIST;
                                } else {
                                    try {
                                        listU = Ba.c.u(activity);
                                    } catch (CameraAccessException e7) {
                                        throw new RuntimeException(e7);
                                    }
                                }
                                arrayList.add(0, listU);
                            } catch (Throwable th) {
                                arrayList = Fe.b.V(th);
                            }
                            c1521a.c(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            C0799o c0799o = new C0799o(arrayList2, c1521a, 22);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g = (C4584g) s1Var2.f43902g;
                                double dDoubleValue = d3.doubleValue();
                                Cc.a aVarB = c4584g.f48112a.b();
                                aVarB.f1982b = dDoubleValue / aVarB.b();
                                aVarB.a(c4584g.f48129s);
                                c4584g.h(new RunnableC4579b(i17, c0799o, aVarB), new C3641c(c0799o, 17));
                                return;
                            } catch (Exception e10) {
                                s1.g(e10, c0799o);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            y yVar = (y) arrayList4.get(1);
                            C0800p c0800p = new C0800p(arrayList3, c1521a, 22);
                            C4584g c4584g2 = (C4584g) s1Var2.f43902g;
                            if (c4584g2 != null) {
                                c4584g2.a();
                            }
                            boolean zBooleanValue = yVar.f48194e.booleanValue();
                            Y y10 = new Y(s1Var2, c0800p, str, yVar);
                            C4026b c4026b = (C4026b) s1Var2.f43898c;
                            if (c4026b.f45322b) {
                                y10.c("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            Activity activity2 = (Activity) s1Var2.f43896a;
                            if (Y0.e.checkSelfPermission(activity2, "android.permission.CAMERA") == 0 && (!zBooleanValue || Y0.e.checkSelfPermission(activity2, "android.permission.RECORD_AUDIO") == 0)) {
                                y10.c(null, null);
                                return;
                            }
                            ((s1) ((InterfaceC3965b) ((C3641c) s1Var2.f43899d).f41267b)).d(new Yc.g(new aa.f(27, c4026b, y10)));
                            c4026b.f45322b = true;
                            AbstractC1274b.a(activity2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            w wVar = (w) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g3 = (C4584g) s1Var2.f43902g;
                                int iOrdinal = wVar.ordinal();
                                if (iOrdinal == 0) {
                                    i15 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c4584g3.l(i15);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = Fe.b.V(th2);
                            }
                            c1521a.c(arrayList5);
                            return;
                        case 4:
                            ArrayList arrayList6 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            C0800p c0800p2 = new C0800p(arrayList6, c1521a, i13);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g4 = (C4584g) s1Var2.f43902g;
                                if (zVar != null) {
                                    w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                                }
                                c4584g4.m(c0800p2, w0Var);
                                return;
                            } catch (Exception e11) {
                                s1.h(e11, c0800p2);
                                return;
                            }
                        case 5:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6730f.floatValue()));
                            } catch (Throwable th3) {
                                arrayList7 = Fe.b.V(th3);
                            }
                            c1521a.c(arrayList7);
                            return;
                        case 6:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6729e.floatValue()));
                            } catch (Throwable th4) {
                                arrayList8 = Fe.b.V(th4);
                            }
                            c1521a.c(arrayList8);
                            return;
                        case 7:
                            ArrayList arrayList9 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj2).get(0);
                            C0801q c0801q = new C0801q(arrayList9, c1521a, i112);
                            C4584g c4584g5 = (C4584g) s1Var2.f43902g;
                            float fFloatValue = d5.floatValue();
                            Kc.a aVarG = c4584g5.f48112a.g();
                            Float f10 = aVarG.f6730f;
                            float fFloatValue2 = f10.floatValue();
                            Float f11 = aVarG.f6729e;
                            float fFloatValue3 = f11.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                c0801q.c(new C4592o("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f11, f10), null));
                                return;
                            }
                            aVarG.f6728d = Float.valueOf(fFloatValue);
                            aVarG.a(c4584g5.f48129s);
                            c4584g5.h(new RunnableC3307c(c0801q, i112), new C3641c(c0801q, 15));
                            return;
                        case 8:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th5) {
                                arrayList10 = Fe.b.V(th5);
                            }
                            try {
                                C4584g c4584g6 = (C4584g) s1Var2.f43902g;
                                if (!c4584g6.f48132v) {
                                    c4584g6.f48132v = true;
                                    CameraCaptureSession cameraCaptureSession = c4584g6.f48126p;
                                    if (cameraCaptureSession != null) {
                                        cameraCaptureSession.stopRepeating();
                                    }
                                }
                                arrayList10.add(0, null);
                                c1521a.c(arrayList10);
                                return;
                            } catch (CameraAccessException e12) {
                                throw new C4592o("CameraAccessException", e12.getMessage(), null);
                            }
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C4584g c4584g7 = (C4584g) s1Var2.f43902g;
                                c4584g7.f48132v = false;
                                c4584g7.h(null, new C4580c(c4584g7, i17));
                                arrayList11.add(0, null);
                            } catch (Throwable th6) {
                                arrayList11 = Fe.b.V(th6);
                            }
                            c1521a.c(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                s1Var2.getClass();
                                try {
                                    ((C4584g) s1Var2.f43902g).j(new t6.q(str2, (CameraManager) ((Activity) s1Var2.f43896a).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e13) {
                                    throw new C4592o("CameraAccessException", e13.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = Fe.b.V(th7);
                            }
                            c1521a.c(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C4584g c4584g8 = (C4584g) s1Var2.f43902g;
                                if (c4584g8.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i16 = 0;
                                        }
                                        if (i16 == 0) {
                                            throw new C4592o("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g8.f48130t.resume();
                                    } catch (IllegalStateException e14) {
                                        throw new C4592o("videoRecordingFailed", e14.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = Fe.b.V(th8);
                            }
                            c1521a.c(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                s1Var2.i((x) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                            } catch (Throwable th9) {
                                arrayList14 = Fe.b.V(th9);
                            }
                            c1521a.c(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C4584g c4584g9 = (C4584g) s1Var2.f43902g;
                                if (c4584g9 != null) {
                                    Log.i("Camera", "dispose");
                                    c4584g9.a();
                                    c4584g9.f48116e.release();
                                    Jc.a aVar = c4584g9.f48112a.f().f6005c;
                                    V1 v1 = aVar.f6003f;
                                    if (v1 != null) {
                                        aVar.f5998a.unregisterReceiver(v1);
                                        aVar.f6003f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                            } catch (Throwable th10) {
                                arrayList15 = Fe.b.V(th10);
                            }
                            c1521a.c(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g10 = (C4584g) s1Var2.f43902g;
                                int iOrdinal2 = tVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        i16 = 2;
                                    } else if (iOrdinal2 == 2) {
                                        i16 = 3;
                                    } else {
                                        if (iOrdinal2 != 3) {
                                            throw new IllegalStateException("Unreachable code");
                                        }
                                        i16 = 4;
                                    }
                                }
                                c4584g10.f48112a.f().f6006d = i16;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = Fe.b.V(th11);
                            }
                            c1521a.c(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C4584g) s1Var2.f43902g).f48112a.f().f6006d = 0;
                                arrayList17.add(0, null);
                            } catch (Throwable th12) {
                                arrayList17 = Fe.b.V(th12);
                            }
                            c1521a.c(arrayList17);
                            return;
                        case 16:
                            C0801q c0801q2 = new C0801q(new ArrayList(), c1521a, i12);
                            C4584g c4584g11 = (C4584g) s1Var2.f43902g;
                            C4585h c4585h = c4584g11.f48122l;
                            if (c4585h.f48138b != 1) {
                                c0801q2.c(new C4592o("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c4584g11.f48136z = c0801q2;
                            try {
                                c4584g11.f48133w = File.createTempFile("CAP", ".jpg", c4584g11.f48118g.getCacheDir());
                                S3.s sVar = c4584g11.f48134x;
                                sVar.getClass();
                                sVar.f11009b = new J5.n(2);
                                sVar.f11010c = new J5.n(2);
                                c4584g11.f48127q.setOnImageAvailableListener(c4584g11, c4584g11.f48123m);
                                Ac.a aVar2 = (Ac.a) c4584g11.f48112a.f5569a.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1257b != 1) {
                                    c4584g11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c4585h.f48138b = 2;
                                c4584g11.d();
                                return;
                            } catch (IOException | SecurityException e15) {
                                c4584g11.f48119h.l(c4584g11.f48136z, "cannotCreateFile", e15.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                s1Var2.n((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                            } catch (Throwable th13) {
                                arrayList18 = Fe.b.V(th13);
                            }
                            c1521a.c(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, s1Var2.o());
                            } catch (Throwable th14) {
                                arrayList19 = Fe.b.V(th14);
                            }
                            c1521a.c(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C4584g c4584g12 = (C4584g) s1Var2.f43902g;
                                if (c4584g12.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i16 = 0;
                                        }
                                        if (i16 == 0) {
                                            throw new C4592o("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g12.f48130t.pause();
                                    } catch (IllegalStateException e16) {
                                        throw new C4592o("videoRecordingFailed", e16.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = Fe.b.V(th15);
                            }
                            c1521a.c(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th16) {
                                arrayList21 = Fe.b.V(th16);
                            }
                            try {
                                C4584g c4584g13 = (C4584g) s1Var2.f43902g;
                                C4273j c4273j = (C4273j) s1Var2.f43901f;
                                c4584g13.getClass();
                                c4273j.a(new Wa.d(c4584g13, i14));
                                c4584g13.o(false, true);
                                Log.i("Camera", "startPreviewWithImageStream");
                                arrayList21.add(0, null);
                                c1521a.c(arrayList21);
                                return;
                            } catch (CameraAccessException e17) {
                                throw new C4592o("CameraAccessException", e17.getMessage(), null);
                            }
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th17) {
                                arrayList22 = Fe.b.V(th17);
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).p(null);
                                arrayList22.add(0, null);
                                c1521a.c(arrayList22);
                                return;
                            } catch (Exception e18) {
                                throw new C4592o(e18.getClass().getName(), e18.getMessage(), null);
                            }
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj2).get(0);
                            C0799o c0799o2 = new C0799o(arrayList23, c1521a, i12);
                            s1Var2.getClass();
                            int iOrdinal3 = vVar.ordinal();
                            if (iOrdinal3 == 0) {
                                i102 = 1;
                            } else if (iOrdinal3 == 1) {
                                i102 = 2;
                            } else if (iOrdinal3 == 2) {
                                i102 = 3;
                            } else {
                                if (iOrdinal3 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                i102 = 4;
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).k(c0799o2, i102);
                                return;
                            } catch (Exception e19) {
                                s1.h(e19, c0799o2);
                                return;
                            }
                        case 23:
                            a(obj2, c1521a);
                            return;
                        case 24:
                            b(obj2, c1521a);
                            return;
                        case 25:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                Cc.a aVarB2 = ((C4584g) s1Var2.f43902g).f48112a.b();
                                arrayList24.add(0, Double.valueOf(aVarB2.b() * (((Range) ((CameraCharacteristics) aVarB2.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r4.getLower()).intValue())));
                            } catch (Throwable th18) {
                                arrayList24 = Fe.b.V(th18);
                            }
                            c1521a.c(arrayList24);
                            return;
                        case 26:
                            c(obj2, c1521a);
                            return;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            try {
                                arrayList25.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.b().b()));
                            } catch (Throwable th19) {
                                arrayList25 = Fe.b.V(th19);
                            }
                            c1521a.c(arrayList25);
                            return;
                    }
                }
            });
        } else {
            x74.n(null);
        }
        X7 x75 = new X7(interfaceC4269f, pVar, obj, "dev.flutter.pigeon.camera_android.CameraApi.dispose");
        if (s1Var != null) {
            final int i12 = 13;
            x75.n(new InterfaceC4265b() { // from class: yc.n
                private final void a(Object obj2, C1521a c1521a) {
                    ArrayList arrayList = new ArrayList();
                    u uVar = (u) ((ArrayList) obj2).get(0);
                    C0800p c0800p = new C0800p(arrayList, c1521a, 23);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    int iOrdinal = uVar.ordinal();
                    int i102 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i102 = 2;
                    }
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        Bc.a aVar = (Bc.a) c4584g.f48112a.f5569a.get("EXPOSURE_LOCK");
                        aVar.f1667b = i102;
                        aVar.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0800p, 26), new C3641c(c0800p, 18));
                    } catch (Exception e7) {
                        s1.h(e7, c0800p);
                    }
                }

                private final void b(Object obj2, C1521a c1521a) {
                    w0 w0Var;
                    ArrayList arrayList = new ArrayList();
                    z zVar = (z) ((ArrayList) obj2).get(0);
                    C0801q c0801q = new C0801q(arrayList, c1521a, 22);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        w0 w0Var2 = null;
                        if (zVar == null) {
                            w0Var = null;
                        } else {
                            w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                        }
                        Dc.a aVarC = c4584g.f48112a.c();
                        if (w0Var != null && ((Double) w0Var.f46405a) != null && ((Double) w0Var.f46406b) != null) {
                            w0Var2 = w0Var;
                        }
                        aVarC.f2631c = w0Var2;
                        aVarC.b();
                        aVarC.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0801q, 22), new C3641c(c0801q, 14));
                    } catch (Exception e7) {
                        s1.h(e7, c0801q);
                    }
                }

                private final void c(Object obj2, C1521a c1521a) {
                    s1 s1Var2 = s1Var;
                    ArrayList arrayList = new ArrayList();
                    try {
                        Cc.a aVarB = ((C4584g) s1Var2.f43902g).f48112a.b();
                        arrayList.add(0, Double.valueOf(aVarB.b() * (((Range) ((CameraCharacteristics) aVarB.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r1.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = Fe.b.V(th);
                    }
                    c1521a.c(arrayList);
                }

                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listU;
                    int i102;
                    int i112 = 23;
                    int i122 = 21;
                    int i13 = 24;
                    int i14 = 3;
                    int i15 = 2;
                    int i16 = 1;
                    w0 w0Var = null;
                    s1 s1Var2 = s1Var;
                    int i17 = 0;
                    switch (i12) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                Activity activity = (Activity) s1Var2.f43896a;
                                if (activity == null) {
                                    listU = Collections.EMPTY_LIST;
                                } else {
                                    try {
                                        listU = Ba.c.u(activity);
                                    } catch (CameraAccessException e7) {
                                        throw new RuntimeException(e7);
                                    }
                                }
                                arrayList.add(0, listU);
                            } catch (Throwable th) {
                                arrayList = Fe.b.V(th);
                            }
                            c1521a.c(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            C0799o c0799o = new C0799o(arrayList2, c1521a, 22);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g = (C4584g) s1Var2.f43902g;
                                double dDoubleValue = d3.doubleValue();
                                Cc.a aVarB = c4584g.f48112a.b();
                                aVarB.f1982b = dDoubleValue / aVarB.b();
                                aVarB.a(c4584g.f48129s);
                                c4584g.h(new RunnableC4579b(i17, c0799o, aVarB), new C3641c(c0799o, 17));
                                return;
                            } catch (Exception e10) {
                                s1.g(e10, c0799o);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            y yVar = (y) arrayList4.get(1);
                            C0800p c0800p = new C0800p(arrayList3, c1521a, 22);
                            C4584g c4584g2 = (C4584g) s1Var2.f43902g;
                            if (c4584g2 != null) {
                                c4584g2.a();
                            }
                            boolean zBooleanValue = yVar.f48194e.booleanValue();
                            Y y10 = new Y(s1Var2, c0800p, str, yVar);
                            C4026b c4026b = (C4026b) s1Var2.f43898c;
                            if (c4026b.f45322b) {
                                y10.c("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            Activity activity2 = (Activity) s1Var2.f43896a;
                            if (Y0.e.checkSelfPermission(activity2, "android.permission.CAMERA") == 0 && (!zBooleanValue || Y0.e.checkSelfPermission(activity2, "android.permission.RECORD_AUDIO") == 0)) {
                                y10.c(null, null);
                                return;
                            }
                            ((s1) ((InterfaceC3965b) ((C3641c) s1Var2.f43899d).f41267b)).d(new Yc.g(new aa.f(27, c4026b, y10)));
                            c4026b.f45322b = true;
                            AbstractC1274b.a(activity2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            w wVar = (w) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g3 = (C4584g) s1Var2.f43902g;
                                int iOrdinal = wVar.ordinal();
                                if (iOrdinal == 0) {
                                    i15 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c4584g3.l(i15);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = Fe.b.V(th2);
                            }
                            c1521a.c(arrayList5);
                            return;
                        case 4:
                            ArrayList arrayList6 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            C0800p c0800p2 = new C0800p(arrayList6, c1521a, i13);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g4 = (C4584g) s1Var2.f43902g;
                                if (zVar != null) {
                                    w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                                }
                                c4584g4.m(c0800p2, w0Var);
                                return;
                            } catch (Exception e11) {
                                s1.h(e11, c0800p2);
                                return;
                            }
                        case 5:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6730f.floatValue()));
                            } catch (Throwable th3) {
                                arrayList7 = Fe.b.V(th3);
                            }
                            c1521a.c(arrayList7);
                            return;
                        case 6:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6729e.floatValue()));
                            } catch (Throwable th4) {
                                arrayList8 = Fe.b.V(th4);
                            }
                            c1521a.c(arrayList8);
                            return;
                        case 7:
                            ArrayList arrayList9 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj2).get(0);
                            C0801q c0801q = new C0801q(arrayList9, c1521a, i112);
                            C4584g c4584g5 = (C4584g) s1Var2.f43902g;
                            float fFloatValue = d5.floatValue();
                            Kc.a aVarG = c4584g5.f48112a.g();
                            Float f10 = aVarG.f6730f;
                            float fFloatValue2 = f10.floatValue();
                            Float f11 = aVarG.f6729e;
                            float fFloatValue3 = f11.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                c0801q.c(new C4592o("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f11, f10), null));
                                return;
                            }
                            aVarG.f6728d = Float.valueOf(fFloatValue);
                            aVarG.a(c4584g5.f48129s);
                            c4584g5.h(new RunnableC3307c(c0801q, i112), new C3641c(c0801q, 15));
                            return;
                        case 8:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th5) {
                                arrayList10 = Fe.b.V(th5);
                            }
                            try {
                                C4584g c4584g6 = (C4584g) s1Var2.f43902g;
                                if (!c4584g6.f48132v) {
                                    c4584g6.f48132v = true;
                                    CameraCaptureSession cameraCaptureSession = c4584g6.f48126p;
                                    if (cameraCaptureSession != null) {
                                        cameraCaptureSession.stopRepeating();
                                    }
                                }
                                arrayList10.add(0, null);
                                c1521a.c(arrayList10);
                                return;
                            } catch (CameraAccessException e12) {
                                throw new C4592o("CameraAccessException", e12.getMessage(), null);
                            }
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C4584g c4584g7 = (C4584g) s1Var2.f43902g;
                                c4584g7.f48132v = false;
                                c4584g7.h(null, new C4580c(c4584g7, i17));
                                arrayList11.add(0, null);
                            } catch (Throwable th6) {
                                arrayList11 = Fe.b.V(th6);
                            }
                            c1521a.c(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                s1Var2.getClass();
                                try {
                                    ((C4584g) s1Var2.f43902g).j(new t6.q(str2, (CameraManager) ((Activity) s1Var2.f43896a).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e13) {
                                    throw new C4592o("CameraAccessException", e13.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = Fe.b.V(th7);
                            }
                            c1521a.c(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C4584g c4584g8 = (C4584g) s1Var2.f43902g;
                                if (c4584g8.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i16 = 0;
                                        }
                                        if (i16 == 0) {
                                            throw new C4592o("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g8.f48130t.resume();
                                    } catch (IllegalStateException e14) {
                                        throw new C4592o("videoRecordingFailed", e14.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = Fe.b.V(th8);
                            }
                            c1521a.c(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                s1Var2.i((x) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                            } catch (Throwable th9) {
                                arrayList14 = Fe.b.V(th9);
                            }
                            c1521a.c(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C4584g c4584g9 = (C4584g) s1Var2.f43902g;
                                if (c4584g9 != null) {
                                    Log.i("Camera", "dispose");
                                    c4584g9.a();
                                    c4584g9.f48116e.release();
                                    Jc.a aVar = c4584g9.f48112a.f().f6005c;
                                    V1 v1 = aVar.f6003f;
                                    if (v1 != null) {
                                        aVar.f5998a.unregisterReceiver(v1);
                                        aVar.f6003f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                            } catch (Throwable th10) {
                                arrayList15 = Fe.b.V(th10);
                            }
                            c1521a.c(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g10 = (C4584g) s1Var2.f43902g;
                                int iOrdinal2 = tVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        i16 = 2;
                                    } else if (iOrdinal2 == 2) {
                                        i16 = 3;
                                    } else {
                                        if (iOrdinal2 != 3) {
                                            throw new IllegalStateException("Unreachable code");
                                        }
                                        i16 = 4;
                                    }
                                }
                                c4584g10.f48112a.f().f6006d = i16;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = Fe.b.V(th11);
                            }
                            c1521a.c(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C4584g) s1Var2.f43902g).f48112a.f().f6006d = 0;
                                arrayList17.add(0, null);
                            } catch (Throwable th12) {
                                arrayList17 = Fe.b.V(th12);
                            }
                            c1521a.c(arrayList17);
                            return;
                        case 16:
                            C0801q c0801q2 = new C0801q(new ArrayList(), c1521a, i122);
                            C4584g c4584g11 = (C4584g) s1Var2.f43902g;
                            C4585h c4585h = c4584g11.f48122l;
                            if (c4585h.f48138b != 1) {
                                c0801q2.c(new C4592o("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c4584g11.f48136z = c0801q2;
                            try {
                                c4584g11.f48133w = File.createTempFile("CAP", ".jpg", c4584g11.f48118g.getCacheDir());
                                S3.s sVar = c4584g11.f48134x;
                                sVar.getClass();
                                sVar.f11009b = new J5.n(2);
                                sVar.f11010c = new J5.n(2);
                                c4584g11.f48127q.setOnImageAvailableListener(c4584g11, c4584g11.f48123m);
                                Ac.a aVar2 = (Ac.a) c4584g11.f48112a.f5569a.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1257b != 1) {
                                    c4584g11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c4585h.f48138b = 2;
                                c4584g11.d();
                                return;
                            } catch (IOException | SecurityException e15) {
                                c4584g11.f48119h.l(c4584g11.f48136z, "cannotCreateFile", e15.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                s1Var2.n((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                            } catch (Throwable th13) {
                                arrayList18 = Fe.b.V(th13);
                            }
                            c1521a.c(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, s1Var2.o());
                            } catch (Throwable th14) {
                                arrayList19 = Fe.b.V(th14);
                            }
                            c1521a.c(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C4584g c4584g12 = (C4584g) s1Var2.f43902g;
                                if (c4584g12.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i16 = 0;
                                        }
                                        if (i16 == 0) {
                                            throw new C4592o("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g12.f48130t.pause();
                                    } catch (IllegalStateException e16) {
                                        throw new C4592o("videoRecordingFailed", e16.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = Fe.b.V(th15);
                            }
                            c1521a.c(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th16) {
                                arrayList21 = Fe.b.V(th16);
                            }
                            try {
                                C4584g c4584g13 = (C4584g) s1Var2.f43902g;
                                C4273j c4273j = (C4273j) s1Var2.f43901f;
                                c4584g13.getClass();
                                c4273j.a(new Wa.d(c4584g13, i14));
                                c4584g13.o(false, true);
                                Log.i("Camera", "startPreviewWithImageStream");
                                arrayList21.add(0, null);
                                c1521a.c(arrayList21);
                                return;
                            } catch (CameraAccessException e17) {
                                throw new C4592o("CameraAccessException", e17.getMessage(), null);
                            }
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th17) {
                                arrayList22 = Fe.b.V(th17);
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).p(null);
                                arrayList22.add(0, null);
                                c1521a.c(arrayList22);
                                return;
                            } catch (Exception e18) {
                                throw new C4592o(e18.getClass().getName(), e18.getMessage(), null);
                            }
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj2).get(0);
                            C0799o c0799o2 = new C0799o(arrayList23, c1521a, i122);
                            s1Var2.getClass();
                            int iOrdinal3 = vVar.ordinal();
                            if (iOrdinal3 == 0) {
                                i102 = 1;
                            } else if (iOrdinal3 == 1) {
                                i102 = 2;
                            } else if (iOrdinal3 == 2) {
                                i102 = 3;
                            } else {
                                if (iOrdinal3 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                i102 = 4;
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).k(c0799o2, i102);
                                return;
                            } catch (Exception e19) {
                                s1.h(e19, c0799o2);
                                return;
                            }
                        case 23:
                            a(obj2, c1521a);
                            return;
                        case 24:
                            b(obj2, c1521a);
                            return;
                        case 25:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                Cc.a aVarB2 = ((C4584g) s1Var2.f43902g).f48112a.b();
                                arrayList24.add(0, Double.valueOf(aVarB2.b() * (((Range) ((CameraCharacteristics) aVarB2.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r4.getLower()).intValue())));
                            } catch (Throwable th18) {
                                arrayList24 = Fe.b.V(th18);
                            }
                            c1521a.c(arrayList24);
                            return;
                        case 26:
                            c(obj2, c1521a);
                            return;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            try {
                                arrayList25.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.b().b()));
                            } catch (Throwable th19) {
                                arrayList25 = Fe.b.V(th19);
                            }
                            c1521a.c(arrayList25);
                            return;
                    }
                }
            });
        } else {
            x75.n(null);
        }
        X7 x76 = new X7(interfaceC4269f, pVar, obj, "dev.flutter.pigeon.camera_android.CameraApi.lockCaptureOrientation");
        if (s1Var != null) {
            final int i13 = 14;
            x76.n(new InterfaceC4265b() { // from class: yc.n
                private final void a(Object obj2, C1521a c1521a) {
                    ArrayList arrayList = new ArrayList();
                    u uVar = (u) ((ArrayList) obj2).get(0);
                    C0800p c0800p = new C0800p(arrayList, c1521a, 23);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    int iOrdinal = uVar.ordinal();
                    int i102 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i102 = 2;
                    }
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        Bc.a aVar = (Bc.a) c4584g.f48112a.f5569a.get("EXPOSURE_LOCK");
                        aVar.f1667b = i102;
                        aVar.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0800p, 26), new C3641c(c0800p, 18));
                    } catch (Exception e7) {
                        s1.h(e7, c0800p);
                    }
                }

                private final void b(Object obj2, C1521a c1521a) {
                    w0 w0Var;
                    ArrayList arrayList = new ArrayList();
                    z zVar = (z) ((ArrayList) obj2).get(0);
                    C0801q c0801q = new C0801q(arrayList, c1521a, 22);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        w0 w0Var2 = null;
                        if (zVar == null) {
                            w0Var = null;
                        } else {
                            w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                        }
                        Dc.a aVarC = c4584g.f48112a.c();
                        if (w0Var != null && ((Double) w0Var.f46405a) != null && ((Double) w0Var.f46406b) != null) {
                            w0Var2 = w0Var;
                        }
                        aVarC.f2631c = w0Var2;
                        aVarC.b();
                        aVarC.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0801q, 22), new C3641c(c0801q, 14));
                    } catch (Exception e7) {
                        s1.h(e7, c0801q);
                    }
                }

                private final void c(Object obj2, C1521a c1521a) {
                    s1 s1Var2 = s1Var;
                    ArrayList arrayList = new ArrayList();
                    try {
                        Cc.a aVarB = ((C4584g) s1Var2.f43902g).f48112a.b();
                        arrayList.add(0, Double.valueOf(aVarB.b() * (((Range) ((CameraCharacteristics) aVarB.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r1.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = Fe.b.V(th);
                    }
                    c1521a.c(arrayList);
                }

                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listU;
                    int i102;
                    int i112 = 23;
                    int i122 = 21;
                    int i132 = 24;
                    int i14 = 3;
                    int i15 = 2;
                    int i16 = 1;
                    w0 w0Var = null;
                    s1 s1Var2 = s1Var;
                    int i17 = 0;
                    switch (i13) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                Activity activity = (Activity) s1Var2.f43896a;
                                if (activity == null) {
                                    listU = Collections.EMPTY_LIST;
                                } else {
                                    try {
                                        listU = Ba.c.u(activity);
                                    } catch (CameraAccessException e7) {
                                        throw new RuntimeException(e7);
                                    }
                                }
                                arrayList.add(0, listU);
                            } catch (Throwable th) {
                                arrayList = Fe.b.V(th);
                            }
                            c1521a.c(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            C0799o c0799o = new C0799o(arrayList2, c1521a, 22);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g = (C4584g) s1Var2.f43902g;
                                double dDoubleValue = d3.doubleValue();
                                Cc.a aVarB = c4584g.f48112a.b();
                                aVarB.f1982b = dDoubleValue / aVarB.b();
                                aVarB.a(c4584g.f48129s);
                                c4584g.h(new RunnableC4579b(i17, c0799o, aVarB), new C3641c(c0799o, 17));
                                return;
                            } catch (Exception e10) {
                                s1.g(e10, c0799o);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            y yVar = (y) arrayList4.get(1);
                            C0800p c0800p = new C0800p(arrayList3, c1521a, 22);
                            C4584g c4584g2 = (C4584g) s1Var2.f43902g;
                            if (c4584g2 != null) {
                                c4584g2.a();
                            }
                            boolean zBooleanValue = yVar.f48194e.booleanValue();
                            Y y10 = new Y(s1Var2, c0800p, str, yVar);
                            C4026b c4026b = (C4026b) s1Var2.f43898c;
                            if (c4026b.f45322b) {
                                y10.c("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            Activity activity2 = (Activity) s1Var2.f43896a;
                            if (Y0.e.checkSelfPermission(activity2, "android.permission.CAMERA") == 0 && (!zBooleanValue || Y0.e.checkSelfPermission(activity2, "android.permission.RECORD_AUDIO") == 0)) {
                                y10.c(null, null);
                                return;
                            }
                            ((s1) ((InterfaceC3965b) ((C3641c) s1Var2.f43899d).f41267b)).d(new Yc.g(new aa.f(27, c4026b, y10)));
                            c4026b.f45322b = true;
                            AbstractC1274b.a(activity2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            w wVar = (w) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g3 = (C4584g) s1Var2.f43902g;
                                int iOrdinal = wVar.ordinal();
                                if (iOrdinal == 0) {
                                    i15 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c4584g3.l(i15);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = Fe.b.V(th2);
                            }
                            c1521a.c(arrayList5);
                            return;
                        case 4:
                            ArrayList arrayList6 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            C0800p c0800p2 = new C0800p(arrayList6, c1521a, i132);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g4 = (C4584g) s1Var2.f43902g;
                                if (zVar != null) {
                                    w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                                }
                                c4584g4.m(c0800p2, w0Var);
                                return;
                            } catch (Exception e11) {
                                s1.h(e11, c0800p2);
                                return;
                            }
                        case 5:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6730f.floatValue()));
                            } catch (Throwable th3) {
                                arrayList7 = Fe.b.V(th3);
                            }
                            c1521a.c(arrayList7);
                            return;
                        case 6:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6729e.floatValue()));
                            } catch (Throwable th4) {
                                arrayList8 = Fe.b.V(th4);
                            }
                            c1521a.c(arrayList8);
                            return;
                        case 7:
                            ArrayList arrayList9 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj2).get(0);
                            C0801q c0801q = new C0801q(arrayList9, c1521a, i112);
                            C4584g c4584g5 = (C4584g) s1Var2.f43902g;
                            float fFloatValue = d5.floatValue();
                            Kc.a aVarG = c4584g5.f48112a.g();
                            Float f10 = aVarG.f6730f;
                            float fFloatValue2 = f10.floatValue();
                            Float f11 = aVarG.f6729e;
                            float fFloatValue3 = f11.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                c0801q.c(new C4592o("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f11, f10), null));
                                return;
                            }
                            aVarG.f6728d = Float.valueOf(fFloatValue);
                            aVarG.a(c4584g5.f48129s);
                            c4584g5.h(new RunnableC3307c(c0801q, i112), new C3641c(c0801q, 15));
                            return;
                        case 8:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th5) {
                                arrayList10 = Fe.b.V(th5);
                            }
                            try {
                                C4584g c4584g6 = (C4584g) s1Var2.f43902g;
                                if (!c4584g6.f48132v) {
                                    c4584g6.f48132v = true;
                                    CameraCaptureSession cameraCaptureSession = c4584g6.f48126p;
                                    if (cameraCaptureSession != null) {
                                        cameraCaptureSession.stopRepeating();
                                    }
                                }
                                arrayList10.add(0, null);
                                c1521a.c(arrayList10);
                                return;
                            } catch (CameraAccessException e12) {
                                throw new C4592o("CameraAccessException", e12.getMessage(), null);
                            }
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C4584g c4584g7 = (C4584g) s1Var2.f43902g;
                                c4584g7.f48132v = false;
                                c4584g7.h(null, new C4580c(c4584g7, i17));
                                arrayList11.add(0, null);
                            } catch (Throwable th6) {
                                arrayList11 = Fe.b.V(th6);
                            }
                            c1521a.c(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                s1Var2.getClass();
                                try {
                                    ((C4584g) s1Var2.f43902g).j(new t6.q(str2, (CameraManager) ((Activity) s1Var2.f43896a).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e13) {
                                    throw new C4592o("CameraAccessException", e13.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = Fe.b.V(th7);
                            }
                            c1521a.c(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C4584g c4584g8 = (C4584g) s1Var2.f43902g;
                                if (c4584g8.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i16 = 0;
                                        }
                                        if (i16 == 0) {
                                            throw new C4592o("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g8.f48130t.resume();
                                    } catch (IllegalStateException e14) {
                                        throw new C4592o("videoRecordingFailed", e14.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = Fe.b.V(th8);
                            }
                            c1521a.c(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                s1Var2.i((x) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                            } catch (Throwable th9) {
                                arrayList14 = Fe.b.V(th9);
                            }
                            c1521a.c(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C4584g c4584g9 = (C4584g) s1Var2.f43902g;
                                if (c4584g9 != null) {
                                    Log.i("Camera", "dispose");
                                    c4584g9.a();
                                    c4584g9.f48116e.release();
                                    Jc.a aVar = c4584g9.f48112a.f().f6005c;
                                    V1 v1 = aVar.f6003f;
                                    if (v1 != null) {
                                        aVar.f5998a.unregisterReceiver(v1);
                                        aVar.f6003f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                            } catch (Throwable th10) {
                                arrayList15 = Fe.b.V(th10);
                            }
                            c1521a.c(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g10 = (C4584g) s1Var2.f43902g;
                                int iOrdinal2 = tVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        i16 = 2;
                                    } else if (iOrdinal2 == 2) {
                                        i16 = 3;
                                    } else {
                                        if (iOrdinal2 != 3) {
                                            throw new IllegalStateException("Unreachable code");
                                        }
                                        i16 = 4;
                                    }
                                }
                                c4584g10.f48112a.f().f6006d = i16;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = Fe.b.V(th11);
                            }
                            c1521a.c(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C4584g) s1Var2.f43902g).f48112a.f().f6006d = 0;
                                arrayList17.add(0, null);
                            } catch (Throwable th12) {
                                arrayList17 = Fe.b.V(th12);
                            }
                            c1521a.c(arrayList17);
                            return;
                        case 16:
                            C0801q c0801q2 = new C0801q(new ArrayList(), c1521a, i122);
                            C4584g c4584g11 = (C4584g) s1Var2.f43902g;
                            C4585h c4585h = c4584g11.f48122l;
                            if (c4585h.f48138b != 1) {
                                c0801q2.c(new C4592o("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c4584g11.f48136z = c0801q2;
                            try {
                                c4584g11.f48133w = File.createTempFile("CAP", ".jpg", c4584g11.f48118g.getCacheDir());
                                S3.s sVar = c4584g11.f48134x;
                                sVar.getClass();
                                sVar.f11009b = new J5.n(2);
                                sVar.f11010c = new J5.n(2);
                                c4584g11.f48127q.setOnImageAvailableListener(c4584g11, c4584g11.f48123m);
                                Ac.a aVar2 = (Ac.a) c4584g11.f48112a.f5569a.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1257b != 1) {
                                    c4584g11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c4585h.f48138b = 2;
                                c4584g11.d();
                                return;
                            } catch (IOException | SecurityException e15) {
                                c4584g11.f48119h.l(c4584g11.f48136z, "cannotCreateFile", e15.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                s1Var2.n((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                            } catch (Throwable th13) {
                                arrayList18 = Fe.b.V(th13);
                            }
                            c1521a.c(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, s1Var2.o());
                            } catch (Throwable th14) {
                                arrayList19 = Fe.b.V(th14);
                            }
                            c1521a.c(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C4584g c4584g12 = (C4584g) s1Var2.f43902g;
                                if (c4584g12.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i16 = 0;
                                        }
                                        if (i16 == 0) {
                                            throw new C4592o("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g12.f48130t.pause();
                                    } catch (IllegalStateException e16) {
                                        throw new C4592o("videoRecordingFailed", e16.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = Fe.b.V(th15);
                            }
                            c1521a.c(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th16) {
                                arrayList21 = Fe.b.V(th16);
                            }
                            try {
                                C4584g c4584g13 = (C4584g) s1Var2.f43902g;
                                C4273j c4273j = (C4273j) s1Var2.f43901f;
                                c4584g13.getClass();
                                c4273j.a(new Wa.d(c4584g13, i14));
                                c4584g13.o(false, true);
                                Log.i("Camera", "startPreviewWithImageStream");
                                arrayList21.add(0, null);
                                c1521a.c(arrayList21);
                                return;
                            } catch (CameraAccessException e17) {
                                throw new C4592o("CameraAccessException", e17.getMessage(), null);
                            }
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th17) {
                                arrayList22 = Fe.b.V(th17);
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).p(null);
                                arrayList22.add(0, null);
                                c1521a.c(arrayList22);
                                return;
                            } catch (Exception e18) {
                                throw new C4592o(e18.getClass().getName(), e18.getMessage(), null);
                            }
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj2).get(0);
                            C0799o c0799o2 = new C0799o(arrayList23, c1521a, i122);
                            s1Var2.getClass();
                            int iOrdinal3 = vVar.ordinal();
                            if (iOrdinal3 == 0) {
                                i102 = 1;
                            } else if (iOrdinal3 == 1) {
                                i102 = 2;
                            } else if (iOrdinal3 == 2) {
                                i102 = 3;
                            } else {
                                if (iOrdinal3 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                i102 = 4;
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).k(c0799o2, i102);
                                return;
                            } catch (Exception e19) {
                                s1.h(e19, c0799o2);
                                return;
                            }
                        case 23:
                            a(obj2, c1521a);
                            return;
                        case 24:
                            b(obj2, c1521a);
                            return;
                        case 25:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                Cc.a aVarB2 = ((C4584g) s1Var2.f43902g).f48112a.b();
                                arrayList24.add(0, Double.valueOf(aVarB2.b() * (((Range) ((CameraCharacteristics) aVarB2.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r4.getLower()).intValue())));
                            } catch (Throwable th18) {
                                arrayList24 = Fe.b.V(th18);
                            }
                            c1521a.c(arrayList24);
                            return;
                        case 26:
                            c(obj2, c1521a);
                            return;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            try {
                                arrayList25.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.b().b()));
                            } catch (Throwable th19) {
                                arrayList25 = Fe.b.V(th19);
                            }
                            c1521a.c(arrayList25);
                            return;
                    }
                }
            });
        } else {
            x76.n(null);
        }
        X7 x77 = new X7(interfaceC4269f, pVar, obj, "dev.flutter.pigeon.camera_android.CameraApi.unlockCaptureOrientation");
        if (s1Var != null) {
            final int i14 = 15;
            x77.n(new InterfaceC4265b() { // from class: yc.n
                private final void a(Object obj2, C1521a c1521a) {
                    ArrayList arrayList = new ArrayList();
                    u uVar = (u) ((ArrayList) obj2).get(0);
                    C0800p c0800p = new C0800p(arrayList, c1521a, 23);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    int iOrdinal = uVar.ordinal();
                    int i102 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i102 = 2;
                    }
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        Bc.a aVar = (Bc.a) c4584g.f48112a.f5569a.get("EXPOSURE_LOCK");
                        aVar.f1667b = i102;
                        aVar.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0800p, 26), new C3641c(c0800p, 18));
                    } catch (Exception e7) {
                        s1.h(e7, c0800p);
                    }
                }

                private final void b(Object obj2, C1521a c1521a) {
                    w0 w0Var;
                    ArrayList arrayList = new ArrayList();
                    z zVar = (z) ((ArrayList) obj2).get(0);
                    C0801q c0801q = new C0801q(arrayList, c1521a, 22);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        w0 w0Var2 = null;
                        if (zVar == null) {
                            w0Var = null;
                        } else {
                            w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                        }
                        Dc.a aVarC = c4584g.f48112a.c();
                        if (w0Var != null && ((Double) w0Var.f46405a) != null && ((Double) w0Var.f46406b) != null) {
                            w0Var2 = w0Var;
                        }
                        aVarC.f2631c = w0Var2;
                        aVarC.b();
                        aVarC.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0801q, 22), new C3641c(c0801q, 14));
                    } catch (Exception e7) {
                        s1.h(e7, c0801q);
                    }
                }

                private final void c(Object obj2, C1521a c1521a) {
                    s1 s1Var2 = s1Var;
                    ArrayList arrayList = new ArrayList();
                    try {
                        Cc.a aVarB = ((C4584g) s1Var2.f43902g).f48112a.b();
                        arrayList.add(0, Double.valueOf(aVarB.b() * (((Range) ((CameraCharacteristics) aVarB.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r1.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = Fe.b.V(th);
                    }
                    c1521a.c(arrayList);
                }

                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listU;
                    int i102;
                    int i112 = 23;
                    int i122 = 21;
                    int i132 = 24;
                    int i142 = 3;
                    int i15 = 2;
                    int i16 = 1;
                    w0 w0Var = null;
                    s1 s1Var2 = s1Var;
                    int i17 = 0;
                    switch (i14) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                Activity activity = (Activity) s1Var2.f43896a;
                                if (activity == null) {
                                    listU = Collections.EMPTY_LIST;
                                } else {
                                    try {
                                        listU = Ba.c.u(activity);
                                    } catch (CameraAccessException e7) {
                                        throw new RuntimeException(e7);
                                    }
                                }
                                arrayList.add(0, listU);
                            } catch (Throwable th) {
                                arrayList = Fe.b.V(th);
                            }
                            c1521a.c(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            C0799o c0799o = new C0799o(arrayList2, c1521a, 22);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g = (C4584g) s1Var2.f43902g;
                                double dDoubleValue = d3.doubleValue();
                                Cc.a aVarB = c4584g.f48112a.b();
                                aVarB.f1982b = dDoubleValue / aVarB.b();
                                aVarB.a(c4584g.f48129s);
                                c4584g.h(new RunnableC4579b(i17, c0799o, aVarB), new C3641c(c0799o, 17));
                                return;
                            } catch (Exception e10) {
                                s1.g(e10, c0799o);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            y yVar = (y) arrayList4.get(1);
                            C0800p c0800p = new C0800p(arrayList3, c1521a, 22);
                            C4584g c4584g2 = (C4584g) s1Var2.f43902g;
                            if (c4584g2 != null) {
                                c4584g2.a();
                            }
                            boolean zBooleanValue = yVar.f48194e.booleanValue();
                            Y y10 = new Y(s1Var2, c0800p, str, yVar);
                            C4026b c4026b = (C4026b) s1Var2.f43898c;
                            if (c4026b.f45322b) {
                                y10.c("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            Activity activity2 = (Activity) s1Var2.f43896a;
                            if (Y0.e.checkSelfPermission(activity2, "android.permission.CAMERA") == 0 && (!zBooleanValue || Y0.e.checkSelfPermission(activity2, "android.permission.RECORD_AUDIO") == 0)) {
                                y10.c(null, null);
                                return;
                            }
                            ((s1) ((InterfaceC3965b) ((C3641c) s1Var2.f43899d).f41267b)).d(new Yc.g(new aa.f(27, c4026b, y10)));
                            c4026b.f45322b = true;
                            AbstractC1274b.a(activity2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            w wVar = (w) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g3 = (C4584g) s1Var2.f43902g;
                                int iOrdinal = wVar.ordinal();
                                if (iOrdinal == 0) {
                                    i15 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c4584g3.l(i15);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = Fe.b.V(th2);
                            }
                            c1521a.c(arrayList5);
                            return;
                        case 4:
                            ArrayList arrayList6 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            C0800p c0800p2 = new C0800p(arrayList6, c1521a, i132);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g4 = (C4584g) s1Var2.f43902g;
                                if (zVar != null) {
                                    w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                                }
                                c4584g4.m(c0800p2, w0Var);
                                return;
                            } catch (Exception e11) {
                                s1.h(e11, c0800p2);
                                return;
                            }
                        case 5:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6730f.floatValue()));
                            } catch (Throwable th3) {
                                arrayList7 = Fe.b.V(th3);
                            }
                            c1521a.c(arrayList7);
                            return;
                        case 6:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6729e.floatValue()));
                            } catch (Throwable th4) {
                                arrayList8 = Fe.b.V(th4);
                            }
                            c1521a.c(arrayList8);
                            return;
                        case 7:
                            ArrayList arrayList9 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj2).get(0);
                            C0801q c0801q = new C0801q(arrayList9, c1521a, i112);
                            C4584g c4584g5 = (C4584g) s1Var2.f43902g;
                            float fFloatValue = d5.floatValue();
                            Kc.a aVarG = c4584g5.f48112a.g();
                            Float f10 = aVarG.f6730f;
                            float fFloatValue2 = f10.floatValue();
                            Float f11 = aVarG.f6729e;
                            float fFloatValue3 = f11.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                c0801q.c(new C4592o("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f11, f10), null));
                                return;
                            }
                            aVarG.f6728d = Float.valueOf(fFloatValue);
                            aVarG.a(c4584g5.f48129s);
                            c4584g5.h(new RunnableC3307c(c0801q, i112), new C3641c(c0801q, 15));
                            return;
                        case 8:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th5) {
                                arrayList10 = Fe.b.V(th5);
                            }
                            try {
                                C4584g c4584g6 = (C4584g) s1Var2.f43902g;
                                if (!c4584g6.f48132v) {
                                    c4584g6.f48132v = true;
                                    CameraCaptureSession cameraCaptureSession = c4584g6.f48126p;
                                    if (cameraCaptureSession != null) {
                                        cameraCaptureSession.stopRepeating();
                                    }
                                }
                                arrayList10.add(0, null);
                                c1521a.c(arrayList10);
                                return;
                            } catch (CameraAccessException e12) {
                                throw new C4592o("CameraAccessException", e12.getMessage(), null);
                            }
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C4584g c4584g7 = (C4584g) s1Var2.f43902g;
                                c4584g7.f48132v = false;
                                c4584g7.h(null, new C4580c(c4584g7, i17));
                                arrayList11.add(0, null);
                            } catch (Throwable th6) {
                                arrayList11 = Fe.b.V(th6);
                            }
                            c1521a.c(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                s1Var2.getClass();
                                try {
                                    ((C4584g) s1Var2.f43902g).j(new t6.q(str2, (CameraManager) ((Activity) s1Var2.f43896a).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e13) {
                                    throw new C4592o("CameraAccessException", e13.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = Fe.b.V(th7);
                            }
                            c1521a.c(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C4584g c4584g8 = (C4584g) s1Var2.f43902g;
                                if (c4584g8.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i16 = 0;
                                        }
                                        if (i16 == 0) {
                                            throw new C4592o("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g8.f48130t.resume();
                                    } catch (IllegalStateException e14) {
                                        throw new C4592o("videoRecordingFailed", e14.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = Fe.b.V(th8);
                            }
                            c1521a.c(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                s1Var2.i((x) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                            } catch (Throwable th9) {
                                arrayList14 = Fe.b.V(th9);
                            }
                            c1521a.c(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C4584g c4584g9 = (C4584g) s1Var2.f43902g;
                                if (c4584g9 != null) {
                                    Log.i("Camera", "dispose");
                                    c4584g9.a();
                                    c4584g9.f48116e.release();
                                    Jc.a aVar = c4584g9.f48112a.f().f6005c;
                                    V1 v1 = aVar.f6003f;
                                    if (v1 != null) {
                                        aVar.f5998a.unregisterReceiver(v1);
                                        aVar.f6003f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                            } catch (Throwable th10) {
                                arrayList15 = Fe.b.V(th10);
                            }
                            c1521a.c(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g10 = (C4584g) s1Var2.f43902g;
                                int iOrdinal2 = tVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        i16 = 2;
                                    } else if (iOrdinal2 == 2) {
                                        i16 = 3;
                                    } else {
                                        if (iOrdinal2 != 3) {
                                            throw new IllegalStateException("Unreachable code");
                                        }
                                        i16 = 4;
                                    }
                                }
                                c4584g10.f48112a.f().f6006d = i16;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = Fe.b.V(th11);
                            }
                            c1521a.c(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C4584g) s1Var2.f43902g).f48112a.f().f6006d = 0;
                                arrayList17.add(0, null);
                            } catch (Throwable th12) {
                                arrayList17 = Fe.b.V(th12);
                            }
                            c1521a.c(arrayList17);
                            return;
                        case 16:
                            C0801q c0801q2 = new C0801q(new ArrayList(), c1521a, i122);
                            C4584g c4584g11 = (C4584g) s1Var2.f43902g;
                            C4585h c4585h = c4584g11.f48122l;
                            if (c4585h.f48138b != 1) {
                                c0801q2.c(new C4592o("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c4584g11.f48136z = c0801q2;
                            try {
                                c4584g11.f48133w = File.createTempFile("CAP", ".jpg", c4584g11.f48118g.getCacheDir());
                                S3.s sVar = c4584g11.f48134x;
                                sVar.getClass();
                                sVar.f11009b = new J5.n(2);
                                sVar.f11010c = new J5.n(2);
                                c4584g11.f48127q.setOnImageAvailableListener(c4584g11, c4584g11.f48123m);
                                Ac.a aVar2 = (Ac.a) c4584g11.f48112a.f5569a.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1257b != 1) {
                                    c4584g11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c4585h.f48138b = 2;
                                c4584g11.d();
                                return;
                            } catch (IOException | SecurityException e15) {
                                c4584g11.f48119h.l(c4584g11.f48136z, "cannotCreateFile", e15.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                s1Var2.n((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                            } catch (Throwable th13) {
                                arrayList18 = Fe.b.V(th13);
                            }
                            c1521a.c(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, s1Var2.o());
                            } catch (Throwable th14) {
                                arrayList19 = Fe.b.V(th14);
                            }
                            c1521a.c(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C4584g c4584g12 = (C4584g) s1Var2.f43902g;
                                if (c4584g12.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i16 = 0;
                                        }
                                        if (i16 == 0) {
                                            throw new C4592o("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g12.f48130t.pause();
                                    } catch (IllegalStateException e16) {
                                        throw new C4592o("videoRecordingFailed", e16.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = Fe.b.V(th15);
                            }
                            c1521a.c(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th16) {
                                arrayList21 = Fe.b.V(th16);
                            }
                            try {
                                C4584g c4584g13 = (C4584g) s1Var2.f43902g;
                                C4273j c4273j = (C4273j) s1Var2.f43901f;
                                c4584g13.getClass();
                                c4273j.a(new Wa.d(c4584g13, i142));
                                c4584g13.o(false, true);
                                Log.i("Camera", "startPreviewWithImageStream");
                                arrayList21.add(0, null);
                                c1521a.c(arrayList21);
                                return;
                            } catch (CameraAccessException e17) {
                                throw new C4592o("CameraAccessException", e17.getMessage(), null);
                            }
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th17) {
                                arrayList22 = Fe.b.V(th17);
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).p(null);
                                arrayList22.add(0, null);
                                c1521a.c(arrayList22);
                                return;
                            } catch (Exception e18) {
                                throw new C4592o(e18.getClass().getName(), e18.getMessage(), null);
                            }
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj2).get(0);
                            C0799o c0799o2 = new C0799o(arrayList23, c1521a, i122);
                            s1Var2.getClass();
                            int iOrdinal3 = vVar.ordinal();
                            if (iOrdinal3 == 0) {
                                i102 = 1;
                            } else if (iOrdinal3 == 1) {
                                i102 = 2;
                            } else if (iOrdinal3 == 2) {
                                i102 = 3;
                            } else {
                                if (iOrdinal3 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                i102 = 4;
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).k(c0799o2, i102);
                                return;
                            } catch (Exception e19) {
                                s1.h(e19, c0799o2);
                                return;
                            }
                        case 23:
                            a(obj2, c1521a);
                            return;
                        case 24:
                            b(obj2, c1521a);
                            return;
                        case 25:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                Cc.a aVarB2 = ((C4584g) s1Var2.f43902g).f48112a.b();
                                arrayList24.add(0, Double.valueOf(aVarB2.b() * (((Range) ((CameraCharacteristics) aVarB2.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r4.getLower()).intValue())));
                            } catch (Throwable th18) {
                                arrayList24 = Fe.b.V(th18);
                            }
                            c1521a.c(arrayList24);
                            return;
                        case 26:
                            c(obj2, c1521a);
                            return;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            try {
                                arrayList25.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.b().b()));
                            } catch (Throwable th19) {
                                arrayList25 = Fe.b.V(th19);
                            }
                            c1521a.c(arrayList25);
                            return;
                    }
                }
            });
        } else {
            x77.n(null);
        }
        X7 x78 = new X7(interfaceC4269f, pVar, obj, "dev.flutter.pigeon.camera_android.CameraApi.takePicture");
        if (s1Var != null) {
            final int i15 = 16;
            x78.n(new InterfaceC4265b() { // from class: yc.n
                private final void a(Object obj2, C1521a c1521a) {
                    ArrayList arrayList = new ArrayList();
                    u uVar = (u) ((ArrayList) obj2).get(0);
                    C0800p c0800p = new C0800p(arrayList, c1521a, 23);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    int iOrdinal = uVar.ordinal();
                    int i102 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i102 = 2;
                    }
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        Bc.a aVar = (Bc.a) c4584g.f48112a.f5569a.get("EXPOSURE_LOCK");
                        aVar.f1667b = i102;
                        aVar.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0800p, 26), new C3641c(c0800p, 18));
                    } catch (Exception e7) {
                        s1.h(e7, c0800p);
                    }
                }

                private final void b(Object obj2, C1521a c1521a) {
                    w0 w0Var;
                    ArrayList arrayList = new ArrayList();
                    z zVar = (z) ((ArrayList) obj2).get(0);
                    C0801q c0801q = new C0801q(arrayList, c1521a, 22);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        w0 w0Var2 = null;
                        if (zVar == null) {
                            w0Var = null;
                        } else {
                            w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                        }
                        Dc.a aVarC = c4584g.f48112a.c();
                        if (w0Var != null && ((Double) w0Var.f46405a) != null && ((Double) w0Var.f46406b) != null) {
                            w0Var2 = w0Var;
                        }
                        aVarC.f2631c = w0Var2;
                        aVarC.b();
                        aVarC.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0801q, 22), new C3641c(c0801q, 14));
                    } catch (Exception e7) {
                        s1.h(e7, c0801q);
                    }
                }

                private final void c(Object obj2, C1521a c1521a) {
                    s1 s1Var2 = s1Var;
                    ArrayList arrayList = new ArrayList();
                    try {
                        Cc.a aVarB = ((C4584g) s1Var2.f43902g).f48112a.b();
                        arrayList.add(0, Double.valueOf(aVarB.b() * (((Range) ((CameraCharacteristics) aVarB.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r1.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = Fe.b.V(th);
                    }
                    c1521a.c(arrayList);
                }

                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listU;
                    int i102;
                    int i112 = 23;
                    int i122 = 21;
                    int i132 = 24;
                    int i142 = 3;
                    int i152 = 2;
                    int i16 = 1;
                    w0 w0Var = null;
                    s1 s1Var2 = s1Var;
                    int i17 = 0;
                    switch (i15) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                Activity activity = (Activity) s1Var2.f43896a;
                                if (activity == null) {
                                    listU = Collections.EMPTY_LIST;
                                } else {
                                    try {
                                        listU = Ba.c.u(activity);
                                    } catch (CameraAccessException e7) {
                                        throw new RuntimeException(e7);
                                    }
                                }
                                arrayList.add(0, listU);
                            } catch (Throwable th) {
                                arrayList = Fe.b.V(th);
                            }
                            c1521a.c(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            C0799o c0799o = new C0799o(arrayList2, c1521a, 22);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g = (C4584g) s1Var2.f43902g;
                                double dDoubleValue = d3.doubleValue();
                                Cc.a aVarB = c4584g.f48112a.b();
                                aVarB.f1982b = dDoubleValue / aVarB.b();
                                aVarB.a(c4584g.f48129s);
                                c4584g.h(new RunnableC4579b(i17, c0799o, aVarB), new C3641c(c0799o, 17));
                                return;
                            } catch (Exception e10) {
                                s1.g(e10, c0799o);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            y yVar = (y) arrayList4.get(1);
                            C0800p c0800p = new C0800p(arrayList3, c1521a, 22);
                            C4584g c4584g2 = (C4584g) s1Var2.f43902g;
                            if (c4584g2 != null) {
                                c4584g2.a();
                            }
                            boolean zBooleanValue = yVar.f48194e.booleanValue();
                            Y y10 = new Y(s1Var2, c0800p, str, yVar);
                            C4026b c4026b = (C4026b) s1Var2.f43898c;
                            if (c4026b.f45322b) {
                                y10.c("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            Activity activity2 = (Activity) s1Var2.f43896a;
                            if (Y0.e.checkSelfPermission(activity2, "android.permission.CAMERA") == 0 && (!zBooleanValue || Y0.e.checkSelfPermission(activity2, "android.permission.RECORD_AUDIO") == 0)) {
                                y10.c(null, null);
                                return;
                            }
                            ((s1) ((InterfaceC3965b) ((C3641c) s1Var2.f43899d).f41267b)).d(new Yc.g(new aa.f(27, c4026b, y10)));
                            c4026b.f45322b = true;
                            AbstractC1274b.a(activity2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            w wVar = (w) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g3 = (C4584g) s1Var2.f43902g;
                                int iOrdinal = wVar.ordinal();
                                if (iOrdinal == 0) {
                                    i152 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c4584g3.l(i152);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = Fe.b.V(th2);
                            }
                            c1521a.c(arrayList5);
                            return;
                        case 4:
                            ArrayList arrayList6 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            C0800p c0800p2 = new C0800p(arrayList6, c1521a, i132);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g4 = (C4584g) s1Var2.f43902g;
                                if (zVar != null) {
                                    w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                                }
                                c4584g4.m(c0800p2, w0Var);
                                return;
                            } catch (Exception e11) {
                                s1.h(e11, c0800p2);
                                return;
                            }
                        case 5:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6730f.floatValue()));
                            } catch (Throwable th3) {
                                arrayList7 = Fe.b.V(th3);
                            }
                            c1521a.c(arrayList7);
                            return;
                        case 6:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6729e.floatValue()));
                            } catch (Throwable th4) {
                                arrayList8 = Fe.b.V(th4);
                            }
                            c1521a.c(arrayList8);
                            return;
                        case 7:
                            ArrayList arrayList9 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj2).get(0);
                            C0801q c0801q = new C0801q(arrayList9, c1521a, i112);
                            C4584g c4584g5 = (C4584g) s1Var2.f43902g;
                            float fFloatValue = d5.floatValue();
                            Kc.a aVarG = c4584g5.f48112a.g();
                            Float f10 = aVarG.f6730f;
                            float fFloatValue2 = f10.floatValue();
                            Float f11 = aVarG.f6729e;
                            float fFloatValue3 = f11.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                c0801q.c(new C4592o("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f11, f10), null));
                                return;
                            }
                            aVarG.f6728d = Float.valueOf(fFloatValue);
                            aVarG.a(c4584g5.f48129s);
                            c4584g5.h(new RunnableC3307c(c0801q, i112), new C3641c(c0801q, 15));
                            return;
                        case 8:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th5) {
                                arrayList10 = Fe.b.V(th5);
                            }
                            try {
                                C4584g c4584g6 = (C4584g) s1Var2.f43902g;
                                if (!c4584g6.f48132v) {
                                    c4584g6.f48132v = true;
                                    CameraCaptureSession cameraCaptureSession = c4584g6.f48126p;
                                    if (cameraCaptureSession != null) {
                                        cameraCaptureSession.stopRepeating();
                                    }
                                }
                                arrayList10.add(0, null);
                                c1521a.c(arrayList10);
                                return;
                            } catch (CameraAccessException e12) {
                                throw new C4592o("CameraAccessException", e12.getMessage(), null);
                            }
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C4584g c4584g7 = (C4584g) s1Var2.f43902g;
                                c4584g7.f48132v = false;
                                c4584g7.h(null, new C4580c(c4584g7, i17));
                                arrayList11.add(0, null);
                            } catch (Throwable th6) {
                                arrayList11 = Fe.b.V(th6);
                            }
                            c1521a.c(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                s1Var2.getClass();
                                try {
                                    ((C4584g) s1Var2.f43902g).j(new t6.q(str2, (CameraManager) ((Activity) s1Var2.f43896a).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e13) {
                                    throw new C4592o("CameraAccessException", e13.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = Fe.b.V(th7);
                            }
                            c1521a.c(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C4584g c4584g8 = (C4584g) s1Var2.f43902g;
                                if (c4584g8.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i16 = 0;
                                        }
                                        if (i16 == 0) {
                                            throw new C4592o("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g8.f48130t.resume();
                                    } catch (IllegalStateException e14) {
                                        throw new C4592o("videoRecordingFailed", e14.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = Fe.b.V(th8);
                            }
                            c1521a.c(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                s1Var2.i((x) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                            } catch (Throwable th9) {
                                arrayList14 = Fe.b.V(th9);
                            }
                            c1521a.c(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C4584g c4584g9 = (C4584g) s1Var2.f43902g;
                                if (c4584g9 != null) {
                                    Log.i("Camera", "dispose");
                                    c4584g9.a();
                                    c4584g9.f48116e.release();
                                    Jc.a aVar = c4584g9.f48112a.f().f6005c;
                                    V1 v1 = aVar.f6003f;
                                    if (v1 != null) {
                                        aVar.f5998a.unregisterReceiver(v1);
                                        aVar.f6003f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                            } catch (Throwable th10) {
                                arrayList15 = Fe.b.V(th10);
                            }
                            c1521a.c(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g10 = (C4584g) s1Var2.f43902g;
                                int iOrdinal2 = tVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        i16 = 2;
                                    } else if (iOrdinal2 == 2) {
                                        i16 = 3;
                                    } else {
                                        if (iOrdinal2 != 3) {
                                            throw new IllegalStateException("Unreachable code");
                                        }
                                        i16 = 4;
                                    }
                                }
                                c4584g10.f48112a.f().f6006d = i16;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = Fe.b.V(th11);
                            }
                            c1521a.c(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C4584g) s1Var2.f43902g).f48112a.f().f6006d = 0;
                                arrayList17.add(0, null);
                            } catch (Throwable th12) {
                                arrayList17 = Fe.b.V(th12);
                            }
                            c1521a.c(arrayList17);
                            return;
                        case 16:
                            C0801q c0801q2 = new C0801q(new ArrayList(), c1521a, i122);
                            C4584g c4584g11 = (C4584g) s1Var2.f43902g;
                            C4585h c4585h = c4584g11.f48122l;
                            if (c4585h.f48138b != 1) {
                                c0801q2.c(new C4592o("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c4584g11.f48136z = c0801q2;
                            try {
                                c4584g11.f48133w = File.createTempFile("CAP", ".jpg", c4584g11.f48118g.getCacheDir());
                                S3.s sVar = c4584g11.f48134x;
                                sVar.getClass();
                                sVar.f11009b = new J5.n(2);
                                sVar.f11010c = new J5.n(2);
                                c4584g11.f48127q.setOnImageAvailableListener(c4584g11, c4584g11.f48123m);
                                Ac.a aVar2 = (Ac.a) c4584g11.f48112a.f5569a.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1257b != 1) {
                                    c4584g11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c4585h.f48138b = 2;
                                c4584g11.d();
                                return;
                            } catch (IOException | SecurityException e15) {
                                c4584g11.f48119h.l(c4584g11.f48136z, "cannotCreateFile", e15.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                s1Var2.n((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                            } catch (Throwable th13) {
                                arrayList18 = Fe.b.V(th13);
                            }
                            c1521a.c(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, s1Var2.o());
                            } catch (Throwable th14) {
                                arrayList19 = Fe.b.V(th14);
                            }
                            c1521a.c(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C4584g c4584g12 = (C4584g) s1Var2.f43902g;
                                if (c4584g12.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i16 = 0;
                                        }
                                        if (i16 == 0) {
                                            throw new C4592o("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g12.f48130t.pause();
                                    } catch (IllegalStateException e16) {
                                        throw new C4592o("videoRecordingFailed", e16.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = Fe.b.V(th15);
                            }
                            c1521a.c(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th16) {
                                arrayList21 = Fe.b.V(th16);
                            }
                            try {
                                C4584g c4584g13 = (C4584g) s1Var2.f43902g;
                                C4273j c4273j = (C4273j) s1Var2.f43901f;
                                c4584g13.getClass();
                                c4273j.a(new Wa.d(c4584g13, i142));
                                c4584g13.o(false, true);
                                Log.i("Camera", "startPreviewWithImageStream");
                                arrayList21.add(0, null);
                                c1521a.c(arrayList21);
                                return;
                            } catch (CameraAccessException e17) {
                                throw new C4592o("CameraAccessException", e17.getMessage(), null);
                            }
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th17) {
                                arrayList22 = Fe.b.V(th17);
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).p(null);
                                arrayList22.add(0, null);
                                c1521a.c(arrayList22);
                                return;
                            } catch (Exception e18) {
                                throw new C4592o(e18.getClass().getName(), e18.getMessage(), null);
                            }
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj2).get(0);
                            C0799o c0799o2 = new C0799o(arrayList23, c1521a, i122);
                            s1Var2.getClass();
                            int iOrdinal3 = vVar.ordinal();
                            if (iOrdinal3 == 0) {
                                i102 = 1;
                            } else if (iOrdinal3 == 1) {
                                i102 = 2;
                            } else if (iOrdinal3 == 2) {
                                i102 = 3;
                            } else {
                                if (iOrdinal3 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                i102 = 4;
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).k(c0799o2, i102);
                                return;
                            } catch (Exception e19) {
                                s1.h(e19, c0799o2);
                                return;
                            }
                        case 23:
                            a(obj2, c1521a);
                            return;
                        case 24:
                            b(obj2, c1521a);
                            return;
                        case 25:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                Cc.a aVarB2 = ((C4584g) s1Var2.f43902g).f48112a.b();
                                arrayList24.add(0, Double.valueOf(aVarB2.b() * (((Range) ((CameraCharacteristics) aVarB2.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r4.getLower()).intValue())));
                            } catch (Throwable th18) {
                                arrayList24 = Fe.b.V(th18);
                            }
                            c1521a.c(arrayList24);
                            return;
                        case 26:
                            c(obj2, c1521a);
                            return;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            try {
                                arrayList25.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.b().b()));
                            } catch (Throwable th19) {
                                arrayList25 = Fe.b.V(th19);
                            }
                            c1521a.c(arrayList25);
                            return;
                    }
                }
            });
        } else {
            x78.n(null);
        }
        X7 x79 = new X7(interfaceC4269f, pVar, obj, "dev.flutter.pigeon.camera_android.CameraApi.startVideoRecording");
        if (s1Var != null) {
            final int i16 = 17;
            x79.n(new InterfaceC4265b() { // from class: yc.n
                private final void a(Object obj2, C1521a c1521a) {
                    ArrayList arrayList = new ArrayList();
                    u uVar = (u) ((ArrayList) obj2).get(0);
                    C0800p c0800p = new C0800p(arrayList, c1521a, 23);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    int iOrdinal = uVar.ordinal();
                    int i102 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i102 = 2;
                    }
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        Bc.a aVar = (Bc.a) c4584g.f48112a.f5569a.get("EXPOSURE_LOCK");
                        aVar.f1667b = i102;
                        aVar.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0800p, 26), new C3641c(c0800p, 18));
                    } catch (Exception e7) {
                        s1.h(e7, c0800p);
                    }
                }

                private final void b(Object obj2, C1521a c1521a) {
                    w0 w0Var;
                    ArrayList arrayList = new ArrayList();
                    z zVar = (z) ((ArrayList) obj2).get(0);
                    C0801q c0801q = new C0801q(arrayList, c1521a, 22);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        w0 w0Var2 = null;
                        if (zVar == null) {
                            w0Var = null;
                        } else {
                            w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                        }
                        Dc.a aVarC = c4584g.f48112a.c();
                        if (w0Var != null && ((Double) w0Var.f46405a) != null && ((Double) w0Var.f46406b) != null) {
                            w0Var2 = w0Var;
                        }
                        aVarC.f2631c = w0Var2;
                        aVarC.b();
                        aVarC.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0801q, 22), new C3641c(c0801q, 14));
                    } catch (Exception e7) {
                        s1.h(e7, c0801q);
                    }
                }

                private final void c(Object obj2, C1521a c1521a) {
                    s1 s1Var2 = s1Var;
                    ArrayList arrayList = new ArrayList();
                    try {
                        Cc.a aVarB = ((C4584g) s1Var2.f43902g).f48112a.b();
                        arrayList.add(0, Double.valueOf(aVarB.b() * (((Range) ((CameraCharacteristics) aVarB.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r1.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = Fe.b.V(th);
                    }
                    c1521a.c(arrayList);
                }

                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listU;
                    int i102;
                    int i112 = 23;
                    int i122 = 21;
                    int i132 = 24;
                    int i142 = 3;
                    int i152 = 2;
                    int i162 = 1;
                    w0 w0Var = null;
                    s1 s1Var2 = s1Var;
                    int i17 = 0;
                    switch (i16) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                Activity activity = (Activity) s1Var2.f43896a;
                                if (activity == null) {
                                    listU = Collections.EMPTY_LIST;
                                } else {
                                    try {
                                        listU = Ba.c.u(activity);
                                    } catch (CameraAccessException e7) {
                                        throw new RuntimeException(e7);
                                    }
                                }
                                arrayList.add(0, listU);
                            } catch (Throwable th) {
                                arrayList = Fe.b.V(th);
                            }
                            c1521a.c(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            C0799o c0799o = new C0799o(arrayList2, c1521a, 22);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g = (C4584g) s1Var2.f43902g;
                                double dDoubleValue = d3.doubleValue();
                                Cc.a aVarB = c4584g.f48112a.b();
                                aVarB.f1982b = dDoubleValue / aVarB.b();
                                aVarB.a(c4584g.f48129s);
                                c4584g.h(new RunnableC4579b(i17, c0799o, aVarB), new C3641c(c0799o, 17));
                                return;
                            } catch (Exception e10) {
                                s1.g(e10, c0799o);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            y yVar = (y) arrayList4.get(1);
                            C0800p c0800p = new C0800p(arrayList3, c1521a, 22);
                            C4584g c4584g2 = (C4584g) s1Var2.f43902g;
                            if (c4584g2 != null) {
                                c4584g2.a();
                            }
                            boolean zBooleanValue = yVar.f48194e.booleanValue();
                            Y y10 = new Y(s1Var2, c0800p, str, yVar);
                            C4026b c4026b = (C4026b) s1Var2.f43898c;
                            if (c4026b.f45322b) {
                                y10.c("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            Activity activity2 = (Activity) s1Var2.f43896a;
                            if (Y0.e.checkSelfPermission(activity2, "android.permission.CAMERA") == 0 && (!zBooleanValue || Y0.e.checkSelfPermission(activity2, "android.permission.RECORD_AUDIO") == 0)) {
                                y10.c(null, null);
                                return;
                            }
                            ((s1) ((InterfaceC3965b) ((C3641c) s1Var2.f43899d).f41267b)).d(new Yc.g(new aa.f(27, c4026b, y10)));
                            c4026b.f45322b = true;
                            AbstractC1274b.a(activity2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            w wVar = (w) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g3 = (C4584g) s1Var2.f43902g;
                                int iOrdinal = wVar.ordinal();
                                if (iOrdinal == 0) {
                                    i152 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c4584g3.l(i152);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = Fe.b.V(th2);
                            }
                            c1521a.c(arrayList5);
                            return;
                        case 4:
                            ArrayList arrayList6 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            C0800p c0800p2 = new C0800p(arrayList6, c1521a, i132);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g4 = (C4584g) s1Var2.f43902g;
                                if (zVar != null) {
                                    w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                                }
                                c4584g4.m(c0800p2, w0Var);
                                return;
                            } catch (Exception e11) {
                                s1.h(e11, c0800p2);
                                return;
                            }
                        case 5:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6730f.floatValue()));
                            } catch (Throwable th3) {
                                arrayList7 = Fe.b.V(th3);
                            }
                            c1521a.c(arrayList7);
                            return;
                        case 6:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6729e.floatValue()));
                            } catch (Throwable th4) {
                                arrayList8 = Fe.b.V(th4);
                            }
                            c1521a.c(arrayList8);
                            return;
                        case 7:
                            ArrayList arrayList9 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj2).get(0);
                            C0801q c0801q = new C0801q(arrayList9, c1521a, i112);
                            C4584g c4584g5 = (C4584g) s1Var2.f43902g;
                            float fFloatValue = d5.floatValue();
                            Kc.a aVarG = c4584g5.f48112a.g();
                            Float f10 = aVarG.f6730f;
                            float fFloatValue2 = f10.floatValue();
                            Float f11 = aVarG.f6729e;
                            float fFloatValue3 = f11.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                c0801q.c(new C4592o("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f11, f10), null));
                                return;
                            }
                            aVarG.f6728d = Float.valueOf(fFloatValue);
                            aVarG.a(c4584g5.f48129s);
                            c4584g5.h(new RunnableC3307c(c0801q, i112), new C3641c(c0801q, 15));
                            return;
                        case 8:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th5) {
                                arrayList10 = Fe.b.V(th5);
                            }
                            try {
                                C4584g c4584g6 = (C4584g) s1Var2.f43902g;
                                if (!c4584g6.f48132v) {
                                    c4584g6.f48132v = true;
                                    CameraCaptureSession cameraCaptureSession = c4584g6.f48126p;
                                    if (cameraCaptureSession != null) {
                                        cameraCaptureSession.stopRepeating();
                                    }
                                }
                                arrayList10.add(0, null);
                                c1521a.c(arrayList10);
                                return;
                            } catch (CameraAccessException e12) {
                                throw new C4592o("CameraAccessException", e12.getMessage(), null);
                            }
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C4584g c4584g7 = (C4584g) s1Var2.f43902g;
                                c4584g7.f48132v = false;
                                c4584g7.h(null, new C4580c(c4584g7, i17));
                                arrayList11.add(0, null);
                            } catch (Throwable th6) {
                                arrayList11 = Fe.b.V(th6);
                            }
                            c1521a.c(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                s1Var2.getClass();
                                try {
                                    ((C4584g) s1Var2.f43902g).j(new t6.q(str2, (CameraManager) ((Activity) s1Var2.f43896a).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e13) {
                                    throw new C4592o("CameraAccessException", e13.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = Fe.b.V(th7);
                            }
                            c1521a.c(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C4584g c4584g8 = (C4584g) s1Var2.f43902g;
                                if (c4584g8.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g8.f48130t.resume();
                                    } catch (IllegalStateException e14) {
                                        throw new C4592o("videoRecordingFailed", e14.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = Fe.b.V(th8);
                            }
                            c1521a.c(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                s1Var2.i((x) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                            } catch (Throwable th9) {
                                arrayList14 = Fe.b.V(th9);
                            }
                            c1521a.c(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C4584g c4584g9 = (C4584g) s1Var2.f43902g;
                                if (c4584g9 != null) {
                                    Log.i("Camera", "dispose");
                                    c4584g9.a();
                                    c4584g9.f48116e.release();
                                    Jc.a aVar = c4584g9.f48112a.f().f6005c;
                                    V1 v1 = aVar.f6003f;
                                    if (v1 != null) {
                                        aVar.f5998a.unregisterReceiver(v1);
                                        aVar.f6003f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                            } catch (Throwable th10) {
                                arrayList15 = Fe.b.V(th10);
                            }
                            c1521a.c(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g10 = (C4584g) s1Var2.f43902g;
                                int iOrdinal2 = tVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        i162 = 2;
                                    } else if (iOrdinal2 == 2) {
                                        i162 = 3;
                                    } else {
                                        if (iOrdinal2 != 3) {
                                            throw new IllegalStateException("Unreachable code");
                                        }
                                        i162 = 4;
                                    }
                                }
                                c4584g10.f48112a.f().f6006d = i162;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = Fe.b.V(th11);
                            }
                            c1521a.c(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C4584g) s1Var2.f43902g).f48112a.f().f6006d = 0;
                                arrayList17.add(0, null);
                            } catch (Throwable th12) {
                                arrayList17 = Fe.b.V(th12);
                            }
                            c1521a.c(arrayList17);
                            return;
                        case 16:
                            C0801q c0801q2 = new C0801q(new ArrayList(), c1521a, i122);
                            C4584g c4584g11 = (C4584g) s1Var2.f43902g;
                            C4585h c4585h = c4584g11.f48122l;
                            if (c4585h.f48138b != 1) {
                                c0801q2.c(new C4592o("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c4584g11.f48136z = c0801q2;
                            try {
                                c4584g11.f48133w = File.createTempFile("CAP", ".jpg", c4584g11.f48118g.getCacheDir());
                                S3.s sVar = c4584g11.f48134x;
                                sVar.getClass();
                                sVar.f11009b = new J5.n(2);
                                sVar.f11010c = new J5.n(2);
                                c4584g11.f48127q.setOnImageAvailableListener(c4584g11, c4584g11.f48123m);
                                Ac.a aVar2 = (Ac.a) c4584g11.f48112a.f5569a.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1257b != 1) {
                                    c4584g11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c4585h.f48138b = 2;
                                c4584g11.d();
                                return;
                            } catch (IOException | SecurityException e15) {
                                c4584g11.f48119h.l(c4584g11.f48136z, "cannotCreateFile", e15.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                s1Var2.n((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                            } catch (Throwable th13) {
                                arrayList18 = Fe.b.V(th13);
                            }
                            c1521a.c(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, s1Var2.o());
                            } catch (Throwable th14) {
                                arrayList19 = Fe.b.V(th14);
                            }
                            c1521a.c(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C4584g c4584g12 = (C4584g) s1Var2.f43902g;
                                if (c4584g12.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g12.f48130t.pause();
                                    } catch (IllegalStateException e16) {
                                        throw new C4592o("videoRecordingFailed", e16.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = Fe.b.V(th15);
                            }
                            c1521a.c(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th16) {
                                arrayList21 = Fe.b.V(th16);
                            }
                            try {
                                C4584g c4584g13 = (C4584g) s1Var2.f43902g;
                                C4273j c4273j = (C4273j) s1Var2.f43901f;
                                c4584g13.getClass();
                                c4273j.a(new Wa.d(c4584g13, i142));
                                c4584g13.o(false, true);
                                Log.i("Camera", "startPreviewWithImageStream");
                                arrayList21.add(0, null);
                                c1521a.c(arrayList21);
                                return;
                            } catch (CameraAccessException e17) {
                                throw new C4592o("CameraAccessException", e17.getMessage(), null);
                            }
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th17) {
                                arrayList22 = Fe.b.V(th17);
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).p(null);
                                arrayList22.add(0, null);
                                c1521a.c(arrayList22);
                                return;
                            } catch (Exception e18) {
                                throw new C4592o(e18.getClass().getName(), e18.getMessage(), null);
                            }
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj2).get(0);
                            C0799o c0799o2 = new C0799o(arrayList23, c1521a, i122);
                            s1Var2.getClass();
                            int iOrdinal3 = vVar.ordinal();
                            if (iOrdinal3 == 0) {
                                i102 = 1;
                            } else if (iOrdinal3 == 1) {
                                i102 = 2;
                            } else if (iOrdinal3 == 2) {
                                i102 = 3;
                            } else {
                                if (iOrdinal3 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                i102 = 4;
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).k(c0799o2, i102);
                                return;
                            } catch (Exception e19) {
                                s1.h(e19, c0799o2);
                                return;
                            }
                        case 23:
                            a(obj2, c1521a);
                            return;
                        case 24:
                            b(obj2, c1521a);
                            return;
                        case 25:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                Cc.a aVarB2 = ((C4584g) s1Var2.f43902g).f48112a.b();
                                arrayList24.add(0, Double.valueOf(aVarB2.b() * (((Range) ((CameraCharacteristics) aVarB2.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r4.getLower()).intValue())));
                            } catch (Throwable th18) {
                                arrayList24 = Fe.b.V(th18);
                            }
                            c1521a.c(arrayList24);
                            return;
                        case 26:
                            c(obj2, c1521a);
                            return;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            try {
                                arrayList25.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.b().b()));
                            } catch (Throwable th19) {
                                arrayList25 = Fe.b.V(th19);
                            }
                            c1521a.c(arrayList25);
                            return;
                    }
                }
            });
        } else {
            x79.n(null);
        }
        X7 x710 = new X7(interfaceC4269f, pVar, obj, "dev.flutter.pigeon.camera_android.CameraApi.stopVideoRecording");
        if (s1Var != null) {
            final int i17 = 18;
            x710.n(new InterfaceC4265b() { // from class: yc.n
                private final void a(Object obj2, C1521a c1521a) {
                    ArrayList arrayList = new ArrayList();
                    u uVar = (u) ((ArrayList) obj2).get(0);
                    C0800p c0800p = new C0800p(arrayList, c1521a, 23);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    int iOrdinal = uVar.ordinal();
                    int i102 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i102 = 2;
                    }
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        Bc.a aVar = (Bc.a) c4584g.f48112a.f5569a.get("EXPOSURE_LOCK");
                        aVar.f1667b = i102;
                        aVar.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0800p, 26), new C3641c(c0800p, 18));
                    } catch (Exception e7) {
                        s1.h(e7, c0800p);
                    }
                }

                private final void b(Object obj2, C1521a c1521a) {
                    w0 w0Var;
                    ArrayList arrayList = new ArrayList();
                    z zVar = (z) ((ArrayList) obj2).get(0);
                    C0801q c0801q = new C0801q(arrayList, c1521a, 22);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        w0 w0Var2 = null;
                        if (zVar == null) {
                            w0Var = null;
                        } else {
                            w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                        }
                        Dc.a aVarC = c4584g.f48112a.c();
                        if (w0Var != null && ((Double) w0Var.f46405a) != null && ((Double) w0Var.f46406b) != null) {
                            w0Var2 = w0Var;
                        }
                        aVarC.f2631c = w0Var2;
                        aVarC.b();
                        aVarC.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0801q, 22), new C3641c(c0801q, 14));
                    } catch (Exception e7) {
                        s1.h(e7, c0801q);
                    }
                }

                private final void c(Object obj2, C1521a c1521a) {
                    s1 s1Var2 = s1Var;
                    ArrayList arrayList = new ArrayList();
                    try {
                        Cc.a aVarB = ((C4584g) s1Var2.f43902g).f48112a.b();
                        arrayList.add(0, Double.valueOf(aVarB.b() * (((Range) ((CameraCharacteristics) aVarB.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r1.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = Fe.b.V(th);
                    }
                    c1521a.c(arrayList);
                }

                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listU;
                    int i102;
                    int i112 = 23;
                    int i122 = 21;
                    int i132 = 24;
                    int i142 = 3;
                    int i152 = 2;
                    int i162 = 1;
                    w0 w0Var = null;
                    s1 s1Var2 = s1Var;
                    int i172 = 0;
                    switch (i17) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                Activity activity = (Activity) s1Var2.f43896a;
                                if (activity == null) {
                                    listU = Collections.EMPTY_LIST;
                                } else {
                                    try {
                                        listU = Ba.c.u(activity);
                                    } catch (CameraAccessException e7) {
                                        throw new RuntimeException(e7);
                                    }
                                }
                                arrayList.add(0, listU);
                            } catch (Throwable th) {
                                arrayList = Fe.b.V(th);
                            }
                            c1521a.c(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            C0799o c0799o = new C0799o(arrayList2, c1521a, 22);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g = (C4584g) s1Var2.f43902g;
                                double dDoubleValue = d3.doubleValue();
                                Cc.a aVarB = c4584g.f48112a.b();
                                aVarB.f1982b = dDoubleValue / aVarB.b();
                                aVarB.a(c4584g.f48129s);
                                c4584g.h(new RunnableC4579b(i172, c0799o, aVarB), new C3641c(c0799o, 17));
                                return;
                            } catch (Exception e10) {
                                s1.g(e10, c0799o);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            y yVar = (y) arrayList4.get(1);
                            C0800p c0800p = new C0800p(arrayList3, c1521a, 22);
                            C4584g c4584g2 = (C4584g) s1Var2.f43902g;
                            if (c4584g2 != null) {
                                c4584g2.a();
                            }
                            boolean zBooleanValue = yVar.f48194e.booleanValue();
                            Y y10 = new Y(s1Var2, c0800p, str, yVar);
                            C4026b c4026b = (C4026b) s1Var2.f43898c;
                            if (c4026b.f45322b) {
                                y10.c("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            Activity activity2 = (Activity) s1Var2.f43896a;
                            if (Y0.e.checkSelfPermission(activity2, "android.permission.CAMERA") == 0 && (!zBooleanValue || Y0.e.checkSelfPermission(activity2, "android.permission.RECORD_AUDIO") == 0)) {
                                y10.c(null, null);
                                return;
                            }
                            ((s1) ((InterfaceC3965b) ((C3641c) s1Var2.f43899d).f41267b)).d(new Yc.g(new aa.f(27, c4026b, y10)));
                            c4026b.f45322b = true;
                            AbstractC1274b.a(activity2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            w wVar = (w) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g3 = (C4584g) s1Var2.f43902g;
                                int iOrdinal = wVar.ordinal();
                                if (iOrdinal == 0) {
                                    i152 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c4584g3.l(i152);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = Fe.b.V(th2);
                            }
                            c1521a.c(arrayList5);
                            return;
                        case 4:
                            ArrayList arrayList6 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            C0800p c0800p2 = new C0800p(arrayList6, c1521a, i132);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g4 = (C4584g) s1Var2.f43902g;
                                if (zVar != null) {
                                    w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                                }
                                c4584g4.m(c0800p2, w0Var);
                                return;
                            } catch (Exception e11) {
                                s1.h(e11, c0800p2);
                                return;
                            }
                        case 5:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6730f.floatValue()));
                            } catch (Throwable th3) {
                                arrayList7 = Fe.b.V(th3);
                            }
                            c1521a.c(arrayList7);
                            return;
                        case 6:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6729e.floatValue()));
                            } catch (Throwable th4) {
                                arrayList8 = Fe.b.V(th4);
                            }
                            c1521a.c(arrayList8);
                            return;
                        case 7:
                            ArrayList arrayList9 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj2).get(0);
                            C0801q c0801q = new C0801q(arrayList9, c1521a, i112);
                            C4584g c4584g5 = (C4584g) s1Var2.f43902g;
                            float fFloatValue = d5.floatValue();
                            Kc.a aVarG = c4584g5.f48112a.g();
                            Float f10 = aVarG.f6730f;
                            float fFloatValue2 = f10.floatValue();
                            Float f11 = aVarG.f6729e;
                            float fFloatValue3 = f11.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                c0801q.c(new C4592o("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f11, f10), null));
                                return;
                            }
                            aVarG.f6728d = Float.valueOf(fFloatValue);
                            aVarG.a(c4584g5.f48129s);
                            c4584g5.h(new RunnableC3307c(c0801q, i112), new C3641c(c0801q, 15));
                            return;
                        case 8:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th5) {
                                arrayList10 = Fe.b.V(th5);
                            }
                            try {
                                C4584g c4584g6 = (C4584g) s1Var2.f43902g;
                                if (!c4584g6.f48132v) {
                                    c4584g6.f48132v = true;
                                    CameraCaptureSession cameraCaptureSession = c4584g6.f48126p;
                                    if (cameraCaptureSession != null) {
                                        cameraCaptureSession.stopRepeating();
                                    }
                                }
                                arrayList10.add(0, null);
                                c1521a.c(arrayList10);
                                return;
                            } catch (CameraAccessException e12) {
                                throw new C4592o("CameraAccessException", e12.getMessage(), null);
                            }
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C4584g c4584g7 = (C4584g) s1Var2.f43902g;
                                c4584g7.f48132v = false;
                                c4584g7.h(null, new C4580c(c4584g7, i172));
                                arrayList11.add(0, null);
                            } catch (Throwable th6) {
                                arrayList11 = Fe.b.V(th6);
                            }
                            c1521a.c(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                s1Var2.getClass();
                                try {
                                    ((C4584g) s1Var2.f43902g).j(new t6.q(str2, (CameraManager) ((Activity) s1Var2.f43896a).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e13) {
                                    throw new C4592o("CameraAccessException", e13.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = Fe.b.V(th7);
                            }
                            c1521a.c(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C4584g c4584g8 = (C4584g) s1Var2.f43902g;
                                if (c4584g8.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g8.f48130t.resume();
                                    } catch (IllegalStateException e14) {
                                        throw new C4592o("videoRecordingFailed", e14.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = Fe.b.V(th8);
                            }
                            c1521a.c(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                s1Var2.i((x) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                            } catch (Throwable th9) {
                                arrayList14 = Fe.b.V(th9);
                            }
                            c1521a.c(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C4584g c4584g9 = (C4584g) s1Var2.f43902g;
                                if (c4584g9 != null) {
                                    Log.i("Camera", "dispose");
                                    c4584g9.a();
                                    c4584g9.f48116e.release();
                                    Jc.a aVar = c4584g9.f48112a.f().f6005c;
                                    V1 v1 = aVar.f6003f;
                                    if (v1 != null) {
                                        aVar.f5998a.unregisterReceiver(v1);
                                        aVar.f6003f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                            } catch (Throwable th10) {
                                arrayList15 = Fe.b.V(th10);
                            }
                            c1521a.c(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g10 = (C4584g) s1Var2.f43902g;
                                int iOrdinal2 = tVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        i162 = 2;
                                    } else if (iOrdinal2 == 2) {
                                        i162 = 3;
                                    } else {
                                        if (iOrdinal2 != 3) {
                                            throw new IllegalStateException("Unreachable code");
                                        }
                                        i162 = 4;
                                    }
                                }
                                c4584g10.f48112a.f().f6006d = i162;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = Fe.b.V(th11);
                            }
                            c1521a.c(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C4584g) s1Var2.f43902g).f48112a.f().f6006d = 0;
                                arrayList17.add(0, null);
                            } catch (Throwable th12) {
                                arrayList17 = Fe.b.V(th12);
                            }
                            c1521a.c(arrayList17);
                            return;
                        case 16:
                            C0801q c0801q2 = new C0801q(new ArrayList(), c1521a, i122);
                            C4584g c4584g11 = (C4584g) s1Var2.f43902g;
                            C4585h c4585h = c4584g11.f48122l;
                            if (c4585h.f48138b != 1) {
                                c0801q2.c(new C4592o("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c4584g11.f48136z = c0801q2;
                            try {
                                c4584g11.f48133w = File.createTempFile("CAP", ".jpg", c4584g11.f48118g.getCacheDir());
                                S3.s sVar = c4584g11.f48134x;
                                sVar.getClass();
                                sVar.f11009b = new J5.n(2);
                                sVar.f11010c = new J5.n(2);
                                c4584g11.f48127q.setOnImageAvailableListener(c4584g11, c4584g11.f48123m);
                                Ac.a aVar2 = (Ac.a) c4584g11.f48112a.f5569a.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1257b != 1) {
                                    c4584g11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c4585h.f48138b = 2;
                                c4584g11.d();
                                return;
                            } catch (IOException | SecurityException e15) {
                                c4584g11.f48119h.l(c4584g11.f48136z, "cannotCreateFile", e15.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                s1Var2.n((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                            } catch (Throwable th13) {
                                arrayList18 = Fe.b.V(th13);
                            }
                            c1521a.c(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, s1Var2.o());
                            } catch (Throwable th14) {
                                arrayList19 = Fe.b.V(th14);
                            }
                            c1521a.c(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C4584g c4584g12 = (C4584g) s1Var2.f43902g;
                                if (c4584g12.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g12.f48130t.pause();
                                    } catch (IllegalStateException e16) {
                                        throw new C4592o("videoRecordingFailed", e16.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = Fe.b.V(th15);
                            }
                            c1521a.c(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th16) {
                                arrayList21 = Fe.b.V(th16);
                            }
                            try {
                                C4584g c4584g13 = (C4584g) s1Var2.f43902g;
                                C4273j c4273j = (C4273j) s1Var2.f43901f;
                                c4584g13.getClass();
                                c4273j.a(new Wa.d(c4584g13, i142));
                                c4584g13.o(false, true);
                                Log.i("Camera", "startPreviewWithImageStream");
                                arrayList21.add(0, null);
                                c1521a.c(arrayList21);
                                return;
                            } catch (CameraAccessException e17) {
                                throw new C4592o("CameraAccessException", e17.getMessage(), null);
                            }
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th17) {
                                arrayList22 = Fe.b.V(th17);
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).p(null);
                                arrayList22.add(0, null);
                                c1521a.c(arrayList22);
                                return;
                            } catch (Exception e18) {
                                throw new C4592o(e18.getClass().getName(), e18.getMessage(), null);
                            }
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj2).get(0);
                            C0799o c0799o2 = new C0799o(arrayList23, c1521a, i122);
                            s1Var2.getClass();
                            int iOrdinal3 = vVar.ordinal();
                            if (iOrdinal3 == 0) {
                                i102 = 1;
                            } else if (iOrdinal3 == 1) {
                                i102 = 2;
                            } else if (iOrdinal3 == 2) {
                                i102 = 3;
                            } else {
                                if (iOrdinal3 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                i102 = 4;
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).k(c0799o2, i102);
                                return;
                            } catch (Exception e19) {
                                s1.h(e19, c0799o2);
                                return;
                            }
                        case 23:
                            a(obj2, c1521a);
                            return;
                        case 24:
                            b(obj2, c1521a);
                            return;
                        case 25:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                Cc.a aVarB2 = ((C4584g) s1Var2.f43902g).f48112a.b();
                                arrayList24.add(0, Double.valueOf(aVarB2.b() * (((Range) ((CameraCharacteristics) aVarB2.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r4.getLower()).intValue())));
                            } catch (Throwable th18) {
                                arrayList24 = Fe.b.V(th18);
                            }
                            c1521a.c(arrayList24);
                            return;
                        case 26:
                            c(obj2, c1521a);
                            return;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            try {
                                arrayList25.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.b().b()));
                            } catch (Throwable th19) {
                                arrayList25 = Fe.b.V(th19);
                            }
                            c1521a.c(arrayList25);
                            return;
                    }
                }
            });
        } else {
            x710.n(null);
        }
        X7 x711 = new X7(interfaceC4269f, pVar, obj, "dev.flutter.pigeon.camera_android.CameraApi.pauseVideoRecording");
        if (s1Var != null) {
            final int i18 = 19;
            x711.n(new InterfaceC4265b() { // from class: yc.n
                private final void a(Object obj2, C1521a c1521a) {
                    ArrayList arrayList = new ArrayList();
                    u uVar = (u) ((ArrayList) obj2).get(0);
                    C0800p c0800p = new C0800p(arrayList, c1521a, 23);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    int iOrdinal = uVar.ordinal();
                    int i102 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i102 = 2;
                    }
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        Bc.a aVar = (Bc.a) c4584g.f48112a.f5569a.get("EXPOSURE_LOCK");
                        aVar.f1667b = i102;
                        aVar.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0800p, 26), new C3641c(c0800p, 18));
                    } catch (Exception e7) {
                        s1.h(e7, c0800p);
                    }
                }

                private final void b(Object obj2, C1521a c1521a) {
                    w0 w0Var;
                    ArrayList arrayList = new ArrayList();
                    z zVar = (z) ((ArrayList) obj2).get(0);
                    C0801q c0801q = new C0801q(arrayList, c1521a, 22);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        w0 w0Var2 = null;
                        if (zVar == null) {
                            w0Var = null;
                        } else {
                            w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                        }
                        Dc.a aVarC = c4584g.f48112a.c();
                        if (w0Var != null && ((Double) w0Var.f46405a) != null && ((Double) w0Var.f46406b) != null) {
                            w0Var2 = w0Var;
                        }
                        aVarC.f2631c = w0Var2;
                        aVarC.b();
                        aVarC.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0801q, 22), new C3641c(c0801q, 14));
                    } catch (Exception e7) {
                        s1.h(e7, c0801q);
                    }
                }

                private final void c(Object obj2, C1521a c1521a) {
                    s1 s1Var2 = s1Var;
                    ArrayList arrayList = new ArrayList();
                    try {
                        Cc.a aVarB = ((C4584g) s1Var2.f43902g).f48112a.b();
                        arrayList.add(0, Double.valueOf(aVarB.b() * (((Range) ((CameraCharacteristics) aVarB.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r1.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = Fe.b.V(th);
                    }
                    c1521a.c(arrayList);
                }

                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listU;
                    int i102;
                    int i112 = 23;
                    int i122 = 21;
                    int i132 = 24;
                    int i142 = 3;
                    int i152 = 2;
                    int i162 = 1;
                    w0 w0Var = null;
                    s1 s1Var2 = s1Var;
                    int i172 = 0;
                    switch (i18) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                Activity activity = (Activity) s1Var2.f43896a;
                                if (activity == null) {
                                    listU = Collections.EMPTY_LIST;
                                } else {
                                    try {
                                        listU = Ba.c.u(activity);
                                    } catch (CameraAccessException e7) {
                                        throw new RuntimeException(e7);
                                    }
                                }
                                arrayList.add(0, listU);
                            } catch (Throwable th) {
                                arrayList = Fe.b.V(th);
                            }
                            c1521a.c(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            C0799o c0799o = new C0799o(arrayList2, c1521a, 22);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g = (C4584g) s1Var2.f43902g;
                                double dDoubleValue = d3.doubleValue();
                                Cc.a aVarB = c4584g.f48112a.b();
                                aVarB.f1982b = dDoubleValue / aVarB.b();
                                aVarB.a(c4584g.f48129s);
                                c4584g.h(new RunnableC4579b(i172, c0799o, aVarB), new C3641c(c0799o, 17));
                                return;
                            } catch (Exception e10) {
                                s1.g(e10, c0799o);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            y yVar = (y) arrayList4.get(1);
                            C0800p c0800p = new C0800p(arrayList3, c1521a, 22);
                            C4584g c4584g2 = (C4584g) s1Var2.f43902g;
                            if (c4584g2 != null) {
                                c4584g2.a();
                            }
                            boolean zBooleanValue = yVar.f48194e.booleanValue();
                            Y y10 = new Y(s1Var2, c0800p, str, yVar);
                            C4026b c4026b = (C4026b) s1Var2.f43898c;
                            if (c4026b.f45322b) {
                                y10.c("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            Activity activity2 = (Activity) s1Var2.f43896a;
                            if (Y0.e.checkSelfPermission(activity2, "android.permission.CAMERA") == 0 && (!zBooleanValue || Y0.e.checkSelfPermission(activity2, "android.permission.RECORD_AUDIO") == 0)) {
                                y10.c(null, null);
                                return;
                            }
                            ((s1) ((InterfaceC3965b) ((C3641c) s1Var2.f43899d).f41267b)).d(new Yc.g(new aa.f(27, c4026b, y10)));
                            c4026b.f45322b = true;
                            AbstractC1274b.a(activity2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            w wVar = (w) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g3 = (C4584g) s1Var2.f43902g;
                                int iOrdinal = wVar.ordinal();
                                if (iOrdinal == 0) {
                                    i152 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c4584g3.l(i152);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = Fe.b.V(th2);
                            }
                            c1521a.c(arrayList5);
                            return;
                        case 4:
                            ArrayList arrayList6 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            C0800p c0800p2 = new C0800p(arrayList6, c1521a, i132);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g4 = (C4584g) s1Var2.f43902g;
                                if (zVar != null) {
                                    w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                                }
                                c4584g4.m(c0800p2, w0Var);
                                return;
                            } catch (Exception e11) {
                                s1.h(e11, c0800p2);
                                return;
                            }
                        case 5:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6730f.floatValue()));
                            } catch (Throwable th3) {
                                arrayList7 = Fe.b.V(th3);
                            }
                            c1521a.c(arrayList7);
                            return;
                        case 6:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6729e.floatValue()));
                            } catch (Throwable th4) {
                                arrayList8 = Fe.b.V(th4);
                            }
                            c1521a.c(arrayList8);
                            return;
                        case 7:
                            ArrayList arrayList9 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj2).get(0);
                            C0801q c0801q = new C0801q(arrayList9, c1521a, i112);
                            C4584g c4584g5 = (C4584g) s1Var2.f43902g;
                            float fFloatValue = d5.floatValue();
                            Kc.a aVarG = c4584g5.f48112a.g();
                            Float f10 = aVarG.f6730f;
                            float fFloatValue2 = f10.floatValue();
                            Float f11 = aVarG.f6729e;
                            float fFloatValue3 = f11.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                c0801q.c(new C4592o("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f11, f10), null));
                                return;
                            }
                            aVarG.f6728d = Float.valueOf(fFloatValue);
                            aVarG.a(c4584g5.f48129s);
                            c4584g5.h(new RunnableC3307c(c0801q, i112), new C3641c(c0801q, 15));
                            return;
                        case 8:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th5) {
                                arrayList10 = Fe.b.V(th5);
                            }
                            try {
                                C4584g c4584g6 = (C4584g) s1Var2.f43902g;
                                if (!c4584g6.f48132v) {
                                    c4584g6.f48132v = true;
                                    CameraCaptureSession cameraCaptureSession = c4584g6.f48126p;
                                    if (cameraCaptureSession != null) {
                                        cameraCaptureSession.stopRepeating();
                                    }
                                }
                                arrayList10.add(0, null);
                                c1521a.c(arrayList10);
                                return;
                            } catch (CameraAccessException e12) {
                                throw new C4592o("CameraAccessException", e12.getMessage(), null);
                            }
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C4584g c4584g7 = (C4584g) s1Var2.f43902g;
                                c4584g7.f48132v = false;
                                c4584g7.h(null, new C4580c(c4584g7, i172));
                                arrayList11.add(0, null);
                            } catch (Throwable th6) {
                                arrayList11 = Fe.b.V(th6);
                            }
                            c1521a.c(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                s1Var2.getClass();
                                try {
                                    ((C4584g) s1Var2.f43902g).j(new t6.q(str2, (CameraManager) ((Activity) s1Var2.f43896a).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e13) {
                                    throw new C4592o("CameraAccessException", e13.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = Fe.b.V(th7);
                            }
                            c1521a.c(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C4584g c4584g8 = (C4584g) s1Var2.f43902g;
                                if (c4584g8.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g8.f48130t.resume();
                                    } catch (IllegalStateException e14) {
                                        throw new C4592o("videoRecordingFailed", e14.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = Fe.b.V(th8);
                            }
                            c1521a.c(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                s1Var2.i((x) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                            } catch (Throwable th9) {
                                arrayList14 = Fe.b.V(th9);
                            }
                            c1521a.c(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C4584g c4584g9 = (C4584g) s1Var2.f43902g;
                                if (c4584g9 != null) {
                                    Log.i("Camera", "dispose");
                                    c4584g9.a();
                                    c4584g9.f48116e.release();
                                    Jc.a aVar = c4584g9.f48112a.f().f6005c;
                                    V1 v1 = aVar.f6003f;
                                    if (v1 != null) {
                                        aVar.f5998a.unregisterReceiver(v1);
                                        aVar.f6003f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                            } catch (Throwable th10) {
                                arrayList15 = Fe.b.V(th10);
                            }
                            c1521a.c(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g10 = (C4584g) s1Var2.f43902g;
                                int iOrdinal2 = tVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        i162 = 2;
                                    } else if (iOrdinal2 == 2) {
                                        i162 = 3;
                                    } else {
                                        if (iOrdinal2 != 3) {
                                            throw new IllegalStateException("Unreachable code");
                                        }
                                        i162 = 4;
                                    }
                                }
                                c4584g10.f48112a.f().f6006d = i162;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = Fe.b.V(th11);
                            }
                            c1521a.c(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C4584g) s1Var2.f43902g).f48112a.f().f6006d = 0;
                                arrayList17.add(0, null);
                            } catch (Throwable th12) {
                                arrayList17 = Fe.b.V(th12);
                            }
                            c1521a.c(arrayList17);
                            return;
                        case 16:
                            C0801q c0801q2 = new C0801q(new ArrayList(), c1521a, i122);
                            C4584g c4584g11 = (C4584g) s1Var2.f43902g;
                            C4585h c4585h = c4584g11.f48122l;
                            if (c4585h.f48138b != 1) {
                                c0801q2.c(new C4592o("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c4584g11.f48136z = c0801q2;
                            try {
                                c4584g11.f48133w = File.createTempFile("CAP", ".jpg", c4584g11.f48118g.getCacheDir());
                                S3.s sVar = c4584g11.f48134x;
                                sVar.getClass();
                                sVar.f11009b = new J5.n(2);
                                sVar.f11010c = new J5.n(2);
                                c4584g11.f48127q.setOnImageAvailableListener(c4584g11, c4584g11.f48123m);
                                Ac.a aVar2 = (Ac.a) c4584g11.f48112a.f5569a.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1257b != 1) {
                                    c4584g11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c4585h.f48138b = 2;
                                c4584g11.d();
                                return;
                            } catch (IOException | SecurityException e15) {
                                c4584g11.f48119h.l(c4584g11.f48136z, "cannotCreateFile", e15.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                s1Var2.n((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                            } catch (Throwable th13) {
                                arrayList18 = Fe.b.V(th13);
                            }
                            c1521a.c(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, s1Var2.o());
                            } catch (Throwable th14) {
                                arrayList19 = Fe.b.V(th14);
                            }
                            c1521a.c(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C4584g c4584g12 = (C4584g) s1Var2.f43902g;
                                if (c4584g12.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g12.f48130t.pause();
                                    } catch (IllegalStateException e16) {
                                        throw new C4592o("videoRecordingFailed", e16.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = Fe.b.V(th15);
                            }
                            c1521a.c(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th16) {
                                arrayList21 = Fe.b.V(th16);
                            }
                            try {
                                C4584g c4584g13 = (C4584g) s1Var2.f43902g;
                                C4273j c4273j = (C4273j) s1Var2.f43901f;
                                c4584g13.getClass();
                                c4273j.a(new Wa.d(c4584g13, i142));
                                c4584g13.o(false, true);
                                Log.i("Camera", "startPreviewWithImageStream");
                                arrayList21.add(0, null);
                                c1521a.c(arrayList21);
                                return;
                            } catch (CameraAccessException e17) {
                                throw new C4592o("CameraAccessException", e17.getMessage(), null);
                            }
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th17) {
                                arrayList22 = Fe.b.V(th17);
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).p(null);
                                arrayList22.add(0, null);
                                c1521a.c(arrayList22);
                                return;
                            } catch (Exception e18) {
                                throw new C4592o(e18.getClass().getName(), e18.getMessage(), null);
                            }
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj2).get(0);
                            C0799o c0799o2 = new C0799o(arrayList23, c1521a, i122);
                            s1Var2.getClass();
                            int iOrdinal3 = vVar.ordinal();
                            if (iOrdinal3 == 0) {
                                i102 = 1;
                            } else if (iOrdinal3 == 1) {
                                i102 = 2;
                            } else if (iOrdinal3 == 2) {
                                i102 = 3;
                            } else {
                                if (iOrdinal3 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                i102 = 4;
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).k(c0799o2, i102);
                                return;
                            } catch (Exception e19) {
                                s1.h(e19, c0799o2);
                                return;
                            }
                        case 23:
                            a(obj2, c1521a);
                            return;
                        case 24:
                            b(obj2, c1521a);
                            return;
                        case 25:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                Cc.a aVarB2 = ((C4584g) s1Var2.f43902g).f48112a.b();
                                arrayList24.add(0, Double.valueOf(aVarB2.b() * (((Range) ((CameraCharacteristics) aVarB2.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r4.getLower()).intValue())));
                            } catch (Throwable th18) {
                                arrayList24 = Fe.b.V(th18);
                            }
                            c1521a.c(arrayList24);
                            return;
                        case 26:
                            c(obj2, c1521a);
                            return;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            try {
                                arrayList25.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.b().b()));
                            } catch (Throwable th19) {
                                arrayList25 = Fe.b.V(th19);
                            }
                            c1521a.c(arrayList25);
                            return;
                    }
                }
            });
        } else {
            x711.n(null);
        }
        X7 x712 = new X7(interfaceC4269f, pVar, obj, "dev.flutter.pigeon.camera_android.CameraApi.resumeVideoRecording");
        if (s1Var != null) {
            final int i19 = 11;
            x712.n(new InterfaceC4265b() { // from class: yc.n
                private final void a(Object obj2, C1521a c1521a) {
                    ArrayList arrayList = new ArrayList();
                    u uVar = (u) ((ArrayList) obj2).get(0);
                    C0800p c0800p = new C0800p(arrayList, c1521a, 23);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    int iOrdinal = uVar.ordinal();
                    int i102 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i102 = 2;
                    }
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        Bc.a aVar = (Bc.a) c4584g.f48112a.f5569a.get("EXPOSURE_LOCK");
                        aVar.f1667b = i102;
                        aVar.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0800p, 26), new C3641c(c0800p, 18));
                    } catch (Exception e7) {
                        s1.h(e7, c0800p);
                    }
                }

                private final void b(Object obj2, C1521a c1521a) {
                    w0 w0Var;
                    ArrayList arrayList = new ArrayList();
                    z zVar = (z) ((ArrayList) obj2).get(0);
                    C0801q c0801q = new C0801q(arrayList, c1521a, 22);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        w0 w0Var2 = null;
                        if (zVar == null) {
                            w0Var = null;
                        } else {
                            w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                        }
                        Dc.a aVarC = c4584g.f48112a.c();
                        if (w0Var != null && ((Double) w0Var.f46405a) != null && ((Double) w0Var.f46406b) != null) {
                            w0Var2 = w0Var;
                        }
                        aVarC.f2631c = w0Var2;
                        aVarC.b();
                        aVarC.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0801q, 22), new C3641c(c0801q, 14));
                    } catch (Exception e7) {
                        s1.h(e7, c0801q);
                    }
                }

                private final void c(Object obj2, C1521a c1521a) {
                    s1 s1Var2 = s1Var;
                    ArrayList arrayList = new ArrayList();
                    try {
                        Cc.a aVarB = ((C4584g) s1Var2.f43902g).f48112a.b();
                        arrayList.add(0, Double.valueOf(aVarB.b() * (((Range) ((CameraCharacteristics) aVarB.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r1.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = Fe.b.V(th);
                    }
                    c1521a.c(arrayList);
                }

                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listU;
                    int i102;
                    int i112 = 23;
                    int i122 = 21;
                    int i132 = 24;
                    int i142 = 3;
                    int i152 = 2;
                    int i162 = 1;
                    w0 w0Var = null;
                    s1 s1Var2 = s1Var;
                    int i172 = 0;
                    switch (i19) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                Activity activity = (Activity) s1Var2.f43896a;
                                if (activity == null) {
                                    listU = Collections.EMPTY_LIST;
                                } else {
                                    try {
                                        listU = Ba.c.u(activity);
                                    } catch (CameraAccessException e7) {
                                        throw new RuntimeException(e7);
                                    }
                                }
                                arrayList.add(0, listU);
                            } catch (Throwable th) {
                                arrayList = Fe.b.V(th);
                            }
                            c1521a.c(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            C0799o c0799o = new C0799o(arrayList2, c1521a, 22);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g = (C4584g) s1Var2.f43902g;
                                double dDoubleValue = d3.doubleValue();
                                Cc.a aVarB = c4584g.f48112a.b();
                                aVarB.f1982b = dDoubleValue / aVarB.b();
                                aVarB.a(c4584g.f48129s);
                                c4584g.h(new RunnableC4579b(i172, c0799o, aVarB), new C3641c(c0799o, 17));
                                return;
                            } catch (Exception e10) {
                                s1.g(e10, c0799o);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            y yVar = (y) arrayList4.get(1);
                            C0800p c0800p = new C0800p(arrayList3, c1521a, 22);
                            C4584g c4584g2 = (C4584g) s1Var2.f43902g;
                            if (c4584g2 != null) {
                                c4584g2.a();
                            }
                            boolean zBooleanValue = yVar.f48194e.booleanValue();
                            Y y10 = new Y(s1Var2, c0800p, str, yVar);
                            C4026b c4026b = (C4026b) s1Var2.f43898c;
                            if (c4026b.f45322b) {
                                y10.c("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            Activity activity2 = (Activity) s1Var2.f43896a;
                            if (Y0.e.checkSelfPermission(activity2, "android.permission.CAMERA") == 0 && (!zBooleanValue || Y0.e.checkSelfPermission(activity2, "android.permission.RECORD_AUDIO") == 0)) {
                                y10.c(null, null);
                                return;
                            }
                            ((s1) ((InterfaceC3965b) ((C3641c) s1Var2.f43899d).f41267b)).d(new Yc.g(new aa.f(27, c4026b, y10)));
                            c4026b.f45322b = true;
                            AbstractC1274b.a(activity2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            w wVar = (w) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g3 = (C4584g) s1Var2.f43902g;
                                int iOrdinal = wVar.ordinal();
                                if (iOrdinal == 0) {
                                    i152 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c4584g3.l(i152);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = Fe.b.V(th2);
                            }
                            c1521a.c(arrayList5);
                            return;
                        case 4:
                            ArrayList arrayList6 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            C0800p c0800p2 = new C0800p(arrayList6, c1521a, i132);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g4 = (C4584g) s1Var2.f43902g;
                                if (zVar != null) {
                                    w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                                }
                                c4584g4.m(c0800p2, w0Var);
                                return;
                            } catch (Exception e11) {
                                s1.h(e11, c0800p2);
                                return;
                            }
                        case 5:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6730f.floatValue()));
                            } catch (Throwable th3) {
                                arrayList7 = Fe.b.V(th3);
                            }
                            c1521a.c(arrayList7);
                            return;
                        case 6:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6729e.floatValue()));
                            } catch (Throwable th4) {
                                arrayList8 = Fe.b.V(th4);
                            }
                            c1521a.c(arrayList8);
                            return;
                        case 7:
                            ArrayList arrayList9 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj2).get(0);
                            C0801q c0801q = new C0801q(arrayList9, c1521a, i112);
                            C4584g c4584g5 = (C4584g) s1Var2.f43902g;
                            float fFloatValue = d5.floatValue();
                            Kc.a aVarG = c4584g5.f48112a.g();
                            Float f10 = aVarG.f6730f;
                            float fFloatValue2 = f10.floatValue();
                            Float f11 = aVarG.f6729e;
                            float fFloatValue3 = f11.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                c0801q.c(new C4592o("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f11, f10), null));
                                return;
                            }
                            aVarG.f6728d = Float.valueOf(fFloatValue);
                            aVarG.a(c4584g5.f48129s);
                            c4584g5.h(new RunnableC3307c(c0801q, i112), new C3641c(c0801q, 15));
                            return;
                        case 8:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th5) {
                                arrayList10 = Fe.b.V(th5);
                            }
                            try {
                                C4584g c4584g6 = (C4584g) s1Var2.f43902g;
                                if (!c4584g6.f48132v) {
                                    c4584g6.f48132v = true;
                                    CameraCaptureSession cameraCaptureSession = c4584g6.f48126p;
                                    if (cameraCaptureSession != null) {
                                        cameraCaptureSession.stopRepeating();
                                    }
                                }
                                arrayList10.add(0, null);
                                c1521a.c(arrayList10);
                                return;
                            } catch (CameraAccessException e12) {
                                throw new C4592o("CameraAccessException", e12.getMessage(), null);
                            }
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C4584g c4584g7 = (C4584g) s1Var2.f43902g;
                                c4584g7.f48132v = false;
                                c4584g7.h(null, new C4580c(c4584g7, i172));
                                arrayList11.add(0, null);
                            } catch (Throwable th6) {
                                arrayList11 = Fe.b.V(th6);
                            }
                            c1521a.c(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                s1Var2.getClass();
                                try {
                                    ((C4584g) s1Var2.f43902g).j(new t6.q(str2, (CameraManager) ((Activity) s1Var2.f43896a).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e13) {
                                    throw new C4592o("CameraAccessException", e13.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = Fe.b.V(th7);
                            }
                            c1521a.c(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C4584g c4584g8 = (C4584g) s1Var2.f43902g;
                                if (c4584g8.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g8.f48130t.resume();
                                    } catch (IllegalStateException e14) {
                                        throw new C4592o("videoRecordingFailed", e14.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = Fe.b.V(th8);
                            }
                            c1521a.c(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                s1Var2.i((x) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                            } catch (Throwable th9) {
                                arrayList14 = Fe.b.V(th9);
                            }
                            c1521a.c(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C4584g c4584g9 = (C4584g) s1Var2.f43902g;
                                if (c4584g9 != null) {
                                    Log.i("Camera", "dispose");
                                    c4584g9.a();
                                    c4584g9.f48116e.release();
                                    Jc.a aVar = c4584g9.f48112a.f().f6005c;
                                    V1 v1 = aVar.f6003f;
                                    if (v1 != null) {
                                        aVar.f5998a.unregisterReceiver(v1);
                                        aVar.f6003f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                            } catch (Throwable th10) {
                                arrayList15 = Fe.b.V(th10);
                            }
                            c1521a.c(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g10 = (C4584g) s1Var2.f43902g;
                                int iOrdinal2 = tVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        i162 = 2;
                                    } else if (iOrdinal2 == 2) {
                                        i162 = 3;
                                    } else {
                                        if (iOrdinal2 != 3) {
                                            throw new IllegalStateException("Unreachable code");
                                        }
                                        i162 = 4;
                                    }
                                }
                                c4584g10.f48112a.f().f6006d = i162;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = Fe.b.V(th11);
                            }
                            c1521a.c(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C4584g) s1Var2.f43902g).f48112a.f().f6006d = 0;
                                arrayList17.add(0, null);
                            } catch (Throwable th12) {
                                arrayList17 = Fe.b.V(th12);
                            }
                            c1521a.c(arrayList17);
                            return;
                        case 16:
                            C0801q c0801q2 = new C0801q(new ArrayList(), c1521a, i122);
                            C4584g c4584g11 = (C4584g) s1Var2.f43902g;
                            C4585h c4585h = c4584g11.f48122l;
                            if (c4585h.f48138b != 1) {
                                c0801q2.c(new C4592o("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c4584g11.f48136z = c0801q2;
                            try {
                                c4584g11.f48133w = File.createTempFile("CAP", ".jpg", c4584g11.f48118g.getCacheDir());
                                S3.s sVar = c4584g11.f48134x;
                                sVar.getClass();
                                sVar.f11009b = new J5.n(2);
                                sVar.f11010c = new J5.n(2);
                                c4584g11.f48127q.setOnImageAvailableListener(c4584g11, c4584g11.f48123m);
                                Ac.a aVar2 = (Ac.a) c4584g11.f48112a.f5569a.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1257b != 1) {
                                    c4584g11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c4585h.f48138b = 2;
                                c4584g11.d();
                                return;
                            } catch (IOException | SecurityException e15) {
                                c4584g11.f48119h.l(c4584g11.f48136z, "cannotCreateFile", e15.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                s1Var2.n((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                            } catch (Throwable th13) {
                                arrayList18 = Fe.b.V(th13);
                            }
                            c1521a.c(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, s1Var2.o());
                            } catch (Throwable th14) {
                                arrayList19 = Fe.b.V(th14);
                            }
                            c1521a.c(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C4584g c4584g12 = (C4584g) s1Var2.f43902g;
                                if (c4584g12.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g12.f48130t.pause();
                                    } catch (IllegalStateException e16) {
                                        throw new C4592o("videoRecordingFailed", e16.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = Fe.b.V(th15);
                            }
                            c1521a.c(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th16) {
                                arrayList21 = Fe.b.V(th16);
                            }
                            try {
                                C4584g c4584g13 = (C4584g) s1Var2.f43902g;
                                C4273j c4273j = (C4273j) s1Var2.f43901f;
                                c4584g13.getClass();
                                c4273j.a(new Wa.d(c4584g13, i142));
                                c4584g13.o(false, true);
                                Log.i("Camera", "startPreviewWithImageStream");
                                arrayList21.add(0, null);
                                c1521a.c(arrayList21);
                                return;
                            } catch (CameraAccessException e17) {
                                throw new C4592o("CameraAccessException", e17.getMessage(), null);
                            }
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th17) {
                                arrayList22 = Fe.b.V(th17);
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).p(null);
                                arrayList22.add(0, null);
                                c1521a.c(arrayList22);
                                return;
                            } catch (Exception e18) {
                                throw new C4592o(e18.getClass().getName(), e18.getMessage(), null);
                            }
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj2).get(0);
                            C0799o c0799o2 = new C0799o(arrayList23, c1521a, i122);
                            s1Var2.getClass();
                            int iOrdinal3 = vVar.ordinal();
                            if (iOrdinal3 == 0) {
                                i102 = 1;
                            } else if (iOrdinal3 == 1) {
                                i102 = 2;
                            } else if (iOrdinal3 == 2) {
                                i102 = 3;
                            } else {
                                if (iOrdinal3 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                i102 = 4;
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).k(c0799o2, i102);
                                return;
                            } catch (Exception e19) {
                                s1.h(e19, c0799o2);
                                return;
                            }
                        case 23:
                            a(obj2, c1521a);
                            return;
                        case 24:
                            b(obj2, c1521a);
                            return;
                        case 25:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                Cc.a aVarB2 = ((C4584g) s1Var2.f43902g).f48112a.b();
                                arrayList24.add(0, Double.valueOf(aVarB2.b() * (((Range) ((CameraCharacteristics) aVarB2.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r4.getLower()).intValue())));
                            } catch (Throwable th18) {
                                arrayList24 = Fe.b.V(th18);
                            }
                            c1521a.c(arrayList24);
                            return;
                        case 26:
                            c(obj2, c1521a);
                            return;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            try {
                                arrayList25.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.b().b()));
                            } catch (Throwable th19) {
                                arrayList25 = Fe.b.V(th19);
                            }
                            c1521a.c(arrayList25);
                            return;
                    }
                }
            });
        } else {
            x712.n(null);
        }
        X7 x713 = new X7(interfaceC4269f, pVar, obj, "dev.flutter.pigeon.camera_android.CameraApi.startImageStream");
        if (s1Var != null) {
            final int i20 = 20;
            x713.n(new InterfaceC4265b() { // from class: yc.n
                private final void a(Object obj2, C1521a c1521a) {
                    ArrayList arrayList = new ArrayList();
                    u uVar = (u) ((ArrayList) obj2).get(0);
                    C0800p c0800p = new C0800p(arrayList, c1521a, 23);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    int iOrdinal = uVar.ordinal();
                    int i102 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i102 = 2;
                    }
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        Bc.a aVar = (Bc.a) c4584g.f48112a.f5569a.get("EXPOSURE_LOCK");
                        aVar.f1667b = i102;
                        aVar.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0800p, 26), new C3641c(c0800p, 18));
                    } catch (Exception e7) {
                        s1.h(e7, c0800p);
                    }
                }

                private final void b(Object obj2, C1521a c1521a) {
                    w0 w0Var;
                    ArrayList arrayList = new ArrayList();
                    z zVar = (z) ((ArrayList) obj2).get(0);
                    C0801q c0801q = new C0801q(arrayList, c1521a, 22);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        w0 w0Var2 = null;
                        if (zVar == null) {
                            w0Var = null;
                        } else {
                            w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                        }
                        Dc.a aVarC = c4584g.f48112a.c();
                        if (w0Var != null && ((Double) w0Var.f46405a) != null && ((Double) w0Var.f46406b) != null) {
                            w0Var2 = w0Var;
                        }
                        aVarC.f2631c = w0Var2;
                        aVarC.b();
                        aVarC.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0801q, 22), new C3641c(c0801q, 14));
                    } catch (Exception e7) {
                        s1.h(e7, c0801q);
                    }
                }

                private final void c(Object obj2, C1521a c1521a) {
                    s1 s1Var2 = s1Var;
                    ArrayList arrayList = new ArrayList();
                    try {
                        Cc.a aVarB = ((C4584g) s1Var2.f43902g).f48112a.b();
                        arrayList.add(0, Double.valueOf(aVarB.b() * (((Range) ((CameraCharacteristics) aVarB.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r1.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = Fe.b.V(th);
                    }
                    c1521a.c(arrayList);
                }

                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listU;
                    int i102;
                    int i112 = 23;
                    int i122 = 21;
                    int i132 = 24;
                    int i142 = 3;
                    int i152 = 2;
                    int i162 = 1;
                    w0 w0Var = null;
                    s1 s1Var2 = s1Var;
                    int i172 = 0;
                    switch (i20) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                Activity activity = (Activity) s1Var2.f43896a;
                                if (activity == null) {
                                    listU = Collections.EMPTY_LIST;
                                } else {
                                    try {
                                        listU = Ba.c.u(activity);
                                    } catch (CameraAccessException e7) {
                                        throw new RuntimeException(e7);
                                    }
                                }
                                arrayList.add(0, listU);
                            } catch (Throwable th) {
                                arrayList = Fe.b.V(th);
                            }
                            c1521a.c(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            C0799o c0799o = new C0799o(arrayList2, c1521a, 22);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g = (C4584g) s1Var2.f43902g;
                                double dDoubleValue = d3.doubleValue();
                                Cc.a aVarB = c4584g.f48112a.b();
                                aVarB.f1982b = dDoubleValue / aVarB.b();
                                aVarB.a(c4584g.f48129s);
                                c4584g.h(new RunnableC4579b(i172, c0799o, aVarB), new C3641c(c0799o, 17));
                                return;
                            } catch (Exception e10) {
                                s1.g(e10, c0799o);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            y yVar = (y) arrayList4.get(1);
                            C0800p c0800p = new C0800p(arrayList3, c1521a, 22);
                            C4584g c4584g2 = (C4584g) s1Var2.f43902g;
                            if (c4584g2 != null) {
                                c4584g2.a();
                            }
                            boolean zBooleanValue = yVar.f48194e.booleanValue();
                            Y y10 = new Y(s1Var2, c0800p, str, yVar);
                            C4026b c4026b = (C4026b) s1Var2.f43898c;
                            if (c4026b.f45322b) {
                                y10.c("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            Activity activity2 = (Activity) s1Var2.f43896a;
                            if (Y0.e.checkSelfPermission(activity2, "android.permission.CAMERA") == 0 && (!zBooleanValue || Y0.e.checkSelfPermission(activity2, "android.permission.RECORD_AUDIO") == 0)) {
                                y10.c(null, null);
                                return;
                            }
                            ((s1) ((InterfaceC3965b) ((C3641c) s1Var2.f43899d).f41267b)).d(new Yc.g(new aa.f(27, c4026b, y10)));
                            c4026b.f45322b = true;
                            AbstractC1274b.a(activity2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            w wVar = (w) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g3 = (C4584g) s1Var2.f43902g;
                                int iOrdinal = wVar.ordinal();
                                if (iOrdinal == 0) {
                                    i152 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c4584g3.l(i152);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = Fe.b.V(th2);
                            }
                            c1521a.c(arrayList5);
                            return;
                        case 4:
                            ArrayList arrayList6 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            C0800p c0800p2 = new C0800p(arrayList6, c1521a, i132);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g4 = (C4584g) s1Var2.f43902g;
                                if (zVar != null) {
                                    w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                                }
                                c4584g4.m(c0800p2, w0Var);
                                return;
                            } catch (Exception e11) {
                                s1.h(e11, c0800p2);
                                return;
                            }
                        case 5:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6730f.floatValue()));
                            } catch (Throwable th3) {
                                arrayList7 = Fe.b.V(th3);
                            }
                            c1521a.c(arrayList7);
                            return;
                        case 6:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6729e.floatValue()));
                            } catch (Throwable th4) {
                                arrayList8 = Fe.b.V(th4);
                            }
                            c1521a.c(arrayList8);
                            return;
                        case 7:
                            ArrayList arrayList9 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj2).get(0);
                            C0801q c0801q = new C0801q(arrayList9, c1521a, i112);
                            C4584g c4584g5 = (C4584g) s1Var2.f43902g;
                            float fFloatValue = d5.floatValue();
                            Kc.a aVarG = c4584g5.f48112a.g();
                            Float f10 = aVarG.f6730f;
                            float fFloatValue2 = f10.floatValue();
                            Float f11 = aVarG.f6729e;
                            float fFloatValue3 = f11.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                c0801q.c(new C4592o("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f11, f10), null));
                                return;
                            }
                            aVarG.f6728d = Float.valueOf(fFloatValue);
                            aVarG.a(c4584g5.f48129s);
                            c4584g5.h(new RunnableC3307c(c0801q, i112), new C3641c(c0801q, 15));
                            return;
                        case 8:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th5) {
                                arrayList10 = Fe.b.V(th5);
                            }
                            try {
                                C4584g c4584g6 = (C4584g) s1Var2.f43902g;
                                if (!c4584g6.f48132v) {
                                    c4584g6.f48132v = true;
                                    CameraCaptureSession cameraCaptureSession = c4584g6.f48126p;
                                    if (cameraCaptureSession != null) {
                                        cameraCaptureSession.stopRepeating();
                                    }
                                }
                                arrayList10.add(0, null);
                                c1521a.c(arrayList10);
                                return;
                            } catch (CameraAccessException e12) {
                                throw new C4592o("CameraAccessException", e12.getMessage(), null);
                            }
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C4584g c4584g7 = (C4584g) s1Var2.f43902g;
                                c4584g7.f48132v = false;
                                c4584g7.h(null, new C4580c(c4584g7, i172));
                                arrayList11.add(0, null);
                            } catch (Throwable th6) {
                                arrayList11 = Fe.b.V(th6);
                            }
                            c1521a.c(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                s1Var2.getClass();
                                try {
                                    ((C4584g) s1Var2.f43902g).j(new t6.q(str2, (CameraManager) ((Activity) s1Var2.f43896a).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e13) {
                                    throw new C4592o("CameraAccessException", e13.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = Fe.b.V(th7);
                            }
                            c1521a.c(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C4584g c4584g8 = (C4584g) s1Var2.f43902g;
                                if (c4584g8.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g8.f48130t.resume();
                                    } catch (IllegalStateException e14) {
                                        throw new C4592o("videoRecordingFailed", e14.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = Fe.b.V(th8);
                            }
                            c1521a.c(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                s1Var2.i((x) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                            } catch (Throwable th9) {
                                arrayList14 = Fe.b.V(th9);
                            }
                            c1521a.c(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C4584g c4584g9 = (C4584g) s1Var2.f43902g;
                                if (c4584g9 != null) {
                                    Log.i("Camera", "dispose");
                                    c4584g9.a();
                                    c4584g9.f48116e.release();
                                    Jc.a aVar = c4584g9.f48112a.f().f6005c;
                                    V1 v1 = aVar.f6003f;
                                    if (v1 != null) {
                                        aVar.f5998a.unregisterReceiver(v1);
                                        aVar.f6003f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                            } catch (Throwable th10) {
                                arrayList15 = Fe.b.V(th10);
                            }
                            c1521a.c(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g10 = (C4584g) s1Var2.f43902g;
                                int iOrdinal2 = tVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        i162 = 2;
                                    } else if (iOrdinal2 == 2) {
                                        i162 = 3;
                                    } else {
                                        if (iOrdinal2 != 3) {
                                            throw new IllegalStateException("Unreachable code");
                                        }
                                        i162 = 4;
                                    }
                                }
                                c4584g10.f48112a.f().f6006d = i162;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = Fe.b.V(th11);
                            }
                            c1521a.c(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C4584g) s1Var2.f43902g).f48112a.f().f6006d = 0;
                                arrayList17.add(0, null);
                            } catch (Throwable th12) {
                                arrayList17 = Fe.b.V(th12);
                            }
                            c1521a.c(arrayList17);
                            return;
                        case 16:
                            C0801q c0801q2 = new C0801q(new ArrayList(), c1521a, i122);
                            C4584g c4584g11 = (C4584g) s1Var2.f43902g;
                            C4585h c4585h = c4584g11.f48122l;
                            if (c4585h.f48138b != 1) {
                                c0801q2.c(new C4592o("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c4584g11.f48136z = c0801q2;
                            try {
                                c4584g11.f48133w = File.createTempFile("CAP", ".jpg", c4584g11.f48118g.getCacheDir());
                                S3.s sVar = c4584g11.f48134x;
                                sVar.getClass();
                                sVar.f11009b = new J5.n(2);
                                sVar.f11010c = new J5.n(2);
                                c4584g11.f48127q.setOnImageAvailableListener(c4584g11, c4584g11.f48123m);
                                Ac.a aVar2 = (Ac.a) c4584g11.f48112a.f5569a.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1257b != 1) {
                                    c4584g11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c4585h.f48138b = 2;
                                c4584g11.d();
                                return;
                            } catch (IOException | SecurityException e15) {
                                c4584g11.f48119h.l(c4584g11.f48136z, "cannotCreateFile", e15.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                s1Var2.n((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                            } catch (Throwable th13) {
                                arrayList18 = Fe.b.V(th13);
                            }
                            c1521a.c(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, s1Var2.o());
                            } catch (Throwable th14) {
                                arrayList19 = Fe.b.V(th14);
                            }
                            c1521a.c(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C4584g c4584g12 = (C4584g) s1Var2.f43902g;
                                if (c4584g12.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g12.f48130t.pause();
                                    } catch (IllegalStateException e16) {
                                        throw new C4592o("videoRecordingFailed", e16.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = Fe.b.V(th15);
                            }
                            c1521a.c(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th16) {
                                arrayList21 = Fe.b.V(th16);
                            }
                            try {
                                C4584g c4584g13 = (C4584g) s1Var2.f43902g;
                                C4273j c4273j = (C4273j) s1Var2.f43901f;
                                c4584g13.getClass();
                                c4273j.a(new Wa.d(c4584g13, i142));
                                c4584g13.o(false, true);
                                Log.i("Camera", "startPreviewWithImageStream");
                                arrayList21.add(0, null);
                                c1521a.c(arrayList21);
                                return;
                            } catch (CameraAccessException e17) {
                                throw new C4592o("CameraAccessException", e17.getMessage(), null);
                            }
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th17) {
                                arrayList22 = Fe.b.V(th17);
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).p(null);
                                arrayList22.add(0, null);
                                c1521a.c(arrayList22);
                                return;
                            } catch (Exception e18) {
                                throw new C4592o(e18.getClass().getName(), e18.getMessage(), null);
                            }
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj2).get(0);
                            C0799o c0799o2 = new C0799o(arrayList23, c1521a, i122);
                            s1Var2.getClass();
                            int iOrdinal3 = vVar.ordinal();
                            if (iOrdinal3 == 0) {
                                i102 = 1;
                            } else if (iOrdinal3 == 1) {
                                i102 = 2;
                            } else if (iOrdinal3 == 2) {
                                i102 = 3;
                            } else {
                                if (iOrdinal3 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                i102 = 4;
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).k(c0799o2, i102);
                                return;
                            } catch (Exception e19) {
                                s1.h(e19, c0799o2);
                                return;
                            }
                        case 23:
                            a(obj2, c1521a);
                            return;
                        case 24:
                            b(obj2, c1521a);
                            return;
                        case 25:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                Cc.a aVarB2 = ((C4584g) s1Var2.f43902g).f48112a.b();
                                arrayList24.add(0, Double.valueOf(aVarB2.b() * (((Range) ((CameraCharacteristics) aVarB2.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r4.getLower()).intValue())));
                            } catch (Throwable th18) {
                                arrayList24 = Fe.b.V(th18);
                            }
                            c1521a.c(arrayList24);
                            return;
                        case 26:
                            c(obj2, c1521a);
                            return;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            try {
                                arrayList25.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.b().b()));
                            } catch (Throwable th19) {
                                arrayList25 = Fe.b.V(th19);
                            }
                            c1521a.c(arrayList25);
                            return;
                    }
                }
            });
        } else {
            x713.n(null);
        }
        X7 x714 = new X7(interfaceC4269f, pVar, obj, "dev.flutter.pigeon.camera_android.CameraApi.stopImageStream");
        if (s1Var != null) {
            final int i21 = 21;
            x714.n(new InterfaceC4265b() { // from class: yc.n
                private final void a(Object obj2, C1521a c1521a) {
                    ArrayList arrayList = new ArrayList();
                    u uVar = (u) ((ArrayList) obj2).get(0);
                    C0800p c0800p = new C0800p(arrayList, c1521a, 23);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    int iOrdinal = uVar.ordinal();
                    int i102 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i102 = 2;
                    }
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        Bc.a aVar = (Bc.a) c4584g.f48112a.f5569a.get("EXPOSURE_LOCK");
                        aVar.f1667b = i102;
                        aVar.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0800p, 26), new C3641c(c0800p, 18));
                    } catch (Exception e7) {
                        s1.h(e7, c0800p);
                    }
                }

                private final void b(Object obj2, C1521a c1521a) {
                    w0 w0Var;
                    ArrayList arrayList = new ArrayList();
                    z zVar = (z) ((ArrayList) obj2).get(0);
                    C0801q c0801q = new C0801q(arrayList, c1521a, 22);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        w0 w0Var2 = null;
                        if (zVar == null) {
                            w0Var = null;
                        } else {
                            w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                        }
                        Dc.a aVarC = c4584g.f48112a.c();
                        if (w0Var != null && ((Double) w0Var.f46405a) != null && ((Double) w0Var.f46406b) != null) {
                            w0Var2 = w0Var;
                        }
                        aVarC.f2631c = w0Var2;
                        aVarC.b();
                        aVarC.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0801q, 22), new C3641c(c0801q, 14));
                    } catch (Exception e7) {
                        s1.h(e7, c0801q);
                    }
                }

                private final void c(Object obj2, C1521a c1521a) {
                    s1 s1Var2 = s1Var;
                    ArrayList arrayList = new ArrayList();
                    try {
                        Cc.a aVarB = ((C4584g) s1Var2.f43902g).f48112a.b();
                        arrayList.add(0, Double.valueOf(aVarB.b() * (((Range) ((CameraCharacteristics) aVarB.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r1.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = Fe.b.V(th);
                    }
                    c1521a.c(arrayList);
                }

                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listU;
                    int i102;
                    int i112 = 23;
                    int i122 = 21;
                    int i132 = 24;
                    int i142 = 3;
                    int i152 = 2;
                    int i162 = 1;
                    w0 w0Var = null;
                    s1 s1Var2 = s1Var;
                    int i172 = 0;
                    switch (i21) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                Activity activity = (Activity) s1Var2.f43896a;
                                if (activity == null) {
                                    listU = Collections.EMPTY_LIST;
                                } else {
                                    try {
                                        listU = Ba.c.u(activity);
                                    } catch (CameraAccessException e7) {
                                        throw new RuntimeException(e7);
                                    }
                                }
                                arrayList.add(0, listU);
                            } catch (Throwable th) {
                                arrayList = Fe.b.V(th);
                            }
                            c1521a.c(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            C0799o c0799o = new C0799o(arrayList2, c1521a, 22);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g = (C4584g) s1Var2.f43902g;
                                double dDoubleValue = d3.doubleValue();
                                Cc.a aVarB = c4584g.f48112a.b();
                                aVarB.f1982b = dDoubleValue / aVarB.b();
                                aVarB.a(c4584g.f48129s);
                                c4584g.h(new RunnableC4579b(i172, c0799o, aVarB), new C3641c(c0799o, 17));
                                return;
                            } catch (Exception e10) {
                                s1.g(e10, c0799o);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            y yVar = (y) arrayList4.get(1);
                            C0800p c0800p = new C0800p(arrayList3, c1521a, 22);
                            C4584g c4584g2 = (C4584g) s1Var2.f43902g;
                            if (c4584g2 != null) {
                                c4584g2.a();
                            }
                            boolean zBooleanValue = yVar.f48194e.booleanValue();
                            Y y10 = new Y(s1Var2, c0800p, str, yVar);
                            C4026b c4026b = (C4026b) s1Var2.f43898c;
                            if (c4026b.f45322b) {
                                y10.c("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            Activity activity2 = (Activity) s1Var2.f43896a;
                            if (Y0.e.checkSelfPermission(activity2, "android.permission.CAMERA") == 0 && (!zBooleanValue || Y0.e.checkSelfPermission(activity2, "android.permission.RECORD_AUDIO") == 0)) {
                                y10.c(null, null);
                                return;
                            }
                            ((s1) ((InterfaceC3965b) ((C3641c) s1Var2.f43899d).f41267b)).d(new Yc.g(new aa.f(27, c4026b, y10)));
                            c4026b.f45322b = true;
                            AbstractC1274b.a(activity2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            w wVar = (w) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g3 = (C4584g) s1Var2.f43902g;
                                int iOrdinal = wVar.ordinal();
                                if (iOrdinal == 0) {
                                    i152 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c4584g3.l(i152);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = Fe.b.V(th2);
                            }
                            c1521a.c(arrayList5);
                            return;
                        case 4:
                            ArrayList arrayList6 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            C0800p c0800p2 = new C0800p(arrayList6, c1521a, i132);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g4 = (C4584g) s1Var2.f43902g;
                                if (zVar != null) {
                                    w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                                }
                                c4584g4.m(c0800p2, w0Var);
                                return;
                            } catch (Exception e11) {
                                s1.h(e11, c0800p2);
                                return;
                            }
                        case 5:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6730f.floatValue()));
                            } catch (Throwable th3) {
                                arrayList7 = Fe.b.V(th3);
                            }
                            c1521a.c(arrayList7);
                            return;
                        case 6:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6729e.floatValue()));
                            } catch (Throwable th4) {
                                arrayList8 = Fe.b.V(th4);
                            }
                            c1521a.c(arrayList8);
                            return;
                        case 7:
                            ArrayList arrayList9 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj2).get(0);
                            C0801q c0801q = new C0801q(arrayList9, c1521a, i112);
                            C4584g c4584g5 = (C4584g) s1Var2.f43902g;
                            float fFloatValue = d5.floatValue();
                            Kc.a aVarG = c4584g5.f48112a.g();
                            Float f10 = aVarG.f6730f;
                            float fFloatValue2 = f10.floatValue();
                            Float f11 = aVarG.f6729e;
                            float fFloatValue3 = f11.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                c0801q.c(new C4592o("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f11, f10), null));
                                return;
                            }
                            aVarG.f6728d = Float.valueOf(fFloatValue);
                            aVarG.a(c4584g5.f48129s);
                            c4584g5.h(new RunnableC3307c(c0801q, i112), new C3641c(c0801q, 15));
                            return;
                        case 8:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th5) {
                                arrayList10 = Fe.b.V(th5);
                            }
                            try {
                                C4584g c4584g6 = (C4584g) s1Var2.f43902g;
                                if (!c4584g6.f48132v) {
                                    c4584g6.f48132v = true;
                                    CameraCaptureSession cameraCaptureSession = c4584g6.f48126p;
                                    if (cameraCaptureSession != null) {
                                        cameraCaptureSession.stopRepeating();
                                    }
                                }
                                arrayList10.add(0, null);
                                c1521a.c(arrayList10);
                                return;
                            } catch (CameraAccessException e12) {
                                throw new C4592o("CameraAccessException", e12.getMessage(), null);
                            }
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C4584g c4584g7 = (C4584g) s1Var2.f43902g;
                                c4584g7.f48132v = false;
                                c4584g7.h(null, new C4580c(c4584g7, i172));
                                arrayList11.add(0, null);
                            } catch (Throwable th6) {
                                arrayList11 = Fe.b.V(th6);
                            }
                            c1521a.c(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                s1Var2.getClass();
                                try {
                                    ((C4584g) s1Var2.f43902g).j(new t6.q(str2, (CameraManager) ((Activity) s1Var2.f43896a).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e13) {
                                    throw new C4592o("CameraAccessException", e13.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = Fe.b.V(th7);
                            }
                            c1521a.c(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C4584g c4584g8 = (C4584g) s1Var2.f43902g;
                                if (c4584g8.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g8.f48130t.resume();
                                    } catch (IllegalStateException e14) {
                                        throw new C4592o("videoRecordingFailed", e14.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = Fe.b.V(th8);
                            }
                            c1521a.c(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                s1Var2.i((x) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                            } catch (Throwable th9) {
                                arrayList14 = Fe.b.V(th9);
                            }
                            c1521a.c(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C4584g c4584g9 = (C4584g) s1Var2.f43902g;
                                if (c4584g9 != null) {
                                    Log.i("Camera", "dispose");
                                    c4584g9.a();
                                    c4584g9.f48116e.release();
                                    Jc.a aVar = c4584g9.f48112a.f().f6005c;
                                    V1 v1 = aVar.f6003f;
                                    if (v1 != null) {
                                        aVar.f5998a.unregisterReceiver(v1);
                                        aVar.f6003f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                            } catch (Throwable th10) {
                                arrayList15 = Fe.b.V(th10);
                            }
                            c1521a.c(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g10 = (C4584g) s1Var2.f43902g;
                                int iOrdinal2 = tVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        i162 = 2;
                                    } else if (iOrdinal2 == 2) {
                                        i162 = 3;
                                    } else {
                                        if (iOrdinal2 != 3) {
                                            throw new IllegalStateException("Unreachable code");
                                        }
                                        i162 = 4;
                                    }
                                }
                                c4584g10.f48112a.f().f6006d = i162;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = Fe.b.V(th11);
                            }
                            c1521a.c(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C4584g) s1Var2.f43902g).f48112a.f().f6006d = 0;
                                arrayList17.add(0, null);
                            } catch (Throwable th12) {
                                arrayList17 = Fe.b.V(th12);
                            }
                            c1521a.c(arrayList17);
                            return;
                        case 16:
                            C0801q c0801q2 = new C0801q(new ArrayList(), c1521a, i122);
                            C4584g c4584g11 = (C4584g) s1Var2.f43902g;
                            C4585h c4585h = c4584g11.f48122l;
                            if (c4585h.f48138b != 1) {
                                c0801q2.c(new C4592o("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c4584g11.f48136z = c0801q2;
                            try {
                                c4584g11.f48133w = File.createTempFile("CAP", ".jpg", c4584g11.f48118g.getCacheDir());
                                S3.s sVar = c4584g11.f48134x;
                                sVar.getClass();
                                sVar.f11009b = new J5.n(2);
                                sVar.f11010c = new J5.n(2);
                                c4584g11.f48127q.setOnImageAvailableListener(c4584g11, c4584g11.f48123m);
                                Ac.a aVar2 = (Ac.a) c4584g11.f48112a.f5569a.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1257b != 1) {
                                    c4584g11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c4585h.f48138b = 2;
                                c4584g11.d();
                                return;
                            } catch (IOException | SecurityException e15) {
                                c4584g11.f48119h.l(c4584g11.f48136z, "cannotCreateFile", e15.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                s1Var2.n((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                            } catch (Throwable th13) {
                                arrayList18 = Fe.b.V(th13);
                            }
                            c1521a.c(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, s1Var2.o());
                            } catch (Throwable th14) {
                                arrayList19 = Fe.b.V(th14);
                            }
                            c1521a.c(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C4584g c4584g12 = (C4584g) s1Var2.f43902g;
                                if (c4584g12.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g12.f48130t.pause();
                                    } catch (IllegalStateException e16) {
                                        throw new C4592o("videoRecordingFailed", e16.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = Fe.b.V(th15);
                            }
                            c1521a.c(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th16) {
                                arrayList21 = Fe.b.V(th16);
                            }
                            try {
                                C4584g c4584g13 = (C4584g) s1Var2.f43902g;
                                C4273j c4273j = (C4273j) s1Var2.f43901f;
                                c4584g13.getClass();
                                c4273j.a(new Wa.d(c4584g13, i142));
                                c4584g13.o(false, true);
                                Log.i("Camera", "startPreviewWithImageStream");
                                arrayList21.add(0, null);
                                c1521a.c(arrayList21);
                                return;
                            } catch (CameraAccessException e17) {
                                throw new C4592o("CameraAccessException", e17.getMessage(), null);
                            }
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th17) {
                                arrayList22 = Fe.b.V(th17);
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).p(null);
                                arrayList22.add(0, null);
                                c1521a.c(arrayList22);
                                return;
                            } catch (Exception e18) {
                                throw new C4592o(e18.getClass().getName(), e18.getMessage(), null);
                            }
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj2).get(0);
                            C0799o c0799o2 = new C0799o(arrayList23, c1521a, i122);
                            s1Var2.getClass();
                            int iOrdinal3 = vVar.ordinal();
                            if (iOrdinal3 == 0) {
                                i102 = 1;
                            } else if (iOrdinal3 == 1) {
                                i102 = 2;
                            } else if (iOrdinal3 == 2) {
                                i102 = 3;
                            } else {
                                if (iOrdinal3 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                i102 = 4;
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).k(c0799o2, i102);
                                return;
                            } catch (Exception e19) {
                                s1.h(e19, c0799o2);
                                return;
                            }
                        case 23:
                            a(obj2, c1521a);
                            return;
                        case 24:
                            b(obj2, c1521a);
                            return;
                        case 25:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                Cc.a aVarB2 = ((C4584g) s1Var2.f43902g).f48112a.b();
                                arrayList24.add(0, Double.valueOf(aVarB2.b() * (((Range) ((CameraCharacteristics) aVarB2.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r4.getLower()).intValue())));
                            } catch (Throwable th18) {
                                arrayList24 = Fe.b.V(th18);
                            }
                            c1521a.c(arrayList24);
                            return;
                        case 26:
                            c(obj2, c1521a);
                            return;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            try {
                                arrayList25.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.b().b()));
                            } catch (Throwable th19) {
                                arrayList25 = Fe.b.V(th19);
                            }
                            c1521a.c(arrayList25);
                            return;
                    }
                }
            });
        } else {
            x714.n(null);
        }
        X7 x715 = new X7(interfaceC4269f, pVar, obj, "dev.flutter.pigeon.camera_android.CameraApi.setFlashMode");
        if (s1Var != null) {
            final int i22 = 22;
            x715.n(new InterfaceC4265b() { // from class: yc.n
                private final void a(Object obj2, C1521a c1521a) {
                    ArrayList arrayList = new ArrayList();
                    u uVar = (u) ((ArrayList) obj2).get(0);
                    C0800p c0800p = new C0800p(arrayList, c1521a, 23);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    int iOrdinal = uVar.ordinal();
                    int i102 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i102 = 2;
                    }
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        Bc.a aVar = (Bc.a) c4584g.f48112a.f5569a.get("EXPOSURE_LOCK");
                        aVar.f1667b = i102;
                        aVar.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0800p, 26), new C3641c(c0800p, 18));
                    } catch (Exception e7) {
                        s1.h(e7, c0800p);
                    }
                }

                private final void b(Object obj2, C1521a c1521a) {
                    w0 w0Var;
                    ArrayList arrayList = new ArrayList();
                    z zVar = (z) ((ArrayList) obj2).get(0);
                    C0801q c0801q = new C0801q(arrayList, c1521a, 22);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        w0 w0Var2 = null;
                        if (zVar == null) {
                            w0Var = null;
                        } else {
                            w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                        }
                        Dc.a aVarC = c4584g.f48112a.c();
                        if (w0Var != null && ((Double) w0Var.f46405a) != null && ((Double) w0Var.f46406b) != null) {
                            w0Var2 = w0Var;
                        }
                        aVarC.f2631c = w0Var2;
                        aVarC.b();
                        aVarC.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0801q, 22), new C3641c(c0801q, 14));
                    } catch (Exception e7) {
                        s1.h(e7, c0801q);
                    }
                }

                private final void c(Object obj2, C1521a c1521a) {
                    s1 s1Var2 = s1Var;
                    ArrayList arrayList = new ArrayList();
                    try {
                        Cc.a aVarB = ((C4584g) s1Var2.f43902g).f48112a.b();
                        arrayList.add(0, Double.valueOf(aVarB.b() * (((Range) ((CameraCharacteristics) aVarB.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r1.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = Fe.b.V(th);
                    }
                    c1521a.c(arrayList);
                }

                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listU;
                    int i102;
                    int i112 = 23;
                    int i122 = 21;
                    int i132 = 24;
                    int i142 = 3;
                    int i152 = 2;
                    int i162 = 1;
                    w0 w0Var = null;
                    s1 s1Var2 = s1Var;
                    int i172 = 0;
                    switch (i22) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                Activity activity = (Activity) s1Var2.f43896a;
                                if (activity == null) {
                                    listU = Collections.EMPTY_LIST;
                                } else {
                                    try {
                                        listU = Ba.c.u(activity);
                                    } catch (CameraAccessException e7) {
                                        throw new RuntimeException(e7);
                                    }
                                }
                                arrayList.add(0, listU);
                            } catch (Throwable th) {
                                arrayList = Fe.b.V(th);
                            }
                            c1521a.c(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            C0799o c0799o = new C0799o(arrayList2, c1521a, 22);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g = (C4584g) s1Var2.f43902g;
                                double dDoubleValue = d3.doubleValue();
                                Cc.a aVarB = c4584g.f48112a.b();
                                aVarB.f1982b = dDoubleValue / aVarB.b();
                                aVarB.a(c4584g.f48129s);
                                c4584g.h(new RunnableC4579b(i172, c0799o, aVarB), new C3641c(c0799o, 17));
                                return;
                            } catch (Exception e10) {
                                s1.g(e10, c0799o);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            y yVar = (y) arrayList4.get(1);
                            C0800p c0800p = new C0800p(arrayList3, c1521a, 22);
                            C4584g c4584g2 = (C4584g) s1Var2.f43902g;
                            if (c4584g2 != null) {
                                c4584g2.a();
                            }
                            boolean zBooleanValue = yVar.f48194e.booleanValue();
                            Y y10 = new Y(s1Var2, c0800p, str, yVar);
                            C4026b c4026b = (C4026b) s1Var2.f43898c;
                            if (c4026b.f45322b) {
                                y10.c("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            Activity activity2 = (Activity) s1Var2.f43896a;
                            if (Y0.e.checkSelfPermission(activity2, "android.permission.CAMERA") == 0 && (!zBooleanValue || Y0.e.checkSelfPermission(activity2, "android.permission.RECORD_AUDIO") == 0)) {
                                y10.c(null, null);
                                return;
                            }
                            ((s1) ((InterfaceC3965b) ((C3641c) s1Var2.f43899d).f41267b)).d(new Yc.g(new aa.f(27, c4026b, y10)));
                            c4026b.f45322b = true;
                            AbstractC1274b.a(activity2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            w wVar = (w) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g3 = (C4584g) s1Var2.f43902g;
                                int iOrdinal = wVar.ordinal();
                                if (iOrdinal == 0) {
                                    i152 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c4584g3.l(i152);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = Fe.b.V(th2);
                            }
                            c1521a.c(arrayList5);
                            return;
                        case 4:
                            ArrayList arrayList6 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            C0800p c0800p2 = new C0800p(arrayList6, c1521a, i132);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g4 = (C4584g) s1Var2.f43902g;
                                if (zVar != null) {
                                    w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                                }
                                c4584g4.m(c0800p2, w0Var);
                                return;
                            } catch (Exception e11) {
                                s1.h(e11, c0800p2);
                                return;
                            }
                        case 5:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6730f.floatValue()));
                            } catch (Throwable th3) {
                                arrayList7 = Fe.b.V(th3);
                            }
                            c1521a.c(arrayList7);
                            return;
                        case 6:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6729e.floatValue()));
                            } catch (Throwable th4) {
                                arrayList8 = Fe.b.V(th4);
                            }
                            c1521a.c(arrayList8);
                            return;
                        case 7:
                            ArrayList arrayList9 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj2).get(0);
                            C0801q c0801q = new C0801q(arrayList9, c1521a, i112);
                            C4584g c4584g5 = (C4584g) s1Var2.f43902g;
                            float fFloatValue = d5.floatValue();
                            Kc.a aVarG = c4584g5.f48112a.g();
                            Float f10 = aVarG.f6730f;
                            float fFloatValue2 = f10.floatValue();
                            Float f11 = aVarG.f6729e;
                            float fFloatValue3 = f11.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                c0801q.c(new C4592o("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f11, f10), null));
                                return;
                            }
                            aVarG.f6728d = Float.valueOf(fFloatValue);
                            aVarG.a(c4584g5.f48129s);
                            c4584g5.h(new RunnableC3307c(c0801q, i112), new C3641c(c0801q, 15));
                            return;
                        case 8:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th5) {
                                arrayList10 = Fe.b.V(th5);
                            }
                            try {
                                C4584g c4584g6 = (C4584g) s1Var2.f43902g;
                                if (!c4584g6.f48132v) {
                                    c4584g6.f48132v = true;
                                    CameraCaptureSession cameraCaptureSession = c4584g6.f48126p;
                                    if (cameraCaptureSession != null) {
                                        cameraCaptureSession.stopRepeating();
                                    }
                                }
                                arrayList10.add(0, null);
                                c1521a.c(arrayList10);
                                return;
                            } catch (CameraAccessException e12) {
                                throw new C4592o("CameraAccessException", e12.getMessage(), null);
                            }
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C4584g c4584g7 = (C4584g) s1Var2.f43902g;
                                c4584g7.f48132v = false;
                                c4584g7.h(null, new C4580c(c4584g7, i172));
                                arrayList11.add(0, null);
                            } catch (Throwable th6) {
                                arrayList11 = Fe.b.V(th6);
                            }
                            c1521a.c(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                s1Var2.getClass();
                                try {
                                    ((C4584g) s1Var2.f43902g).j(new t6.q(str2, (CameraManager) ((Activity) s1Var2.f43896a).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e13) {
                                    throw new C4592o("CameraAccessException", e13.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = Fe.b.V(th7);
                            }
                            c1521a.c(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C4584g c4584g8 = (C4584g) s1Var2.f43902g;
                                if (c4584g8.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g8.f48130t.resume();
                                    } catch (IllegalStateException e14) {
                                        throw new C4592o("videoRecordingFailed", e14.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = Fe.b.V(th8);
                            }
                            c1521a.c(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                s1Var2.i((x) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                            } catch (Throwable th9) {
                                arrayList14 = Fe.b.V(th9);
                            }
                            c1521a.c(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C4584g c4584g9 = (C4584g) s1Var2.f43902g;
                                if (c4584g9 != null) {
                                    Log.i("Camera", "dispose");
                                    c4584g9.a();
                                    c4584g9.f48116e.release();
                                    Jc.a aVar = c4584g9.f48112a.f().f6005c;
                                    V1 v1 = aVar.f6003f;
                                    if (v1 != null) {
                                        aVar.f5998a.unregisterReceiver(v1);
                                        aVar.f6003f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                            } catch (Throwable th10) {
                                arrayList15 = Fe.b.V(th10);
                            }
                            c1521a.c(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g10 = (C4584g) s1Var2.f43902g;
                                int iOrdinal2 = tVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        i162 = 2;
                                    } else if (iOrdinal2 == 2) {
                                        i162 = 3;
                                    } else {
                                        if (iOrdinal2 != 3) {
                                            throw new IllegalStateException("Unreachable code");
                                        }
                                        i162 = 4;
                                    }
                                }
                                c4584g10.f48112a.f().f6006d = i162;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = Fe.b.V(th11);
                            }
                            c1521a.c(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C4584g) s1Var2.f43902g).f48112a.f().f6006d = 0;
                                arrayList17.add(0, null);
                            } catch (Throwable th12) {
                                arrayList17 = Fe.b.V(th12);
                            }
                            c1521a.c(arrayList17);
                            return;
                        case 16:
                            C0801q c0801q2 = new C0801q(new ArrayList(), c1521a, i122);
                            C4584g c4584g11 = (C4584g) s1Var2.f43902g;
                            C4585h c4585h = c4584g11.f48122l;
                            if (c4585h.f48138b != 1) {
                                c0801q2.c(new C4592o("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c4584g11.f48136z = c0801q2;
                            try {
                                c4584g11.f48133w = File.createTempFile("CAP", ".jpg", c4584g11.f48118g.getCacheDir());
                                S3.s sVar = c4584g11.f48134x;
                                sVar.getClass();
                                sVar.f11009b = new J5.n(2);
                                sVar.f11010c = new J5.n(2);
                                c4584g11.f48127q.setOnImageAvailableListener(c4584g11, c4584g11.f48123m);
                                Ac.a aVar2 = (Ac.a) c4584g11.f48112a.f5569a.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1257b != 1) {
                                    c4584g11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c4585h.f48138b = 2;
                                c4584g11.d();
                                return;
                            } catch (IOException | SecurityException e15) {
                                c4584g11.f48119h.l(c4584g11.f48136z, "cannotCreateFile", e15.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                s1Var2.n((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                            } catch (Throwable th13) {
                                arrayList18 = Fe.b.V(th13);
                            }
                            c1521a.c(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, s1Var2.o());
                            } catch (Throwable th14) {
                                arrayList19 = Fe.b.V(th14);
                            }
                            c1521a.c(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C4584g c4584g12 = (C4584g) s1Var2.f43902g;
                                if (c4584g12.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g12.f48130t.pause();
                                    } catch (IllegalStateException e16) {
                                        throw new C4592o("videoRecordingFailed", e16.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = Fe.b.V(th15);
                            }
                            c1521a.c(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th16) {
                                arrayList21 = Fe.b.V(th16);
                            }
                            try {
                                C4584g c4584g13 = (C4584g) s1Var2.f43902g;
                                C4273j c4273j = (C4273j) s1Var2.f43901f;
                                c4584g13.getClass();
                                c4273j.a(new Wa.d(c4584g13, i142));
                                c4584g13.o(false, true);
                                Log.i("Camera", "startPreviewWithImageStream");
                                arrayList21.add(0, null);
                                c1521a.c(arrayList21);
                                return;
                            } catch (CameraAccessException e17) {
                                throw new C4592o("CameraAccessException", e17.getMessage(), null);
                            }
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th17) {
                                arrayList22 = Fe.b.V(th17);
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).p(null);
                                arrayList22.add(0, null);
                                c1521a.c(arrayList22);
                                return;
                            } catch (Exception e18) {
                                throw new C4592o(e18.getClass().getName(), e18.getMessage(), null);
                            }
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj2).get(0);
                            C0799o c0799o2 = new C0799o(arrayList23, c1521a, i122);
                            s1Var2.getClass();
                            int iOrdinal3 = vVar.ordinal();
                            if (iOrdinal3 == 0) {
                                i102 = 1;
                            } else if (iOrdinal3 == 1) {
                                i102 = 2;
                            } else if (iOrdinal3 == 2) {
                                i102 = 3;
                            } else {
                                if (iOrdinal3 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                i102 = 4;
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).k(c0799o2, i102);
                                return;
                            } catch (Exception e19) {
                                s1.h(e19, c0799o2);
                                return;
                            }
                        case 23:
                            a(obj2, c1521a);
                            return;
                        case 24:
                            b(obj2, c1521a);
                            return;
                        case 25:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                Cc.a aVarB2 = ((C4584g) s1Var2.f43902g).f48112a.b();
                                arrayList24.add(0, Double.valueOf(aVarB2.b() * (((Range) ((CameraCharacteristics) aVarB2.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r4.getLower()).intValue())));
                            } catch (Throwable th18) {
                                arrayList24 = Fe.b.V(th18);
                            }
                            c1521a.c(arrayList24);
                            return;
                        case 26:
                            c(obj2, c1521a);
                            return;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            try {
                                arrayList25.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.b().b()));
                            } catch (Throwable th19) {
                                arrayList25 = Fe.b.V(th19);
                            }
                            c1521a.c(arrayList25);
                            return;
                    }
                }
            });
        } else {
            x715.n(null);
        }
        X7 x716 = new X7(interfaceC4269f, pVar, obj, "dev.flutter.pigeon.camera_android.CameraApi.setExposureMode");
        if (s1Var != null) {
            final int i23 = 23;
            x716.n(new InterfaceC4265b() { // from class: yc.n
                private final void a(Object obj2, C1521a c1521a) {
                    ArrayList arrayList = new ArrayList();
                    u uVar = (u) ((ArrayList) obj2).get(0);
                    C0800p c0800p = new C0800p(arrayList, c1521a, 23);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    int iOrdinal = uVar.ordinal();
                    int i102 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i102 = 2;
                    }
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        Bc.a aVar = (Bc.a) c4584g.f48112a.f5569a.get("EXPOSURE_LOCK");
                        aVar.f1667b = i102;
                        aVar.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0800p, 26), new C3641c(c0800p, 18));
                    } catch (Exception e7) {
                        s1.h(e7, c0800p);
                    }
                }

                private final void b(Object obj2, C1521a c1521a) {
                    w0 w0Var;
                    ArrayList arrayList = new ArrayList();
                    z zVar = (z) ((ArrayList) obj2).get(0);
                    C0801q c0801q = new C0801q(arrayList, c1521a, 22);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        w0 w0Var2 = null;
                        if (zVar == null) {
                            w0Var = null;
                        } else {
                            w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                        }
                        Dc.a aVarC = c4584g.f48112a.c();
                        if (w0Var != null && ((Double) w0Var.f46405a) != null && ((Double) w0Var.f46406b) != null) {
                            w0Var2 = w0Var;
                        }
                        aVarC.f2631c = w0Var2;
                        aVarC.b();
                        aVarC.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0801q, 22), new C3641c(c0801q, 14));
                    } catch (Exception e7) {
                        s1.h(e7, c0801q);
                    }
                }

                private final void c(Object obj2, C1521a c1521a) {
                    s1 s1Var2 = s1Var;
                    ArrayList arrayList = new ArrayList();
                    try {
                        Cc.a aVarB = ((C4584g) s1Var2.f43902g).f48112a.b();
                        arrayList.add(0, Double.valueOf(aVarB.b() * (((Range) ((CameraCharacteristics) aVarB.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r1.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = Fe.b.V(th);
                    }
                    c1521a.c(arrayList);
                }

                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listU;
                    int i102;
                    int i112 = 23;
                    int i122 = 21;
                    int i132 = 24;
                    int i142 = 3;
                    int i152 = 2;
                    int i162 = 1;
                    w0 w0Var = null;
                    s1 s1Var2 = s1Var;
                    int i172 = 0;
                    switch (i23) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                Activity activity = (Activity) s1Var2.f43896a;
                                if (activity == null) {
                                    listU = Collections.EMPTY_LIST;
                                } else {
                                    try {
                                        listU = Ba.c.u(activity);
                                    } catch (CameraAccessException e7) {
                                        throw new RuntimeException(e7);
                                    }
                                }
                                arrayList.add(0, listU);
                            } catch (Throwable th) {
                                arrayList = Fe.b.V(th);
                            }
                            c1521a.c(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            C0799o c0799o = new C0799o(arrayList2, c1521a, 22);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g = (C4584g) s1Var2.f43902g;
                                double dDoubleValue = d3.doubleValue();
                                Cc.a aVarB = c4584g.f48112a.b();
                                aVarB.f1982b = dDoubleValue / aVarB.b();
                                aVarB.a(c4584g.f48129s);
                                c4584g.h(new RunnableC4579b(i172, c0799o, aVarB), new C3641c(c0799o, 17));
                                return;
                            } catch (Exception e10) {
                                s1.g(e10, c0799o);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            y yVar = (y) arrayList4.get(1);
                            C0800p c0800p = new C0800p(arrayList3, c1521a, 22);
                            C4584g c4584g2 = (C4584g) s1Var2.f43902g;
                            if (c4584g2 != null) {
                                c4584g2.a();
                            }
                            boolean zBooleanValue = yVar.f48194e.booleanValue();
                            Y y10 = new Y(s1Var2, c0800p, str, yVar);
                            C4026b c4026b = (C4026b) s1Var2.f43898c;
                            if (c4026b.f45322b) {
                                y10.c("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            Activity activity2 = (Activity) s1Var2.f43896a;
                            if (Y0.e.checkSelfPermission(activity2, "android.permission.CAMERA") == 0 && (!zBooleanValue || Y0.e.checkSelfPermission(activity2, "android.permission.RECORD_AUDIO") == 0)) {
                                y10.c(null, null);
                                return;
                            }
                            ((s1) ((InterfaceC3965b) ((C3641c) s1Var2.f43899d).f41267b)).d(new Yc.g(new aa.f(27, c4026b, y10)));
                            c4026b.f45322b = true;
                            AbstractC1274b.a(activity2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            w wVar = (w) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g3 = (C4584g) s1Var2.f43902g;
                                int iOrdinal = wVar.ordinal();
                                if (iOrdinal == 0) {
                                    i152 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c4584g3.l(i152);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = Fe.b.V(th2);
                            }
                            c1521a.c(arrayList5);
                            return;
                        case 4:
                            ArrayList arrayList6 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            C0800p c0800p2 = new C0800p(arrayList6, c1521a, i132);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g4 = (C4584g) s1Var2.f43902g;
                                if (zVar != null) {
                                    w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                                }
                                c4584g4.m(c0800p2, w0Var);
                                return;
                            } catch (Exception e11) {
                                s1.h(e11, c0800p2);
                                return;
                            }
                        case 5:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6730f.floatValue()));
                            } catch (Throwable th3) {
                                arrayList7 = Fe.b.V(th3);
                            }
                            c1521a.c(arrayList7);
                            return;
                        case 6:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6729e.floatValue()));
                            } catch (Throwable th4) {
                                arrayList8 = Fe.b.V(th4);
                            }
                            c1521a.c(arrayList8);
                            return;
                        case 7:
                            ArrayList arrayList9 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj2).get(0);
                            C0801q c0801q = new C0801q(arrayList9, c1521a, i112);
                            C4584g c4584g5 = (C4584g) s1Var2.f43902g;
                            float fFloatValue = d5.floatValue();
                            Kc.a aVarG = c4584g5.f48112a.g();
                            Float f10 = aVarG.f6730f;
                            float fFloatValue2 = f10.floatValue();
                            Float f11 = aVarG.f6729e;
                            float fFloatValue3 = f11.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                c0801q.c(new C4592o("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f11, f10), null));
                                return;
                            }
                            aVarG.f6728d = Float.valueOf(fFloatValue);
                            aVarG.a(c4584g5.f48129s);
                            c4584g5.h(new RunnableC3307c(c0801q, i112), new C3641c(c0801q, 15));
                            return;
                        case 8:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th5) {
                                arrayList10 = Fe.b.V(th5);
                            }
                            try {
                                C4584g c4584g6 = (C4584g) s1Var2.f43902g;
                                if (!c4584g6.f48132v) {
                                    c4584g6.f48132v = true;
                                    CameraCaptureSession cameraCaptureSession = c4584g6.f48126p;
                                    if (cameraCaptureSession != null) {
                                        cameraCaptureSession.stopRepeating();
                                    }
                                }
                                arrayList10.add(0, null);
                                c1521a.c(arrayList10);
                                return;
                            } catch (CameraAccessException e12) {
                                throw new C4592o("CameraAccessException", e12.getMessage(), null);
                            }
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C4584g c4584g7 = (C4584g) s1Var2.f43902g;
                                c4584g7.f48132v = false;
                                c4584g7.h(null, new C4580c(c4584g7, i172));
                                arrayList11.add(0, null);
                            } catch (Throwable th6) {
                                arrayList11 = Fe.b.V(th6);
                            }
                            c1521a.c(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                s1Var2.getClass();
                                try {
                                    ((C4584g) s1Var2.f43902g).j(new t6.q(str2, (CameraManager) ((Activity) s1Var2.f43896a).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e13) {
                                    throw new C4592o("CameraAccessException", e13.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = Fe.b.V(th7);
                            }
                            c1521a.c(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C4584g c4584g8 = (C4584g) s1Var2.f43902g;
                                if (c4584g8.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g8.f48130t.resume();
                                    } catch (IllegalStateException e14) {
                                        throw new C4592o("videoRecordingFailed", e14.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = Fe.b.V(th8);
                            }
                            c1521a.c(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                s1Var2.i((x) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                            } catch (Throwable th9) {
                                arrayList14 = Fe.b.V(th9);
                            }
                            c1521a.c(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C4584g c4584g9 = (C4584g) s1Var2.f43902g;
                                if (c4584g9 != null) {
                                    Log.i("Camera", "dispose");
                                    c4584g9.a();
                                    c4584g9.f48116e.release();
                                    Jc.a aVar = c4584g9.f48112a.f().f6005c;
                                    V1 v1 = aVar.f6003f;
                                    if (v1 != null) {
                                        aVar.f5998a.unregisterReceiver(v1);
                                        aVar.f6003f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                            } catch (Throwable th10) {
                                arrayList15 = Fe.b.V(th10);
                            }
                            c1521a.c(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g10 = (C4584g) s1Var2.f43902g;
                                int iOrdinal2 = tVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        i162 = 2;
                                    } else if (iOrdinal2 == 2) {
                                        i162 = 3;
                                    } else {
                                        if (iOrdinal2 != 3) {
                                            throw new IllegalStateException("Unreachable code");
                                        }
                                        i162 = 4;
                                    }
                                }
                                c4584g10.f48112a.f().f6006d = i162;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = Fe.b.V(th11);
                            }
                            c1521a.c(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C4584g) s1Var2.f43902g).f48112a.f().f6006d = 0;
                                arrayList17.add(0, null);
                            } catch (Throwable th12) {
                                arrayList17 = Fe.b.V(th12);
                            }
                            c1521a.c(arrayList17);
                            return;
                        case 16:
                            C0801q c0801q2 = new C0801q(new ArrayList(), c1521a, i122);
                            C4584g c4584g11 = (C4584g) s1Var2.f43902g;
                            C4585h c4585h = c4584g11.f48122l;
                            if (c4585h.f48138b != 1) {
                                c0801q2.c(new C4592o("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c4584g11.f48136z = c0801q2;
                            try {
                                c4584g11.f48133w = File.createTempFile("CAP", ".jpg", c4584g11.f48118g.getCacheDir());
                                S3.s sVar = c4584g11.f48134x;
                                sVar.getClass();
                                sVar.f11009b = new J5.n(2);
                                sVar.f11010c = new J5.n(2);
                                c4584g11.f48127q.setOnImageAvailableListener(c4584g11, c4584g11.f48123m);
                                Ac.a aVar2 = (Ac.a) c4584g11.f48112a.f5569a.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1257b != 1) {
                                    c4584g11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c4585h.f48138b = 2;
                                c4584g11.d();
                                return;
                            } catch (IOException | SecurityException e15) {
                                c4584g11.f48119h.l(c4584g11.f48136z, "cannotCreateFile", e15.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                s1Var2.n((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                            } catch (Throwable th13) {
                                arrayList18 = Fe.b.V(th13);
                            }
                            c1521a.c(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, s1Var2.o());
                            } catch (Throwable th14) {
                                arrayList19 = Fe.b.V(th14);
                            }
                            c1521a.c(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C4584g c4584g12 = (C4584g) s1Var2.f43902g;
                                if (c4584g12.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g12.f48130t.pause();
                                    } catch (IllegalStateException e16) {
                                        throw new C4592o("videoRecordingFailed", e16.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = Fe.b.V(th15);
                            }
                            c1521a.c(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th16) {
                                arrayList21 = Fe.b.V(th16);
                            }
                            try {
                                C4584g c4584g13 = (C4584g) s1Var2.f43902g;
                                C4273j c4273j = (C4273j) s1Var2.f43901f;
                                c4584g13.getClass();
                                c4273j.a(new Wa.d(c4584g13, i142));
                                c4584g13.o(false, true);
                                Log.i("Camera", "startPreviewWithImageStream");
                                arrayList21.add(0, null);
                                c1521a.c(arrayList21);
                                return;
                            } catch (CameraAccessException e17) {
                                throw new C4592o("CameraAccessException", e17.getMessage(), null);
                            }
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th17) {
                                arrayList22 = Fe.b.V(th17);
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).p(null);
                                arrayList22.add(0, null);
                                c1521a.c(arrayList22);
                                return;
                            } catch (Exception e18) {
                                throw new C4592o(e18.getClass().getName(), e18.getMessage(), null);
                            }
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj2).get(0);
                            C0799o c0799o2 = new C0799o(arrayList23, c1521a, i122);
                            s1Var2.getClass();
                            int iOrdinal3 = vVar.ordinal();
                            if (iOrdinal3 == 0) {
                                i102 = 1;
                            } else if (iOrdinal3 == 1) {
                                i102 = 2;
                            } else if (iOrdinal3 == 2) {
                                i102 = 3;
                            } else {
                                if (iOrdinal3 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                i102 = 4;
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).k(c0799o2, i102);
                                return;
                            } catch (Exception e19) {
                                s1.h(e19, c0799o2);
                                return;
                            }
                        case 23:
                            a(obj2, c1521a);
                            return;
                        case 24:
                            b(obj2, c1521a);
                            return;
                        case 25:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                Cc.a aVarB2 = ((C4584g) s1Var2.f43902g).f48112a.b();
                                arrayList24.add(0, Double.valueOf(aVarB2.b() * (((Range) ((CameraCharacteristics) aVarB2.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r4.getLower()).intValue())));
                            } catch (Throwable th18) {
                                arrayList24 = Fe.b.V(th18);
                            }
                            c1521a.c(arrayList24);
                            return;
                        case 26:
                            c(obj2, c1521a);
                            return;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            try {
                                arrayList25.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.b().b()));
                            } catch (Throwable th19) {
                                arrayList25 = Fe.b.V(th19);
                            }
                            c1521a.c(arrayList25);
                            return;
                    }
                }
            });
        } else {
            x716.n(null);
        }
        p pVar2 = p.f48158d;
        X7 x717 = new X7(interfaceC4269f, pVar, obj, "dev.flutter.pigeon.camera_android.CameraApi.setExposurePoint");
        if (s1Var != null) {
            final int i24 = 24;
            x717.n(new InterfaceC4265b() { // from class: yc.n
                private final void a(Object obj2, C1521a c1521a) {
                    ArrayList arrayList = new ArrayList();
                    u uVar = (u) ((ArrayList) obj2).get(0);
                    C0800p c0800p = new C0800p(arrayList, c1521a, 23);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    int iOrdinal = uVar.ordinal();
                    int i102 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i102 = 2;
                    }
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        Bc.a aVar = (Bc.a) c4584g.f48112a.f5569a.get("EXPOSURE_LOCK");
                        aVar.f1667b = i102;
                        aVar.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0800p, 26), new C3641c(c0800p, 18));
                    } catch (Exception e7) {
                        s1.h(e7, c0800p);
                    }
                }

                private final void b(Object obj2, C1521a c1521a) {
                    w0 w0Var;
                    ArrayList arrayList = new ArrayList();
                    z zVar = (z) ((ArrayList) obj2).get(0);
                    C0801q c0801q = new C0801q(arrayList, c1521a, 22);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        w0 w0Var2 = null;
                        if (zVar == null) {
                            w0Var = null;
                        } else {
                            w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                        }
                        Dc.a aVarC = c4584g.f48112a.c();
                        if (w0Var != null && ((Double) w0Var.f46405a) != null && ((Double) w0Var.f46406b) != null) {
                            w0Var2 = w0Var;
                        }
                        aVarC.f2631c = w0Var2;
                        aVarC.b();
                        aVarC.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0801q, 22), new C3641c(c0801q, 14));
                    } catch (Exception e7) {
                        s1.h(e7, c0801q);
                    }
                }

                private final void c(Object obj2, C1521a c1521a) {
                    s1 s1Var2 = s1Var;
                    ArrayList arrayList = new ArrayList();
                    try {
                        Cc.a aVarB = ((C4584g) s1Var2.f43902g).f48112a.b();
                        arrayList.add(0, Double.valueOf(aVarB.b() * (((Range) ((CameraCharacteristics) aVarB.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r1.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = Fe.b.V(th);
                    }
                    c1521a.c(arrayList);
                }

                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listU;
                    int i102;
                    int i112 = 23;
                    int i122 = 21;
                    int i132 = 24;
                    int i142 = 3;
                    int i152 = 2;
                    int i162 = 1;
                    w0 w0Var = null;
                    s1 s1Var2 = s1Var;
                    int i172 = 0;
                    switch (i24) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                Activity activity = (Activity) s1Var2.f43896a;
                                if (activity == null) {
                                    listU = Collections.EMPTY_LIST;
                                } else {
                                    try {
                                        listU = Ba.c.u(activity);
                                    } catch (CameraAccessException e7) {
                                        throw new RuntimeException(e7);
                                    }
                                }
                                arrayList.add(0, listU);
                            } catch (Throwable th) {
                                arrayList = Fe.b.V(th);
                            }
                            c1521a.c(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            C0799o c0799o = new C0799o(arrayList2, c1521a, 22);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g = (C4584g) s1Var2.f43902g;
                                double dDoubleValue = d3.doubleValue();
                                Cc.a aVarB = c4584g.f48112a.b();
                                aVarB.f1982b = dDoubleValue / aVarB.b();
                                aVarB.a(c4584g.f48129s);
                                c4584g.h(new RunnableC4579b(i172, c0799o, aVarB), new C3641c(c0799o, 17));
                                return;
                            } catch (Exception e10) {
                                s1.g(e10, c0799o);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            y yVar = (y) arrayList4.get(1);
                            C0800p c0800p = new C0800p(arrayList3, c1521a, 22);
                            C4584g c4584g2 = (C4584g) s1Var2.f43902g;
                            if (c4584g2 != null) {
                                c4584g2.a();
                            }
                            boolean zBooleanValue = yVar.f48194e.booleanValue();
                            Y y10 = new Y(s1Var2, c0800p, str, yVar);
                            C4026b c4026b = (C4026b) s1Var2.f43898c;
                            if (c4026b.f45322b) {
                                y10.c("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            Activity activity2 = (Activity) s1Var2.f43896a;
                            if (Y0.e.checkSelfPermission(activity2, "android.permission.CAMERA") == 0 && (!zBooleanValue || Y0.e.checkSelfPermission(activity2, "android.permission.RECORD_AUDIO") == 0)) {
                                y10.c(null, null);
                                return;
                            }
                            ((s1) ((InterfaceC3965b) ((C3641c) s1Var2.f43899d).f41267b)).d(new Yc.g(new aa.f(27, c4026b, y10)));
                            c4026b.f45322b = true;
                            AbstractC1274b.a(activity2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            w wVar = (w) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g3 = (C4584g) s1Var2.f43902g;
                                int iOrdinal = wVar.ordinal();
                                if (iOrdinal == 0) {
                                    i152 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c4584g3.l(i152);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = Fe.b.V(th2);
                            }
                            c1521a.c(arrayList5);
                            return;
                        case 4:
                            ArrayList arrayList6 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            C0800p c0800p2 = new C0800p(arrayList6, c1521a, i132);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g4 = (C4584g) s1Var2.f43902g;
                                if (zVar != null) {
                                    w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                                }
                                c4584g4.m(c0800p2, w0Var);
                                return;
                            } catch (Exception e11) {
                                s1.h(e11, c0800p2);
                                return;
                            }
                        case 5:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6730f.floatValue()));
                            } catch (Throwable th3) {
                                arrayList7 = Fe.b.V(th3);
                            }
                            c1521a.c(arrayList7);
                            return;
                        case 6:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6729e.floatValue()));
                            } catch (Throwable th4) {
                                arrayList8 = Fe.b.V(th4);
                            }
                            c1521a.c(arrayList8);
                            return;
                        case 7:
                            ArrayList arrayList9 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj2).get(0);
                            C0801q c0801q = new C0801q(arrayList9, c1521a, i112);
                            C4584g c4584g5 = (C4584g) s1Var2.f43902g;
                            float fFloatValue = d5.floatValue();
                            Kc.a aVarG = c4584g5.f48112a.g();
                            Float f10 = aVarG.f6730f;
                            float fFloatValue2 = f10.floatValue();
                            Float f11 = aVarG.f6729e;
                            float fFloatValue3 = f11.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                c0801q.c(new C4592o("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f11, f10), null));
                                return;
                            }
                            aVarG.f6728d = Float.valueOf(fFloatValue);
                            aVarG.a(c4584g5.f48129s);
                            c4584g5.h(new RunnableC3307c(c0801q, i112), new C3641c(c0801q, 15));
                            return;
                        case 8:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th5) {
                                arrayList10 = Fe.b.V(th5);
                            }
                            try {
                                C4584g c4584g6 = (C4584g) s1Var2.f43902g;
                                if (!c4584g6.f48132v) {
                                    c4584g6.f48132v = true;
                                    CameraCaptureSession cameraCaptureSession = c4584g6.f48126p;
                                    if (cameraCaptureSession != null) {
                                        cameraCaptureSession.stopRepeating();
                                    }
                                }
                                arrayList10.add(0, null);
                                c1521a.c(arrayList10);
                                return;
                            } catch (CameraAccessException e12) {
                                throw new C4592o("CameraAccessException", e12.getMessage(), null);
                            }
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C4584g c4584g7 = (C4584g) s1Var2.f43902g;
                                c4584g7.f48132v = false;
                                c4584g7.h(null, new C4580c(c4584g7, i172));
                                arrayList11.add(0, null);
                            } catch (Throwable th6) {
                                arrayList11 = Fe.b.V(th6);
                            }
                            c1521a.c(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                s1Var2.getClass();
                                try {
                                    ((C4584g) s1Var2.f43902g).j(new t6.q(str2, (CameraManager) ((Activity) s1Var2.f43896a).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e13) {
                                    throw new C4592o("CameraAccessException", e13.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = Fe.b.V(th7);
                            }
                            c1521a.c(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C4584g c4584g8 = (C4584g) s1Var2.f43902g;
                                if (c4584g8.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g8.f48130t.resume();
                                    } catch (IllegalStateException e14) {
                                        throw new C4592o("videoRecordingFailed", e14.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = Fe.b.V(th8);
                            }
                            c1521a.c(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                s1Var2.i((x) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                            } catch (Throwable th9) {
                                arrayList14 = Fe.b.V(th9);
                            }
                            c1521a.c(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C4584g c4584g9 = (C4584g) s1Var2.f43902g;
                                if (c4584g9 != null) {
                                    Log.i("Camera", "dispose");
                                    c4584g9.a();
                                    c4584g9.f48116e.release();
                                    Jc.a aVar = c4584g9.f48112a.f().f6005c;
                                    V1 v1 = aVar.f6003f;
                                    if (v1 != null) {
                                        aVar.f5998a.unregisterReceiver(v1);
                                        aVar.f6003f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                            } catch (Throwable th10) {
                                arrayList15 = Fe.b.V(th10);
                            }
                            c1521a.c(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g10 = (C4584g) s1Var2.f43902g;
                                int iOrdinal2 = tVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        i162 = 2;
                                    } else if (iOrdinal2 == 2) {
                                        i162 = 3;
                                    } else {
                                        if (iOrdinal2 != 3) {
                                            throw new IllegalStateException("Unreachable code");
                                        }
                                        i162 = 4;
                                    }
                                }
                                c4584g10.f48112a.f().f6006d = i162;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = Fe.b.V(th11);
                            }
                            c1521a.c(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C4584g) s1Var2.f43902g).f48112a.f().f6006d = 0;
                                arrayList17.add(0, null);
                            } catch (Throwable th12) {
                                arrayList17 = Fe.b.V(th12);
                            }
                            c1521a.c(arrayList17);
                            return;
                        case 16:
                            C0801q c0801q2 = new C0801q(new ArrayList(), c1521a, i122);
                            C4584g c4584g11 = (C4584g) s1Var2.f43902g;
                            C4585h c4585h = c4584g11.f48122l;
                            if (c4585h.f48138b != 1) {
                                c0801q2.c(new C4592o("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c4584g11.f48136z = c0801q2;
                            try {
                                c4584g11.f48133w = File.createTempFile("CAP", ".jpg", c4584g11.f48118g.getCacheDir());
                                S3.s sVar = c4584g11.f48134x;
                                sVar.getClass();
                                sVar.f11009b = new J5.n(2);
                                sVar.f11010c = new J5.n(2);
                                c4584g11.f48127q.setOnImageAvailableListener(c4584g11, c4584g11.f48123m);
                                Ac.a aVar2 = (Ac.a) c4584g11.f48112a.f5569a.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1257b != 1) {
                                    c4584g11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c4585h.f48138b = 2;
                                c4584g11.d();
                                return;
                            } catch (IOException | SecurityException e15) {
                                c4584g11.f48119h.l(c4584g11.f48136z, "cannotCreateFile", e15.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                s1Var2.n((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                            } catch (Throwable th13) {
                                arrayList18 = Fe.b.V(th13);
                            }
                            c1521a.c(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, s1Var2.o());
                            } catch (Throwable th14) {
                                arrayList19 = Fe.b.V(th14);
                            }
                            c1521a.c(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C4584g c4584g12 = (C4584g) s1Var2.f43902g;
                                if (c4584g12.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g12.f48130t.pause();
                                    } catch (IllegalStateException e16) {
                                        throw new C4592o("videoRecordingFailed", e16.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = Fe.b.V(th15);
                            }
                            c1521a.c(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th16) {
                                arrayList21 = Fe.b.V(th16);
                            }
                            try {
                                C4584g c4584g13 = (C4584g) s1Var2.f43902g;
                                C4273j c4273j = (C4273j) s1Var2.f43901f;
                                c4584g13.getClass();
                                c4273j.a(new Wa.d(c4584g13, i142));
                                c4584g13.o(false, true);
                                Log.i("Camera", "startPreviewWithImageStream");
                                arrayList21.add(0, null);
                                c1521a.c(arrayList21);
                                return;
                            } catch (CameraAccessException e17) {
                                throw new C4592o("CameraAccessException", e17.getMessage(), null);
                            }
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th17) {
                                arrayList22 = Fe.b.V(th17);
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).p(null);
                                arrayList22.add(0, null);
                                c1521a.c(arrayList22);
                                return;
                            } catch (Exception e18) {
                                throw new C4592o(e18.getClass().getName(), e18.getMessage(), null);
                            }
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj2).get(0);
                            C0799o c0799o2 = new C0799o(arrayList23, c1521a, i122);
                            s1Var2.getClass();
                            int iOrdinal3 = vVar.ordinal();
                            if (iOrdinal3 == 0) {
                                i102 = 1;
                            } else if (iOrdinal3 == 1) {
                                i102 = 2;
                            } else if (iOrdinal3 == 2) {
                                i102 = 3;
                            } else {
                                if (iOrdinal3 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                i102 = 4;
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).k(c0799o2, i102);
                                return;
                            } catch (Exception e19) {
                                s1.h(e19, c0799o2);
                                return;
                            }
                        case 23:
                            a(obj2, c1521a);
                            return;
                        case 24:
                            b(obj2, c1521a);
                            return;
                        case 25:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                Cc.a aVarB2 = ((C4584g) s1Var2.f43902g).f48112a.b();
                                arrayList24.add(0, Double.valueOf(aVarB2.b() * (((Range) ((CameraCharacteristics) aVarB2.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r4.getLower()).intValue())));
                            } catch (Throwable th18) {
                                arrayList24 = Fe.b.V(th18);
                            }
                            c1521a.c(arrayList24);
                            return;
                        case 26:
                            c(obj2, c1521a);
                            return;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            try {
                                arrayList25.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.b().b()));
                            } catch (Throwable th19) {
                                arrayList25 = Fe.b.V(th19);
                            }
                            c1521a.c(arrayList25);
                            return;
                    }
                }
            });
        } else {
            x717.n(null);
        }
        p pVar3 = p.f48158d;
        X7 x718 = new X7(interfaceC4269f, pVar, obj, "dev.flutter.pigeon.camera_android.CameraApi.getMinExposureOffset");
        if (s1Var != null) {
            final int i25 = 25;
            x718.n(new InterfaceC4265b() { // from class: yc.n
                private final void a(Object obj2, C1521a c1521a) {
                    ArrayList arrayList = new ArrayList();
                    u uVar = (u) ((ArrayList) obj2).get(0);
                    C0800p c0800p = new C0800p(arrayList, c1521a, 23);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    int iOrdinal = uVar.ordinal();
                    int i102 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i102 = 2;
                    }
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        Bc.a aVar = (Bc.a) c4584g.f48112a.f5569a.get("EXPOSURE_LOCK");
                        aVar.f1667b = i102;
                        aVar.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0800p, 26), new C3641c(c0800p, 18));
                    } catch (Exception e7) {
                        s1.h(e7, c0800p);
                    }
                }

                private final void b(Object obj2, C1521a c1521a) {
                    w0 w0Var;
                    ArrayList arrayList = new ArrayList();
                    z zVar = (z) ((ArrayList) obj2).get(0);
                    C0801q c0801q = new C0801q(arrayList, c1521a, 22);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        w0 w0Var2 = null;
                        if (zVar == null) {
                            w0Var = null;
                        } else {
                            w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                        }
                        Dc.a aVarC = c4584g.f48112a.c();
                        if (w0Var != null && ((Double) w0Var.f46405a) != null && ((Double) w0Var.f46406b) != null) {
                            w0Var2 = w0Var;
                        }
                        aVarC.f2631c = w0Var2;
                        aVarC.b();
                        aVarC.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0801q, 22), new C3641c(c0801q, 14));
                    } catch (Exception e7) {
                        s1.h(e7, c0801q);
                    }
                }

                private final void c(Object obj2, C1521a c1521a) {
                    s1 s1Var2 = s1Var;
                    ArrayList arrayList = new ArrayList();
                    try {
                        Cc.a aVarB = ((C4584g) s1Var2.f43902g).f48112a.b();
                        arrayList.add(0, Double.valueOf(aVarB.b() * (((Range) ((CameraCharacteristics) aVarB.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r1.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = Fe.b.V(th);
                    }
                    c1521a.c(arrayList);
                }

                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listU;
                    int i102;
                    int i112 = 23;
                    int i122 = 21;
                    int i132 = 24;
                    int i142 = 3;
                    int i152 = 2;
                    int i162 = 1;
                    w0 w0Var = null;
                    s1 s1Var2 = s1Var;
                    int i172 = 0;
                    switch (i25) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                Activity activity = (Activity) s1Var2.f43896a;
                                if (activity == null) {
                                    listU = Collections.EMPTY_LIST;
                                } else {
                                    try {
                                        listU = Ba.c.u(activity);
                                    } catch (CameraAccessException e7) {
                                        throw new RuntimeException(e7);
                                    }
                                }
                                arrayList.add(0, listU);
                            } catch (Throwable th) {
                                arrayList = Fe.b.V(th);
                            }
                            c1521a.c(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            C0799o c0799o = new C0799o(arrayList2, c1521a, 22);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g = (C4584g) s1Var2.f43902g;
                                double dDoubleValue = d3.doubleValue();
                                Cc.a aVarB = c4584g.f48112a.b();
                                aVarB.f1982b = dDoubleValue / aVarB.b();
                                aVarB.a(c4584g.f48129s);
                                c4584g.h(new RunnableC4579b(i172, c0799o, aVarB), new C3641c(c0799o, 17));
                                return;
                            } catch (Exception e10) {
                                s1.g(e10, c0799o);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            y yVar = (y) arrayList4.get(1);
                            C0800p c0800p = new C0800p(arrayList3, c1521a, 22);
                            C4584g c4584g2 = (C4584g) s1Var2.f43902g;
                            if (c4584g2 != null) {
                                c4584g2.a();
                            }
                            boolean zBooleanValue = yVar.f48194e.booleanValue();
                            Y y10 = new Y(s1Var2, c0800p, str, yVar);
                            C4026b c4026b = (C4026b) s1Var2.f43898c;
                            if (c4026b.f45322b) {
                                y10.c("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            Activity activity2 = (Activity) s1Var2.f43896a;
                            if (Y0.e.checkSelfPermission(activity2, "android.permission.CAMERA") == 0 && (!zBooleanValue || Y0.e.checkSelfPermission(activity2, "android.permission.RECORD_AUDIO") == 0)) {
                                y10.c(null, null);
                                return;
                            }
                            ((s1) ((InterfaceC3965b) ((C3641c) s1Var2.f43899d).f41267b)).d(new Yc.g(new aa.f(27, c4026b, y10)));
                            c4026b.f45322b = true;
                            AbstractC1274b.a(activity2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            w wVar = (w) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g3 = (C4584g) s1Var2.f43902g;
                                int iOrdinal = wVar.ordinal();
                                if (iOrdinal == 0) {
                                    i152 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c4584g3.l(i152);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = Fe.b.V(th2);
                            }
                            c1521a.c(arrayList5);
                            return;
                        case 4:
                            ArrayList arrayList6 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            C0800p c0800p2 = new C0800p(arrayList6, c1521a, i132);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g4 = (C4584g) s1Var2.f43902g;
                                if (zVar != null) {
                                    w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                                }
                                c4584g4.m(c0800p2, w0Var);
                                return;
                            } catch (Exception e11) {
                                s1.h(e11, c0800p2);
                                return;
                            }
                        case 5:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6730f.floatValue()));
                            } catch (Throwable th3) {
                                arrayList7 = Fe.b.V(th3);
                            }
                            c1521a.c(arrayList7);
                            return;
                        case 6:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6729e.floatValue()));
                            } catch (Throwable th4) {
                                arrayList8 = Fe.b.V(th4);
                            }
                            c1521a.c(arrayList8);
                            return;
                        case 7:
                            ArrayList arrayList9 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj2).get(0);
                            C0801q c0801q = new C0801q(arrayList9, c1521a, i112);
                            C4584g c4584g5 = (C4584g) s1Var2.f43902g;
                            float fFloatValue = d5.floatValue();
                            Kc.a aVarG = c4584g5.f48112a.g();
                            Float f10 = aVarG.f6730f;
                            float fFloatValue2 = f10.floatValue();
                            Float f11 = aVarG.f6729e;
                            float fFloatValue3 = f11.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                c0801q.c(new C4592o("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f11, f10), null));
                                return;
                            }
                            aVarG.f6728d = Float.valueOf(fFloatValue);
                            aVarG.a(c4584g5.f48129s);
                            c4584g5.h(new RunnableC3307c(c0801q, i112), new C3641c(c0801q, 15));
                            return;
                        case 8:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th5) {
                                arrayList10 = Fe.b.V(th5);
                            }
                            try {
                                C4584g c4584g6 = (C4584g) s1Var2.f43902g;
                                if (!c4584g6.f48132v) {
                                    c4584g6.f48132v = true;
                                    CameraCaptureSession cameraCaptureSession = c4584g6.f48126p;
                                    if (cameraCaptureSession != null) {
                                        cameraCaptureSession.stopRepeating();
                                    }
                                }
                                arrayList10.add(0, null);
                                c1521a.c(arrayList10);
                                return;
                            } catch (CameraAccessException e12) {
                                throw new C4592o("CameraAccessException", e12.getMessage(), null);
                            }
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C4584g c4584g7 = (C4584g) s1Var2.f43902g;
                                c4584g7.f48132v = false;
                                c4584g7.h(null, new C4580c(c4584g7, i172));
                                arrayList11.add(0, null);
                            } catch (Throwable th6) {
                                arrayList11 = Fe.b.V(th6);
                            }
                            c1521a.c(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                s1Var2.getClass();
                                try {
                                    ((C4584g) s1Var2.f43902g).j(new t6.q(str2, (CameraManager) ((Activity) s1Var2.f43896a).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e13) {
                                    throw new C4592o("CameraAccessException", e13.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = Fe.b.V(th7);
                            }
                            c1521a.c(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C4584g c4584g8 = (C4584g) s1Var2.f43902g;
                                if (c4584g8.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g8.f48130t.resume();
                                    } catch (IllegalStateException e14) {
                                        throw new C4592o("videoRecordingFailed", e14.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = Fe.b.V(th8);
                            }
                            c1521a.c(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                s1Var2.i((x) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                            } catch (Throwable th9) {
                                arrayList14 = Fe.b.V(th9);
                            }
                            c1521a.c(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C4584g c4584g9 = (C4584g) s1Var2.f43902g;
                                if (c4584g9 != null) {
                                    Log.i("Camera", "dispose");
                                    c4584g9.a();
                                    c4584g9.f48116e.release();
                                    Jc.a aVar = c4584g9.f48112a.f().f6005c;
                                    V1 v1 = aVar.f6003f;
                                    if (v1 != null) {
                                        aVar.f5998a.unregisterReceiver(v1);
                                        aVar.f6003f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                            } catch (Throwable th10) {
                                arrayList15 = Fe.b.V(th10);
                            }
                            c1521a.c(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g10 = (C4584g) s1Var2.f43902g;
                                int iOrdinal2 = tVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        i162 = 2;
                                    } else if (iOrdinal2 == 2) {
                                        i162 = 3;
                                    } else {
                                        if (iOrdinal2 != 3) {
                                            throw new IllegalStateException("Unreachable code");
                                        }
                                        i162 = 4;
                                    }
                                }
                                c4584g10.f48112a.f().f6006d = i162;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = Fe.b.V(th11);
                            }
                            c1521a.c(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C4584g) s1Var2.f43902g).f48112a.f().f6006d = 0;
                                arrayList17.add(0, null);
                            } catch (Throwable th12) {
                                arrayList17 = Fe.b.V(th12);
                            }
                            c1521a.c(arrayList17);
                            return;
                        case 16:
                            C0801q c0801q2 = new C0801q(new ArrayList(), c1521a, i122);
                            C4584g c4584g11 = (C4584g) s1Var2.f43902g;
                            C4585h c4585h = c4584g11.f48122l;
                            if (c4585h.f48138b != 1) {
                                c0801q2.c(new C4592o("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c4584g11.f48136z = c0801q2;
                            try {
                                c4584g11.f48133w = File.createTempFile("CAP", ".jpg", c4584g11.f48118g.getCacheDir());
                                S3.s sVar = c4584g11.f48134x;
                                sVar.getClass();
                                sVar.f11009b = new J5.n(2);
                                sVar.f11010c = new J5.n(2);
                                c4584g11.f48127q.setOnImageAvailableListener(c4584g11, c4584g11.f48123m);
                                Ac.a aVar2 = (Ac.a) c4584g11.f48112a.f5569a.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1257b != 1) {
                                    c4584g11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c4585h.f48138b = 2;
                                c4584g11.d();
                                return;
                            } catch (IOException | SecurityException e15) {
                                c4584g11.f48119h.l(c4584g11.f48136z, "cannotCreateFile", e15.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                s1Var2.n((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                            } catch (Throwable th13) {
                                arrayList18 = Fe.b.V(th13);
                            }
                            c1521a.c(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, s1Var2.o());
                            } catch (Throwable th14) {
                                arrayList19 = Fe.b.V(th14);
                            }
                            c1521a.c(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C4584g c4584g12 = (C4584g) s1Var2.f43902g;
                                if (c4584g12.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g12.f48130t.pause();
                                    } catch (IllegalStateException e16) {
                                        throw new C4592o("videoRecordingFailed", e16.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = Fe.b.V(th15);
                            }
                            c1521a.c(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th16) {
                                arrayList21 = Fe.b.V(th16);
                            }
                            try {
                                C4584g c4584g13 = (C4584g) s1Var2.f43902g;
                                C4273j c4273j = (C4273j) s1Var2.f43901f;
                                c4584g13.getClass();
                                c4273j.a(new Wa.d(c4584g13, i142));
                                c4584g13.o(false, true);
                                Log.i("Camera", "startPreviewWithImageStream");
                                arrayList21.add(0, null);
                                c1521a.c(arrayList21);
                                return;
                            } catch (CameraAccessException e17) {
                                throw new C4592o("CameraAccessException", e17.getMessage(), null);
                            }
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th17) {
                                arrayList22 = Fe.b.V(th17);
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).p(null);
                                arrayList22.add(0, null);
                                c1521a.c(arrayList22);
                                return;
                            } catch (Exception e18) {
                                throw new C4592o(e18.getClass().getName(), e18.getMessage(), null);
                            }
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj2).get(0);
                            C0799o c0799o2 = new C0799o(arrayList23, c1521a, i122);
                            s1Var2.getClass();
                            int iOrdinal3 = vVar.ordinal();
                            if (iOrdinal3 == 0) {
                                i102 = 1;
                            } else if (iOrdinal3 == 1) {
                                i102 = 2;
                            } else if (iOrdinal3 == 2) {
                                i102 = 3;
                            } else {
                                if (iOrdinal3 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                i102 = 4;
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).k(c0799o2, i102);
                                return;
                            } catch (Exception e19) {
                                s1.h(e19, c0799o2);
                                return;
                            }
                        case 23:
                            a(obj2, c1521a);
                            return;
                        case 24:
                            b(obj2, c1521a);
                            return;
                        case 25:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                Cc.a aVarB2 = ((C4584g) s1Var2.f43902g).f48112a.b();
                                arrayList24.add(0, Double.valueOf(aVarB2.b() * (((Range) ((CameraCharacteristics) aVarB2.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r4.getLower()).intValue())));
                            } catch (Throwable th18) {
                                arrayList24 = Fe.b.V(th18);
                            }
                            c1521a.c(arrayList24);
                            return;
                        case 26:
                            c(obj2, c1521a);
                            return;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            try {
                                arrayList25.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.b().b()));
                            } catch (Throwable th19) {
                                arrayList25 = Fe.b.V(th19);
                            }
                            c1521a.c(arrayList25);
                            return;
                    }
                }
            });
        } else {
            x718.n(null);
        }
        p pVar4 = p.f48158d;
        X7 x719 = new X7(interfaceC4269f, pVar, obj, "dev.flutter.pigeon.camera_android.CameraApi.getMaxExposureOffset");
        if (s1Var != null) {
            final int i26 = 26;
            x719.n(new InterfaceC4265b() { // from class: yc.n
                private final void a(Object obj2, C1521a c1521a) {
                    ArrayList arrayList = new ArrayList();
                    u uVar = (u) ((ArrayList) obj2).get(0);
                    C0800p c0800p = new C0800p(arrayList, c1521a, 23);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    int iOrdinal = uVar.ordinal();
                    int i102 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i102 = 2;
                    }
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        Bc.a aVar = (Bc.a) c4584g.f48112a.f5569a.get("EXPOSURE_LOCK");
                        aVar.f1667b = i102;
                        aVar.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0800p, 26), new C3641c(c0800p, 18));
                    } catch (Exception e7) {
                        s1.h(e7, c0800p);
                    }
                }

                private final void b(Object obj2, C1521a c1521a) {
                    w0 w0Var;
                    ArrayList arrayList = new ArrayList();
                    z zVar = (z) ((ArrayList) obj2).get(0);
                    C0801q c0801q = new C0801q(arrayList, c1521a, 22);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        w0 w0Var2 = null;
                        if (zVar == null) {
                            w0Var = null;
                        } else {
                            w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                        }
                        Dc.a aVarC = c4584g.f48112a.c();
                        if (w0Var != null && ((Double) w0Var.f46405a) != null && ((Double) w0Var.f46406b) != null) {
                            w0Var2 = w0Var;
                        }
                        aVarC.f2631c = w0Var2;
                        aVarC.b();
                        aVarC.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0801q, 22), new C3641c(c0801q, 14));
                    } catch (Exception e7) {
                        s1.h(e7, c0801q);
                    }
                }

                private final void c(Object obj2, C1521a c1521a) {
                    s1 s1Var2 = s1Var;
                    ArrayList arrayList = new ArrayList();
                    try {
                        Cc.a aVarB = ((C4584g) s1Var2.f43902g).f48112a.b();
                        arrayList.add(0, Double.valueOf(aVarB.b() * (((Range) ((CameraCharacteristics) aVarB.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r1.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = Fe.b.V(th);
                    }
                    c1521a.c(arrayList);
                }

                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listU;
                    int i102;
                    int i112 = 23;
                    int i122 = 21;
                    int i132 = 24;
                    int i142 = 3;
                    int i152 = 2;
                    int i162 = 1;
                    w0 w0Var = null;
                    s1 s1Var2 = s1Var;
                    int i172 = 0;
                    switch (i26) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                Activity activity = (Activity) s1Var2.f43896a;
                                if (activity == null) {
                                    listU = Collections.EMPTY_LIST;
                                } else {
                                    try {
                                        listU = Ba.c.u(activity);
                                    } catch (CameraAccessException e7) {
                                        throw new RuntimeException(e7);
                                    }
                                }
                                arrayList.add(0, listU);
                            } catch (Throwable th) {
                                arrayList = Fe.b.V(th);
                            }
                            c1521a.c(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            C0799o c0799o = new C0799o(arrayList2, c1521a, 22);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g = (C4584g) s1Var2.f43902g;
                                double dDoubleValue = d3.doubleValue();
                                Cc.a aVarB = c4584g.f48112a.b();
                                aVarB.f1982b = dDoubleValue / aVarB.b();
                                aVarB.a(c4584g.f48129s);
                                c4584g.h(new RunnableC4579b(i172, c0799o, aVarB), new C3641c(c0799o, 17));
                                return;
                            } catch (Exception e10) {
                                s1.g(e10, c0799o);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            y yVar = (y) arrayList4.get(1);
                            C0800p c0800p = new C0800p(arrayList3, c1521a, 22);
                            C4584g c4584g2 = (C4584g) s1Var2.f43902g;
                            if (c4584g2 != null) {
                                c4584g2.a();
                            }
                            boolean zBooleanValue = yVar.f48194e.booleanValue();
                            Y y10 = new Y(s1Var2, c0800p, str, yVar);
                            C4026b c4026b = (C4026b) s1Var2.f43898c;
                            if (c4026b.f45322b) {
                                y10.c("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            Activity activity2 = (Activity) s1Var2.f43896a;
                            if (Y0.e.checkSelfPermission(activity2, "android.permission.CAMERA") == 0 && (!zBooleanValue || Y0.e.checkSelfPermission(activity2, "android.permission.RECORD_AUDIO") == 0)) {
                                y10.c(null, null);
                                return;
                            }
                            ((s1) ((InterfaceC3965b) ((C3641c) s1Var2.f43899d).f41267b)).d(new Yc.g(new aa.f(27, c4026b, y10)));
                            c4026b.f45322b = true;
                            AbstractC1274b.a(activity2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            w wVar = (w) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g3 = (C4584g) s1Var2.f43902g;
                                int iOrdinal = wVar.ordinal();
                                if (iOrdinal == 0) {
                                    i152 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c4584g3.l(i152);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = Fe.b.V(th2);
                            }
                            c1521a.c(arrayList5);
                            return;
                        case 4:
                            ArrayList arrayList6 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            C0800p c0800p2 = new C0800p(arrayList6, c1521a, i132);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g4 = (C4584g) s1Var2.f43902g;
                                if (zVar != null) {
                                    w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                                }
                                c4584g4.m(c0800p2, w0Var);
                                return;
                            } catch (Exception e11) {
                                s1.h(e11, c0800p2);
                                return;
                            }
                        case 5:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6730f.floatValue()));
                            } catch (Throwable th3) {
                                arrayList7 = Fe.b.V(th3);
                            }
                            c1521a.c(arrayList7);
                            return;
                        case 6:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6729e.floatValue()));
                            } catch (Throwable th4) {
                                arrayList8 = Fe.b.V(th4);
                            }
                            c1521a.c(arrayList8);
                            return;
                        case 7:
                            ArrayList arrayList9 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj2).get(0);
                            C0801q c0801q = new C0801q(arrayList9, c1521a, i112);
                            C4584g c4584g5 = (C4584g) s1Var2.f43902g;
                            float fFloatValue = d5.floatValue();
                            Kc.a aVarG = c4584g5.f48112a.g();
                            Float f10 = aVarG.f6730f;
                            float fFloatValue2 = f10.floatValue();
                            Float f11 = aVarG.f6729e;
                            float fFloatValue3 = f11.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                c0801q.c(new C4592o("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f11, f10), null));
                                return;
                            }
                            aVarG.f6728d = Float.valueOf(fFloatValue);
                            aVarG.a(c4584g5.f48129s);
                            c4584g5.h(new RunnableC3307c(c0801q, i112), new C3641c(c0801q, 15));
                            return;
                        case 8:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th5) {
                                arrayList10 = Fe.b.V(th5);
                            }
                            try {
                                C4584g c4584g6 = (C4584g) s1Var2.f43902g;
                                if (!c4584g6.f48132v) {
                                    c4584g6.f48132v = true;
                                    CameraCaptureSession cameraCaptureSession = c4584g6.f48126p;
                                    if (cameraCaptureSession != null) {
                                        cameraCaptureSession.stopRepeating();
                                    }
                                }
                                arrayList10.add(0, null);
                                c1521a.c(arrayList10);
                                return;
                            } catch (CameraAccessException e12) {
                                throw new C4592o("CameraAccessException", e12.getMessage(), null);
                            }
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C4584g c4584g7 = (C4584g) s1Var2.f43902g;
                                c4584g7.f48132v = false;
                                c4584g7.h(null, new C4580c(c4584g7, i172));
                                arrayList11.add(0, null);
                            } catch (Throwable th6) {
                                arrayList11 = Fe.b.V(th6);
                            }
                            c1521a.c(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                s1Var2.getClass();
                                try {
                                    ((C4584g) s1Var2.f43902g).j(new t6.q(str2, (CameraManager) ((Activity) s1Var2.f43896a).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e13) {
                                    throw new C4592o("CameraAccessException", e13.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = Fe.b.V(th7);
                            }
                            c1521a.c(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C4584g c4584g8 = (C4584g) s1Var2.f43902g;
                                if (c4584g8.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g8.f48130t.resume();
                                    } catch (IllegalStateException e14) {
                                        throw new C4592o("videoRecordingFailed", e14.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = Fe.b.V(th8);
                            }
                            c1521a.c(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                s1Var2.i((x) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                            } catch (Throwable th9) {
                                arrayList14 = Fe.b.V(th9);
                            }
                            c1521a.c(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C4584g c4584g9 = (C4584g) s1Var2.f43902g;
                                if (c4584g9 != null) {
                                    Log.i("Camera", "dispose");
                                    c4584g9.a();
                                    c4584g9.f48116e.release();
                                    Jc.a aVar = c4584g9.f48112a.f().f6005c;
                                    V1 v1 = aVar.f6003f;
                                    if (v1 != null) {
                                        aVar.f5998a.unregisterReceiver(v1);
                                        aVar.f6003f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                            } catch (Throwable th10) {
                                arrayList15 = Fe.b.V(th10);
                            }
                            c1521a.c(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g10 = (C4584g) s1Var2.f43902g;
                                int iOrdinal2 = tVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        i162 = 2;
                                    } else if (iOrdinal2 == 2) {
                                        i162 = 3;
                                    } else {
                                        if (iOrdinal2 != 3) {
                                            throw new IllegalStateException("Unreachable code");
                                        }
                                        i162 = 4;
                                    }
                                }
                                c4584g10.f48112a.f().f6006d = i162;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = Fe.b.V(th11);
                            }
                            c1521a.c(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C4584g) s1Var2.f43902g).f48112a.f().f6006d = 0;
                                arrayList17.add(0, null);
                            } catch (Throwable th12) {
                                arrayList17 = Fe.b.V(th12);
                            }
                            c1521a.c(arrayList17);
                            return;
                        case 16:
                            C0801q c0801q2 = new C0801q(new ArrayList(), c1521a, i122);
                            C4584g c4584g11 = (C4584g) s1Var2.f43902g;
                            C4585h c4585h = c4584g11.f48122l;
                            if (c4585h.f48138b != 1) {
                                c0801q2.c(new C4592o("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c4584g11.f48136z = c0801q2;
                            try {
                                c4584g11.f48133w = File.createTempFile("CAP", ".jpg", c4584g11.f48118g.getCacheDir());
                                S3.s sVar = c4584g11.f48134x;
                                sVar.getClass();
                                sVar.f11009b = new J5.n(2);
                                sVar.f11010c = new J5.n(2);
                                c4584g11.f48127q.setOnImageAvailableListener(c4584g11, c4584g11.f48123m);
                                Ac.a aVar2 = (Ac.a) c4584g11.f48112a.f5569a.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1257b != 1) {
                                    c4584g11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c4585h.f48138b = 2;
                                c4584g11.d();
                                return;
                            } catch (IOException | SecurityException e15) {
                                c4584g11.f48119h.l(c4584g11.f48136z, "cannotCreateFile", e15.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                s1Var2.n((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                            } catch (Throwable th13) {
                                arrayList18 = Fe.b.V(th13);
                            }
                            c1521a.c(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, s1Var2.o());
                            } catch (Throwable th14) {
                                arrayList19 = Fe.b.V(th14);
                            }
                            c1521a.c(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C4584g c4584g12 = (C4584g) s1Var2.f43902g;
                                if (c4584g12.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g12.f48130t.pause();
                                    } catch (IllegalStateException e16) {
                                        throw new C4592o("videoRecordingFailed", e16.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = Fe.b.V(th15);
                            }
                            c1521a.c(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th16) {
                                arrayList21 = Fe.b.V(th16);
                            }
                            try {
                                C4584g c4584g13 = (C4584g) s1Var2.f43902g;
                                C4273j c4273j = (C4273j) s1Var2.f43901f;
                                c4584g13.getClass();
                                c4273j.a(new Wa.d(c4584g13, i142));
                                c4584g13.o(false, true);
                                Log.i("Camera", "startPreviewWithImageStream");
                                arrayList21.add(0, null);
                                c1521a.c(arrayList21);
                                return;
                            } catch (CameraAccessException e17) {
                                throw new C4592o("CameraAccessException", e17.getMessage(), null);
                            }
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th17) {
                                arrayList22 = Fe.b.V(th17);
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).p(null);
                                arrayList22.add(0, null);
                                c1521a.c(arrayList22);
                                return;
                            } catch (Exception e18) {
                                throw new C4592o(e18.getClass().getName(), e18.getMessage(), null);
                            }
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj2).get(0);
                            C0799o c0799o2 = new C0799o(arrayList23, c1521a, i122);
                            s1Var2.getClass();
                            int iOrdinal3 = vVar.ordinal();
                            if (iOrdinal3 == 0) {
                                i102 = 1;
                            } else if (iOrdinal3 == 1) {
                                i102 = 2;
                            } else if (iOrdinal3 == 2) {
                                i102 = 3;
                            } else {
                                if (iOrdinal3 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                i102 = 4;
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).k(c0799o2, i102);
                                return;
                            } catch (Exception e19) {
                                s1.h(e19, c0799o2);
                                return;
                            }
                        case 23:
                            a(obj2, c1521a);
                            return;
                        case 24:
                            b(obj2, c1521a);
                            return;
                        case 25:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                Cc.a aVarB2 = ((C4584g) s1Var2.f43902g).f48112a.b();
                                arrayList24.add(0, Double.valueOf(aVarB2.b() * (((Range) ((CameraCharacteristics) aVarB2.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r4.getLower()).intValue())));
                            } catch (Throwable th18) {
                                arrayList24 = Fe.b.V(th18);
                            }
                            c1521a.c(arrayList24);
                            return;
                        case 26:
                            c(obj2, c1521a);
                            return;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            try {
                                arrayList25.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.b().b()));
                            } catch (Throwable th19) {
                                arrayList25 = Fe.b.V(th19);
                            }
                            c1521a.c(arrayList25);
                            return;
                    }
                }
            });
        } else {
            x719.n(null);
        }
        p pVar5 = p.f48158d;
        X7 x720 = new X7(interfaceC4269f, pVar, obj, "dev.flutter.pigeon.camera_android.CameraApi.getExposureOffsetStepSize");
        if (s1Var != null) {
            final int i27 = 27;
            x720.n(new InterfaceC4265b() { // from class: yc.n
                private final void a(Object obj2, C1521a c1521a) {
                    ArrayList arrayList = new ArrayList();
                    u uVar = (u) ((ArrayList) obj2).get(0);
                    C0800p c0800p = new C0800p(arrayList, c1521a, 23);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    int iOrdinal = uVar.ordinal();
                    int i102 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i102 = 2;
                    }
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        Bc.a aVar = (Bc.a) c4584g.f48112a.f5569a.get("EXPOSURE_LOCK");
                        aVar.f1667b = i102;
                        aVar.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0800p, 26), new C3641c(c0800p, 18));
                    } catch (Exception e7) {
                        s1.h(e7, c0800p);
                    }
                }

                private final void b(Object obj2, C1521a c1521a) {
                    w0 w0Var;
                    ArrayList arrayList = new ArrayList();
                    z zVar = (z) ((ArrayList) obj2).get(0);
                    C0801q c0801q = new C0801q(arrayList, c1521a, 22);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        w0 w0Var2 = null;
                        if (zVar == null) {
                            w0Var = null;
                        } else {
                            w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                        }
                        Dc.a aVarC = c4584g.f48112a.c();
                        if (w0Var != null && ((Double) w0Var.f46405a) != null && ((Double) w0Var.f46406b) != null) {
                            w0Var2 = w0Var;
                        }
                        aVarC.f2631c = w0Var2;
                        aVarC.b();
                        aVarC.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0801q, 22), new C3641c(c0801q, 14));
                    } catch (Exception e7) {
                        s1.h(e7, c0801q);
                    }
                }

                private final void c(Object obj2, C1521a c1521a) {
                    s1 s1Var2 = s1Var;
                    ArrayList arrayList = new ArrayList();
                    try {
                        Cc.a aVarB = ((C4584g) s1Var2.f43902g).f48112a.b();
                        arrayList.add(0, Double.valueOf(aVarB.b() * (((Range) ((CameraCharacteristics) aVarB.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r1.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = Fe.b.V(th);
                    }
                    c1521a.c(arrayList);
                }

                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listU;
                    int i102;
                    int i112 = 23;
                    int i122 = 21;
                    int i132 = 24;
                    int i142 = 3;
                    int i152 = 2;
                    int i162 = 1;
                    w0 w0Var = null;
                    s1 s1Var2 = s1Var;
                    int i172 = 0;
                    switch (i27) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                Activity activity = (Activity) s1Var2.f43896a;
                                if (activity == null) {
                                    listU = Collections.EMPTY_LIST;
                                } else {
                                    try {
                                        listU = Ba.c.u(activity);
                                    } catch (CameraAccessException e7) {
                                        throw new RuntimeException(e7);
                                    }
                                }
                                arrayList.add(0, listU);
                            } catch (Throwable th) {
                                arrayList = Fe.b.V(th);
                            }
                            c1521a.c(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            C0799o c0799o = new C0799o(arrayList2, c1521a, 22);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g = (C4584g) s1Var2.f43902g;
                                double dDoubleValue = d3.doubleValue();
                                Cc.a aVarB = c4584g.f48112a.b();
                                aVarB.f1982b = dDoubleValue / aVarB.b();
                                aVarB.a(c4584g.f48129s);
                                c4584g.h(new RunnableC4579b(i172, c0799o, aVarB), new C3641c(c0799o, 17));
                                return;
                            } catch (Exception e10) {
                                s1.g(e10, c0799o);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            y yVar = (y) arrayList4.get(1);
                            C0800p c0800p = new C0800p(arrayList3, c1521a, 22);
                            C4584g c4584g2 = (C4584g) s1Var2.f43902g;
                            if (c4584g2 != null) {
                                c4584g2.a();
                            }
                            boolean zBooleanValue = yVar.f48194e.booleanValue();
                            Y y10 = new Y(s1Var2, c0800p, str, yVar);
                            C4026b c4026b = (C4026b) s1Var2.f43898c;
                            if (c4026b.f45322b) {
                                y10.c("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            Activity activity2 = (Activity) s1Var2.f43896a;
                            if (Y0.e.checkSelfPermission(activity2, "android.permission.CAMERA") == 0 && (!zBooleanValue || Y0.e.checkSelfPermission(activity2, "android.permission.RECORD_AUDIO") == 0)) {
                                y10.c(null, null);
                                return;
                            }
                            ((s1) ((InterfaceC3965b) ((C3641c) s1Var2.f43899d).f41267b)).d(new Yc.g(new aa.f(27, c4026b, y10)));
                            c4026b.f45322b = true;
                            AbstractC1274b.a(activity2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            w wVar = (w) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g3 = (C4584g) s1Var2.f43902g;
                                int iOrdinal = wVar.ordinal();
                                if (iOrdinal == 0) {
                                    i152 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c4584g3.l(i152);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = Fe.b.V(th2);
                            }
                            c1521a.c(arrayList5);
                            return;
                        case 4:
                            ArrayList arrayList6 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            C0800p c0800p2 = new C0800p(arrayList6, c1521a, i132);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g4 = (C4584g) s1Var2.f43902g;
                                if (zVar != null) {
                                    w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                                }
                                c4584g4.m(c0800p2, w0Var);
                                return;
                            } catch (Exception e11) {
                                s1.h(e11, c0800p2);
                                return;
                            }
                        case 5:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6730f.floatValue()));
                            } catch (Throwable th3) {
                                arrayList7 = Fe.b.V(th3);
                            }
                            c1521a.c(arrayList7);
                            return;
                        case 6:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6729e.floatValue()));
                            } catch (Throwable th4) {
                                arrayList8 = Fe.b.V(th4);
                            }
                            c1521a.c(arrayList8);
                            return;
                        case 7:
                            ArrayList arrayList9 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj2).get(0);
                            C0801q c0801q = new C0801q(arrayList9, c1521a, i112);
                            C4584g c4584g5 = (C4584g) s1Var2.f43902g;
                            float fFloatValue = d5.floatValue();
                            Kc.a aVarG = c4584g5.f48112a.g();
                            Float f10 = aVarG.f6730f;
                            float fFloatValue2 = f10.floatValue();
                            Float f11 = aVarG.f6729e;
                            float fFloatValue3 = f11.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                c0801q.c(new C4592o("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f11, f10), null));
                                return;
                            }
                            aVarG.f6728d = Float.valueOf(fFloatValue);
                            aVarG.a(c4584g5.f48129s);
                            c4584g5.h(new RunnableC3307c(c0801q, i112), new C3641c(c0801q, 15));
                            return;
                        case 8:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th5) {
                                arrayList10 = Fe.b.V(th5);
                            }
                            try {
                                C4584g c4584g6 = (C4584g) s1Var2.f43902g;
                                if (!c4584g6.f48132v) {
                                    c4584g6.f48132v = true;
                                    CameraCaptureSession cameraCaptureSession = c4584g6.f48126p;
                                    if (cameraCaptureSession != null) {
                                        cameraCaptureSession.stopRepeating();
                                    }
                                }
                                arrayList10.add(0, null);
                                c1521a.c(arrayList10);
                                return;
                            } catch (CameraAccessException e12) {
                                throw new C4592o("CameraAccessException", e12.getMessage(), null);
                            }
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C4584g c4584g7 = (C4584g) s1Var2.f43902g;
                                c4584g7.f48132v = false;
                                c4584g7.h(null, new C4580c(c4584g7, i172));
                                arrayList11.add(0, null);
                            } catch (Throwable th6) {
                                arrayList11 = Fe.b.V(th6);
                            }
                            c1521a.c(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                s1Var2.getClass();
                                try {
                                    ((C4584g) s1Var2.f43902g).j(new t6.q(str2, (CameraManager) ((Activity) s1Var2.f43896a).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e13) {
                                    throw new C4592o("CameraAccessException", e13.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = Fe.b.V(th7);
                            }
                            c1521a.c(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C4584g c4584g8 = (C4584g) s1Var2.f43902g;
                                if (c4584g8.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g8.f48130t.resume();
                                    } catch (IllegalStateException e14) {
                                        throw new C4592o("videoRecordingFailed", e14.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = Fe.b.V(th8);
                            }
                            c1521a.c(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                s1Var2.i((x) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                            } catch (Throwable th9) {
                                arrayList14 = Fe.b.V(th9);
                            }
                            c1521a.c(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C4584g c4584g9 = (C4584g) s1Var2.f43902g;
                                if (c4584g9 != null) {
                                    Log.i("Camera", "dispose");
                                    c4584g9.a();
                                    c4584g9.f48116e.release();
                                    Jc.a aVar = c4584g9.f48112a.f().f6005c;
                                    V1 v1 = aVar.f6003f;
                                    if (v1 != null) {
                                        aVar.f5998a.unregisterReceiver(v1);
                                        aVar.f6003f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                            } catch (Throwable th10) {
                                arrayList15 = Fe.b.V(th10);
                            }
                            c1521a.c(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g10 = (C4584g) s1Var2.f43902g;
                                int iOrdinal2 = tVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        i162 = 2;
                                    } else if (iOrdinal2 == 2) {
                                        i162 = 3;
                                    } else {
                                        if (iOrdinal2 != 3) {
                                            throw new IllegalStateException("Unreachable code");
                                        }
                                        i162 = 4;
                                    }
                                }
                                c4584g10.f48112a.f().f6006d = i162;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = Fe.b.V(th11);
                            }
                            c1521a.c(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C4584g) s1Var2.f43902g).f48112a.f().f6006d = 0;
                                arrayList17.add(0, null);
                            } catch (Throwable th12) {
                                arrayList17 = Fe.b.V(th12);
                            }
                            c1521a.c(arrayList17);
                            return;
                        case 16:
                            C0801q c0801q2 = new C0801q(new ArrayList(), c1521a, i122);
                            C4584g c4584g11 = (C4584g) s1Var2.f43902g;
                            C4585h c4585h = c4584g11.f48122l;
                            if (c4585h.f48138b != 1) {
                                c0801q2.c(new C4592o("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c4584g11.f48136z = c0801q2;
                            try {
                                c4584g11.f48133w = File.createTempFile("CAP", ".jpg", c4584g11.f48118g.getCacheDir());
                                S3.s sVar = c4584g11.f48134x;
                                sVar.getClass();
                                sVar.f11009b = new J5.n(2);
                                sVar.f11010c = new J5.n(2);
                                c4584g11.f48127q.setOnImageAvailableListener(c4584g11, c4584g11.f48123m);
                                Ac.a aVar2 = (Ac.a) c4584g11.f48112a.f5569a.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1257b != 1) {
                                    c4584g11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c4585h.f48138b = 2;
                                c4584g11.d();
                                return;
                            } catch (IOException | SecurityException e15) {
                                c4584g11.f48119h.l(c4584g11.f48136z, "cannotCreateFile", e15.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                s1Var2.n((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                            } catch (Throwable th13) {
                                arrayList18 = Fe.b.V(th13);
                            }
                            c1521a.c(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, s1Var2.o());
                            } catch (Throwable th14) {
                                arrayList19 = Fe.b.V(th14);
                            }
                            c1521a.c(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C4584g c4584g12 = (C4584g) s1Var2.f43902g;
                                if (c4584g12.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g12.f48130t.pause();
                                    } catch (IllegalStateException e16) {
                                        throw new C4592o("videoRecordingFailed", e16.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = Fe.b.V(th15);
                            }
                            c1521a.c(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th16) {
                                arrayList21 = Fe.b.V(th16);
                            }
                            try {
                                C4584g c4584g13 = (C4584g) s1Var2.f43902g;
                                C4273j c4273j = (C4273j) s1Var2.f43901f;
                                c4584g13.getClass();
                                c4273j.a(new Wa.d(c4584g13, i142));
                                c4584g13.o(false, true);
                                Log.i("Camera", "startPreviewWithImageStream");
                                arrayList21.add(0, null);
                                c1521a.c(arrayList21);
                                return;
                            } catch (CameraAccessException e17) {
                                throw new C4592o("CameraAccessException", e17.getMessage(), null);
                            }
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th17) {
                                arrayList22 = Fe.b.V(th17);
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).p(null);
                                arrayList22.add(0, null);
                                c1521a.c(arrayList22);
                                return;
                            } catch (Exception e18) {
                                throw new C4592o(e18.getClass().getName(), e18.getMessage(), null);
                            }
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj2).get(0);
                            C0799o c0799o2 = new C0799o(arrayList23, c1521a, i122);
                            s1Var2.getClass();
                            int iOrdinal3 = vVar.ordinal();
                            if (iOrdinal3 == 0) {
                                i102 = 1;
                            } else if (iOrdinal3 == 1) {
                                i102 = 2;
                            } else if (iOrdinal3 == 2) {
                                i102 = 3;
                            } else {
                                if (iOrdinal3 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                i102 = 4;
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).k(c0799o2, i102);
                                return;
                            } catch (Exception e19) {
                                s1.h(e19, c0799o2);
                                return;
                            }
                        case 23:
                            a(obj2, c1521a);
                            return;
                        case 24:
                            b(obj2, c1521a);
                            return;
                        case 25:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                Cc.a aVarB2 = ((C4584g) s1Var2.f43902g).f48112a.b();
                                arrayList24.add(0, Double.valueOf(aVarB2.b() * (((Range) ((CameraCharacteristics) aVarB2.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r4.getLower()).intValue())));
                            } catch (Throwable th18) {
                                arrayList24 = Fe.b.V(th18);
                            }
                            c1521a.c(arrayList24);
                            return;
                        case 26:
                            c(obj2, c1521a);
                            return;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            try {
                                arrayList25.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.b().b()));
                            } catch (Throwable th19) {
                                arrayList25 = Fe.b.V(th19);
                            }
                            c1521a.c(arrayList25);
                            return;
                    }
                }
            });
        } else {
            x720.n(null);
        }
        p pVar6 = p.f48158d;
        X7 x721 = new X7(interfaceC4269f, pVar, obj, "dev.flutter.pigeon.camera_android.CameraApi.setExposureOffset");
        if (s1Var != null) {
            final int i28 = 1;
            x721.n(new InterfaceC4265b() { // from class: yc.n
                private final void a(Object obj2, C1521a c1521a) {
                    ArrayList arrayList = new ArrayList();
                    u uVar = (u) ((ArrayList) obj2).get(0);
                    C0800p c0800p = new C0800p(arrayList, c1521a, 23);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    int iOrdinal = uVar.ordinal();
                    int i102 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i102 = 2;
                    }
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        Bc.a aVar = (Bc.a) c4584g.f48112a.f5569a.get("EXPOSURE_LOCK");
                        aVar.f1667b = i102;
                        aVar.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0800p, 26), new C3641c(c0800p, 18));
                    } catch (Exception e7) {
                        s1.h(e7, c0800p);
                    }
                }

                private final void b(Object obj2, C1521a c1521a) {
                    w0 w0Var;
                    ArrayList arrayList = new ArrayList();
                    z zVar = (z) ((ArrayList) obj2).get(0);
                    C0801q c0801q = new C0801q(arrayList, c1521a, 22);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        w0 w0Var2 = null;
                        if (zVar == null) {
                            w0Var = null;
                        } else {
                            w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                        }
                        Dc.a aVarC = c4584g.f48112a.c();
                        if (w0Var != null && ((Double) w0Var.f46405a) != null && ((Double) w0Var.f46406b) != null) {
                            w0Var2 = w0Var;
                        }
                        aVarC.f2631c = w0Var2;
                        aVarC.b();
                        aVarC.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0801q, 22), new C3641c(c0801q, 14));
                    } catch (Exception e7) {
                        s1.h(e7, c0801q);
                    }
                }

                private final void c(Object obj2, C1521a c1521a) {
                    s1 s1Var2 = s1Var;
                    ArrayList arrayList = new ArrayList();
                    try {
                        Cc.a aVarB = ((C4584g) s1Var2.f43902g).f48112a.b();
                        arrayList.add(0, Double.valueOf(aVarB.b() * (((Range) ((CameraCharacteristics) aVarB.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r1.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = Fe.b.V(th);
                    }
                    c1521a.c(arrayList);
                }

                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listU;
                    int i102;
                    int i112 = 23;
                    int i122 = 21;
                    int i132 = 24;
                    int i142 = 3;
                    int i152 = 2;
                    int i162 = 1;
                    w0 w0Var = null;
                    s1 s1Var2 = s1Var;
                    int i172 = 0;
                    switch (i28) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                Activity activity = (Activity) s1Var2.f43896a;
                                if (activity == null) {
                                    listU = Collections.EMPTY_LIST;
                                } else {
                                    try {
                                        listU = Ba.c.u(activity);
                                    } catch (CameraAccessException e7) {
                                        throw new RuntimeException(e7);
                                    }
                                }
                                arrayList.add(0, listU);
                            } catch (Throwable th) {
                                arrayList = Fe.b.V(th);
                            }
                            c1521a.c(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            C0799o c0799o = new C0799o(arrayList2, c1521a, 22);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g = (C4584g) s1Var2.f43902g;
                                double dDoubleValue = d3.doubleValue();
                                Cc.a aVarB = c4584g.f48112a.b();
                                aVarB.f1982b = dDoubleValue / aVarB.b();
                                aVarB.a(c4584g.f48129s);
                                c4584g.h(new RunnableC4579b(i172, c0799o, aVarB), new C3641c(c0799o, 17));
                                return;
                            } catch (Exception e10) {
                                s1.g(e10, c0799o);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            y yVar = (y) arrayList4.get(1);
                            C0800p c0800p = new C0800p(arrayList3, c1521a, 22);
                            C4584g c4584g2 = (C4584g) s1Var2.f43902g;
                            if (c4584g2 != null) {
                                c4584g2.a();
                            }
                            boolean zBooleanValue = yVar.f48194e.booleanValue();
                            Y y10 = new Y(s1Var2, c0800p, str, yVar);
                            C4026b c4026b = (C4026b) s1Var2.f43898c;
                            if (c4026b.f45322b) {
                                y10.c("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            Activity activity2 = (Activity) s1Var2.f43896a;
                            if (Y0.e.checkSelfPermission(activity2, "android.permission.CAMERA") == 0 && (!zBooleanValue || Y0.e.checkSelfPermission(activity2, "android.permission.RECORD_AUDIO") == 0)) {
                                y10.c(null, null);
                                return;
                            }
                            ((s1) ((InterfaceC3965b) ((C3641c) s1Var2.f43899d).f41267b)).d(new Yc.g(new aa.f(27, c4026b, y10)));
                            c4026b.f45322b = true;
                            AbstractC1274b.a(activity2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            w wVar = (w) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g3 = (C4584g) s1Var2.f43902g;
                                int iOrdinal = wVar.ordinal();
                                if (iOrdinal == 0) {
                                    i152 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c4584g3.l(i152);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = Fe.b.V(th2);
                            }
                            c1521a.c(arrayList5);
                            return;
                        case 4:
                            ArrayList arrayList6 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            C0800p c0800p2 = new C0800p(arrayList6, c1521a, i132);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g4 = (C4584g) s1Var2.f43902g;
                                if (zVar != null) {
                                    w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                                }
                                c4584g4.m(c0800p2, w0Var);
                                return;
                            } catch (Exception e11) {
                                s1.h(e11, c0800p2);
                                return;
                            }
                        case 5:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6730f.floatValue()));
                            } catch (Throwable th3) {
                                arrayList7 = Fe.b.V(th3);
                            }
                            c1521a.c(arrayList7);
                            return;
                        case 6:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6729e.floatValue()));
                            } catch (Throwable th4) {
                                arrayList8 = Fe.b.V(th4);
                            }
                            c1521a.c(arrayList8);
                            return;
                        case 7:
                            ArrayList arrayList9 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj2).get(0);
                            C0801q c0801q = new C0801q(arrayList9, c1521a, i112);
                            C4584g c4584g5 = (C4584g) s1Var2.f43902g;
                            float fFloatValue = d5.floatValue();
                            Kc.a aVarG = c4584g5.f48112a.g();
                            Float f10 = aVarG.f6730f;
                            float fFloatValue2 = f10.floatValue();
                            Float f11 = aVarG.f6729e;
                            float fFloatValue3 = f11.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                c0801q.c(new C4592o("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f11, f10), null));
                                return;
                            }
                            aVarG.f6728d = Float.valueOf(fFloatValue);
                            aVarG.a(c4584g5.f48129s);
                            c4584g5.h(new RunnableC3307c(c0801q, i112), new C3641c(c0801q, 15));
                            return;
                        case 8:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th5) {
                                arrayList10 = Fe.b.V(th5);
                            }
                            try {
                                C4584g c4584g6 = (C4584g) s1Var2.f43902g;
                                if (!c4584g6.f48132v) {
                                    c4584g6.f48132v = true;
                                    CameraCaptureSession cameraCaptureSession = c4584g6.f48126p;
                                    if (cameraCaptureSession != null) {
                                        cameraCaptureSession.stopRepeating();
                                    }
                                }
                                arrayList10.add(0, null);
                                c1521a.c(arrayList10);
                                return;
                            } catch (CameraAccessException e12) {
                                throw new C4592o("CameraAccessException", e12.getMessage(), null);
                            }
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C4584g c4584g7 = (C4584g) s1Var2.f43902g;
                                c4584g7.f48132v = false;
                                c4584g7.h(null, new C4580c(c4584g7, i172));
                                arrayList11.add(0, null);
                            } catch (Throwable th6) {
                                arrayList11 = Fe.b.V(th6);
                            }
                            c1521a.c(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                s1Var2.getClass();
                                try {
                                    ((C4584g) s1Var2.f43902g).j(new t6.q(str2, (CameraManager) ((Activity) s1Var2.f43896a).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e13) {
                                    throw new C4592o("CameraAccessException", e13.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = Fe.b.V(th7);
                            }
                            c1521a.c(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C4584g c4584g8 = (C4584g) s1Var2.f43902g;
                                if (c4584g8.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g8.f48130t.resume();
                                    } catch (IllegalStateException e14) {
                                        throw new C4592o("videoRecordingFailed", e14.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = Fe.b.V(th8);
                            }
                            c1521a.c(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                s1Var2.i((x) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                            } catch (Throwable th9) {
                                arrayList14 = Fe.b.V(th9);
                            }
                            c1521a.c(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C4584g c4584g9 = (C4584g) s1Var2.f43902g;
                                if (c4584g9 != null) {
                                    Log.i("Camera", "dispose");
                                    c4584g9.a();
                                    c4584g9.f48116e.release();
                                    Jc.a aVar = c4584g9.f48112a.f().f6005c;
                                    V1 v1 = aVar.f6003f;
                                    if (v1 != null) {
                                        aVar.f5998a.unregisterReceiver(v1);
                                        aVar.f6003f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                            } catch (Throwable th10) {
                                arrayList15 = Fe.b.V(th10);
                            }
                            c1521a.c(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g10 = (C4584g) s1Var2.f43902g;
                                int iOrdinal2 = tVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        i162 = 2;
                                    } else if (iOrdinal2 == 2) {
                                        i162 = 3;
                                    } else {
                                        if (iOrdinal2 != 3) {
                                            throw new IllegalStateException("Unreachable code");
                                        }
                                        i162 = 4;
                                    }
                                }
                                c4584g10.f48112a.f().f6006d = i162;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = Fe.b.V(th11);
                            }
                            c1521a.c(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C4584g) s1Var2.f43902g).f48112a.f().f6006d = 0;
                                arrayList17.add(0, null);
                            } catch (Throwable th12) {
                                arrayList17 = Fe.b.V(th12);
                            }
                            c1521a.c(arrayList17);
                            return;
                        case 16:
                            C0801q c0801q2 = new C0801q(new ArrayList(), c1521a, i122);
                            C4584g c4584g11 = (C4584g) s1Var2.f43902g;
                            C4585h c4585h = c4584g11.f48122l;
                            if (c4585h.f48138b != 1) {
                                c0801q2.c(new C4592o("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c4584g11.f48136z = c0801q2;
                            try {
                                c4584g11.f48133w = File.createTempFile("CAP", ".jpg", c4584g11.f48118g.getCacheDir());
                                S3.s sVar = c4584g11.f48134x;
                                sVar.getClass();
                                sVar.f11009b = new J5.n(2);
                                sVar.f11010c = new J5.n(2);
                                c4584g11.f48127q.setOnImageAvailableListener(c4584g11, c4584g11.f48123m);
                                Ac.a aVar2 = (Ac.a) c4584g11.f48112a.f5569a.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1257b != 1) {
                                    c4584g11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c4585h.f48138b = 2;
                                c4584g11.d();
                                return;
                            } catch (IOException | SecurityException e15) {
                                c4584g11.f48119h.l(c4584g11.f48136z, "cannotCreateFile", e15.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                s1Var2.n((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                            } catch (Throwable th13) {
                                arrayList18 = Fe.b.V(th13);
                            }
                            c1521a.c(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, s1Var2.o());
                            } catch (Throwable th14) {
                                arrayList19 = Fe.b.V(th14);
                            }
                            c1521a.c(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C4584g c4584g12 = (C4584g) s1Var2.f43902g;
                                if (c4584g12.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g12.f48130t.pause();
                                    } catch (IllegalStateException e16) {
                                        throw new C4592o("videoRecordingFailed", e16.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = Fe.b.V(th15);
                            }
                            c1521a.c(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th16) {
                                arrayList21 = Fe.b.V(th16);
                            }
                            try {
                                C4584g c4584g13 = (C4584g) s1Var2.f43902g;
                                C4273j c4273j = (C4273j) s1Var2.f43901f;
                                c4584g13.getClass();
                                c4273j.a(new Wa.d(c4584g13, i142));
                                c4584g13.o(false, true);
                                Log.i("Camera", "startPreviewWithImageStream");
                                arrayList21.add(0, null);
                                c1521a.c(arrayList21);
                                return;
                            } catch (CameraAccessException e17) {
                                throw new C4592o("CameraAccessException", e17.getMessage(), null);
                            }
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th17) {
                                arrayList22 = Fe.b.V(th17);
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).p(null);
                                arrayList22.add(0, null);
                                c1521a.c(arrayList22);
                                return;
                            } catch (Exception e18) {
                                throw new C4592o(e18.getClass().getName(), e18.getMessage(), null);
                            }
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj2).get(0);
                            C0799o c0799o2 = new C0799o(arrayList23, c1521a, i122);
                            s1Var2.getClass();
                            int iOrdinal3 = vVar.ordinal();
                            if (iOrdinal3 == 0) {
                                i102 = 1;
                            } else if (iOrdinal3 == 1) {
                                i102 = 2;
                            } else if (iOrdinal3 == 2) {
                                i102 = 3;
                            } else {
                                if (iOrdinal3 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                i102 = 4;
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).k(c0799o2, i102);
                                return;
                            } catch (Exception e19) {
                                s1.h(e19, c0799o2);
                                return;
                            }
                        case 23:
                            a(obj2, c1521a);
                            return;
                        case 24:
                            b(obj2, c1521a);
                            return;
                        case 25:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                Cc.a aVarB2 = ((C4584g) s1Var2.f43902g).f48112a.b();
                                arrayList24.add(0, Double.valueOf(aVarB2.b() * (((Range) ((CameraCharacteristics) aVarB2.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r4.getLower()).intValue())));
                            } catch (Throwable th18) {
                                arrayList24 = Fe.b.V(th18);
                            }
                            c1521a.c(arrayList24);
                            return;
                        case 26:
                            c(obj2, c1521a);
                            return;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            try {
                                arrayList25.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.b().b()));
                            } catch (Throwable th19) {
                                arrayList25 = Fe.b.V(th19);
                            }
                            c1521a.c(arrayList25);
                            return;
                    }
                }
            });
        } else {
            x721.n(null);
        }
        p pVar7 = p.f48158d;
        X7 x722 = new X7(interfaceC4269f, pVar, obj, "dev.flutter.pigeon.camera_android.CameraApi.setFocusMode");
        if (s1Var != null) {
            final int i29 = 3;
            x722.n(new InterfaceC4265b() { // from class: yc.n
                private final void a(Object obj2, C1521a c1521a) {
                    ArrayList arrayList = new ArrayList();
                    u uVar = (u) ((ArrayList) obj2).get(0);
                    C0800p c0800p = new C0800p(arrayList, c1521a, 23);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    int iOrdinal = uVar.ordinal();
                    int i102 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i102 = 2;
                    }
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        Bc.a aVar = (Bc.a) c4584g.f48112a.f5569a.get("EXPOSURE_LOCK");
                        aVar.f1667b = i102;
                        aVar.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0800p, 26), new C3641c(c0800p, 18));
                    } catch (Exception e7) {
                        s1.h(e7, c0800p);
                    }
                }

                private final void b(Object obj2, C1521a c1521a) {
                    w0 w0Var;
                    ArrayList arrayList = new ArrayList();
                    z zVar = (z) ((ArrayList) obj2).get(0);
                    C0801q c0801q = new C0801q(arrayList, c1521a, 22);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        w0 w0Var2 = null;
                        if (zVar == null) {
                            w0Var = null;
                        } else {
                            w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                        }
                        Dc.a aVarC = c4584g.f48112a.c();
                        if (w0Var != null && ((Double) w0Var.f46405a) != null && ((Double) w0Var.f46406b) != null) {
                            w0Var2 = w0Var;
                        }
                        aVarC.f2631c = w0Var2;
                        aVarC.b();
                        aVarC.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0801q, 22), new C3641c(c0801q, 14));
                    } catch (Exception e7) {
                        s1.h(e7, c0801q);
                    }
                }

                private final void c(Object obj2, C1521a c1521a) {
                    s1 s1Var2 = s1Var;
                    ArrayList arrayList = new ArrayList();
                    try {
                        Cc.a aVarB = ((C4584g) s1Var2.f43902g).f48112a.b();
                        arrayList.add(0, Double.valueOf(aVarB.b() * (((Range) ((CameraCharacteristics) aVarB.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r1.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = Fe.b.V(th);
                    }
                    c1521a.c(arrayList);
                }

                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listU;
                    int i102;
                    int i112 = 23;
                    int i122 = 21;
                    int i132 = 24;
                    int i142 = 3;
                    int i152 = 2;
                    int i162 = 1;
                    w0 w0Var = null;
                    s1 s1Var2 = s1Var;
                    int i172 = 0;
                    switch (i29) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                Activity activity = (Activity) s1Var2.f43896a;
                                if (activity == null) {
                                    listU = Collections.EMPTY_LIST;
                                } else {
                                    try {
                                        listU = Ba.c.u(activity);
                                    } catch (CameraAccessException e7) {
                                        throw new RuntimeException(e7);
                                    }
                                }
                                arrayList.add(0, listU);
                            } catch (Throwable th) {
                                arrayList = Fe.b.V(th);
                            }
                            c1521a.c(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            C0799o c0799o = new C0799o(arrayList2, c1521a, 22);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g = (C4584g) s1Var2.f43902g;
                                double dDoubleValue = d3.doubleValue();
                                Cc.a aVarB = c4584g.f48112a.b();
                                aVarB.f1982b = dDoubleValue / aVarB.b();
                                aVarB.a(c4584g.f48129s);
                                c4584g.h(new RunnableC4579b(i172, c0799o, aVarB), new C3641c(c0799o, 17));
                                return;
                            } catch (Exception e10) {
                                s1.g(e10, c0799o);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            y yVar = (y) arrayList4.get(1);
                            C0800p c0800p = new C0800p(arrayList3, c1521a, 22);
                            C4584g c4584g2 = (C4584g) s1Var2.f43902g;
                            if (c4584g2 != null) {
                                c4584g2.a();
                            }
                            boolean zBooleanValue = yVar.f48194e.booleanValue();
                            Y y10 = new Y(s1Var2, c0800p, str, yVar);
                            C4026b c4026b = (C4026b) s1Var2.f43898c;
                            if (c4026b.f45322b) {
                                y10.c("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            Activity activity2 = (Activity) s1Var2.f43896a;
                            if (Y0.e.checkSelfPermission(activity2, "android.permission.CAMERA") == 0 && (!zBooleanValue || Y0.e.checkSelfPermission(activity2, "android.permission.RECORD_AUDIO") == 0)) {
                                y10.c(null, null);
                                return;
                            }
                            ((s1) ((InterfaceC3965b) ((C3641c) s1Var2.f43899d).f41267b)).d(new Yc.g(new aa.f(27, c4026b, y10)));
                            c4026b.f45322b = true;
                            AbstractC1274b.a(activity2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            w wVar = (w) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g3 = (C4584g) s1Var2.f43902g;
                                int iOrdinal = wVar.ordinal();
                                if (iOrdinal == 0) {
                                    i152 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c4584g3.l(i152);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = Fe.b.V(th2);
                            }
                            c1521a.c(arrayList5);
                            return;
                        case 4:
                            ArrayList arrayList6 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            C0800p c0800p2 = new C0800p(arrayList6, c1521a, i132);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g4 = (C4584g) s1Var2.f43902g;
                                if (zVar != null) {
                                    w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                                }
                                c4584g4.m(c0800p2, w0Var);
                                return;
                            } catch (Exception e11) {
                                s1.h(e11, c0800p2);
                                return;
                            }
                        case 5:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6730f.floatValue()));
                            } catch (Throwable th3) {
                                arrayList7 = Fe.b.V(th3);
                            }
                            c1521a.c(arrayList7);
                            return;
                        case 6:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6729e.floatValue()));
                            } catch (Throwable th4) {
                                arrayList8 = Fe.b.V(th4);
                            }
                            c1521a.c(arrayList8);
                            return;
                        case 7:
                            ArrayList arrayList9 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj2).get(0);
                            C0801q c0801q = new C0801q(arrayList9, c1521a, i112);
                            C4584g c4584g5 = (C4584g) s1Var2.f43902g;
                            float fFloatValue = d5.floatValue();
                            Kc.a aVarG = c4584g5.f48112a.g();
                            Float f10 = aVarG.f6730f;
                            float fFloatValue2 = f10.floatValue();
                            Float f11 = aVarG.f6729e;
                            float fFloatValue3 = f11.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                c0801q.c(new C4592o("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f11, f10), null));
                                return;
                            }
                            aVarG.f6728d = Float.valueOf(fFloatValue);
                            aVarG.a(c4584g5.f48129s);
                            c4584g5.h(new RunnableC3307c(c0801q, i112), new C3641c(c0801q, 15));
                            return;
                        case 8:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th5) {
                                arrayList10 = Fe.b.V(th5);
                            }
                            try {
                                C4584g c4584g6 = (C4584g) s1Var2.f43902g;
                                if (!c4584g6.f48132v) {
                                    c4584g6.f48132v = true;
                                    CameraCaptureSession cameraCaptureSession = c4584g6.f48126p;
                                    if (cameraCaptureSession != null) {
                                        cameraCaptureSession.stopRepeating();
                                    }
                                }
                                arrayList10.add(0, null);
                                c1521a.c(arrayList10);
                                return;
                            } catch (CameraAccessException e12) {
                                throw new C4592o("CameraAccessException", e12.getMessage(), null);
                            }
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C4584g c4584g7 = (C4584g) s1Var2.f43902g;
                                c4584g7.f48132v = false;
                                c4584g7.h(null, new C4580c(c4584g7, i172));
                                arrayList11.add(0, null);
                            } catch (Throwable th6) {
                                arrayList11 = Fe.b.V(th6);
                            }
                            c1521a.c(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                s1Var2.getClass();
                                try {
                                    ((C4584g) s1Var2.f43902g).j(new t6.q(str2, (CameraManager) ((Activity) s1Var2.f43896a).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e13) {
                                    throw new C4592o("CameraAccessException", e13.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = Fe.b.V(th7);
                            }
                            c1521a.c(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C4584g c4584g8 = (C4584g) s1Var2.f43902g;
                                if (c4584g8.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g8.f48130t.resume();
                                    } catch (IllegalStateException e14) {
                                        throw new C4592o("videoRecordingFailed", e14.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = Fe.b.V(th8);
                            }
                            c1521a.c(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                s1Var2.i((x) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                            } catch (Throwable th9) {
                                arrayList14 = Fe.b.V(th9);
                            }
                            c1521a.c(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C4584g c4584g9 = (C4584g) s1Var2.f43902g;
                                if (c4584g9 != null) {
                                    Log.i("Camera", "dispose");
                                    c4584g9.a();
                                    c4584g9.f48116e.release();
                                    Jc.a aVar = c4584g9.f48112a.f().f6005c;
                                    V1 v1 = aVar.f6003f;
                                    if (v1 != null) {
                                        aVar.f5998a.unregisterReceiver(v1);
                                        aVar.f6003f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                            } catch (Throwable th10) {
                                arrayList15 = Fe.b.V(th10);
                            }
                            c1521a.c(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g10 = (C4584g) s1Var2.f43902g;
                                int iOrdinal2 = tVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        i162 = 2;
                                    } else if (iOrdinal2 == 2) {
                                        i162 = 3;
                                    } else {
                                        if (iOrdinal2 != 3) {
                                            throw new IllegalStateException("Unreachable code");
                                        }
                                        i162 = 4;
                                    }
                                }
                                c4584g10.f48112a.f().f6006d = i162;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = Fe.b.V(th11);
                            }
                            c1521a.c(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C4584g) s1Var2.f43902g).f48112a.f().f6006d = 0;
                                arrayList17.add(0, null);
                            } catch (Throwable th12) {
                                arrayList17 = Fe.b.V(th12);
                            }
                            c1521a.c(arrayList17);
                            return;
                        case 16:
                            C0801q c0801q2 = new C0801q(new ArrayList(), c1521a, i122);
                            C4584g c4584g11 = (C4584g) s1Var2.f43902g;
                            C4585h c4585h = c4584g11.f48122l;
                            if (c4585h.f48138b != 1) {
                                c0801q2.c(new C4592o("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c4584g11.f48136z = c0801q2;
                            try {
                                c4584g11.f48133w = File.createTempFile("CAP", ".jpg", c4584g11.f48118g.getCacheDir());
                                S3.s sVar = c4584g11.f48134x;
                                sVar.getClass();
                                sVar.f11009b = new J5.n(2);
                                sVar.f11010c = new J5.n(2);
                                c4584g11.f48127q.setOnImageAvailableListener(c4584g11, c4584g11.f48123m);
                                Ac.a aVar2 = (Ac.a) c4584g11.f48112a.f5569a.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1257b != 1) {
                                    c4584g11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c4585h.f48138b = 2;
                                c4584g11.d();
                                return;
                            } catch (IOException | SecurityException e15) {
                                c4584g11.f48119h.l(c4584g11.f48136z, "cannotCreateFile", e15.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                s1Var2.n((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                            } catch (Throwable th13) {
                                arrayList18 = Fe.b.V(th13);
                            }
                            c1521a.c(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, s1Var2.o());
                            } catch (Throwable th14) {
                                arrayList19 = Fe.b.V(th14);
                            }
                            c1521a.c(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C4584g c4584g12 = (C4584g) s1Var2.f43902g;
                                if (c4584g12.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g12.f48130t.pause();
                                    } catch (IllegalStateException e16) {
                                        throw new C4592o("videoRecordingFailed", e16.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = Fe.b.V(th15);
                            }
                            c1521a.c(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th16) {
                                arrayList21 = Fe.b.V(th16);
                            }
                            try {
                                C4584g c4584g13 = (C4584g) s1Var2.f43902g;
                                C4273j c4273j = (C4273j) s1Var2.f43901f;
                                c4584g13.getClass();
                                c4273j.a(new Wa.d(c4584g13, i142));
                                c4584g13.o(false, true);
                                Log.i("Camera", "startPreviewWithImageStream");
                                arrayList21.add(0, null);
                                c1521a.c(arrayList21);
                                return;
                            } catch (CameraAccessException e17) {
                                throw new C4592o("CameraAccessException", e17.getMessage(), null);
                            }
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th17) {
                                arrayList22 = Fe.b.V(th17);
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).p(null);
                                arrayList22.add(0, null);
                                c1521a.c(arrayList22);
                                return;
                            } catch (Exception e18) {
                                throw new C4592o(e18.getClass().getName(), e18.getMessage(), null);
                            }
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj2).get(0);
                            C0799o c0799o2 = new C0799o(arrayList23, c1521a, i122);
                            s1Var2.getClass();
                            int iOrdinal3 = vVar.ordinal();
                            if (iOrdinal3 == 0) {
                                i102 = 1;
                            } else if (iOrdinal3 == 1) {
                                i102 = 2;
                            } else if (iOrdinal3 == 2) {
                                i102 = 3;
                            } else {
                                if (iOrdinal3 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                i102 = 4;
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).k(c0799o2, i102);
                                return;
                            } catch (Exception e19) {
                                s1.h(e19, c0799o2);
                                return;
                            }
                        case 23:
                            a(obj2, c1521a);
                            return;
                        case 24:
                            b(obj2, c1521a);
                            return;
                        case 25:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                Cc.a aVarB2 = ((C4584g) s1Var2.f43902g).f48112a.b();
                                arrayList24.add(0, Double.valueOf(aVarB2.b() * (((Range) ((CameraCharacteristics) aVarB2.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r4.getLower()).intValue())));
                            } catch (Throwable th18) {
                                arrayList24 = Fe.b.V(th18);
                            }
                            c1521a.c(arrayList24);
                            return;
                        case 26:
                            c(obj2, c1521a);
                            return;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            try {
                                arrayList25.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.b().b()));
                            } catch (Throwable th19) {
                                arrayList25 = Fe.b.V(th19);
                            }
                            c1521a.c(arrayList25);
                            return;
                    }
                }
            });
        } else {
            x722.n(null);
        }
        p pVar8 = p.f48158d;
        X7 x723 = new X7(interfaceC4269f, pVar, obj, "dev.flutter.pigeon.camera_android.CameraApi.setFocusPoint");
        if (s1Var != null) {
            final int i30 = 4;
            x723.n(new InterfaceC4265b() { // from class: yc.n
                private final void a(Object obj2, C1521a c1521a) {
                    ArrayList arrayList = new ArrayList();
                    u uVar = (u) ((ArrayList) obj2).get(0);
                    C0800p c0800p = new C0800p(arrayList, c1521a, 23);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    int iOrdinal = uVar.ordinal();
                    int i102 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i102 = 2;
                    }
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        Bc.a aVar = (Bc.a) c4584g.f48112a.f5569a.get("EXPOSURE_LOCK");
                        aVar.f1667b = i102;
                        aVar.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0800p, 26), new C3641c(c0800p, 18));
                    } catch (Exception e7) {
                        s1.h(e7, c0800p);
                    }
                }

                private final void b(Object obj2, C1521a c1521a) {
                    w0 w0Var;
                    ArrayList arrayList = new ArrayList();
                    z zVar = (z) ((ArrayList) obj2).get(0);
                    C0801q c0801q = new C0801q(arrayList, c1521a, 22);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        w0 w0Var2 = null;
                        if (zVar == null) {
                            w0Var = null;
                        } else {
                            w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                        }
                        Dc.a aVarC = c4584g.f48112a.c();
                        if (w0Var != null && ((Double) w0Var.f46405a) != null && ((Double) w0Var.f46406b) != null) {
                            w0Var2 = w0Var;
                        }
                        aVarC.f2631c = w0Var2;
                        aVarC.b();
                        aVarC.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0801q, 22), new C3641c(c0801q, 14));
                    } catch (Exception e7) {
                        s1.h(e7, c0801q);
                    }
                }

                private final void c(Object obj2, C1521a c1521a) {
                    s1 s1Var2 = s1Var;
                    ArrayList arrayList = new ArrayList();
                    try {
                        Cc.a aVarB = ((C4584g) s1Var2.f43902g).f48112a.b();
                        arrayList.add(0, Double.valueOf(aVarB.b() * (((Range) ((CameraCharacteristics) aVarB.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r1.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = Fe.b.V(th);
                    }
                    c1521a.c(arrayList);
                }

                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listU;
                    int i102;
                    int i112 = 23;
                    int i122 = 21;
                    int i132 = 24;
                    int i142 = 3;
                    int i152 = 2;
                    int i162 = 1;
                    w0 w0Var = null;
                    s1 s1Var2 = s1Var;
                    int i172 = 0;
                    switch (i30) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                Activity activity = (Activity) s1Var2.f43896a;
                                if (activity == null) {
                                    listU = Collections.EMPTY_LIST;
                                } else {
                                    try {
                                        listU = Ba.c.u(activity);
                                    } catch (CameraAccessException e7) {
                                        throw new RuntimeException(e7);
                                    }
                                }
                                arrayList.add(0, listU);
                            } catch (Throwable th) {
                                arrayList = Fe.b.V(th);
                            }
                            c1521a.c(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            C0799o c0799o = new C0799o(arrayList2, c1521a, 22);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g = (C4584g) s1Var2.f43902g;
                                double dDoubleValue = d3.doubleValue();
                                Cc.a aVarB = c4584g.f48112a.b();
                                aVarB.f1982b = dDoubleValue / aVarB.b();
                                aVarB.a(c4584g.f48129s);
                                c4584g.h(new RunnableC4579b(i172, c0799o, aVarB), new C3641c(c0799o, 17));
                                return;
                            } catch (Exception e10) {
                                s1.g(e10, c0799o);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            y yVar = (y) arrayList4.get(1);
                            C0800p c0800p = new C0800p(arrayList3, c1521a, 22);
                            C4584g c4584g2 = (C4584g) s1Var2.f43902g;
                            if (c4584g2 != null) {
                                c4584g2.a();
                            }
                            boolean zBooleanValue = yVar.f48194e.booleanValue();
                            Y y10 = new Y(s1Var2, c0800p, str, yVar);
                            C4026b c4026b = (C4026b) s1Var2.f43898c;
                            if (c4026b.f45322b) {
                                y10.c("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            Activity activity2 = (Activity) s1Var2.f43896a;
                            if (Y0.e.checkSelfPermission(activity2, "android.permission.CAMERA") == 0 && (!zBooleanValue || Y0.e.checkSelfPermission(activity2, "android.permission.RECORD_AUDIO") == 0)) {
                                y10.c(null, null);
                                return;
                            }
                            ((s1) ((InterfaceC3965b) ((C3641c) s1Var2.f43899d).f41267b)).d(new Yc.g(new aa.f(27, c4026b, y10)));
                            c4026b.f45322b = true;
                            AbstractC1274b.a(activity2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            w wVar = (w) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g3 = (C4584g) s1Var2.f43902g;
                                int iOrdinal = wVar.ordinal();
                                if (iOrdinal == 0) {
                                    i152 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c4584g3.l(i152);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = Fe.b.V(th2);
                            }
                            c1521a.c(arrayList5);
                            return;
                        case 4:
                            ArrayList arrayList6 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            C0800p c0800p2 = new C0800p(arrayList6, c1521a, i132);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g4 = (C4584g) s1Var2.f43902g;
                                if (zVar != null) {
                                    w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                                }
                                c4584g4.m(c0800p2, w0Var);
                                return;
                            } catch (Exception e11) {
                                s1.h(e11, c0800p2);
                                return;
                            }
                        case 5:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6730f.floatValue()));
                            } catch (Throwable th3) {
                                arrayList7 = Fe.b.V(th3);
                            }
                            c1521a.c(arrayList7);
                            return;
                        case 6:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6729e.floatValue()));
                            } catch (Throwable th4) {
                                arrayList8 = Fe.b.V(th4);
                            }
                            c1521a.c(arrayList8);
                            return;
                        case 7:
                            ArrayList arrayList9 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj2).get(0);
                            C0801q c0801q = new C0801q(arrayList9, c1521a, i112);
                            C4584g c4584g5 = (C4584g) s1Var2.f43902g;
                            float fFloatValue = d5.floatValue();
                            Kc.a aVarG = c4584g5.f48112a.g();
                            Float f10 = aVarG.f6730f;
                            float fFloatValue2 = f10.floatValue();
                            Float f11 = aVarG.f6729e;
                            float fFloatValue3 = f11.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                c0801q.c(new C4592o("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f11, f10), null));
                                return;
                            }
                            aVarG.f6728d = Float.valueOf(fFloatValue);
                            aVarG.a(c4584g5.f48129s);
                            c4584g5.h(new RunnableC3307c(c0801q, i112), new C3641c(c0801q, 15));
                            return;
                        case 8:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th5) {
                                arrayList10 = Fe.b.V(th5);
                            }
                            try {
                                C4584g c4584g6 = (C4584g) s1Var2.f43902g;
                                if (!c4584g6.f48132v) {
                                    c4584g6.f48132v = true;
                                    CameraCaptureSession cameraCaptureSession = c4584g6.f48126p;
                                    if (cameraCaptureSession != null) {
                                        cameraCaptureSession.stopRepeating();
                                    }
                                }
                                arrayList10.add(0, null);
                                c1521a.c(arrayList10);
                                return;
                            } catch (CameraAccessException e12) {
                                throw new C4592o("CameraAccessException", e12.getMessage(), null);
                            }
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C4584g c4584g7 = (C4584g) s1Var2.f43902g;
                                c4584g7.f48132v = false;
                                c4584g7.h(null, new C4580c(c4584g7, i172));
                                arrayList11.add(0, null);
                            } catch (Throwable th6) {
                                arrayList11 = Fe.b.V(th6);
                            }
                            c1521a.c(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                s1Var2.getClass();
                                try {
                                    ((C4584g) s1Var2.f43902g).j(new t6.q(str2, (CameraManager) ((Activity) s1Var2.f43896a).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e13) {
                                    throw new C4592o("CameraAccessException", e13.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = Fe.b.V(th7);
                            }
                            c1521a.c(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C4584g c4584g8 = (C4584g) s1Var2.f43902g;
                                if (c4584g8.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g8.f48130t.resume();
                                    } catch (IllegalStateException e14) {
                                        throw new C4592o("videoRecordingFailed", e14.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = Fe.b.V(th8);
                            }
                            c1521a.c(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                s1Var2.i((x) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                            } catch (Throwable th9) {
                                arrayList14 = Fe.b.V(th9);
                            }
                            c1521a.c(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C4584g c4584g9 = (C4584g) s1Var2.f43902g;
                                if (c4584g9 != null) {
                                    Log.i("Camera", "dispose");
                                    c4584g9.a();
                                    c4584g9.f48116e.release();
                                    Jc.a aVar = c4584g9.f48112a.f().f6005c;
                                    V1 v1 = aVar.f6003f;
                                    if (v1 != null) {
                                        aVar.f5998a.unregisterReceiver(v1);
                                        aVar.f6003f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                            } catch (Throwable th10) {
                                arrayList15 = Fe.b.V(th10);
                            }
                            c1521a.c(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g10 = (C4584g) s1Var2.f43902g;
                                int iOrdinal2 = tVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        i162 = 2;
                                    } else if (iOrdinal2 == 2) {
                                        i162 = 3;
                                    } else {
                                        if (iOrdinal2 != 3) {
                                            throw new IllegalStateException("Unreachable code");
                                        }
                                        i162 = 4;
                                    }
                                }
                                c4584g10.f48112a.f().f6006d = i162;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = Fe.b.V(th11);
                            }
                            c1521a.c(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C4584g) s1Var2.f43902g).f48112a.f().f6006d = 0;
                                arrayList17.add(0, null);
                            } catch (Throwable th12) {
                                arrayList17 = Fe.b.V(th12);
                            }
                            c1521a.c(arrayList17);
                            return;
                        case 16:
                            C0801q c0801q2 = new C0801q(new ArrayList(), c1521a, i122);
                            C4584g c4584g11 = (C4584g) s1Var2.f43902g;
                            C4585h c4585h = c4584g11.f48122l;
                            if (c4585h.f48138b != 1) {
                                c0801q2.c(new C4592o("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c4584g11.f48136z = c0801q2;
                            try {
                                c4584g11.f48133w = File.createTempFile("CAP", ".jpg", c4584g11.f48118g.getCacheDir());
                                S3.s sVar = c4584g11.f48134x;
                                sVar.getClass();
                                sVar.f11009b = new J5.n(2);
                                sVar.f11010c = new J5.n(2);
                                c4584g11.f48127q.setOnImageAvailableListener(c4584g11, c4584g11.f48123m);
                                Ac.a aVar2 = (Ac.a) c4584g11.f48112a.f5569a.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1257b != 1) {
                                    c4584g11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c4585h.f48138b = 2;
                                c4584g11.d();
                                return;
                            } catch (IOException | SecurityException e15) {
                                c4584g11.f48119h.l(c4584g11.f48136z, "cannotCreateFile", e15.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                s1Var2.n((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                            } catch (Throwable th13) {
                                arrayList18 = Fe.b.V(th13);
                            }
                            c1521a.c(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, s1Var2.o());
                            } catch (Throwable th14) {
                                arrayList19 = Fe.b.V(th14);
                            }
                            c1521a.c(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C4584g c4584g12 = (C4584g) s1Var2.f43902g;
                                if (c4584g12.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g12.f48130t.pause();
                                    } catch (IllegalStateException e16) {
                                        throw new C4592o("videoRecordingFailed", e16.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = Fe.b.V(th15);
                            }
                            c1521a.c(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th16) {
                                arrayList21 = Fe.b.V(th16);
                            }
                            try {
                                C4584g c4584g13 = (C4584g) s1Var2.f43902g;
                                C4273j c4273j = (C4273j) s1Var2.f43901f;
                                c4584g13.getClass();
                                c4273j.a(new Wa.d(c4584g13, i142));
                                c4584g13.o(false, true);
                                Log.i("Camera", "startPreviewWithImageStream");
                                arrayList21.add(0, null);
                                c1521a.c(arrayList21);
                                return;
                            } catch (CameraAccessException e17) {
                                throw new C4592o("CameraAccessException", e17.getMessage(), null);
                            }
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th17) {
                                arrayList22 = Fe.b.V(th17);
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).p(null);
                                arrayList22.add(0, null);
                                c1521a.c(arrayList22);
                                return;
                            } catch (Exception e18) {
                                throw new C4592o(e18.getClass().getName(), e18.getMessage(), null);
                            }
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj2).get(0);
                            C0799o c0799o2 = new C0799o(arrayList23, c1521a, i122);
                            s1Var2.getClass();
                            int iOrdinal3 = vVar.ordinal();
                            if (iOrdinal3 == 0) {
                                i102 = 1;
                            } else if (iOrdinal3 == 1) {
                                i102 = 2;
                            } else if (iOrdinal3 == 2) {
                                i102 = 3;
                            } else {
                                if (iOrdinal3 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                i102 = 4;
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).k(c0799o2, i102);
                                return;
                            } catch (Exception e19) {
                                s1.h(e19, c0799o2);
                                return;
                            }
                        case 23:
                            a(obj2, c1521a);
                            return;
                        case 24:
                            b(obj2, c1521a);
                            return;
                        case 25:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                Cc.a aVarB2 = ((C4584g) s1Var2.f43902g).f48112a.b();
                                arrayList24.add(0, Double.valueOf(aVarB2.b() * (((Range) ((CameraCharacteristics) aVarB2.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r4.getLower()).intValue())));
                            } catch (Throwable th18) {
                                arrayList24 = Fe.b.V(th18);
                            }
                            c1521a.c(arrayList24);
                            return;
                        case 26:
                            c(obj2, c1521a);
                            return;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            try {
                                arrayList25.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.b().b()));
                            } catch (Throwable th19) {
                                arrayList25 = Fe.b.V(th19);
                            }
                            c1521a.c(arrayList25);
                            return;
                    }
                }
            });
        } else {
            x723.n(null);
        }
        p pVar9 = p.f48158d;
        X7 x724 = new X7(interfaceC4269f, pVar, obj, "dev.flutter.pigeon.camera_android.CameraApi.getMaxZoomLevel");
        if (s1Var != null) {
            final int i31 = 5;
            x724.n(new InterfaceC4265b() { // from class: yc.n
                private final void a(Object obj2, C1521a c1521a) {
                    ArrayList arrayList = new ArrayList();
                    u uVar = (u) ((ArrayList) obj2).get(0);
                    C0800p c0800p = new C0800p(arrayList, c1521a, 23);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    int iOrdinal = uVar.ordinal();
                    int i102 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i102 = 2;
                    }
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        Bc.a aVar = (Bc.a) c4584g.f48112a.f5569a.get("EXPOSURE_LOCK");
                        aVar.f1667b = i102;
                        aVar.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0800p, 26), new C3641c(c0800p, 18));
                    } catch (Exception e7) {
                        s1.h(e7, c0800p);
                    }
                }

                private final void b(Object obj2, C1521a c1521a) {
                    w0 w0Var;
                    ArrayList arrayList = new ArrayList();
                    z zVar = (z) ((ArrayList) obj2).get(0);
                    C0801q c0801q = new C0801q(arrayList, c1521a, 22);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        w0 w0Var2 = null;
                        if (zVar == null) {
                            w0Var = null;
                        } else {
                            w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                        }
                        Dc.a aVarC = c4584g.f48112a.c();
                        if (w0Var != null && ((Double) w0Var.f46405a) != null && ((Double) w0Var.f46406b) != null) {
                            w0Var2 = w0Var;
                        }
                        aVarC.f2631c = w0Var2;
                        aVarC.b();
                        aVarC.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0801q, 22), new C3641c(c0801q, 14));
                    } catch (Exception e7) {
                        s1.h(e7, c0801q);
                    }
                }

                private final void c(Object obj2, C1521a c1521a) {
                    s1 s1Var2 = s1Var;
                    ArrayList arrayList = new ArrayList();
                    try {
                        Cc.a aVarB = ((C4584g) s1Var2.f43902g).f48112a.b();
                        arrayList.add(0, Double.valueOf(aVarB.b() * (((Range) ((CameraCharacteristics) aVarB.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r1.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = Fe.b.V(th);
                    }
                    c1521a.c(arrayList);
                }

                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listU;
                    int i102;
                    int i112 = 23;
                    int i122 = 21;
                    int i132 = 24;
                    int i142 = 3;
                    int i152 = 2;
                    int i162 = 1;
                    w0 w0Var = null;
                    s1 s1Var2 = s1Var;
                    int i172 = 0;
                    switch (i31) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                Activity activity = (Activity) s1Var2.f43896a;
                                if (activity == null) {
                                    listU = Collections.EMPTY_LIST;
                                } else {
                                    try {
                                        listU = Ba.c.u(activity);
                                    } catch (CameraAccessException e7) {
                                        throw new RuntimeException(e7);
                                    }
                                }
                                arrayList.add(0, listU);
                            } catch (Throwable th) {
                                arrayList = Fe.b.V(th);
                            }
                            c1521a.c(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            C0799o c0799o = new C0799o(arrayList2, c1521a, 22);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g = (C4584g) s1Var2.f43902g;
                                double dDoubleValue = d3.doubleValue();
                                Cc.a aVarB = c4584g.f48112a.b();
                                aVarB.f1982b = dDoubleValue / aVarB.b();
                                aVarB.a(c4584g.f48129s);
                                c4584g.h(new RunnableC4579b(i172, c0799o, aVarB), new C3641c(c0799o, 17));
                                return;
                            } catch (Exception e10) {
                                s1.g(e10, c0799o);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            y yVar = (y) arrayList4.get(1);
                            C0800p c0800p = new C0800p(arrayList3, c1521a, 22);
                            C4584g c4584g2 = (C4584g) s1Var2.f43902g;
                            if (c4584g2 != null) {
                                c4584g2.a();
                            }
                            boolean zBooleanValue = yVar.f48194e.booleanValue();
                            Y y10 = new Y(s1Var2, c0800p, str, yVar);
                            C4026b c4026b = (C4026b) s1Var2.f43898c;
                            if (c4026b.f45322b) {
                                y10.c("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            Activity activity2 = (Activity) s1Var2.f43896a;
                            if (Y0.e.checkSelfPermission(activity2, "android.permission.CAMERA") == 0 && (!zBooleanValue || Y0.e.checkSelfPermission(activity2, "android.permission.RECORD_AUDIO") == 0)) {
                                y10.c(null, null);
                                return;
                            }
                            ((s1) ((InterfaceC3965b) ((C3641c) s1Var2.f43899d).f41267b)).d(new Yc.g(new aa.f(27, c4026b, y10)));
                            c4026b.f45322b = true;
                            AbstractC1274b.a(activity2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            w wVar = (w) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g3 = (C4584g) s1Var2.f43902g;
                                int iOrdinal = wVar.ordinal();
                                if (iOrdinal == 0) {
                                    i152 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c4584g3.l(i152);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = Fe.b.V(th2);
                            }
                            c1521a.c(arrayList5);
                            return;
                        case 4:
                            ArrayList arrayList6 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            C0800p c0800p2 = new C0800p(arrayList6, c1521a, i132);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g4 = (C4584g) s1Var2.f43902g;
                                if (zVar != null) {
                                    w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                                }
                                c4584g4.m(c0800p2, w0Var);
                                return;
                            } catch (Exception e11) {
                                s1.h(e11, c0800p2);
                                return;
                            }
                        case 5:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6730f.floatValue()));
                            } catch (Throwable th3) {
                                arrayList7 = Fe.b.V(th3);
                            }
                            c1521a.c(arrayList7);
                            return;
                        case 6:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6729e.floatValue()));
                            } catch (Throwable th4) {
                                arrayList8 = Fe.b.V(th4);
                            }
                            c1521a.c(arrayList8);
                            return;
                        case 7:
                            ArrayList arrayList9 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj2).get(0);
                            C0801q c0801q = new C0801q(arrayList9, c1521a, i112);
                            C4584g c4584g5 = (C4584g) s1Var2.f43902g;
                            float fFloatValue = d5.floatValue();
                            Kc.a aVarG = c4584g5.f48112a.g();
                            Float f10 = aVarG.f6730f;
                            float fFloatValue2 = f10.floatValue();
                            Float f11 = aVarG.f6729e;
                            float fFloatValue3 = f11.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                c0801q.c(new C4592o("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f11, f10), null));
                                return;
                            }
                            aVarG.f6728d = Float.valueOf(fFloatValue);
                            aVarG.a(c4584g5.f48129s);
                            c4584g5.h(new RunnableC3307c(c0801q, i112), new C3641c(c0801q, 15));
                            return;
                        case 8:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th5) {
                                arrayList10 = Fe.b.V(th5);
                            }
                            try {
                                C4584g c4584g6 = (C4584g) s1Var2.f43902g;
                                if (!c4584g6.f48132v) {
                                    c4584g6.f48132v = true;
                                    CameraCaptureSession cameraCaptureSession = c4584g6.f48126p;
                                    if (cameraCaptureSession != null) {
                                        cameraCaptureSession.stopRepeating();
                                    }
                                }
                                arrayList10.add(0, null);
                                c1521a.c(arrayList10);
                                return;
                            } catch (CameraAccessException e12) {
                                throw new C4592o("CameraAccessException", e12.getMessage(), null);
                            }
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C4584g c4584g7 = (C4584g) s1Var2.f43902g;
                                c4584g7.f48132v = false;
                                c4584g7.h(null, new C4580c(c4584g7, i172));
                                arrayList11.add(0, null);
                            } catch (Throwable th6) {
                                arrayList11 = Fe.b.V(th6);
                            }
                            c1521a.c(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                s1Var2.getClass();
                                try {
                                    ((C4584g) s1Var2.f43902g).j(new t6.q(str2, (CameraManager) ((Activity) s1Var2.f43896a).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e13) {
                                    throw new C4592o("CameraAccessException", e13.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = Fe.b.V(th7);
                            }
                            c1521a.c(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C4584g c4584g8 = (C4584g) s1Var2.f43902g;
                                if (c4584g8.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g8.f48130t.resume();
                                    } catch (IllegalStateException e14) {
                                        throw new C4592o("videoRecordingFailed", e14.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = Fe.b.V(th8);
                            }
                            c1521a.c(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                s1Var2.i((x) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                            } catch (Throwable th9) {
                                arrayList14 = Fe.b.V(th9);
                            }
                            c1521a.c(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C4584g c4584g9 = (C4584g) s1Var2.f43902g;
                                if (c4584g9 != null) {
                                    Log.i("Camera", "dispose");
                                    c4584g9.a();
                                    c4584g9.f48116e.release();
                                    Jc.a aVar = c4584g9.f48112a.f().f6005c;
                                    V1 v1 = aVar.f6003f;
                                    if (v1 != null) {
                                        aVar.f5998a.unregisterReceiver(v1);
                                        aVar.f6003f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                            } catch (Throwable th10) {
                                arrayList15 = Fe.b.V(th10);
                            }
                            c1521a.c(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g10 = (C4584g) s1Var2.f43902g;
                                int iOrdinal2 = tVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        i162 = 2;
                                    } else if (iOrdinal2 == 2) {
                                        i162 = 3;
                                    } else {
                                        if (iOrdinal2 != 3) {
                                            throw new IllegalStateException("Unreachable code");
                                        }
                                        i162 = 4;
                                    }
                                }
                                c4584g10.f48112a.f().f6006d = i162;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = Fe.b.V(th11);
                            }
                            c1521a.c(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C4584g) s1Var2.f43902g).f48112a.f().f6006d = 0;
                                arrayList17.add(0, null);
                            } catch (Throwable th12) {
                                arrayList17 = Fe.b.V(th12);
                            }
                            c1521a.c(arrayList17);
                            return;
                        case 16:
                            C0801q c0801q2 = new C0801q(new ArrayList(), c1521a, i122);
                            C4584g c4584g11 = (C4584g) s1Var2.f43902g;
                            C4585h c4585h = c4584g11.f48122l;
                            if (c4585h.f48138b != 1) {
                                c0801q2.c(new C4592o("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c4584g11.f48136z = c0801q2;
                            try {
                                c4584g11.f48133w = File.createTempFile("CAP", ".jpg", c4584g11.f48118g.getCacheDir());
                                S3.s sVar = c4584g11.f48134x;
                                sVar.getClass();
                                sVar.f11009b = new J5.n(2);
                                sVar.f11010c = new J5.n(2);
                                c4584g11.f48127q.setOnImageAvailableListener(c4584g11, c4584g11.f48123m);
                                Ac.a aVar2 = (Ac.a) c4584g11.f48112a.f5569a.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1257b != 1) {
                                    c4584g11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c4585h.f48138b = 2;
                                c4584g11.d();
                                return;
                            } catch (IOException | SecurityException e15) {
                                c4584g11.f48119h.l(c4584g11.f48136z, "cannotCreateFile", e15.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                s1Var2.n((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                            } catch (Throwable th13) {
                                arrayList18 = Fe.b.V(th13);
                            }
                            c1521a.c(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, s1Var2.o());
                            } catch (Throwable th14) {
                                arrayList19 = Fe.b.V(th14);
                            }
                            c1521a.c(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C4584g c4584g12 = (C4584g) s1Var2.f43902g;
                                if (c4584g12.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g12.f48130t.pause();
                                    } catch (IllegalStateException e16) {
                                        throw new C4592o("videoRecordingFailed", e16.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = Fe.b.V(th15);
                            }
                            c1521a.c(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th16) {
                                arrayList21 = Fe.b.V(th16);
                            }
                            try {
                                C4584g c4584g13 = (C4584g) s1Var2.f43902g;
                                C4273j c4273j = (C4273j) s1Var2.f43901f;
                                c4584g13.getClass();
                                c4273j.a(new Wa.d(c4584g13, i142));
                                c4584g13.o(false, true);
                                Log.i("Camera", "startPreviewWithImageStream");
                                arrayList21.add(0, null);
                                c1521a.c(arrayList21);
                                return;
                            } catch (CameraAccessException e17) {
                                throw new C4592o("CameraAccessException", e17.getMessage(), null);
                            }
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th17) {
                                arrayList22 = Fe.b.V(th17);
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).p(null);
                                arrayList22.add(0, null);
                                c1521a.c(arrayList22);
                                return;
                            } catch (Exception e18) {
                                throw new C4592o(e18.getClass().getName(), e18.getMessage(), null);
                            }
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj2).get(0);
                            C0799o c0799o2 = new C0799o(arrayList23, c1521a, i122);
                            s1Var2.getClass();
                            int iOrdinal3 = vVar.ordinal();
                            if (iOrdinal3 == 0) {
                                i102 = 1;
                            } else if (iOrdinal3 == 1) {
                                i102 = 2;
                            } else if (iOrdinal3 == 2) {
                                i102 = 3;
                            } else {
                                if (iOrdinal3 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                i102 = 4;
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).k(c0799o2, i102);
                                return;
                            } catch (Exception e19) {
                                s1.h(e19, c0799o2);
                                return;
                            }
                        case 23:
                            a(obj2, c1521a);
                            return;
                        case 24:
                            b(obj2, c1521a);
                            return;
                        case 25:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                Cc.a aVarB2 = ((C4584g) s1Var2.f43902g).f48112a.b();
                                arrayList24.add(0, Double.valueOf(aVarB2.b() * (((Range) ((CameraCharacteristics) aVarB2.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r4.getLower()).intValue())));
                            } catch (Throwable th18) {
                                arrayList24 = Fe.b.V(th18);
                            }
                            c1521a.c(arrayList24);
                            return;
                        case 26:
                            c(obj2, c1521a);
                            return;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            try {
                                arrayList25.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.b().b()));
                            } catch (Throwable th19) {
                                arrayList25 = Fe.b.V(th19);
                            }
                            c1521a.c(arrayList25);
                            return;
                    }
                }
            });
        } else {
            x724.n(null);
        }
        p pVar10 = p.f48158d;
        X7 x725 = new X7(interfaceC4269f, pVar, obj, "dev.flutter.pigeon.camera_android.CameraApi.getMinZoomLevel");
        if (s1Var != null) {
            final int i32 = 6;
            x725.n(new InterfaceC4265b() { // from class: yc.n
                private final void a(Object obj2, C1521a c1521a) {
                    ArrayList arrayList = new ArrayList();
                    u uVar = (u) ((ArrayList) obj2).get(0);
                    C0800p c0800p = new C0800p(arrayList, c1521a, 23);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    int iOrdinal = uVar.ordinal();
                    int i102 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i102 = 2;
                    }
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        Bc.a aVar = (Bc.a) c4584g.f48112a.f5569a.get("EXPOSURE_LOCK");
                        aVar.f1667b = i102;
                        aVar.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0800p, 26), new C3641c(c0800p, 18));
                    } catch (Exception e7) {
                        s1.h(e7, c0800p);
                    }
                }

                private final void b(Object obj2, C1521a c1521a) {
                    w0 w0Var;
                    ArrayList arrayList = new ArrayList();
                    z zVar = (z) ((ArrayList) obj2).get(0);
                    C0801q c0801q = new C0801q(arrayList, c1521a, 22);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        w0 w0Var2 = null;
                        if (zVar == null) {
                            w0Var = null;
                        } else {
                            w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                        }
                        Dc.a aVarC = c4584g.f48112a.c();
                        if (w0Var != null && ((Double) w0Var.f46405a) != null && ((Double) w0Var.f46406b) != null) {
                            w0Var2 = w0Var;
                        }
                        aVarC.f2631c = w0Var2;
                        aVarC.b();
                        aVarC.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0801q, 22), new C3641c(c0801q, 14));
                    } catch (Exception e7) {
                        s1.h(e7, c0801q);
                    }
                }

                private final void c(Object obj2, C1521a c1521a) {
                    s1 s1Var2 = s1Var;
                    ArrayList arrayList = new ArrayList();
                    try {
                        Cc.a aVarB = ((C4584g) s1Var2.f43902g).f48112a.b();
                        arrayList.add(0, Double.valueOf(aVarB.b() * (((Range) ((CameraCharacteristics) aVarB.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r1.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = Fe.b.V(th);
                    }
                    c1521a.c(arrayList);
                }

                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listU;
                    int i102;
                    int i112 = 23;
                    int i122 = 21;
                    int i132 = 24;
                    int i142 = 3;
                    int i152 = 2;
                    int i162 = 1;
                    w0 w0Var = null;
                    s1 s1Var2 = s1Var;
                    int i172 = 0;
                    switch (i32) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                Activity activity = (Activity) s1Var2.f43896a;
                                if (activity == null) {
                                    listU = Collections.EMPTY_LIST;
                                } else {
                                    try {
                                        listU = Ba.c.u(activity);
                                    } catch (CameraAccessException e7) {
                                        throw new RuntimeException(e7);
                                    }
                                }
                                arrayList.add(0, listU);
                            } catch (Throwable th) {
                                arrayList = Fe.b.V(th);
                            }
                            c1521a.c(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            C0799o c0799o = new C0799o(arrayList2, c1521a, 22);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g = (C4584g) s1Var2.f43902g;
                                double dDoubleValue = d3.doubleValue();
                                Cc.a aVarB = c4584g.f48112a.b();
                                aVarB.f1982b = dDoubleValue / aVarB.b();
                                aVarB.a(c4584g.f48129s);
                                c4584g.h(new RunnableC4579b(i172, c0799o, aVarB), new C3641c(c0799o, 17));
                                return;
                            } catch (Exception e10) {
                                s1.g(e10, c0799o);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            y yVar = (y) arrayList4.get(1);
                            C0800p c0800p = new C0800p(arrayList3, c1521a, 22);
                            C4584g c4584g2 = (C4584g) s1Var2.f43902g;
                            if (c4584g2 != null) {
                                c4584g2.a();
                            }
                            boolean zBooleanValue = yVar.f48194e.booleanValue();
                            Y y10 = new Y(s1Var2, c0800p, str, yVar);
                            C4026b c4026b = (C4026b) s1Var2.f43898c;
                            if (c4026b.f45322b) {
                                y10.c("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            Activity activity2 = (Activity) s1Var2.f43896a;
                            if (Y0.e.checkSelfPermission(activity2, "android.permission.CAMERA") == 0 && (!zBooleanValue || Y0.e.checkSelfPermission(activity2, "android.permission.RECORD_AUDIO") == 0)) {
                                y10.c(null, null);
                                return;
                            }
                            ((s1) ((InterfaceC3965b) ((C3641c) s1Var2.f43899d).f41267b)).d(new Yc.g(new aa.f(27, c4026b, y10)));
                            c4026b.f45322b = true;
                            AbstractC1274b.a(activity2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            w wVar = (w) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g3 = (C4584g) s1Var2.f43902g;
                                int iOrdinal = wVar.ordinal();
                                if (iOrdinal == 0) {
                                    i152 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c4584g3.l(i152);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = Fe.b.V(th2);
                            }
                            c1521a.c(arrayList5);
                            return;
                        case 4:
                            ArrayList arrayList6 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            C0800p c0800p2 = new C0800p(arrayList6, c1521a, i132);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g4 = (C4584g) s1Var2.f43902g;
                                if (zVar != null) {
                                    w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                                }
                                c4584g4.m(c0800p2, w0Var);
                                return;
                            } catch (Exception e11) {
                                s1.h(e11, c0800p2);
                                return;
                            }
                        case 5:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6730f.floatValue()));
                            } catch (Throwable th3) {
                                arrayList7 = Fe.b.V(th3);
                            }
                            c1521a.c(arrayList7);
                            return;
                        case 6:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6729e.floatValue()));
                            } catch (Throwable th4) {
                                arrayList8 = Fe.b.V(th4);
                            }
                            c1521a.c(arrayList8);
                            return;
                        case 7:
                            ArrayList arrayList9 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj2).get(0);
                            C0801q c0801q = new C0801q(arrayList9, c1521a, i112);
                            C4584g c4584g5 = (C4584g) s1Var2.f43902g;
                            float fFloatValue = d5.floatValue();
                            Kc.a aVarG = c4584g5.f48112a.g();
                            Float f10 = aVarG.f6730f;
                            float fFloatValue2 = f10.floatValue();
                            Float f11 = aVarG.f6729e;
                            float fFloatValue3 = f11.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                c0801q.c(new C4592o("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f11, f10), null));
                                return;
                            }
                            aVarG.f6728d = Float.valueOf(fFloatValue);
                            aVarG.a(c4584g5.f48129s);
                            c4584g5.h(new RunnableC3307c(c0801q, i112), new C3641c(c0801q, 15));
                            return;
                        case 8:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th5) {
                                arrayList10 = Fe.b.V(th5);
                            }
                            try {
                                C4584g c4584g6 = (C4584g) s1Var2.f43902g;
                                if (!c4584g6.f48132v) {
                                    c4584g6.f48132v = true;
                                    CameraCaptureSession cameraCaptureSession = c4584g6.f48126p;
                                    if (cameraCaptureSession != null) {
                                        cameraCaptureSession.stopRepeating();
                                    }
                                }
                                arrayList10.add(0, null);
                                c1521a.c(arrayList10);
                                return;
                            } catch (CameraAccessException e12) {
                                throw new C4592o("CameraAccessException", e12.getMessage(), null);
                            }
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C4584g c4584g7 = (C4584g) s1Var2.f43902g;
                                c4584g7.f48132v = false;
                                c4584g7.h(null, new C4580c(c4584g7, i172));
                                arrayList11.add(0, null);
                            } catch (Throwable th6) {
                                arrayList11 = Fe.b.V(th6);
                            }
                            c1521a.c(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                s1Var2.getClass();
                                try {
                                    ((C4584g) s1Var2.f43902g).j(new t6.q(str2, (CameraManager) ((Activity) s1Var2.f43896a).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e13) {
                                    throw new C4592o("CameraAccessException", e13.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = Fe.b.V(th7);
                            }
                            c1521a.c(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C4584g c4584g8 = (C4584g) s1Var2.f43902g;
                                if (c4584g8.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g8.f48130t.resume();
                                    } catch (IllegalStateException e14) {
                                        throw new C4592o("videoRecordingFailed", e14.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = Fe.b.V(th8);
                            }
                            c1521a.c(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                s1Var2.i((x) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                            } catch (Throwable th9) {
                                arrayList14 = Fe.b.V(th9);
                            }
                            c1521a.c(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C4584g c4584g9 = (C4584g) s1Var2.f43902g;
                                if (c4584g9 != null) {
                                    Log.i("Camera", "dispose");
                                    c4584g9.a();
                                    c4584g9.f48116e.release();
                                    Jc.a aVar = c4584g9.f48112a.f().f6005c;
                                    V1 v1 = aVar.f6003f;
                                    if (v1 != null) {
                                        aVar.f5998a.unregisterReceiver(v1);
                                        aVar.f6003f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                            } catch (Throwable th10) {
                                arrayList15 = Fe.b.V(th10);
                            }
                            c1521a.c(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g10 = (C4584g) s1Var2.f43902g;
                                int iOrdinal2 = tVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        i162 = 2;
                                    } else if (iOrdinal2 == 2) {
                                        i162 = 3;
                                    } else {
                                        if (iOrdinal2 != 3) {
                                            throw new IllegalStateException("Unreachable code");
                                        }
                                        i162 = 4;
                                    }
                                }
                                c4584g10.f48112a.f().f6006d = i162;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = Fe.b.V(th11);
                            }
                            c1521a.c(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C4584g) s1Var2.f43902g).f48112a.f().f6006d = 0;
                                arrayList17.add(0, null);
                            } catch (Throwable th12) {
                                arrayList17 = Fe.b.V(th12);
                            }
                            c1521a.c(arrayList17);
                            return;
                        case 16:
                            C0801q c0801q2 = new C0801q(new ArrayList(), c1521a, i122);
                            C4584g c4584g11 = (C4584g) s1Var2.f43902g;
                            C4585h c4585h = c4584g11.f48122l;
                            if (c4585h.f48138b != 1) {
                                c0801q2.c(new C4592o("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c4584g11.f48136z = c0801q2;
                            try {
                                c4584g11.f48133w = File.createTempFile("CAP", ".jpg", c4584g11.f48118g.getCacheDir());
                                S3.s sVar = c4584g11.f48134x;
                                sVar.getClass();
                                sVar.f11009b = new J5.n(2);
                                sVar.f11010c = new J5.n(2);
                                c4584g11.f48127q.setOnImageAvailableListener(c4584g11, c4584g11.f48123m);
                                Ac.a aVar2 = (Ac.a) c4584g11.f48112a.f5569a.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1257b != 1) {
                                    c4584g11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c4585h.f48138b = 2;
                                c4584g11.d();
                                return;
                            } catch (IOException | SecurityException e15) {
                                c4584g11.f48119h.l(c4584g11.f48136z, "cannotCreateFile", e15.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                s1Var2.n((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                            } catch (Throwable th13) {
                                arrayList18 = Fe.b.V(th13);
                            }
                            c1521a.c(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, s1Var2.o());
                            } catch (Throwable th14) {
                                arrayList19 = Fe.b.V(th14);
                            }
                            c1521a.c(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C4584g c4584g12 = (C4584g) s1Var2.f43902g;
                                if (c4584g12.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g12.f48130t.pause();
                                    } catch (IllegalStateException e16) {
                                        throw new C4592o("videoRecordingFailed", e16.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = Fe.b.V(th15);
                            }
                            c1521a.c(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th16) {
                                arrayList21 = Fe.b.V(th16);
                            }
                            try {
                                C4584g c4584g13 = (C4584g) s1Var2.f43902g;
                                C4273j c4273j = (C4273j) s1Var2.f43901f;
                                c4584g13.getClass();
                                c4273j.a(new Wa.d(c4584g13, i142));
                                c4584g13.o(false, true);
                                Log.i("Camera", "startPreviewWithImageStream");
                                arrayList21.add(0, null);
                                c1521a.c(arrayList21);
                                return;
                            } catch (CameraAccessException e17) {
                                throw new C4592o("CameraAccessException", e17.getMessage(), null);
                            }
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th17) {
                                arrayList22 = Fe.b.V(th17);
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).p(null);
                                arrayList22.add(0, null);
                                c1521a.c(arrayList22);
                                return;
                            } catch (Exception e18) {
                                throw new C4592o(e18.getClass().getName(), e18.getMessage(), null);
                            }
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj2).get(0);
                            C0799o c0799o2 = new C0799o(arrayList23, c1521a, i122);
                            s1Var2.getClass();
                            int iOrdinal3 = vVar.ordinal();
                            if (iOrdinal3 == 0) {
                                i102 = 1;
                            } else if (iOrdinal3 == 1) {
                                i102 = 2;
                            } else if (iOrdinal3 == 2) {
                                i102 = 3;
                            } else {
                                if (iOrdinal3 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                i102 = 4;
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).k(c0799o2, i102);
                                return;
                            } catch (Exception e19) {
                                s1.h(e19, c0799o2);
                                return;
                            }
                        case 23:
                            a(obj2, c1521a);
                            return;
                        case 24:
                            b(obj2, c1521a);
                            return;
                        case 25:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                Cc.a aVarB2 = ((C4584g) s1Var2.f43902g).f48112a.b();
                                arrayList24.add(0, Double.valueOf(aVarB2.b() * (((Range) ((CameraCharacteristics) aVarB2.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r4.getLower()).intValue())));
                            } catch (Throwable th18) {
                                arrayList24 = Fe.b.V(th18);
                            }
                            c1521a.c(arrayList24);
                            return;
                        case 26:
                            c(obj2, c1521a);
                            return;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            try {
                                arrayList25.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.b().b()));
                            } catch (Throwable th19) {
                                arrayList25 = Fe.b.V(th19);
                            }
                            c1521a.c(arrayList25);
                            return;
                    }
                }
            });
        } else {
            x725.n(null);
        }
        p pVar11 = p.f48158d;
        X7 x726 = new X7(interfaceC4269f, pVar, obj, "dev.flutter.pigeon.camera_android.CameraApi.setZoomLevel");
        if (s1Var != null) {
            final int i33 = 7;
            x726.n(new InterfaceC4265b() { // from class: yc.n
                private final void a(Object obj2, C1521a c1521a) {
                    ArrayList arrayList = new ArrayList();
                    u uVar = (u) ((ArrayList) obj2).get(0);
                    C0800p c0800p = new C0800p(arrayList, c1521a, 23);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    int iOrdinal = uVar.ordinal();
                    int i102 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i102 = 2;
                    }
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        Bc.a aVar = (Bc.a) c4584g.f48112a.f5569a.get("EXPOSURE_LOCK");
                        aVar.f1667b = i102;
                        aVar.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0800p, 26), new C3641c(c0800p, 18));
                    } catch (Exception e7) {
                        s1.h(e7, c0800p);
                    }
                }

                private final void b(Object obj2, C1521a c1521a) {
                    w0 w0Var;
                    ArrayList arrayList = new ArrayList();
                    z zVar = (z) ((ArrayList) obj2).get(0);
                    C0801q c0801q = new C0801q(arrayList, c1521a, 22);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        w0 w0Var2 = null;
                        if (zVar == null) {
                            w0Var = null;
                        } else {
                            w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                        }
                        Dc.a aVarC = c4584g.f48112a.c();
                        if (w0Var != null && ((Double) w0Var.f46405a) != null && ((Double) w0Var.f46406b) != null) {
                            w0Var2 = w0Var;
                        }
                        aVarC.f2631c = w0Var2;
                        aVarC.b();
                        aVarC.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0801q, 22), new C3641c(c0801q, 14));
                    } catch (Exception e7) {
                        s1.h(e7, c0801q);
                    }
                }

                private final void c(Object obj2, C1521a c1521a) {
                    s1 s1Var2 = s1Var;
                    ArrayList arrayList = new ArrayList();
                    try {
                        Cc.a aVarB = ((C4584g) s1Var2.f43902g).f48112a.b();
                        arrayList.add(0, Double.valueOf(aVarB.b() * (((Range) ((CameraCharacteristics) aVarB.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r1.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = Fe.b.V(th);
                    }
                    c1521a.c(arrayList);
                }

                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listU;
                    int i102;
                    int i112 = 23;
                    int i122 = 21;
                    int i132 = 24;
                    int i142 = 3;
                    int i152 = 2;
                    int i162 = 1;
                    w0 w0Var = null;
                    s1 s1Var2 = s1Var;
                    int i172 = 0;
                    switch (i33) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                Activity activity = (Activity) s1Var2.f43896a;
                                if (activity == null) {
                                    listU = Collections.EMPTY_LIST;
                                } else {
                                    try {
                                        listU = Ba.c.u(activity);
                                    } catch (CameraAccessException e7) {
                                        throw new RuntimeException(e7);
                                    }
                                }
                                arrayList.add(0, listU);
                            } catch (Throwable th) {
                                arrayList = Fe.b.V(th);
                            }
                            c1521a.c(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            C0799o c0799o = new C0799o(arrayList2, c1521a, 22);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g = (C4584g) s1Var2.f43902g;
                                double dDoubleValue = d3.doubleValue();
                                Cc.a aVarB = c4584g.f48112a.b();
                                aVarB.f1982b = dDoubleValue / aVarB.b();
                                aVarB.a(c4584g.f48129s);
                                c4584g.h(new RunnableC4579b(i172, c0799o, aVarB), new C3641c(c0799o, 17));
                                return;
                            } catch (Exception e10) {
                                s1.g(e10, c0799o);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            y yVar = (y) arrayList4.get(1);
                            C0800p c0800p = new C0800p(arrayList3, c1521a, 22);
                            C4584g c4584g2 = (C4584g) s1Var2.f43902g;
                            if (c4584g2 != null) {
                                c4584g2.a();
                            }
                            boolean zBooleanValue = yVar.f48194e.booleanValue();
                            Y y10 = new Y(s1Var2, c0800p, str, yVar);
                            C4026b c4026b = (C4026b) s1Var2.f43898c;
                            if (c4026b.f45322b) {
                                y10.c("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            Activity activity2 = (Activity) s1Var2.f43896a;
                            if (Y0.e.checkSelfPermission(activity2, "android.permission.CAMERA") == 0 && (!zBooleanValue || Y0.e.checkSelfPermission(activity2, "android.permission.RECORD_AUDIO") == 0)) {
                                y10.c(null, null);
                                return;
                            }
                            ((s1) ((InterfaceC3965b) ((C3641c) s1Var2.f43899d).f41267b)).d(new Yc.g(new aa.f(27, c4026b, y10)));
                            c4026b.f45322b = true;
                            AbstractC1274b.a(activity2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            w wVar = (w) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g3 = (C4584g) s1Var2.f43902g;
                                int iOrdinal = wVar.ordinal();
                                if (iOrdinal == 0) {
                                    i152 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c4584g3.l(i152);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = Fe.b.V(th2);
                            }
                            c1521a.c(arrayList5);
                            return;
                        case 4:
                            ArrayList arrayList6 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            C0800p c0800p2 = new C0800p(arrayList6, c1521a, i132);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g4 = (C4584g) s1Var2.f43902g;
                                if (zVar != null) {
                                    w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                                }
                                c4584g4.m(c0800p2, w0Var);
                                return;
                            } catch (Exception e11) {
                                s1.h(e11, c0800p2);
                                return;
                            }
                        case 5:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6730f.floatValue()));
                            } catch (Throwable th3) {
                                arrayList7 = Fe.b.V(th3);
                            }
                            c1521a.c(arrayList7);
                            return;
                        case 6:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6729e.floatValue()));
                            } catch (Throwable th4) {
                                arrayList8 = Fe.b.V(th4);
                            }
                            c1521a.c(arrayList8);
                            return;
                        case 7:
                            ArrayList arrayList9 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj2).get(0);
                            C0801q c0801q = new C0801q(arrayList9, c1521a, i112);
                            C4584g c4584g5 = (C4584g) s1Var2.f43902g;
                            float fFloatValue = d5.floatValue();
                            Kc.a aVarG = c4584g5.f48112a.g();
                            Float f10 = aVarG.f6730f;
                            float fFloatValue2 = f10.floatValue();
                            Float f11 = aVarG.f6729e;
                            float fFloatValue3 = f11.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                c0801q.c(new C4592o("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f11, f10), null));
                                return;
                            }
                            aVarG.f6728d = Float.valueOf(fFloatValue);
                            aVarG.a(c4584g5.f48129s);
                            c4584g5.h(new RunnableC3307c(c0801q, i112), new C3641c(c0801q, 15));
                            return;
                        case 8:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th5) {
                                arrayList10 = Fe.b.V(th5);
                            }
                            try {
                                C4584g c4584g6 = (C4584g) s1Var2.f43902g;
                                if (!c4584g6.f48132v) {
                                    c4584g6.f48132v = true;
                                    CameraCaptureSession cameraCaptureSession = c4584g6.f48126p;
                                    if (cameraCaptureSession != null) {
                                        cameraCaptureSession.stopRepeating();
                                    }
                                }
                                arrayList10.add(0, null);
                                c1521a.c(arrayList10);
                                return;
                            } catch (CameraAccessException e12) {
                                throw new C4592o("CameraAccessException", e12.getMessage(), null);
                            }
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C4584g c4584g7 = (C4584g) s1Var2.f43902g;
                                c4584g7.f48132v = false;
                                c4584g7.h(null, new C4580c(c4584g7, i172));
                                arrayList11.add(0, null);
                            } catch (Throwable th6) {
                                arrayList11 = Fe.b.V(th6);
                            }
                            c1521a.c(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                s1Var2.getClass();
                                try {
                                    ((C4584g) s1Var2.f43902g).j(new t6.q(str2, (CameraManager) ((Activity) s1Var2.f43896a).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e13) {
                                    throw new C4592o("CameraAccessException", e13.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = Fe.b.V(th7);
                            }
                            c1521a.c(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C4584g c4584g8 = (C4584g) s1Var2.f43902g;
                                if (c4584g8.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g8.f48130t.resume();
                                    } catch (IllegalStateException e14) {
                                        throw new C4592o("videoRecordingFailed", e14.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = Fe.b.V(th8);
                            }
                            c1521a.c(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                s1Var2.i((x) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                            } catch (Throwable th9) {
                                arrayList14 = Fe.b.V(th9);
                            }
                            c1521a.c(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C4584g c4584g9 = (C4584g) s1Var2.f43902g;
                                if (c4584g9 != null) {
                                    Log.i("Camera", "dispose");
                                    c4584g9.a();
                                    c4584g9.f48116e.release();
                                    Jc.a aVar = c4584g9.f48112a.f().f6005c;
                                    V1 v1 = aVar.f6003f;
                                    if (v1 != null) {
                                        aVar.f5998a.unregisterReceiver(v1);
                                        aVar.f6003f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                            } catch (Throwable th10) {
                                arrayList15 = Fe.b.V(th10);
                            }
                            c1521a.c(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g10 = (C4584g) s1Var2.f43902g;
                                int iOrdinal2 = tVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        i162 = 2;
                                    } else if (iOrdinal2 == 2) {
                                        i162 = 3;
                                    } else {
                                        if (iOrdinal2 != 3) {
                                            throw new IllegalStateException("Unreachable code");
                                        }
                                        i162 = 4;
                                    }
                                }
                                c4584g10.f48112a.f().f6006d = i162;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = Fe.b.V(th11);
                            }
                            c1521a.c(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C4584g) s1Var2.f43902g).f48112a.f().f6006d = 0;
                                arrayList17.add(0, null);
                            } catch (Throwable th12) {
                                arrayList17 = Fe.b.V(th12);
                            }
                            c1521a.c(arrayList17);
                            return;
                        case 16:
                            C0801q c0801q2 = new C0801q(new ArrayList(), c1521a, i122);
                            C4584g c4584g11 = (C4584g) s1Var2.f43902g;
                            C4585h c4585h = c4584g11.f48122l;
                            if (c4585h.f48138b != 1) {
                                c0801q2.c(new C4592o("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c4584g11.f48136z = c0801q2;
                            try {
                                c4584g11.f48133w = File.createTempFile("CAP", ".jpg", c4584g11.f48118g.getCacheDir());
                                S3.s sVar = c4584g11.f48134x;
                                sVar.getClass();
                                sVar.f11009b = new J5.n(2);
                                sVar.f11010c = new J5.n(2);
                                c4584g11.f48127q.setOnImageAvailableListener(c4584g11, c4584g11.f48123m);
                                Ac.a aVar2 = (Ac.a) c4584g11.f48112a.f5569a.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1257b != 1) {
                                    c4584g11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c4585h.f48138b = 2;
                                c4584g11.d();
                                return;
                            } catch (IOException | SecurityException e15) {
                                c4584g11.f48119h.l(c4584g11.f48136z, "cannotCreateFile", e15.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                s1Var2.n((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                            } catch (Throwable th13) {
                                arrayList18 = Fe.b.V(th13);
                            }
                            c1521a.c(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, s1Var2.o());
                            } catch (Throwable th14) {
                                arrayList19 = Fe.b.V(th14);
                            }
                            c1521a.c(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C4584g c4584g12 = (C4584g) s1Var2.f43902g;
                                if (c4584g12.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g12.f48130t.pause();
                                    } catch (IllegalStateException e16) {
                                        throw new C4592o("videoRecordingFailed", e16.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = Fe.b.V(th15);
                            }
                            c1521a.c(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th16) {
                                arrayList21 = Fe.b.V(th16);
                            }
                            try {
                                C4584g c4584g13 = (C4584g) s1Var2.f43902g;
                                C4273j c4273j = (C4273j) s1Var2.f43901f;
                                c4584g13.getClass();
                                c4273j.a(new Wa.d(c4584g13, i142));
                                c4584g13.o(false, true);
                                Log.i("Camera", "startPreviewWithImageStream");
                                arrayList21.add(0, null);
                                c1521a.c(arrayList21);
                                return;
                            } catch (CameraAccessException e17) {
                                throw new C4592o("CameraAccessException", e17.getMessage(), null);
                            }
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th17) {
                                arrayList22 = Fe.b.V(th17);
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).p(null);
                                arrayList22.add(0, null);
                                c1521a.c(arrayList22);
                                return;
                            } catch (Exception e18) {
                                throw new C4592o(e18.getClass().getName(), e18.getMessage(), null);
                            }
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj2).get(0);
                            C0799o c0799o2 = new C0799o(arrayList23, c1521a, i122);
                            s1Var2.getClass();
                            int iOrdinal3 = vVar.ordinal();
                            if (iOrdinal3 == 0) {
                                i102 = 1;
                            } else if (iOrdinal3 == 1) {
                                i102 = 2;
                            } else if (iOrdinal3 == 2) {
                                i102 = 3;
                            } else {
                                if (iOrdinal3 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                i102 = 4;
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).k(c0799o2, i102);
                                return;
                            } catch (Exception e19) {
                                s1.h(e19, c0799o2);
                                return;
                            }
                        case 23:
                            a(obj2, c1521a);
                            return;
                        case 24:
                            b(obj2, c1521a);
                            return;
                        case 25:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                Cc.a aVarB2 = ((C4584g) s1Var2.f43902g).f48112a.b();
                                arrayList24.add(0, Double.valueOf(aVarB2.b() * (((Range) ((CameraCharacteristics) aVarB2.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r4.getLower()).intValue())));
                            } catch (Throwable th18) {
                                arrayList24 = Fe.b.V(th18);
                            }
                            c1521a.c(arrayList24);
                            return;
                        case 26:
                            c(obj2, c1521a);
                            return;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            try {
                                arrayList25.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.b().b()));
                            } catch (Throwable th19) {
                                arrayList25 = Fe.b.V(th19);
                            }
                            c1521a.c(arrayList25);
                            return;
                    }
                }
            });
        } else {
            x726.n(null);
        }
        p pVar12 = p.f48158d;
        X7 x727 = new X7(interfaceC4269f, pVar, obj, "dev.flutter.pigeon.camera_android.CameraApi.pausePreview");
        if (s1Var != null) {
            final int i34 = 8;
            x727.n(new InterfaceC4265b() { // from class: yc.n
                private final void a(Object obj2, C1521a c1521a) {
                    ArrayList arrayList = new ArrayList();
                    u uVar = (u) ((ArrayList) obj2).get(0);
                    C0800p c0800p = new C0800p(arrayList, c1521a, 23);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    int iOrdinal = uVar.ordinal();
                    int i102 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i102 = 2;
                    }
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        Bc.a aVar = (Bc.a) c4584g.f48112a.f5569a.get("EXPOSURE_LOCK");
                        aVar.f1667b = i102;
                        aVar.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0800p, 26), new C3641c(c0800p, 18));
                    } catch (Exception e7) {
                        s1.h(e7, c0800p);
                    }
                }

                private final void b(Object obj2, C1521a c1521a) {
                    w0 w0Var;
                    ArrayList arrayList = new ArrayList();
                    z zVar = (z) ((ArrayList) obj2).get(0);
                    C0801q c0801q = new C0801q(arrayList, c1521a, 22);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        w0 w0Var2 = null;
                        if (zVar == null) {
                            w0Var = null;
                        } else {
                            w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                        }
                        Dc.a aVarC = c4584g.f48112a.c();
                        if (w0Var != null && ((Double) w0Var.f46405a) != null && ((Double) w0Var.f46406b) != null) {
                            w0Var2 = w0Var;
                        }
                        aVarC.f2631c = w0Var2;
                        aVarC.b();
                        aVarC.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0801q, 22), new C3641c(c0801q, 14));
                    } catch (Exception e7) {
                        s1.h(e7, c0801q);
                    }
                }

                private final void c(Object obj2, C1521a c1521a) {
                    s1 s1Var2 = s1Var;
                    ArrayList arrayList = new ArrayList();
                    try {
                        Cc.a aVarB = ((C4584g) s1Var2.f43902g).f48112a.b();
                        arrayList.add(0, Double.valueOf(aVarB.b() * (((Range) ((CameraCharacteristics) aVarB.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r1.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = Fe.b.V(th);
                    }
                    c1521a.c(arrayList);
                }

                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listU;
                    int i102;
                    int i112 = 23;
                    int i122 = 21;
                    int i132 = 24;
                    int i142 = 3;
                    int i152 = 2;
                    int i162 = 1;
                    w0 w0Var = null;
                    s1 s1Var2 = s1Var;
                    int i172 = 0;
                    switch (i34) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                Activity activity = (Activity) s1Var2.f43896a;
                                if (activity == null) {
                                    listU = Collections.EMPTY_LIST;
                                } else {
                                    try {
                                        listU = Ba.c.u(activity);
                                    } catch (CameraAccessException e7) {
                                        throw new RuntimeException(e7);
                                    }
                                }
                                arrayList.add(0, listU);
                            } catch (Throwable th) {
                                arrayList = Fe.b.V(th);
                            }
                            c1521a.c(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            C0799o c0799o = new C0799o(arrayList2, c1521a, 22);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g = (C4584g) s1Var2.f43902g;
                                double dDoubleValue = d3.doubleValue();
                                Cc.a aVarB = c4584g.f48112a.b();
                                aVarB.f1982b = dDoubleValue / aVarB.b();
                                aVarB.a(c4584g.f48129s);
                                c4584g.h(new RunnableC4579b(i172, c0799o, aVarB), new C3641c(c0799o, 17));
                                return;
                            } catch (Exception e10) {
                                s1.g(e10, c0799o);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            y yVar = (y) arrayList4.get(1);
                            C0800p c0800p = new C0800p(arrayList3, c1521a, 22);
                            C4584g c4584g2 = (C4584g) s1Var2.f43902g;
                            if (c4584g2 != null) {
                                c4584g2.a();
                            }
                            boolean zBooleanValue = yVar.f48194e.booleanValue();
                            Y y10 = new Y(s1Var2, c0800p, str, yVar);
                            C4026b c4026b = (C4026b) s1Var2.f43898c;
                            if (c4026b.f45322b) {
                                y10.c("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            Activity activity2 = (Activity) s1Var2.f43896a;
                            if (Y0.e.checkSelfPermission(activity2, "android.permission.CAMERA") == 0 && (!zBooleanValue || Y0.e.checkSelfPermission(activity2, "android.permission.RECORD_AUDIO") == 0)) {
                                y10.c(null, null);
                                return;
                            }
                            ((s1) ((InterfaceC3965b) ((C3641c) s1Var2.f43899d).f41267b)).d(new Yc.g(new aa.f(27, c4026b, y10)));
                            c4026b.f45322b = true;
                            AbstractC1274b.a(activity2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            w wVar = (w) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g3 = (C4584g) s1Var2.f43902g;
                                int iOrdinal = wVar.ordinal();
                                if (iOrdinal == 0) {
                                    i152 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c4584g3.l(i152);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = Fe.b.V(th2);
                            }
                            c1521a.c(arrayList5);
                            return;
                        case 4:
                            ArrayList arrayList6 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            C0800p c0800p2 = new C0800p(arrayList6, c1521a, i132);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g4 = (C4584g) s1Var2.f43902g;
                                if (zVar != null) {
                                    w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                                }
                                c4584g4.m(c0800p2, w0Var);
                                return;
                            } catch (Exception e11) {
                                s1.h(e11, c0800p2);
                                return;
                            }
                        case 5:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6730f.floatValue()));
                            } catch (Throwable th3) {
                                arrayList7 = Fe.b.V(th3);
                            }
                            c1521a.c(arrayList7);
                            return;
                        case 6:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6729e.floatValue()));
                            } catch (Throwable th4) {
                                arrayList8 = Fe.b.V(th4);
                            }
                            c1521a.c(arrayList8);
                            return;
                        case 7:
                            ArrayList arrayList9 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj2).get(0);
                            C0801q c0801q = new C0801q(arrayList9, c1521a, i112);
                            C4584g c4584g5 = (C4584g) s1Var2.f43902g;
                            float fFloatValue = d5.floatValue();
                            Kc.a aVarG = c4584g5.f48112a.g();
                            Float f10 = aVarG.f6730f;
                            float fFloatValue2 = f10.floatValue();
                            Float f11 = aVarG.f6729e;
                            float fFloatValue3 = f11.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                c0801q.c(new C4592o("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f11, f10), null));
                                return;
                            }
                            aVarG.f6728d = Float.valueOf(fFloatValue);
                            aVarG.a(c4584g5.f48129s);
                            c4584g5.h(new RunnableC3307c(c0801q, i112), new C3641c(c0801q, 15));
                            return;
                        case 8:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th5) {
                                arrayList10 = Fe.b.V(th5);
                            }
                            try {
                                C4584g c4584g6 = (C4584g) s1Var2.f43902g;
                                if (!c4584g6.f48132v) {
                                    c4584g6.f48132v = true;
                                    CameraCaptureSession cameraCaptureSession = c4584g6.f48126p;
                                    if (cameraCaptureSession != null) {
                                        cameraCaptureSession.stopRepeating();
                                    }
                                }
                                arrayList10.add(0, null);
                                c1521a.c(arrayList10);
                                return;
                            } catch (CameraAccessException e12) {
                                throw new C4592o("CameraAccessException", e12.getMessage(), null);
                            }
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C4584g c4584g7 = (C4584g) s1Var2.f43902g;
                                c4584g7.f48132v = false;
                                c4584g7.h(null, new C4580c(c4584g7, i172));
                                arrayList11.add(0, null);
                            } catch (Throwable th6) {
                                arrayList11 = Fe.b.V(th6);
                            }
                            c1521a.c(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                s1Var2.getClass();
                                try {
                                    ((C4584g) s1Var2.f43902g).j(new t6.q(str2, (CameraManager) ((Activity) s1Var2.f43896a).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e13) {
                                    throw new C4592o("CameraAccessException", e13.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = Fe.b.V(th7);
                            }
                            c1521a.c(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C4584g c4584g8 = (C4584g) s1Var2.f43902g;
                                if (c4584g8.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g8.f48130t.resume();
                                    } catch (IllegalStateException e14) {
                                        throw new C4592o("videoRecordingFailed", e14.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = Fe.b.V(th8);
                            }
                            c1521a.c(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                s1Var2.i((x) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                            } catch (Throwable th9) {
                                arrayList14 = Fe.b.V(th9);
                            }
                            c1521a.c(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C4584g c4584g9 = (C4584g) s1Var2.f43902g;
                                if (c4584g9 != null) {
                                    Log.i("Camera", "dispose");
                                    c4584g9.a();
                                    c4584g9.f48116e.release();
                                    Jc.a aVar = c4584g9.f48112a.f().f6005c;
                                    V1 v1 = aVar.f6003f;
                                    if (v1 != null) {
                                        aVar.f5998a.unregisterReceiver(v1);
                                        aVar.f6003f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                            } catch (Throwable th10) {
                                arrayList15 = Fe.b.V(th10);
                            }
                            c1521a.c(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g10 = (C4584g) s1Var2.f43902g;
                                int iOrdinal2 = tVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        i162 = 2;
                                    } else if (iOrdinal2 == 2) {
                                        i162 = 3;
                                    } else {
                                        if (iOrdinal2 != 3) {
                                            throw new IllegalStateException("Unreachable code");
                                        }
                                        i162 = 4;
                                    }
                                }
                                c4584g10.f48112a.f().f6006d = i162;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = Fe.b.V(th11);
                            }
                            c1521a.c(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C4584g) s1Var2.f43902g).f48112a.f().f6006d = 0;
                                arrayList17.add(0, null);
                            } catch (Throwable th12) {
                                arrayList17 = Fe.b.V(th12);
                            }
                            c1521a.c(arrayList17);
                            return;
                        case 16:
                            C0801q c0801q2 = new C0801q(new ArrayList(), c1521a, i122);
                            C4584g c4584g11 = (C4584g) s1Var2.f43902g;
                            C4585h c4585h = c4584g11.f48122l;
                            if (c4585h.f48138b != 1) {
                                c0801q2.c(new C4592o("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c4584g11.f48136z = c0801q2;
                            try {
                                c4584g11.f48133w = File.createTempFile("CAP", ".jpg", c4584g11.f48118g.getCacheDir());
                                S3.s sVar = c4584g11.f48134x;
                                sVar.getClass();
                                sVar.f11009b = new J5.n(2);
                                sVar.f11010c = new J5.n(2);
                                c4584g11.f48127q.setOnImageAvailableListener(c4584g11, c4584g11.f48123m);
                                Ac.a aVar2 = (Ac.a) c4584g11.f48112a.f5569a.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1257b != 1) {
                                    c4584g11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c4585h.f48138b = 2;
                                c4584g11.d();
                                return;
                            } catch (IOException | SecurityException e15) {
                                c4584g11.f48119h.l(c4584g11.f48136z, "cannotCreateFile", e15.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                s1Var2.n((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                            } catch (Throwable th13) {
                                arrayList18 = Fe.b.V(th13);
                            }
                            c1521a.c(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, s1Var2.o());
                            } catch (Throwable th14) {
                                arrayList19 = Fe.b.V(th14);
                            }
                            c1521a.c(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C4584g c4584g12 = (C4584g) s1Var2.f43902g;
                                if (c4584g12.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g12.f48130t.pause();
                                    } catch (IllegalStateException e16) {
                                        throw new C4592o("videoRecordingFailed", e16.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = Fe.b.V(th15);
                            }
                            c1521a.c(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th16) {
                                arrayList21 = Fe.b.V(th16);
                            }
                            try {
                                C4584g c4584g13 = (C4584g) s1Var2.f43902g;
                                C4273j c4273j = (C4273j) s1Var2.f43901f;
                                c4584g13.getClass();
                                c4273j.a(new Wa.d(c4584g13, i142));
                                c4584g13.o(false, true);
                                Log.i("Camera", "startPreviewWithImageStream");
                                arrayList21.add(0, null);
                                c1521a.c(arrayList21);
                                return;
                            } catch (CameraAccessException e17) {
                                throw new C4592o("CameraAccessException", e17.getMessage(), null);
                            }
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th17) {
                                arrayList22 = Fe.b.V(th17);
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).p(null);
                                arrayList22.add(0, null);
                                c1521a.c(arrayList22);
                                return;
                            } catch (Exception e18) {
                                throw new C4592o(e18.getClass().getName(), e18.getMessage(), null);
                            }
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj2).get(0);
                            C0799o c0799o2 = new C0799o(arrayList23, c1521a, i122);
                            s1Var2.getClass();
                            int iOrdinal3 = vVar.ordinal();
                            if (iOrdinal3 == 0) {
                                i102 = 1;
                            } else if (iOrdinal3 == 1) {
                                i102 = 2;
                            } else if (iOrdinal3 == 2) {
                                i102 = 3;
                            } else {
                                if (iOrdinal3 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                i102 = 4;
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).k(c0799o2, i102);
                                return;
                            } catch (Exception e19) {
                                s1.h(e19, c0799o2);
                                return;
                            }
                        case 23:
                            a(obj2, c1521a);
                            return;
                        case 24:
                            b(obj2, c1521a);
                            return;
                        case 25:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                Cc.a aVarB2 = ((C4584g) s1Var2.f43902g).f48112a.b();
                                arrayList24.add(0, Double.valueOf(aVarB2.b() * (((Range) ((CameraCharacteristics) aVarB2.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r4.getLower()).intValue())));
                            } catch (Throwable th18) {
                                arrayList24 = Fe.b.V(th18);
                            }
                            c1521a.c(arrayList24);
                            return;
                        case 26:
                            c(obj2, c1521a);
                            return;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            try {
                                arrayList25.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.b().b()));
                            } catch (Throwable th19) {
                                arrayList25 = Fe.b.V(th19);
                            }
                            c1521a.c(arrayList25);
                            return;
                    }
                }
            });
        } else {
            x727.n(null);
        }
        p pVar13 = p.f48158d;
        X7 x728 = new X7(interfaceC4269f, pVar, obj, "dev.flutter.pigeon.camera_android.CameraApi.resumePreview");
        if (s1Var != null) {
            final int i35 = 9;
            x728.n(new InterfaceC4265b() { // from class: yc.n
                private final void a(Object obj2, C1521a c1521a) {
                    ArrayList arrayList = new ArrayList();
                    u uVar = (u) ((ArrayList) obj2).get(0);
                    C0800p c0800p = new C0800p(arrayList, c1521a, 23);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    int iOrdinal = uVar.ordinal();
                    int i102 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i102 = 2;
                    }
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        Bc.a aVar = (Bc.a) c4584g.f48112a.f5569a.get("EXPOSURE_LOCK");
                        aVar.f1667b = i102;
                        aVar.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0800p, 26), new C3641c(c0800p, 18));
                    } catch (Exception e7) {
                        s1.h(e7, c0800p);
                    }
                }

                private final void b(Object obj2, C1521a c1521a) {
                    w0 w0Var;
                    ArrayList arrayList = new ArrayList();
                    z zVar = (z) ((ArrayList) obj2).get(0);
                    C0801q c0801q = new C0801q(arrayList, c1521a, 22);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        w0 w0Var2 = null;
                        if (zVar == null) {
                            w0Var = null;
                        } else {
                            w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                        }
                        Dc.a aVarC = c4584g.f48112a.c();
                        if (w0Var != null && ((Double) w0Var.f46405a) != null && ((Double) w0Var.f46406b) != null) {
                            w0Var2 = w0Var;
                        }
                        aVarC.f2631c = w0Var2;
                        aVarC.b();
                        aVarC.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0801q, 22), new C3641c(c0801q, 14));
                    } catch (Exception e7) {
                        s1.h(e7, c0801q);
                    }
                }

                private final void c(Object obj2, C1521a c1521a) {
                    s1 s1Var2 = s1Var;
                    ArrayList arrayList = new ArrayList();
                    try {
                        Cc.a aVarB = ((C4584g) s1Var2.f43902g).f48112a.b();
                        arrayList.add(0, Double.valueOf(aVarB.b() * (((Range) ((CameraCharacteristics) aVarB.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r1.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = Fe.b.V(th);
                    }
                    c1521a.c(arrayList);
                }

                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listU;
                    int i102;
                    int i112 = 23;
                    int i122 = 21;
                    int i132 = 24;
                    int i142 = 3;
                    int i152 = 2;
                    int i162 = 1;
                    w0 w0Var = null;
                    s1 s1Var2 = s1Var;
                    int i172 = 0;
                    switch (i35) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                Activity activity = (Activity) s1Var2.f43896a;
                                if (activity == null) {
                                    listU = Collections.EMPTY_LIST;
                                } else {
                                    try {
                                        listU = Ba.c.u(activity);
                                    } catch (CameraAccessException e7) {
                                        throw new RuntimeException(e7);
                                    }
                                }
                                arrayList.add(0, listU);
                            } catch (Throwable th) {
                                arrayList = Fe.b.V(th);
                            }
                            c1521a.c(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            C0799o c0799o = new C0799o(arrayList2, c1521a, 22);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g = (C4584g) s1Var2.f43902g;
                                double dDoubleValue = d3.doubleValue();
                                Cc.a aVarB = c4584g.f48112a.b();
                                aVarB.f1982b = dDoubleValue / aVarB.b();
                                aVarB.a(c4584g.f48129s);
                                c4584g.h(new RunnableC4579b(i172, c0799o, aVarB), new C3641c(c0799o, 17));
                                return;
                            } catch (Exception e10) {
                                s1.g(e10, c0799o);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            y yVar = (y) arrayList4.get(1);
                            C0800p c0800p = new C0800p(arrayList3, c1521a, 22);
                            C4584g c4584g2 = (C4584g) s1Var2.f43902g;
                            if (c4584g2 != null) {
                                c4584g2.a();
                            }
                            boolean zBooleanValue = yVar.f48194e.booleanValue();
                            Y y10 = new Y(s1Var2, c0800p, str, yVar);
                            C4026b c4026b = (C4026b) s1Var2.f43898c;
                            if (c4026b.f45322b) {
                                y10.c("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            Activity activity2 = (Activity) s1Var2.f43896a;
                            if (Y0.e.checkSelfPermission(activity2, "android.permission.CAMERA") == 0 && (!zBooleanValue || Y0.e.checkSelfPermission(activity2, "android.permission.RECORD_AUDIO") == 0)) {
                                y10.c(null, null);
                                return;
                            }
                            ((s1) ((InterfaceC3965b) ((C3641c) s1Var2.f43899d).f41267b)).d(new Yc.g(new aa.f(27, c4026b, y10)));
                            c4026b.f45322b = true;
                            AbstractC1274b.a(activity2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            w wVar = (w) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g3 = (C4584g) s1Var2.f43902g;
                                int iOrdinal = wVar.ordinal();
                                if (iOrdinal == 0) {
                                    i152 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c4584g3.l(i152);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = Fe.b.V(th2);
                            }
                            c1521a.c(arrayList5);
                            return;
                        case 4:
                            ArrayList arrayList6 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            C0800p c0800p2 = new C0800p(arrayList6, c1521a, i132);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g4 = (C4584g) s1Var2.f43902g;
                                if (zVar != null) {
                                    w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                                }
                                c4584g4.m(c0800p2, w0Var);
                                return;
                            } catch (Exception e11) {
                                s1.h(e11, c0800p2);
                                return;
                            }
                        case 5:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6730f.floatValue()));
                            } catch (Throwable th3) {
                                arrayList7 = Fe.b.V(th3);
                            }
                            c1521a.c(arrayList7);
                            return;
                        case 6:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6729e.floatValue()));
                            } catch (Throwable th4) {
                                arrayList8 = Fe.b.V(th4);
                            }
                            c1521a.c(arrayList8);
                            return;
                        case 7:
                            ArrayList arrayList9 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj2).get(0);
                            C0801q c0801q = new C0801q(arrayList9, c1521a, i112);
                            C4584g c4584g5 = (C4584g) s1Var2.f43902g;
                            float fFloatValue = d5.floatValue();
                            Kc.a aVarG = c4584g5.f48112a.g();
                            Float f10 = aVarG.f6730f;
                            float fFloatValue2 = f10.floatValue();
                            Float f11 = aVarG.f6729e;
                            float fFloatValue3 = f11.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                c0801q.c(new C4592o("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f11, f10), null));
                                return;
                            }
                            aVarG.f6728d = Float.valueOf(fFloatValue);
                            aVarG.a(c4584g5.f48129s);
                            c4584g5.h(new RunnableC3307c(c0801q, i112), new C3641c(c0801q, 15));
                            return;
                        case 8:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th5) {
                                arrayList10 = Fe.b.V(th5);
                            }
                            try {
                                C4584g c4584g6 = (C4584g) s1Var2.f43902g;
                                if (!c4584g6.f48132v) {
                                    c4584g6.f48132v = true;
                                    CameraCaptureSession cameraCaptureSession = c4584g6.f48126p;
                                    if (cameraCaptureSession != null) {
                                        cameraCaptureSession.stopRepeating();
                                    }
                                }
                                arrayList10.add(0, null);
                                c1521a.c(arrayList10);
                                return;
                            } catch (CameraAccessException e12) {
                                throw new C4592o("CameraAccessException", e12.getMessage(), null);
                            }
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C4584g c4584g7 = (C4584g) s1Var2.f43902g;
                                c4584g7.f48132v = false;
                                c4584g7.h(null, new C4580c(c4584g7, i172));
                                arrayList11.add(0, null);
                            } catch (Throwable th6) {
                                arrayList11 = Fe.b.V(th6);
                            }
                            c1521a.c(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                s1Var2.getClass();
                                try {
                                    ((C4584g) s1Var2.f43902g).j(new t6.q(str2, (CameraManager) ((Activity) s1Var2.f43896a).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e13) {
                                    throw new C4592o("CameraAccessException", e13.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = Fe.b.V(th7);
                            }
                            c1521a.c(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C4584g c4584g8 = (C4584g) s1Var2.f43902g;
                                if (c4584g8.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g8.f48130t.resume();
                                    } catch (IllegalStateException e14) {
                                        throw new C4592o("videoRecordingFailed", e14.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = Fe.b.V(th8);
                            }
                            c1521a.c(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                s1Var2.i((x) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                            } catch (Throwable th9) {
                                arrayList14 = Fe.b.V(th9);
                            }
                            c1521a.c(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C4584g c4584g9 = (C4584g) s1Var2.f43902g;
                                if (c4584g9 != null) {
                                    Log.i("Camera", "dispose");
                                    c4584g9.a();
                                    c4584g9.f48116e.release();
                                    Jc.a aVar = c4584g9.f48112a.f().f6005c;
                                    V1 v1 = aVar.f6003f;
                                    if (v1 != null) {
                                        aVar.f5998a.unregisterReceiver(v1);
                                        aVar.f6003f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                            } catch (Throwable th10) {
                                arrayList15 = Fe.b.V(th10);
                            }
                            c1521a.c(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g10 = (C4584g) s1Var2.f43902g;
                                int iOrdinal2 = tVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        i162 = 2;
                                    } else if (iOrdinal2 == 2) {
                                        i162 = 3;
                                    } else {
                                        if (iOrdinal2 != 3) {
                                            throw new IllegalStateException("Unreachable code");
                                        }
                                        i162 = 4;
                                    }
                                }
                                c4584g10.f48112a.f().f6006d = i162;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = Fe.b.V(th11);
                            }
                            c1521a.c(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C4584g) s1Var2.f43902g).f48112a.f().f6006d = 0;
                                arrayList17.add(0, null);
                            } catch (Throwable th12) {
                                arrayList17 = Fe.b.V(th12);
                            }
                            c1521a.c(arrayList17);
                            return;
                        case 16:
                            C0801q c0801q2 = new C0801q(new ArrayList(), c1521a, i122);
                            C4584g c4584g11 = (C4584g) s1Var2.f43902g;
                            C4585h c4585h = c4584g11.f48122l;
                            if (c4585h.f48138b != 1) {
                                c0801q2.c(new C4592o("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c4584g11.f48136z = c0801q2;
                            try {
                                c4584g11.f48133w = File.createTempFile("CAP", ".jpg", c4584g11.f48118g.getCacheDir());
                                S3.s sVar = c4584g11.f48134x;
                                sVar.getClass();
                                sVar.f11009b = new J5.n(2);
                                sVar.f11010c = new J5.n(2);
                                c4584g11.f48127q.setOnImageAvailableListener(c4584g11, c4584g11.f48123m);
                                Ac.a aVar2 = (Ac.a) c4584g11.f48112a.f5569a.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1257b != 1) {
                                    c4584g11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c4585h.f48138b = 2;
                                c4584g11.d();
                                return;
                            } catch (IOException | SecurityException e15) {
                                c4584g11.f48119h.l(c4584g11.f48136z, "cannotCreateFile", e15.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                s1Var2.n((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                            } catch (Throwable th13) {
                                arrayList18 = Fe.b.V(th13);
                            }
                            c1521a.c(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, s1Var2.o());
                            } catch (Throwable th14) {
                                arrayList19 = Fe.b.V(th14);
                            }
                            c1521a.c(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C4584g c4584g12 = (C4584g) s1Var2.f43902g;
                                if (c4584g12.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g12.f48130t.pause();
                                    } catch (IllegalStateException e16) {
                                        throw new C4592o("videoRecordingFailed", e16.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = Fe.b.V(th15);
                            }
                            c1521a.c(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th16) {
                                arrayList21 = Fe.b.V(th16);
                            }
                            try {
                                C4584g c4584g13 = (C4584g) s1Var2.f43902g;
                                C4273j c4273j = (C4273j) s1Var2.f43901f;
                                c4584g13.getClass();
                                c4273j.a(new Wa.d(c4584g13, i142));
                                c4584g13.o(false, true);
                                Log.i("Camera", "startPreviewWithImageStream");
                                arrayList21.add(0, null);
                                c1521a.c(arrayList21);
                                return;
                            } catch (CameraAccessException e17) {
                                throw new C4592o("CameraAccessException", e17.getMessage(), null);
                            }
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th17) {
                                arrayList22 = Fe.b.V(th17);
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).p(null);
                                arrayList22.add(0, null);
                                c1521a.c(arrayList22);
                                return;
                            } catch (Exception e18) {
                                throw new C4592o(e18.getClass().getName(), e18.getMessage(), null);
                            }
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj2).get(0);
                            C0799o c0799o2 = new C0799o(arrayList23, c1521a, i122);
                            s1Var2.getClass();
                            int iOrdinal3 = vVar.ordinal();
                            if (iOrdinal3 == 0) {
                                i102 = 1;
                            } else if (iOrdinal3 == 1) {
                                i102 = 2;
                            } else if (iOrdinal3 == 2) {
                                i102 = 3;
                            } else {
                                if (iOrdinal3 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                i102 = 4;
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).k(c0799o2, i102);
                                return;
                            } catch (Exception e19) {
                                s1.h(e19, c0799o2);
                                return;
                            }
                        case 23:
                            a(obj2, c1521a);
                            return;
                        case 24:
                            b(obj2, c1521a);
                            return;
                        case 25:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                Cc.a aVarB2 = ((C4584g) s1Var2.f43902g).f48112a.b();
                                arrayList24.add(0, Double.valueOf(aVarB2.b() * (((Range) ((CameraCharacteristics) aVarB2.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r4.getLower()).intValue())));
                            } catch (Throwable th18) {
                                arrayList24 = Fe.b.V(th18);
                            }
                            c1521a.c(arrayList24);
                            return;
                        case 26:
                            c(obj2, c1521a);
                            return;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            try {
                                arrayList25.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.b().b()));
                            } catch (Throwable th19) {
                                arrayList25 = Fe.b.V(th19);
                            }
                            c1521a.c(arrayList25);
                            return;
                    }
                }
            });
        } else {
            x728.n(null);
        }
        p pVar14 = p.f48158d;
        X7 x729 = new X7(interfaceC4269f, pVar, obj, "dev.flutter.pigeon.camera_android.CameraApi.setDescriptionWhileRecording");
        if (s1Var == null) {
            x729.n(null);
        } else {
            final int i36 = 10;
            x729.n(new InterfaceC4265b() { // from class: yc.n
                private final void a(Object obj2, C1521a c1521a) {
                    ArrayList arrayList = new ArrayList();
                    u uVar = (u) ((ArrayList) obj2).get(0);
                    C0800p c0800p = new C0800p(arrayList, c1521a, 23);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    int iOrdinal = uVar.ordinal();
                    int i102 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i102 = 2;
                    }
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        Bc.a aVar = (Bc.a) c4584g.f48112a.f5569a.get("EXPOSURE_LOCK");
                        aVar.f1667b = i102;
                        aVar.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0800p, 26), new C3641c(c0800p, 18));
                    } catch (Exception e7) {
                        s1.h(e7, c0800p);
                    }
                }

                private final void b(Object obj2, C1521a c1521a) {
                    w0 w0Var;
                    ArrayList arrayList = new ArrayList();
                    z zVar = (z) ((ArrayList) obj2).get(0);
                    C0801q c0801q = new C0801q(arrayList, c1521a, 22);
                    s1 s1Var2 = s1Var;
                    s1Var2.getClass();
                    try {
                        C4584g c4584g = (C4584g) s1Var2.f43902g;
                        w0 w0Var2 = null;
                        if (zVar == null) {
                            w0Var = null;
                        } else {
                            w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                        }
                        Dc.a aVarC = c4584g.f48112a.c();
                        if (w0Var != null && ((Double) w0Var.f46405a) != null && ((Double) w0Var.f46406b) != null) {
                            w0Var2 = w0Var;
                        }
                        aVarC.f2631c = w0Var2;
                        aVarC.b();
                        aVarC.a(c4584g.f48129s);
                        c4584g.h(new RunnableC3307c(c0801q, 22), new C3641c(c0801q, 14));
                    } catch (Exception e7) {
                        s1.h(e7, c0801q);
                    }
                }

                private final void c(Object obj2, C1521a c1521a) {
                    s1 s1Var2 = s1Var;
                    ArrayList arrayList = new ArrayList();
                    try {
                        Cc.a aVarB = ((C4584g) s1Var2.f43902g).f48112a.b();
                        arrayList.add(0, Double.valueOf(aVarB.b() * (((Range) ((CameraCharacteristics) aVarB.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r1.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = Fe.b.V(th);
                    }
                    c1521a.c(arrayList);
                }

                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listU;
                    int i102;
                    int i112 = 23;
                    int i122 = 21;
                    int i132 = 24;
                    int i142 = 3;
                    int i152 = 2;
                    int i162 = 1;
                    w0 w0Var = null;
                    s1 s1Var2 = s1Var;
                    int i172 = 0;
                    switch (i36) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                Activity activity = (Activity) s1Var2.f43896a;
                                if (activity == null) {
                                    listU = Collections.EMPTY_LIST;
                                } else {
                                    try {
                                        listU = Ba.c.u(activity);
                                    } catch (CameraAccessException e7) {
                                        throw new RuntimeException(e7);
                                    }
                                }
                                arrayList.add(0, listU);
                            } catch (Throwable th) {
                                arrayList = Fe.b.V(th);
                            }
                            c1521a.c(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            C0799o c0799o = new C0799o(arrayList2, c1521a, 22);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g = (C4584g) s1Var2.f43902g;
                                double dDoubleValue = d3.doubleValue();
                                Cc.a aVarB = c4584g.f48112a.b();
                                aVarB.f1982b = dDoubleValue / aVarB.b();
                                aVarB.a(c4584g.f48129s);
                                c4584g.h(new RunnableC4579b(i172, c0799o, aVarB), new C3641c(c0799o, 17));
                                return;
                            } catch (Exception e10) {
                                s1.g(e10, c0799o);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            y yVar = (y) arrayList4.get(1);
                            C0800p c0800p = new C0800p(arrayList3, c1521a, 22);
                            C4584g c4584g2 = (C4584g) s1Var2.f43902g;
                            if (c4584g2 != null) {
                                c4584g2.a();
                            }
                            boolean zBooleanValue = yVar.f48194e.booleanValue();
                            Y y10 = new Y(s1Var2, c0800p, str, yVar);
                            C4026b c4026b = (C4026b) s1Var2.f43898c;
                            if (c4026b.f45322b) {
                                y10.c("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            Activity activity2 = (Activity) s1Var2.f43896a;
                            if (Y0.e.checkSelfPermission(activity2, "android.permission.CAMERA") == 0 && (!zBooleanValue || Y0.e.checkSelfPermission(activity2, "android.permission.RECORD_AUDIO") == 0)) {
                                y10.c(null, null);
                                return;
                            }
                            ((s1) ((InterfaceC3965b) ((C3641c) s1Var2.f43899d).f41267b)).d(new Yc.g(new aa.f(27, c4026b, y10)));
                            c4026b.f45322b = true;
                            AbstractC1274b.a(activity2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            w wVar = (w) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g3 = (C4584g) s1Var2.f43902g;
                                int iOrdinal = wVar.ordinal();
                                if (iOrdinal == 0) {
                                    i152 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c4584g3.l(i152);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = Fe.b.V(th2);
                            }
                            c1521a.c(arrayList5);
                            return;
                        case 4:
                            ArrayList arrayList6 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            C0800p c0800p2 = new C0800p(arrayList6, c1521a, i132);
                            s1Var2.getClass();
                            try {
                                C4584g c4584g4 = (C4584g) s1Var2.f43902g;
                                if (zVar != null) {
                                    w0Var = new w0((Serializable) zVar.f48196b, (Object) zVar.f48195a);
                                }
                                c4584g4.m(c0800p2, w0Var);
                                return;
                            } catch (Exception e11) {
                                s1.h(e11, c0800p2);
                                return;
                            }
                        case 5:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6730f.floatValue()));
                            } catch (Throwable th3) {
                                arrayList7 = Fe.b.V(th3);
                            }
                            c1521a.c(arrayList7);
                            return;
                        case 6:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.g().f6729e.floatValue()));
                            } catch (Throwable th4) {
                                arrayList8 = Fe.b.V(th4);
                            }
                            c1521a.c(arrayList8);
                            return;
                        case 7:
                            ArrayList arrayList9 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj2).get(0);
                            C0801q c0801q = new C0801q(arrayList9, c1521a, i112);
                            C4584g c4584g5 = (C4584g) s1Var2.f43902g;
                            float fFloatValue = d5.floatValue();
                            Kc.a aVarG = c4584g5.f48112a.g();
                            Float f10 = aVarG.f6730f;
                            float fFloatValue2 = f10.floatValue();
                            Float f11 = aVarG.f6729e;
                            float fFloatValue3 = f11.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                c0801q.c(new C4592o("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f11, f10), null));
                                return;
                            }
                            aVarG.f6728d = Float.valueOf(fFloatValue);
                            aVarG.a(c4584g5.f48129s);
                            c4584g5.h(new RunnableC3307c(c0801q, i112), new C3641c(c0801q, 15));
                            return;
                        case 8:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th5) {
                                arrayList10 = Fe.b.V(th5);
                            }
                            try {
                                C4584g c4584g6 = (C4584g) s1Var2.f43902g;
                                if (!c4584g6.f48132v) {
                                    c4584g6.f48132v = true;
                                    CameraCaptureSession cameraCaptureSession = c4584g6.f48126p;
                                    if (cameraCaptureSession != null) {
                                        cameraCaptureSession.stopRepeating();
                                    }
                                }
                                arrayList10.add(0, null);
                                c1521a.c(arrayList10);
                                return;
                            } catch (CameraAccessException e12) {
                                throw new C4592o("CameraAccessException", e12.getMessage(), null);
                            }
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C4584g c4584g7 = (C4584g) s1Var2.f43902g;
                                c4584g7.f48132v = false;
                                c4584g7.h(null, new C4580c(c4584g7, i172));
                                arrayList11.add(0, null);
                            } catch (Throwable th6) {
                                arrayList11 = Fe.b.V(th6);
                            }
                            c1521a.c(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                s1Var2.getClass();
                                try {
                                    ((C4584g) s1Var2.f43902g).j(new t6.q(str2, (CameraManager) ((Activity) s1Var2.f43896a).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e13) {
                                    throw new C4592o("CameraAccessException", e13.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = Fe.b.V(th7);
                            }
                            c1521a.c(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C4584g c4584g8 = (C4584g) s1Var2.f43902g;
                                if (c4584g8.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g8.f48130t.resume();
                                    } catch (IllegalStateException e14) {
                                        throw new C4592o("videoRecordingFailed", e14.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = Fe.b.V(th8);
                            }
                            c1521a.c(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                s1Var2.i((x) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                            } catch (Throwable th9) {
                                arrayList14 = Fe.b.V(th9);
                            }
                            c1521a.c(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C4584g c4584g9 = (C4584g) s1Var2.f43902g;
                                if (c4584g9 != null) {
                                    Log.i("Camera", "dispose");
                                    c4584g9.a();
                                    c4584g9.f48116e.release();
                                    Jc.a aVar = c4584g9.f48112a.f().f6005c;
                                    V1 v1 = aVar.f6003f;
                                    if (v1 != null) {
                                        aVar.f5998a.unregisterReceiver(v1);
                                        aVar.f6003f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                            } catch (Throwable th10) {
                                arrayList15 = Fe.b.V(th10);
                            }
                            c1521a.c(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            try {
                                C4584g c4584g10 = (C4584g) s1Var2.f43902g;
                                int iOrdinal2 = tVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        i162 = 2;
                                    } else if (iOrdinal2 == 2) {
                                        i162 = 3;
                                    } else {
                                        if (iOrdinal2 != 3) {
                                            throw new IllegalStateException("Unreachable code");
                                        }
                                        i162 = 4;
                                    }
                                }
                                c4584g10.f48112a.f().f6006d = i162;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = Fe.b.V(th11);
                            }
                            c1521a.c(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C4584g) s1Var2.f43902g).f48112a.f().f6006d = 0;
                                arrayList17.add(0, null);
                            } catch (Throwable th12) {
                                arrayList17 = Fe.b.V(th12);
                            }
                            c1521a.c(arrayList17);
                            return;
                        case 16:
                            C0801q c0801q2 = new C0801q(new ArrayList(), c1521a, i122);
                            C4584g c4584g11 = (C4584g) s1Var2.f43902g;
                            C4585h c4585h = c4584g11.f48122l;
                            if (c4585h.f48138b != 1) {
                                c0801q2.c(new C4592o("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c4584g11.f48136z = c0801q2;
                            try {
                                c4584g11.f48133w = File.createTempFile("CAP", ".jpg", c4584g11.f48118g.getCacheDir());
                                S3.s sVar = c4584g11.f48134x;
                                sVar.getClass();
                                sVar.f11009b = new J5.n(2);
                                sVar.f11010c = new J5.n(2);
                                c4584g11.f48127q.setOnImageAvailableListener(c4584g11, c4584g11.f48123m);
                                Ac.a aVar2 = (Ac.a) c4584g11.f48112a.f5569a.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1257b != 1) {
                                    c4584g11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c4585h.f48138b = 2;
                                c4584g11.d();
                                return;
                            } catch (IOException | SecurityException e15) {
                                c4584g11.f48119h.l(c4584g11.f48136z, "cannotCreateFile", e15.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                s1Var2.n((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                            } catch (Throwable th13) {
                                arrayList18 = Fe.b.V(th13);
                            }
                            c1521a.c(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, s1Var2.o());
                            } catch (Throwable th14) {
                                arrayList19 = Fe.b.V(th14);
                            }
                            c1521a.c(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C4584g c4584g12 = (C4584g) s1Var2.f43902g;
                                if (c4584g12.f48131u) {
                                    try {
                                        if (AbstractC4575E.f48077a < 24) {
                                            i162 = 0;
                                        }
                                        if (i162 == 0) {
                                            throw new C4592o("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c4584g12.f48130t.pause();
                                    } catch (IllegalStateException e16) {
                                        throw new C4592o("videoRecordingFailed", e16.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = Fe.b.V(th15);
                            }
                            c1521a.c(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th16) {
                                arrayList21 = Fe.b.V(th16);
                            }
                            try {
                                C4584g c4584g13 = (C4584g) s1Var2.f43902g;
                                C4273j c4273j = (C4273j) s1Var2.f43901f;
                                c4584g13.getClass();
                                c4273j.a(new Wa.d(c4584g13, i142));
                                c4584g13.o(false, true);
                                Log.i("Camera", "startPreviewWithImageStream");
                                arrayList21.add(0, null);
                                c1521a.c(arrayList21);
                                return;
                            } catch (CameraAccessException e17) {
                                throw new C4592o("CameraAccessException", e17.getMessage(), null);
                            }
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                s1Var2.getClass();
                            } catch (Throwable th17) {
                                arrayList22 = Fe.b.V(th17);
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).p(null);
                                arrayList22.add(0, null);
                                c1521a.c(arrayList22);
                                return;
                            } catch (Exception e18) {
                                throw new C4592o(e18.getClass().getName(), e18.getMessage(), null);
                            }
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj2).get(0);
                            C0799o c0799o2 = new C0799o(arrayList23, c1521a, i122);
                            s1Var2.getClass();
                            int iOrdinal3 = vVar.ordinal();
                            if (iOrdinal3 == 0) {
                                i102 = 1;
                            } else if (iOrdinal3 == 1) {
                                i102 = 2;
                            } else if (iOrdinal3 == 2) {
                                i102 = 3;
                            } else {
                                if (iOrdinal3 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                i102 = 4;
                            }
                            try {
                                ((C4584g) s1Var2.f43902g).k(c0799o2, i102);
                                return;
                            } catch (Exception e19) {
                                s1.h(e19, c0799o2);
                                return;
                            }
                        case 23:
                            a(obj2, c1521a);
                            return;
                        case 24:
                            b(obj2, c1521a);
                            return;
                        case 25:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                Cc.a aVarB2 = ((C4584g) s1Var2.f43902g).f48112a.b();
                                arrayList24.add(0, Double.valueOf(aVarB2.b() * (((Range) ((CameraCharacteristics) aVarB2.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null ? 0.0d : ((Integer) r4.getLower()).intValue())));
                            } catch (Throwable th18) {
                                arrayList24 = Fe.b.V(th18);
                            }
                            c1521a.c(arrayList24);
                            return;
                        case 26:
                            c(obj2, c1521a);
                            return;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            try {
                                arrayList25.add(0, Double.valueOf(((C4584g) s1Var2.f43902g).f48112a.b().b()));
                            } catch (Throwable th19) {
                                arrayList25 = Fe.b.V(th19);
                            }
                            c1521a.c(arrayList25);
                            return;
                    }
                }
            });
        }
    }
}
