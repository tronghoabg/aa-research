package defpackage;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.car.app.model.Alert;
import androidx.core.telecom.extensions.Capability;
import androidx.datastore.core.NativeSharedCounter;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class cxm implements afdr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ cxm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v64, types: [aiuo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v66, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.ParcelFileDescriptor] */
    /* JADX WARN: Type inference failed for: r3v10, types: [cuk] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [cun] */
    @Override // defpackage.afdr
    public final Object invoke() throws IOException {
        cxl cxlVarC;
        ?? cukVar = 0;
        cstVar = null;
        cst cstVar = null;
        cukVar = 0;
        cukVar = 0;
        switch (this.b) {
            case 0:
                cxn cxnVar = (cxn) this.a;
                cxnVar.f.g = 0;
                byw bywVarK = cxnVar.p().k();
                Object[] objArr = bywVarK.a;
                int i = bywVarK.b;
                for (int i2 = 0; i2 < i; i2++) {
                    cxn cxnVar2 = ((cxb) objArr[i2]).w.p;
                    cxnVar2.getClass();
                    cxnVar2.h = cxnVar2.i;
                    cxnVar2.i = Alert.DURATION_SHOW_INDEFINITELY;
                    if (cxnVar2.y == 2) {
                        cxnVar2.y = 3;
                    }
                }
                cxnVar.l(new cmj(8));
                cxl cxlVar = ((cwq) cxnVar.k()).g;
                if (cxlVar == null) {
                    throw new IllegalStateException("Expected lookahead delegate");
                }
                affv affvVar = new affv();
                List listV = cxnVar.p().v();
                int size = listV.size();
                for (int i3 = 0; i3 < size; i3++) {
                    cxb cxbVar = (cxb) listV.get(i3);
                    cxl cxlVarC2 = cxbVar.q().C();
                    if (cxlVarC2 != null) {
                        if (cxlVarC2.m) {
                            aag aagVar = (aag) affvVar.a;
                            if (aagVar == null) {
                                aagVar = new aag(16);
                            }
                            affvVar.a = aagVar;
                            ((aag) affvVar.a).p(cxbVar);
                        }
                        cxlVarC2.m = cxlVar.m;
                    }
                }
                cxlVar.K().h();
                List listV2 = cxnVar.p().v();
                int size2 = listV2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    cxb cxbVar2 = (cxb) listV2.get(i4);
                    aag aagVar2 = (aag) affvVar.a;
                    boolean z = aagVar2 != null && aagVar2.e(cxbVar2);
                    cxl cxlVarC3 = cxbVar2.q().C();
                    if (cxlVarC3 != null) {
                        cxlVarC3.m = z;
                    }
                }
                byw bywVarK2 = cxnVar.p().k();
                Object[] objArr2 = bywVarK2.a;
                int i5 = bywVarK2.b;
                for (int i6 = 0; i6 < i5; i6++) {
                    cxn cxnVar3 = ((cxb) objArr2[i6]).w.p;
                    cxnVar3.getClass();
                    int i7 = cxnVar3.h;
                    int i8 = cxnVar3.i;
                    if (i7 != i8 && i8 == Integer.MAX_VALUE) {
                        cxnVar3.s(true);
                    }
                }
                cxnVar.l(new cmj(9));
                return afak.a;
            case 1:
                ((chc) this.a).e();
                return afak.a;
            case 2:
                cxn cxnVar4 = (cxn) this.a;
                cxl cxlVarC4 = cxnVar4.r().C();
                cxlVarC4.getClass();
                cxlVarC4.v(cxnVar4.v);
                return afak.a;
            case 3:
                cxn cxnVar5 = (cxn) this.a;
                if (cjn.s(cxnVar5.p()) || cxnVar5.f.c) {
                    cyc cycVar = cxnVar5.r().x;
                    if (cycVar != null) {
                        cukVar = cycVar.n;
                    }
                } else {
                    cyc cycVar2 = cxnVar5.r().x;
                    if (cycVar2 != null && (cxlVarC = cycVar2.C()) != null) {
                        cukVar = cxlVarC.n;
                    }
                }
                if (cukVar == 0) {
                    cukVar = new cuk(cxe.a(cxnVar5.p()));
                }
                cxl cxlVarC5 = cxnVar5.r().C();
                cxlVarC5.getClass();
                cukVar.s(cxlVarC5, cxnVar5.m, BitmapDescriptorFactory.HUE_RED);
                return afak.a;
            case 4:
                ahni.e(((dac) this.a).b, null);
                return afak.a;
            case 5:
                ((dbr) this.a).a.a();
                return afak.a;
            case 6:
                Object obj = this.a;
                dme dmeVar = (dme) obj;
                if (dmeVar.e && dmeVar.isAttachedToWindow() && dmeVar.b.getParent() == obj) {
                    ((ces) dmeVar.j().a).b(obj, dme.a, dmeVar.d);
                }
                return afak.a;
            case 7:
                ((dme) this.a).v.G();
                return afak.a;
            case 8:
                return this.a;
            case 9:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                ((dms) this.a).x.saveHierarchyState(sparseArray);
                return sparseArray;
            case 10:
                dms dmsVar = (dms) this.a;
                dmsVar.z.invoke(dmsVar.x);
                dmsVar.o(null);
                return afak.a;
            case 11:
                dms dmsVar2 = (dms) this.a;
                dmsVar2.y.invoke(dmsVar2.x);
                return afak.a;
            case 12:
                dnq dnqVar = (dnq) this.a;
                cst cstVarA = dnqVar.a();
                if (cstVarA != null && cstVarA.t()) {
                    cstVar = cstVarA;
                }
                return Boolean.valueOf((cstVar == null || dnqVar.k() == null) ? false : true);
            case 13:
                Capability capability = new Capability();
                capability.a = 2;
                capability.b = 2;
                capability.c = new int[0];
                return new dwv(capability, new dwx(this.a, 0));
            case 14:
                Capability capability2 = new Capability();
                capability2.a = 4;
                capability2.b = 1;
                capability2.c = new int[0];
                return new dwv(capability2, new dwx(this.a, 2, (char[]) null));
            case 15:
                Capability capability3 = new Capability();
                capability3.a = 3;
                capability3.b = 1;
                capability3.c = new int[0];
                return new dwv(capability3, new dwx(this.a, 1, (byte[]) null));
            case 16:
                egt egtVar = (egt) this.a;
                File fileG = egtVar.g(egtVar.a);
                egt.h(fileG);
                return fileG;
            case 17:
                int i9 = ehd.a;
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open((File) new cxm(this.a, 18).invoke(), 939524096);
                    parcelFileDescriptorOpen.getClass();
                    NativeSharedCounter nativeSharedCounter = ehb.a;
                    if (nativeSharedCounter == null) {
                        throw new IllegalStateException("DataStore failed to load the native library to create SharedCounter.");
                    }
                    int fd = parcelFileDescriptorOpen.getFd();
                    if (nativeSharedCounter.nativeTruncateFile(fd) != 0) {
                        throw new IOException("Failed to truncate counter file");
                    }
                    long jNativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd);
                    if (jNativeCreateSharedCounter < 0) {
                        throw new IOException("Failed to mmap counter file");
                    }
                    ehc ehcVar = new ehc(nativeSharedCounter, jNativeCreateSharedCounter);
                    parcelFileDescriptorOpen.close();
                    return ehcVar;
                } catch (Throwable th) {
                    if (0 != 0) {
                        cukVar.close();
                    }
                    throw th;
                }
            case 18:
                egt egtVar2 = (egt) this.a;
                File fileG2 = egtVar2.g(egtVar2.b);
                egt.h(fileG2);
                return fileG2;
            case 19:
                this.a.hy();
                return afak.a;
            default:
                Object objInvoke = this.a.invoke();
                File file = (File) objInvoke;
                if (!affa.f(adqs.x(file), "preferences_pb")) {
                    throw new IllegalStateException(a.bm(objInvoke, "File extension for file: ", " does not match required extension for Preferences file: preferences_pb"));
                }
                File absoluteFile = file.getAbsoluteFile();
                absoluteFile.getClass();
                return absoluteFile;
        }
    }
}
