package defpackage;

import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.media.Image;
import android.media.ImageReader;
import android.media.ImageWriter;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.Surface;
import com.google.android.apps.auto.carservice.car.window.composition.ProjectionRootActivity;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.ProjectionWindowDecorationParams;
import com.google.android.gms.car.display.CarRegionId;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class jjd implements jix, jjf {
    public static final yph a = yph.c("CAR.WM.RLCOMPOSER");
    public volatile iph b;
    public final izj c;
    private final Context d;
    private final int e;
    private final boolean f;
    private final afeh g;
    private ImageReader h;
    private ImageWriter i;
    private Image j;
    private final aizz k;
    private jje l;
    private int m;
    private long n;
    private UUID o;
    private final ajab p;

    public jjd(Context context, izj izjVar, int i, boolean z) {
        context.getClass();
        jjb jjbVar = new jjb(context, 0);
        this.d = context;
        this.c = izjVar;
        this.e = i;
        this.f = z;
        this.g = jjbVar;
        ajab ajabVarA = ajac.a(new jjg(afbe.a, false, i, new jit(0, 0, 0, 0, 1.0f)));
        this.p = ajabVarA;
        this.k = new aizl(ajabVarA, null);
        this.m = 3;
    }

    private static final boolean a(jhf jhfVar) {
        int iJ = jhfVar.j();
        if (iJ != 5) {
            return iJ == 4 && !jhfVar.aC();
        }
        return true;
    }

    @Override // defpackage.jix
    public final void b(CarRegionId carRegionId, jiw jiwVar, UUID uuid, int i, int i2, SparseArray sparseArray, jhc jhcVar) {
        jiwVar.getClass();
        uuid.getClass();
        sparseArray.getClass();
        jhcVar.getClass();
    }

    @Override // defpackage.jix
    public final void c(PrintWriter printWriter) {
        printWriter.getClass();
        printWriter.println("RelayComposer:");
    }

    @Override // defpackage.jix
    public final void d(jhc jhcVar) {
        jhcVar.getClass();
    }

    @Override // defpackage.jix
    public final void e(jhc jhcVar) {
        ajab ajabVar = this.p;
        jjg jjgVar = (jjg) ajabVar.b();
        iuw iuwVar = jhcVar.a;
        int i = iuwVar.g;
        int i2 = iuwVar.h;
        int i3 = jhcVar.f;
        int i4 = jhcVar.g;
        float f = jhcVar.d;
        ajabVar.d(jjg.a(jjgVar, null, false, 0, new jit(i, i2, i3, i4, f), 7));
        ((ype) a.f()).T("onUiConfigChanged: margins changed to left=%d, top=%d, par=%f, usableWidth=%d, usableHeight=%d", Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Integer.valueOf(i3), Integer.valueOf(i4));
    }

    @Override // defpackage.jix
    public final void f(int i, UUID uuid, int i2, SparseArray sparseArray) {
        uuid.getClass();
        sparseArray.getClass();
    }

    @Override // defpackage.jix
    public final void i(Surface surface, UUID uuid, jhc jhcVar, boolean z) {
        surface.getClass();
        uuid.getClass();
        jhcVar.getClass();
        this.o = uuid;
        ype ypeVar = (ype) a.f();
        iuw iuwVar = jhcVar.a;
        int i = iuwVar.b;
        int i2 = iuwVar.h;
        int i3 = jhcVar.f;
        int i4 = iuwVar.c;
        Integer numValueOf = Integer.valueOf(i3);
        int i5 = jhcVar.g;
        Integer numValueOf2 = Integer.valueOf(i5);
        Integer numValueOf3 = Integer.valueOf(i);
        Integer numValueOf4 = Integer.valueOf(i4);
        int i6 = iuwVar.g;
        Integer numValueOf5 = Integer.valueOf(i6);
        Integer numValueOf6 = Integer.valueOf(i2);
        int i7 = iuwVar.i;
        ypeVar.V("start(): scaledWidth=%d, scaledHeight=%d, codecWidth=%d, codecHeight=%d, leftMargin=%d, topMargin=%d, dpi=%d", numValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5, numValueOf6, Integer.valueOf(i7));
        if (this.b != null) {
            throw new IllegalStateException("Lifecycle violation: start() called while VirtualDisplay is still active.");
        }
        ajab ajabVar = this.p;
        int i8 = this.e;
        float f = jhcVar.d;
        ajabVar.d(new jjg(afbe.a, false, i8, new jit(i6, i2, i3, i5, f)));
        ImageReader imageReaderNewInstance = ImageReader.newInstance(i, i4, 34, 3, 66048L);
        imageReaderNewInstance.getClass();
        this.h = imageReaderNewInstance;
        ImageWriter imageWriterNewInstance = ImageWriter.newInstance(surface, 3);
        imageWriterNewInstance.getClass();
        this.i = imageWriterNewInstance;
        iph iphVar = (iph) this.g.invoke(new DrawingSpec(i, i4, i7, imageReaderNewInstance.getSurface(), null, 0, -1, null), true, "RelayComposer");
        iphVar.l(1);
        Context context = this.d;
        iphVar.e(new ComponentName(context, (Class<?>) ProjectionRootActivity.class));
        this.b = iphVar;
        Intent intent = new Intent(context, (Class<?>) ProjectionRootActivity.class);
        intent.addFlags(402685952);
        intent.putExtra("usable_width", i3);
        intent.putExtra("usable_height", i5);
        intent.putExtra("display_left_margin", i6);
        intent.putExtra("display_top_margin", i2);
        intent.putExtra("par", f);
        Bundle bundle = new Bundle();
        jje jjeVar = new jje(this, this.k);
        this.l = jjeVar;
        bundle.putBinder("relay_host_callback", jjeVar);
        intent.putExtra("relay_host_callback_bundle", bundle);
        ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
        activityOptionsMakeBasic.setLaunchDisplayId(iphVar.c().getDisplayId());
        context.startActivity(intent, activityOptionsMakeBasic.toBundle());
    }

    @Override // defpackage.jix
    public final void j() {
        ((ype) a.f()).u("stop()");
        ajab ajabVar = this.p;
        ajabVar.d(jjg.a((jjg) ajabVar.b(), null, true, 0, null, 13));
        jje jjeVar = this.l;
        if (jjeVar != null) {
            jjeVar.a = null;
            jjeVar.b = null;
        }
        this.l = null;
        iph iphVar = this.b;
        if (iphVar != null) {
            iphVar.g();
        }
        this.b = null;
        Image image = this.j;
        if (image != null) {
            image.close();
        }
        this.j = null;
        ImageReader imageReader = this.h;
        if (imageReader != null) {
            imageReader.close();
        }
        this.h = null;
        ImageWriter imageWriter = this.i;
        if (imageWriter != null) {
            imageWriter.close();
        }
        this.i = null;
    }

    @Override // defpackage.jix
    public final void k(long j) {
        Image image = this.j;
        if (image == null) {
            return;
        }
        image.setTimestamp(j);
        ImageWriter imageWriter = this.i;
        if (imageWriter == null) {
            image.close();
            this.j = null;
            throw new IllegalStateException("imageWriter is null in submitFrame()");
        }
        try {
            imageWriter.queueInputImage(image);
            this.j = null;
        } catch (IllegalStateException e) {
            ((ype) ((ype) ((ype) a.h()).l(1, TimeUnit.SECONDS)).p(e)).u("Failed to queue image, likely full. Retaining frame.");
        }
    }

    @Override // defpackage.jix
    public final void l(SparseArray sparseArray, int i) {
        int iKeyAt;
        jjl jjlVar;
        List list;
        int i2;
        jhk jhkVar;
        int iL;
        Rect rectS;
        int i3;
        jjd jjdVar = this;
        SparseArray sparseArray2 = sparseArray;
        sparseArray2.getClass();
        ajab ajabVar = jjdVar.p;
        if (((jjg) ajabVar.b()).c == i) {
            List list2 = ((jjg) ajabVar.b()).a;
            int size = sparseArray2.size();
            int i4 = 0;
            int i5 = 0;
            loop0: while (true) {
                if (i4 < size) {
                    iKeyAt = sparseArray2.keyAt(i4);
                    List list3 = (List) sparseArray2.valueAt(i4);
                    if (list3 != null) {
                        int size2 = list3.size();
                        int i6 = 0;
                        while (i6 < size2) {
                            jhf jhfVar = (jhf) list3.get(i6);
                            if (!(jhfVar instanceof jhk)) {
                                Objects.toString(jhfVar);
                                throw new IllegalArgumentException("Window must be a ViewProjectionWindow: ".concat(String.valueOf(jhfVar)));
                            }
                            if (i5 >= list2.size()) {
                                a.l().B("shouldUpdate: more windows added (prev=%d, current > %d), returning true", list2.size(), i5);
                                break loop0;
                            }
                            jjlVar = (jjl) list2.get(i5);
                            if (!a(jhfVar)) {
                                jhkVar = (jhk) jhfVar;
                                iL = jhkVar.l();
                                int i7 = jjlVar.a;
                                if (i7 != iL) {
                                    a.l().R("shouldUpdate: window ID mismatch at idx=%d (prevId=%d, currentId=%d), returning true", Integer.valueOf(i5), Integer.valueOf(i7), Integer.valueOf(iL));
                                    break loop0;
                                }
                                rectS = jhkVar.s();
                                list = list2;
                                i3 = jjlVar.d;
                                if (i3 != iKeyAt) {
                                    break loop0;
                                }
                                i2 = size;
                                if (!affa.f(jjlVar.c, jhkVar.I()) || !affa.f(jjlVar.g, rectS) || jjlVar.e != jhkVar.bi() || jjlVar.i != jhkVar.S()) {
                                    break loop0;
                                } else {
                                    i5++;
                                }
                            } else {
                                list = list2;
                                i2 = size;
                            }
                            i6++;
                            list2 = list;
                            size = i2;
                        }
                    }
                    i4++;
                    list2 = list2;
                    size = size;
                } else {
                    List list4 = list2;
                    if (i5 == list4.size()) {
                        return;
                    } else {
                        a.l().B("shouldUpdate: window count shrunken (prev=%d, current=%d), returning true", list4.size(), i5);
                    }
                }
            }
            a.l().W("shouldUpdate: material properties changed for window id=%d (name=%s), returning true\n  prevData: zOrder=%d, bounds=%s, insets=%s, alpha=%f\n  current : zOrder=%d, bounds=%s, insets=%s, alpha=%f", Integer.valueOf(iL), jhkVar.E(), Integer.valueOf(i3), jjlVar.c, jjlVar.g, Float.valueOf(jjlVar.e), Integer.valueOf(iKeyAt), jhkVar.I(), rectS, Float.valueOf(jhkVar.bi()));
        }
        ArrayList arrayList = new ArrayList();
        int size3 = sparseArray2.size();
        int i8 = 0;
        while (i8 < size3) {
            int iKeyAt2 = sparseArray2.keyAt(i8);
            List<jhf> list5 = (List) sparseArray2.valueAt(i8);
            if (list5 != null) {
                for (jhf jhfVar2 : list5) {
                    if (!(jhfVar2 instanceof jhk)) {
                        Objects.toString(jhfVar2);
                        throw new IllegalArgumentException("Window is not a ViewProjectionWindow: ".concat(String.valueOf(jhfVar2)));
                    }
                    jhk jhkVar2 = (jhk) jhfVar2;
                    int iL2 = jhkVar2.l();
                    if (!a(jhfVar2)) {
                        UUID uuid = jjdVar.o;
                        if (uuid == null) {
                            throw new IllegalStateException("displayConfigurationId is null, must call start() first");
                        }
                        int i9 = ((jjg) jjdVar.k.b()).d.d;
                        if (i9 <= 0) {
                            throw new IllegalStateException("usableHeight is not configured, must call start() first");
                        }
                        ProjectionWindowDecorationParams projectionWindowDecorationParamsB = jhkVar2.B();
                        Rect rectI = jhkVar2.I();
                        float f = rectI.left;
                        float f2 = rectI.right;
                        int i10 = i9 - rectI.top;
                        float f3 = i9 - rectI.bottom;
                        float f4 = i10;
                        jhg jhgVar = new jhg(jhkVar2, f, f4, f2, f3);
                        jhg jhgVar2 = new jhg(jhkVar2, f, f4, f2, f3);
                        dsg.H(jhkVar2, sparseArray2, uuid, jjdVar.f, jhgVar2, i8);
                        int iK = afgi.k(jhgVar2.a);
                        int iK2 = afgi.k(jhgVar2.c);
                        float f5 = i9;
                        int iK3 = afgi.k(f5 - jhgVar2.d);
                        int iK4 = afgi.k(f5 - jhgVar2.b);
                        boolean z = true;
                        if (jhgVar2.a <= f && jhgVar2.c >= f2 && jhgVar2.d >= f4 && jhgVar2.b <= f3) {
                            z = false;
                        }
                        if (!jhkVar2.B().h || z) {
                            Rect rectN = jhkVar2.n();
                            iK = afpt.e(iK, rectN.left + projectionWindowDecorationParamsB.a);
                            iK2 = afpt.f(iK2, rectN.right - projectionWindowDecorationParamsB.c);
                            iK3 = afpt.e(iK3, rectN.top + projectionWindowDecorationParamsB.b);
                            iK4 = afpt.f(iK4, rectN.bottom - projectionWindowDecorationParamsB.d);
                        }
                        jjc jjcVar = new jjc(new Rect(iK, iK3, afpt.e(iK2, iK), afpt.e(iK4, iK3)), jhkVar2.w(jhgVar, jhgVar2));
                        Rect rect = jjcVar.a;
                        float f6 = jjcVar.b;
                        a.l().T("updateUiState: window id=%d, name=%s\n  bounds: %s\n  customCropBounds: %s\n  cornerRadiusPx: %f", Integer.valueOf(iL2), jhkVar2.E(), jhkVar2.I(), rect, Float.valueOf(f6));
                        String strE = jhkVar2.E();
                        if (strE == null) {
                            strE = "Unknown";
                        }
                        arrayList.add(new jjl(iL2, strE, jhkVar2.I(), iKeyAt2, jhkVar2.bi(), rect, jhkVar2.s(), f6, jhkVar2.S()));
                    }
                    jjdVar = this;
                    sparseArray2 = sparseArray;
                }
            }
            i8++;
            jjdVar = this;
            sparseArray2 = sparseArray;
        }
        ajabVar.d(jjg.a((jjg) ajabVar.b(), arrayList, false, i, null, 10));
    }

    @Override // defpackage.jix
    public final boolean m() {
        return false;
    }

    @Override // defpackage.jix
    public final boolean n(SparseArray sparseArray) {
        sparseArray.getClass();
        ImageReader imageReader = this.h;
        if (imageReader == null) {
            ((ype) ((ype) a.h()).l(1, TimeUnit.SECONDS)).u("imageReader is null in hasNewContent");
            return false;
        }
        Image imageAcquireLatestImage = imageReader.acquireLatestImage();
        if (imageAcquireLatestImage != null) {
            Image image = this.j;
            if (image != null) {
                image.close();
            }
            this.j = imageAcquireLatestImage;
        }
        return this.j != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [int] */
    @Override // defpackage.jix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o(defpackage.iye r20) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jjd.o(iye):boolean");
    }

    @Override // defpackage.jix
    public final boolean p() {
        return false;
    }

    @Override // defpackage.jix
    public final void g(boolean z) {
    }

    @Override // defpackage.jix
    public final void h(boolean z) {
    }
}
