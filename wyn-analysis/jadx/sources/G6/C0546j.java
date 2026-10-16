package G6;

import D6.C0395s;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzecv;
import com.google.android.gms.internal.ads.zzecz;
import com.google.android.gms.internal.ads.zzgax;
import com.google.android.gms.internal.ads.zzhcp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.tika.metadata.OfficeOpenXMLExtended;
import org.apache.tika.mime.MimeTypes;

/* renamed from: G6.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0546j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4601a;

    /* renamed from: b, reason: collision with root package name */
    public final zzecz f4602b;

    /* renamed from: c, reason: collision with root package name */
    public String f4603c;

    /* renamed from: d, reason: collision with root package name */
    public String f4604d;

    /* renamed from: e, reason: collision with root package name */
    public String f4605e;

    /* renamed from: f, reason: collision with root package name */
    public String f4606f;

    /* renamed from: h, reason: collision with root package name */
    public final int f4608h;

    /* renamed from: i, reason: collision with root package name */
    public PointF f4609i;

    /* renamed from: j, reason: collision with root package name */
    public PointF f4610j;
    public final zzgax k;

    /* renamed from: g, reason: collision with root package name */
    public int f4607g = 0;

    /* renamed from: l, reason: collision with root package name */
    public final RunnableC0539c f4611l = new RunnableC0539c(this, 6);

    public C0546j(Context context) {
        this.f4601a = context;
        this.f4608h = ViewConfiguration.get(context).getScaledTouchSlop();
        C6.n nVar = C6.n.f1857D;
        nVar.f1879t.j();
        this.k = (zzgax) nVar.f1879t.f19707c;
        this.f4602b = (zzecz) nVar.f1874o.f4624g;
    }

    public static final int e(ArrayList arrayList, String str, boolean z2) {
        if (!z2) {
            return -1;
        }
        arrayList.add(str);
        return arrayList.size() - 1;
    }

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f4607g = 0;
            this.f4609i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i5 = this.f4607g;
        if (i5 == -1) {
            return;
        }
        RunnableC0539c runnableC0539c = this.f4611l;
        zzgax zzgaxVar = this.k;
        if (i5 == 0) {
            if (actionMasked == 5) {
                this.f4607g = 5;
                this.f4610j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                zzgaxVar.postDelayed(runnableC0539c, ((Long) C0395s.f2489e.f2492c.zzd(zzbix.zzga)).longValue());
                return;
            }
            return;
        }
        if (i5 == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z2 = false;
                for (int i10 = 0; i10 < historySize; i10++) {
                    z2 |= !c(motionEvent.getHistoricalX(0, i10), motionEvent.getHistoricalY(0, i10), motionEvent.getHistoricalX(1, i10), motionEvent.getHistoricalY(1, i10));
                }
                if (c(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z2) {
                    return;
                }
            }
            this.f4607g = -1;
            zzgaxVar.removeCallbacks(runnableC0539c);
        }
    }

    public final void b() {
        String str;
        try {
            Context context = this.f4601a;
            if (!(context instanceof Activity)) {
                int i5 = L.f4523b;
                H6.l.e("Can not create dialog without Activity Context");
                return;
            }
            C6.n nVar = C6.n.f1857D;
            C0549m c0549m = nVar.f1874o;
            synchronized (c0549m.f4623f) {
                str = c0549m.f4619b;
            }
            String str2 = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(str)) {
                str2 = "Creative preview";
            }
            String str3 = true != nVar.f1874o.h() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int iE = e(arrayList, "Ad information", true);
            final int iE2 = e(arrayList, str2, true);
            final int iE3 = e(arrayList, str3, true);
            boolean zBooleanValue = ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzkK)).booleanValue();
            final int iE4 = e(arrayList, "Open ad inspector", zBooleanValue);
            final int iE5 = e(arrayList, "Ad inspector settings", zBooleanValue);
            AlertDialog.Builder builderK = U.k(context);
            builderK.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: G6.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    final int i11 = 0;
                    final int i12 = 1;
                    final C0546j c0546j = this.f4579a;
                    c0546j.getClass();
                    if (i10 != iE) {
                        if (i10 == iE2) {
                            int i13 = L.f4523b;
                            H6.l.a("Debug mode [Creative Preview] selected.");
                            zzcfy.zza.execute(new RunnableC0539c(c0546j, i12));
                            return;
                        }
                        if (i10 == iE3) {
                            int i14 = L.f4523b;
                            H6.l.a("Debug mode [Troubleshooting] selected.");
                            zzcfy.zza.execute(new RunnableC0539c(c0546j, 2));
                            return;
                        }
                        int i15 = iE4;
                        zzecz zzeczVar = c0546j.f4602b;
                        if (i10 == i15) {
                            final zzhcp zzhcpVar = zzcfy.zzf;
                            zzhcp zzhcpVar2 = zzcfy.zza;
                            if (zzeczVar.zzs()) {
                                zzhcpVar.execute(new RunnableC0539c(c0546j, 5));
                                return;
                            } else {
                                zzhcpVar2.execute(new Runnable() { // from class: G6.i
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i11) {
                                            case 0:
                                                C0546j c0546j2 = c0546j;
                                                c0546j2.getClass();
                                                C6.n nVar2 = C6.n.f1857D;
                                                C0549m c0549m2 = nVar2.f1874o;
                                                String str4 = c0546j2.f4604d;
                                                String str5 = c0546j2.f4605e;
                                                Context context2 = c0546j2.f4601a;
                                                if (!c0549m2.b(context2, str4, str5)) {
                                                    nVar2.f1874o.c(context2, c0546j2.f4604d, c0546j2.f4605e);
                                                    break;
                                                } else {
                                                    zzhcpVar.execute(new RunnableC0539c(c0546j2, 4));
                                                    break;
                                                }
                                            default:
                                                C0546j c0546j3 = c0546j;
                                                c0546j3.getClass();
                                                C6.n nVar3 = C6.n.f1857D;
                                                C0549m c0549m3 = nVar3.f1874o;
                                                String str6 = c0546j3.f4604d;
                                                String str7 = c0546j3.f4605e;
                                                Context context3 = c0546j3.f4601a;
                                                if (!c0549m3.b(context3, str6, str7)) {
                                                    nVar3.f1874o.c(context3, c0546j3.f4604d, c0546j3.f4605e);
                                                    break;
                                                } else {
                                                    zzhcpVar.execute(new RunnableC0539c(c0546j3, 3));
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        if (i10 == iE5) {
                            final zzhcp zzhcpVar3 = zzcfy.zzf;
                            zzhcp zzhcpVar4 = zzcfy.zza;
                            if (zzeczVar.zzs()) {
                                zzhcpVar3.execute(new RunnableC0539c(c0546j, i11));
                                return;
                            } else {
                                zzhcpVar4.execute(new Runnable() { // from class: G6.i
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                C0546j c0546j2 = c0546j;
                                                c0546j2.getClass();
                                                C6.n nVar2 = C6.n.f1857D;
                                                C0549m c0549m2 = nVar2.f1874o;
                                                String str4 = c0546j2.f4604d;
                                                String str5 = c0546j2.f4605e;
                                                Context context2 = c0546j2.f4601a;
                                                if (!c0549m2.b(context2, str4, str5)) {
                                                    nVar2.f1874o.c(context2, c0546j2.f4604d, c0546j2.f4605e);
                                                    break;
                                                } else {
                                                    zzhcpVar3.execute(new RunnableC0539c(c0546j2, 4));
                                                    break;
                                                }
                                            default:
                                                C0546j c0546j3 = c0546j;
                                                c0546j3.getClass();
                                                C6.n nVar3 = C6.n.f1857D;
                                                C0549m c0549m3 = nVar3.f1874o;
                                                String str6 = c0546j3.f4604d;
                                                String str7 = c0546j3.f4605e;
                                                Context context3 = c0546j3.f4601a;
                                                if (!c0549m3.b(context3, str6, str7)) {
                                                    nVar3.f1874o.c(context3, c0546j3.f4604d, c0546j3.f4605e);
                                                    break;
                                                } else {
                                                    zzhcpVar3.execute(new RunnableC0539c(c0546j3, 3));
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        return;
                    }
                    Context context2 = c0546j.f4601a;
                    if (!(context2 instanceof Activity)) {
                        int i16 = L.f4523b;
                        H6.l.e("Can not create dialog without Activity Context");
                        return;
                    }
                    String str4 = c0546j.f4603c;
                    final String str5 = "No debug information";
                    if (!TextUtils.isEmpty(str4)) {
                        Uri uriBuild = new Uri.Builder().encodedQuery(str4.replaceAll("\\+", "%20")).build();
                        StringBuilder sb2 = new StringBuilder();
                        U u10 = C6.n.f1857D.f1863c;
                        HashMap mapO = U.o(uriBuild);
                        for (String str6 : mapO.keySet()) {
                            sb2.append(str6);
                            sb2.append(" = ");
                            sb2.append((String) mapO.get(str6));
                            sb2.append("\n\n");
                        }
                        String strTrim = sb2.toString().trim();
                        if (!TextUtils.isEmpty(strTrim)) {
                            str5 = strTrim;
                        }
                    }
                    U u11 = C6.n.f1857D.f1863c;
                    AlertDialog.Builder builderK2 = U.k(context2);
                    builderK2.setMessage(str5);
                    builderK2.setTitle("Ad Information");
                    builderK2.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: G6.g
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface2, int i17) {
                            C0546j c0546j2 = c0546j;
                            c0546j2.getClass();
                            U u12 = C6.n.f1857D.f1863c;
                            U.s(c0546j2.f4601a, Intent.createChooser(new Intent("android.intent.action.SEND").setType(MimeTypes.PLAIN_TEXT).putExtra("android.intent.extra.TEXT", str5), "Share via"));
                        }
                    });
                    builderK2.setNegativeButton("Close", DialogInterfaceOnClickListenerC0544h.f4597a);
                    builderK2.create().show();
                }
            });
            builderK.create().show();
        } catch (WindowManager.BadTokenException e7) {
            L.l("", e7);
        }
    }

    public final boolean c(float f10, float f11, float f12, float f13) {
        float fAbs = Math.abs(this.f4609i.x - f10);
        int i5 = this.f4608h;
        return fAbs < ((float) i5) && Math.abs(this.f4609i.y - f11) < ((float) i5) && Math.abs(this.f4610j.x - f12) < ((float) i5) && Math.abs(this.f4610j.y - f13) < ((float) i5);
    }

    public final void d(Context context) {
        ArrayList arrayList = new ArrayList();
        int iE = e(arrayList, OfficeOpenXMLExtended.SECURITY_NONE, true);
        final int iE2 = e(arrayList, "Shake", true);
        final int iE3 = e(arrayList, "Flick", true);
        int iOrdinal = this.f4602b.zzf().ordinal();
        final int i5 = iOrdinal != 1 ? iOrdinal != 2 ? iE : iE3 : iE2;
        U u10 = C6.n.f1857D.f1863c;
        AlertDialog.Builder builderK = U.k(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i5);
        builderK.setTitle("Setup gesture");
        builderK.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i5, new DialogInterfaceOnClickListenerC0540d(atomicInteger, 0));
        builderK.setNegativeButton("Dismiss", new DialogInterfaceOnClickListenerC0540d(this, 1));
        builderK.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: G6.e
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i10) {
                C0546j c0546j = this.f4589a;
                c0546j.getClass();
                AtomicInteger atomicInteger2 = atomicInteger;
                if (atomicInteger2.get() != i5) {
                    int i11 = atomicInteger2.get();
                    int i12 = iE2;
                    zzecz zzeczVar = c0546j.f4602b;
                    if (i11 == i12) {
                        zzeczVar.zze(zzecv.SHAKE);
                    } else if (atomicInteger2.get() == iE3) {
                        zzeczVar.zze(zzecv.FLICK);
                    } else {
                        zzeczVar.zze(zzecv.NONE);
                    }
                }
                c0546j.b();
            }
        });
        builderK.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: G6.f
            @Override // android.content.DialogInterface.OnCancelListener
            public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                this.f4594a.b();
            }
        });
        builderK.create().show();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("{Dialog: ");
        sb2.append(this.f4603c);
        sb2.append(",DebugSignal: ");
        sb2.append(this.f4606f);
        sb2.append(",AFMA Version: ");
        sb2.append(this.f4605e);
        sb2.append(",Ad Unit ID: ");
        return wg.b.c(sb2, this.f4604d, "}");
    }
}
