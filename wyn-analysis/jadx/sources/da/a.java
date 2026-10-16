package Da;

import G6.I;
import Ga.b;
import Ga.d;
import Ga.e;
import H7.E;
import Va.C1038ka;
import Xd.c;
import a.AbstractC1304a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbabj;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbku;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zblc;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbnx;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbnz;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboe;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbog;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboi;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbok;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboo;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbpb;
import com.google.android.libraries.vision.visionkit.pipeline.alt.PipelineException;
import com.moloco.sdk.internal.publisher.H;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import q7.BinderC3877b;
import q7.InterfaceC3876a;
import r7.AbstractC3935e;

/* loaded from: classes4.dex */
public final class a extends zbnz {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2618a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2619b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2620c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2621d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2622e;

    /* renamed from: f, reason: collision with root package name */
    public I f2623f;

    public a(Context context, String str, String str2, String str3, boolean z2) {
        this.f2618a = context;
        this.f2619b = str;
        this.f2621d = str2;
        this.f2622e = str3;
        this.f2620c = z2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboa
    public final zbok zbb(InterfaceC3876a interfaceC3876a, zbnx zbnxVar) throws PipelineException, ua.a, RemoteException, SecurityException {
        Ga.a aVarA;
        zbki zbkiVarA;
        Matrix matrix;
        zbkx zbkxVarZbh;
        zbku zbkuVar;
        zbkx zbkxVarZbh2;
        zbku zbkuVar2;
        zbku zbkuVar3;
        I i5 = this.f2623f;
        if (i5 == null) {
            throw new RemoteException("Process is started without initiation.");
        }
        b bVarA = i5.a();
        if (bVarA.f4695b.zbc()) {
            aVarA = Ga.a.a(bVarA);
        } else {
            try {
                int i10 = 1;
                if (zbnxVar.zbb() == -1) {
                    Log.d("PipelineManager", "Start process bitmap");
                    Bitmap bitmapCopy = (Bitmap) BinderC3877b.S(interfaceC3876a);
                    AbstractC1732v.i(bitmapCopy);
                    Bitmap.Config config = bitmapCopy.getConfig();
                    Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
                    if (config != config2) {
                        Log.d("PipelineManager", "Input bitmap is not ARGB_8888 config. Converting it to ARGB_8888 from ".concat(String.valueOf(bitmapCopy.getConfig())));
                        bitmapCopy = bitmapCopy.copy(config2, bitmapCopy.isMutable());
                    }
                    d dVar = (d) i5.f4513e;
                    AbstractC1732v.i(dVar);
                    long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                    int iZbc = zbnxVar.zbc();
                    zbkiVarA = dVar.b(jElapsedRealtime, bitmapCopy, iZbc != 1 ? iZbc != 2 ? iZbc != 3 ? 1 : 2 : 3 : 4);
                } else if (zbnxVar.zbb() == 35) {
                    Log.d("PipelineManager", "Start process YUV");
                    Object objS = BinderC3877b.S(interfaceC3876a);
                    AbstractC1732v.i(objS);
                    Image.Plane[] planes = ((Image) objS).getPlanes();
                    d dVar2 = (d) i5.f4513e;
                    AbstractC1732v.i(dVar2);
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() * 1000;
                    Image.Plane plane = planes[0];
                    AbstractC1732v.i(plane);
                    ByteBuffer buffer = plane.getBuffer();
                    Image.Plane plane2 = planes[1];
                    AbstractC1732v.i(plane2);
                    ByteBuffer buffer2 = plane2.getBuffer();
                    Image.Plane plane3 = planes[2];
                    AbstractC1732v.i(plane3);
                    ByteBuffer buffer3 = plane3.getBuffer();
                    int iZbd = zbnxVar.zbd();
                    int iZba = zbnxVar.zba();
                    Image.Plane plane4 = planes[0];
                    AbstractC1732v.i(plane4);
                    int rowStride = plane4.getRowStride();
                    Image.Plane plane5 = planes[1];
                    AbstractC1732v.i(plane5);
                    int rowStride2 = plane5.getRowStride();
                    Image.Plane plane6 = planes[1];
                    AbstractC1732v.i(plane6);
                    int pixelStride = plane6.getPixelStride();
                    int iZbc2 = zbnxVar.zbc();
                    zbkiVarA = dVar2.c(jElapsedRealtime2, buffer, buffer2, buffer3, iZbd, iZba, rowStride, rowStride2, pixelStride, iZbc2 != 1 ? iZbc2 != 2 ? iZbc2 != 3 ? 1 : 2 : 3 : 4);
                } else if (zbnxVar.zbb() == 17) {
                    Log.d("PipelineManager", "Start process NV21");
                    ByteBuffer byteBufferWrap = (ByteBuffer) BinderC3877b.S(interfaceC3876a);
                    AbstractC1732v.i(byteBufferWrap);
                    if (!byteBufferWrap.hasArray()) {
                        byteBufferWrap.rewind();
                        byte[] bArr = new byte[byteBufferWrap.limit()];
                        byteBufferWrap.get(bArr);
                        byteBufferWrap = ByteBuffer.wrap(bArr);
                    }
                    d dVar3 = (d) i5.f4513e;
                    AbstractC1732v.i(dVar3);
                    zbkiVarA = dVar3.a(H.w0(byteBufferWrap, zbnxVar));
                } else {
                    if (zbnxVar.zbb() != 842094169) {
                        throw new ua.a("Unsupported image format: " + zbnxVar.zbb(), 3);
                    }
                    Log.d("PipelineManager", "Start process YV12");
                    Object objS2 = BinderC3877b.S(interfaceC3876a);
                    AbstractC1732v.i(objS2);
                    ByteBuffer byteBufferV = AbstractC3935e.V((ByteBuffer) objS2);
                    d dVar4 = (d) i5.f4513e;
                    AbstractC1732v.i(dVar4);
                    zbkiVarA = dVar4.a(H.w0(byteBufferV, zbnxVar));
                }
                if (zbkiVarA.zbc()) {
                    Log.d("PipelineManager", "OCR process succeeded via visionkit pipeline.");
                    E e7 = (E) zbkiVarA.zba();
                    Ba.a aVar = Ba.a.f1647b;
                    int iZbd2 = zbnxVar.zbd();
                    int iZba2 = zbnxVar.zba();
                    int iZbc3 = zbnxVar.zbc();
                    aVar.getClass();
                    if (iZbc3 == 0) {
                        matrix = null;
                    } else {
                        Matrix matrix2 = new Matrix();
                        matrix2.postTranslate((-iZbd2) / 2.0f, (-iZba2) / 2.0f);
                        matrix2.postRotate(iZbc3 * 90);
                        int i11 = iZbc3 % 2;
                        int i12 = i11 != 0 ? iZba2 : iZbd2;
                        if (i11 == 0) {
                            iZbd2 = iZba2;
                        }
                        matrix2.postTranslate(i12 / 2.0f, iZbd2 / 2.0f);
                        matrix = matrix2;
                    }
                    boolean z2 = i5.f4511c;
                    b bVar = new b(0, zbki.zbd());
                    List<zbabj> listZbf = e7.zbe().zbf();
                    HashMap map = new HashMap();
                    HashMap map2 = new HashMap();
                    HashMap map3 = new HashMap();
                    for (zbabj zbabjVar : listZbf) {
                        if (zbabjVar.zbI() == 6) {
                            zbpb zbpbVarG0 = AbstractC1304a.g0(zbabjVar.zbf());
                            List listH0 = AbstractC1304a.h0(zbpbVarG0);
                            zboo zbooVar = new zboo(zbabjVar.zbH(), AbstractC1304a.f0(listH0, matrix), listH0, zbabjVar.zbc(), zbpbVarG0.zba());
                            Integer numValueOf = Integer.valueOf(zbabjVar.zbe());
                            if (map2.containsKey(numValueOf)) {
                                zbkuVar3 = (zbku) map2.get(numValueOf);
                            } else {
                                zbku zbkuVar4 = new zbku();
                                map2.put(numValueOf, zbkuVar4);
                                zbkuVar3 = zbkuVar4;
                            }
                            AbstractC1732v.i(zbkuVar3);
                            zbkuVar3.zba(zbooVar);
                        }
                    }
                    int i13 = 0;
                    while (i13 < listZbf.size()) {
                        zbabj zbabjVar2 = (zbabj) listZbf.get(i13);
                        if (zbabjVar2.zbI() == i10) {
                            zbpb zbpbVarG02 = AbstractC1304a.g0(zbabjVar2.zbf());
                            List listH02 = AbstractC1304a.h0(zbpbVarG02);
                            Integer numValueOf2 = Integer.valueOf(i13);
                            if (map2.containsKey(numValueOf2)) {
                                zbku zbkuVar5 = (zbku) map2.get(numValueOf2);
                                AbstractC1732v.i(zbkuVar5);
                                zbkxVarZbh2 = zbkuVar5.zbb();
                            } else {
                                zbkxVarZbh2 = zbkx.zbh();
                            }
                            zbkx zbkxVar = zbkxVarZbh2;
                            String strZbH = zbabjVar2.zbH();
                            Rect rectF0 = AbstractC1304a.f0(listH02, matrix);
                            String strX0 = android.support.v4.media.session.b.x0(zbabjVar2.zbh().zbf());
                            float fZbc = zbabjVar2.zbc();
                            float fZba = zbpbVarG02.zba();
                            AbstractC1732v.i(zbkxVar);
                            zbog zbogVar = new zbog(strZbH, rectF0, listH02, strX0, fZbc, fZba, zbkxVar);
                            Integer numValueOf3 = Integer.valueOf(zbabjVar2.zbe());
                            if (map.containsKey(numValueOf3)) {
                                zbkuVar2 = (zbku) map.get(numValueOf3);
                            } else {
                                zbku zbkuVar6 = new zbku();
                                map.put(numValueOf3, zbkuVar6);
                                zbkuVar2 = zbkuVar6;
                            }
                            AbstractC1732v.i(zbkuVar2);
                            zbkuVar2.zba(zbogVar);
                        }
                        i13++;
                        i10 = 1;
                    }
                    for (int i14 = 0; i14 < listZbf.size(); i14++) {
                        zbabj zbabjVar3 = (zbabj) listZbf.get(i14);
                        if (zbabjVar3.zbI() == 3) {
                            zbpb zbpbVarG03 = AbstractC1304a.g0(zbabjVar3.zbf());
                            List listH03 = AbstractC1304a.h0(zbpbVarG03);
                            Integer numValueOf4 = Integer.valueOf(i14);
                            if (map.containsKey(numValueOf4)) {
                                zbku zbkuVar7 = (zbku) map.get(numValueOf4);
                                AbstractC1732v.i(zbkuVar7);
                                zbkxVarZbh = zbkuVar7.zbb();
                            } else {
                                zbkxVarZbh = zbkx.zbh();
                            }
                            zbkx zbkxVar2 = zbkxVarZbh;
                            String strZbH2 = zbabjVar3.zbH();
                            Rect rectF02 = AbstractC1304a.f0(listH03, matrix);
                            String strX02 = android.support.v4.media.session.b.x0(zbabjVar3.zbh().zbf());
                            AbstractC1732v.i(zbkxVar2);
                            zboi zboiVar = new zboi(strZbH2, rectF02, listH03, strX02, zbkxVar2, zbabjVar3.zbc(), zbpbVarG03.zba());
                            Integer numValueOf5 = Integer.valueOf(zbabjVar3.zbe());
                            if (map3.containsKey(numValueOf5)) {
                                zbkuVar = (zbku) map3.get(numValueOf5);
                            } else {
                                zbku zbkuVar8 = new zbku();
                                map3.put(Integer.valueOf(zbabjVar3.zbe()), zbkuVar8);
                                zbkuVar = zbkuVar8;
                            }
                            AbstractC1732v.i(zbkuVar);
                            zbkuVar.zba(zboiVar);
                        }
                    }
                    zbku zbkuVar9 = new zbku();
                    for (int i15 = 0; i15 < listZbf.size(); i15++) {
                        zbabj zbabjVar4 = (zbabj) listZbf.get(i15);
                        if (zbabjVar4.zbI() == 4) {
                            List listH04 = AbstractC1304a.h0(AbstractC1304a.g0(zbabjVar4.zbf()));
                            zbkx zbkxVarZbh3 = zbkx.zbh();
                            Integer numValueOf6 = Integer.valueOf(i15);
                            if (map3.containsKey(numValueOf6)) {
                                zbku zbkuVar10 = (zbku) map3.get(numValueOf6);
                                AbstractC1732v.i(zbkuVar10);
                                zbkxVarZbh3 = zbkuVar10.zbb();
                                map3.remove(numValueOf6);
                            }
                            String strZbb = e.f4700a.zbb(zblc.zba(zbkxVarZbh3, new C1038ka(19)));
                            Rect rectF03 = AbstractC1304a.f0(listH04, matrix);
                            String strX03 = android.support.v4.media.session.b.x0(zbabjVar4.zbh().zbf());
                            AbstractC1732v.i(zbkxVarZbh3);
                            zbkuVar9.zba(new zboe(strZbb, rectF03, listH04, strX03, zbkxVarZbh3));
                        }
                    }
                    Iterator it = map3.values().iterator();
                    while (it.hasNext()) {
                        zbkx zbkxVarZbb = ((zbku) it.next()).zbb();
                        int size = zbkxVarZbb.size();
                        for (int i16 = 0; i16 < size; i16++) {
                            zboi zboiVar2 = (zboi) zbkxVarZbb.get(i16);
                            zbkuVar9.zba(new zboe(zboiVar2.zbc(), zboiVar2.zba(), zboiVar2.zbd(), zboiVar2.zbb(), zbkx.zbi(zboiVar2)));
                        }
                    }
                    zbkx zbkxVarZbb2 = zbkuVar9.zbb();
                    Ga.a aVar2 = new Ga.a(bVar, new zbok(e.f4700a.zbb(zblc.zba(zbkxVarZbb2, new c(19))), zbkxVarZbb2), zbkx.zbh(), z2);
                    i5.f4511c = false;
                    aVarA = aVar2;
                } else {
                    aVarA = Ga.a.a(new b(3, zbki.zbe(new RemoteException("VisionKit pipeline returns empty result."))));
                }
            } catch (ua.a e10) {
                aVarA = Ga.a.a(new b(2, zbki.zbe(new RemoteException("Failed to process input image.".concat(String.valueOf(e10.getMessage()))))));
            }
        }
        zbki zbkiVar = aVarA.f4690a.f4695b;
        if (zbkiVar.zbc()) {
            throw ((RemoteException) zbkiVar.zba());
        }
        return aVarA.f4691b;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboa
    public final void zbc() throws RemoteException {
        if (this.f2623f == null) {
            System.loadLibrary("mlkit_google_ocr_pipeline");
            String str = this.f2622e;
            if (str == null || str.isEmpty()) {
                str = "";
            }
            String str2 = this.f2619b;
            if (str2 == null) {
                throw new NullPointerException("Null configLabel");
            }
            String str3 = this.f2621d;
            if (str3 == null) {
                str3 = "mlkit-google-ocr-models";
            }
            I i5 = new I(this.f2618a, new Ga.c(str2, str3, str, this.f2620c));
            this.f2623f = i5;
            zbki zbkiVar = i5.a().f4695b;
            if (zbkiVar.zbc()) {
                throw ((RemoteException) zbkiVar.zba());
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboa
    public final void zbd() {
        I i5 = this.f2623f;
        if (i5 != null) {
            d dVar = (d) i5.f4513e;
            if (dVar != null) {
                if (i5.f4510b) {
                    long j8 = dVar.f26754c;
                    if (j8 == 0) {
                        throw new IllegalStateException("Pipeline has been closed or was not initialized");
                    }
                    if (!dVar.f26753b.stop(j8)) {
                        throw new IllegalStateException("Pipeline did not stop successfully.");
                    }
                }
                d dVar2 = (d) i5.f4513e;
                synchronized (dVar2) {
                    long j10 = dVar2.f26754c;
                    if (j10 != 0) {
                        dVar2.f26753b.stop(j10);
                        dVar2.f26753b.close(dVar2.f26754c, dVar2.f26755d, dVar2.f26756e, dVar2.f26757f, dVar2.f26758g);
                        dVar2.f26754c = 0L;
                        dVar2.f26753b.zba();
                    }
                }
                i5.f4513e = null;
            }
            i5.f4510b = false;
            i5.f4511c = true;
            this.f2623f = null;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboa
    public final zbf[] zbe(InterfaceC3876a interfaceC3876a, zbnx zbnxVar) throws RemoteException {
        throw new RemoteException("#recognizeBitmap should not be triggered from text thick client.");
    }
}
