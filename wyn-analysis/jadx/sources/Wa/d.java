package Wa;

import C8.d;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.Looper;
import b7.k;
import hd.n;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import uc.C4271h;
import uc.InterfaceC4270g;
import uc.InterfaceC4272i;
import yc.C4584g;

/* loaded from: classes4.dex */
public final class d implements InterfaceC4272i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15431a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15432b;

    public /* synthetic */ d(Object obj, int i5) {
        this.f15431a = i5;
        this.f15432b = obj;
    }

    @Override // uc.InterfaceC4272i
    public final void onCancel(Object obj) {
        switch (this.f15431a) {
            case 0:
                ((b) this.f15432b).f15428h = null;
                break;
            case 1:
                ((eb.d) this.f15432b).f34629a = null;
                break;
            case 2:
                n nVar = (n) this.f15432b;
                nVar.f36418a = null;
                nVar.b();
                break;
            default:
                C4584g c4584g = (C4584g) this.f15432b;
                E4.n nVar2 = c4584g.f48128r;
                if (nVar2 != null) {
                    ((ImageReader) nVar2.f2939c).setOnImageAvailableListener(null, c4584g.f48123m);
                    break;
                }
                break;
        }
    }

    @Override // uc.InterfaceC4272i
    public final void onListen(Object obj, InterfaceC4270g interfaceC4270g) {
        switch (this.f15431a) {
            case 0:
                ((b) this.f15432b).f15428h = (C4271h) interfaceC4270g;
                break;
            case 1:
                ((eb.d) this.f15432b).f34629a = (C4271h) interfaceC4270g;
                break;
            case 2:
                n nVar = (n) this.f15432b;
                nVar.f36418a = (C4271h) interfaceC4270g;
                nVar.b();
                break;
            default:
                C4584g c4584g = (C4584g) this.f15432b;
                final E4.n nVar2 = c4584g.f48128r;
                if (nVar2 != null) {
                    Handler handler = c4584g.f48123m;
                    final k kVar = c4584g.f48135y;
                    final C4271h c4271h = (C4271h) interfaceC4270g;
                    ((ImageReader) nVar2.f2939c).setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: Lc.a
                        @Override // android.media.ImageReader.OnImageAvailableListener
                        public final void onImageAvailable(ImageReader imageReader) {
                            E4.n nVar3 = nVar2;
                            nVar3.getClass();
                            Image imageAcquireNextImage = imageReader.acquireNextImage();
                            if (imageAcquireNextImage == null) {
                                return;
                            }
                            HashMap map = new HashMap();
                            map.put("width", Integer.valueOf(imageAcquireNextImage.getWidth()));
                            map.put("height", Integer.valueOf(imageAcquireNextImage.getHeight()));
                            C4271h c4271h2 = c4271h;
                            int i5 = nVar3.f2938b;
                            try {
                                try {
                                    if (i5 == 17) {
                                        map.put("planes", nVar3.r(imageAcquireNextImage));
                                    } else {
                                        map.put("planes", E4.n.u(imageAcquireNextImage));
                                    }
                                } catch (IllegalStateException e7) {
                                    new Handler(Looper.getMainLooper()).post(new d(20, c4271h2, e7));
                                }
                                imageAcquireNextImage.close();
                                map.put("format", Integer.valueOf(i5));
                                k kVar2 = kVar;
                                map.put("lensAperture", (Float) kVar2.f19396b);
                                map.put("sensorExposureTime", (Long) kVar2.f19397c);
                                map.put("sensorSensitivity", ((Integer) kVar2.f19398d) == null ? null : Double.valueOf(r8.intValue()));
                                Handler handler2 = new Handler(Looper.getMainLooper());
                                L7.b bVar = new L7.b(c4271h2, 1);
                                bVar.f6981b = new WeakReference(map);
                                handler2.post(bVar);
                            } catch (Throwable th) {
                                imageAcquireNextImage.close();
                                throw th;
                            }
                        }
                    }, handler);
                    break;
                }
                break;
        }
    }
}
