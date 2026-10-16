package androidx.camera.core;

import android.graphics.Bitmap;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.imagecapture.RequestWithCallback;
import androidx.camera.core.imagecapture.TakePictureRequest;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import e.b.c;
import h.ab;
import h.c.e;
import h.c.g;
import h.c.h;
import h.d.b;
import h.g.a.a;
import h.g.a.l;
import h.g.b.aq;
import h.g.b.x;
import java.util.concurrent.Executor;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ImageCaptureExtKt {
    public static final TakePictureRequest getTakePictureRequest(ImageCapture imageCapture) {
        x.f(imageCapture, "<this>");
        RequestWithCallback capturingRequest = imageCapture.getTakePictureManager().getCapturingRequest();
        if (capturingRequest != null) {
            return capturingRequest.getTakePictureRequest();
        }
        return null;
    }

    public static final Object takePicture(ImageCapture imageCapture, ImageCapture.OutputFileOptions outputFileOptions, final a<ab> aVar, final l<? super Integer, ab> lVar, final l<? super Bitmap, ab> lVar2, e<? super ImageCapture.OutputFileResults> eVar) {
        Executor executorDirectExecutor;
        h hVar = eVar.getContext().get(g.f48059a);
        DelegatingImageSavedCallback delegatingImageSavedCallback = null;
        kotlinx.coroutines.ab abVar = hVar instanceof kotlinx.coroutines.ab ? (kotlinx.coroutines.ab) hVar : null;
        if (abVar != null) {
            executorDirectExecutor = bo.e(abVar);
        } else {
            executorDirectExecutor = CameraXExecutors.directExecutor();
            x.e(executorDirectExecutor, "directExecutor(...)");
        }
        kotlinx.coroutines.l lVar3 = new kotlinx.coroutines.l(h.c.a.h.d(eVar), 1);
        lVar3.u();
        final kotlinx.coroutines.l lVar4 = lVar3;
        final aq aqVar = new aq();
        aqVar.f48105a = new DelegatingImageSavedCallback(new ImageCapture.OnImageSavedCallback() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$4$1
            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onCaptureProcessProgressed(int i2) {
                l<Integer, ab> lVar5 = lVar;
                if (lVar5 != null) {
                    lVar5.invoke(Integer.valueOf(i2));
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onCaptureStarted() {
                a<ab> aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onError(ImageCaptureException imageCaptureException) {
                DelegatingImageSavedCallback delegatingImageSavedCallback2;
                x.f(imageCaptureException, "exception");
                Object obj = aqVar.f48105a;
                if (obj == null) {
                    x.j("delegatingCallback");
                    delegatingImageSavedCallback2 = null;
                } else {
                    delegatingImageSavedCallback2 = (DelegatingImageSavedCallback) obj;
                }
                delegatingImageSavedCallback2.dispose();
                lVar4.resumeWith(c.a(imageCaptureException));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onImageSaved(ImageCapture.OutputFileResults outputFileResults) {
                DelegatingImageSavedCallback delegatingImageSavedCallback2;
                x.f(outputFileResults, "outputFileResults");
                Object obj = aqVar.f48105a;
                if (obj == null) {
                    x.j("delegatingCallback");
                    delegatingImageSavedCallback2 = null;
                } else {
                    delegatingImageSavedCallback2 = (DelegatingImageSavedCallback) obj;
                }
                delegatingImageSavedCallback2.dispose();
                lVar4.resumeWith(outputFileResults);
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onPostviewBitmapAvailable(Bitmap bitmap) {
                x.f(bitmap, "bitmap");
                l<Bitmap, ab> lVar5 = lVar2;
                if (lVar5 != null) {
                    lVar5.invoke(bitmap);
                }
            }
        });
        lVar4.c(new l<Throwable, ab>() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$4$2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                DelegatingImageSavedCallback delegatingImageSavedCallback2;
                Object obj = aqVar.f48105a;
                if (obj == null) {
                    x.j("delegatingCallback");
                    delegatingImageSavedCallback2 = null;
                } else {
                    delegatingImageSavedCallback2 = (DelegatingImageSavedCallback) obj;
                }
                delegatingImageSavedCallback2.dispose();
            }

            @Override // h.g.a.l
            public /* bridge */ /* synthetic */ ab invoke(Throwable th) {
                invoke2(th);
                return ab.f48028a;
            }
        });
        Object obj = aqVar.f48105a;
        if (obj == null) {
            x.j("delegatingCallback");
        } else {
            delegatingImageSavedCallback = (DelegatingImageSavedCallback) obj;
        }
        imageCapture.m1324lambda$takePicture$2$androidxcameracoreImageCapture(outputFileOptions, executorDirectExecutor, delegatingImageSavedCallback);
        Object objJ = lVar3.j();
        if (objJ == h.c.a.a.f48038a) {
            b.c(eVar);
        }
        return objJ;
    }

    public static /* synthetic */ Object takePicture$default(ImageCapture imageCapture, a aVar, l lVar, l lVar2, e eVar, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            aVar = null;
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        if ((i2 & 4) != 0) {
            lVar2 = null;
        }
        return takePicture(imageCapture, aVar, lVar, lVar2, eVar);
    }

    public static /* synthetic */ Object takePicture$default(ImageCapture imageCapture, ImageCapture.OutputFileOptions outputFileOptions, a aVar, l lVar, l lVar2, e eVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            aVar = null;
        }
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        if ((i2 & 8) != 0) {
            lVar2 = null;
        }
        return takePicture(imageCapture, outputFileOptions, aVar, lVar, lVar2, eVar);
    }

    public static final Object takePicture(ImageCapture imageCapture, final a<ab> aVar, final l<? super Integer, ab> lVar, final l<? super Bitmap, ab> lVar2, e<? super ImageProxy> eVar) {
        Executor executorDirectExecutor;
        h hVar = eVar.getContext().get(g.f48059a);
        DelegatingImageCapturedCallback delegatingImageCapturedCallback = null;
        kotlinx.coroutines.ab abVar = hVar instanceof kotlinx.coroutines.ab ? (kotlinx.coroutines.ab) hVar : null;
        if (abVar != null) {
            executorDirectExecutor = bo.e(abVar);
        } else {
            executorDirectExecutor = CameraXExecutors.directExecutor();
            x.e(executorDirectExecutor, "directExecutor(...)");
        }
        kotlinx.coroutines.l lVar3 = new kotlinx.coroutines.l(h.c.a.h.d(eVar), 1);
        lVar3.u();
        final kotlinx.coroutines.l lVar4 = lVar3;
        final aq aqVar = new aq();
        aqVar.f48105a = new DelegatingImageCapturedCallback(new ImageCapture.OnImageCapturedCallback() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$2$1
            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onCaptureProcessProgressed(int i2) {
                l<Integer, ab> lVar5 = lVar;
                if (lVar5 != null) {
                    lVar5.invoke(Integer.valueOf(i2));
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onCaptureStarted() {
                a<ab> aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onCaptureSuccess(ImageProxy imageProxy) {
                DelegatingImageCapturedCallback delegatingImageCapturedCallback2;
                x.f(imageProxy, "imageProxy");
                Object obj = aqVar.f48105a;
                if (obj == null) {
                    x.j("delegatingCallback");
                    delegatingImageCapturedCallback2 = null;
                } else {
                    delegatingImageCapturedCallback2 = (DelegatingImageCapturedCallback) obj;
                }
                delegatingImageCapturedCallback2.dispose();
                lVar4.resumeWith(imageProxy);
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onError(ImageCaptureException imageCaptureException) {
                DelegatingImageCapturedCallback delegatingImageCapturedCallback2;
                x.f(imageCaptureException, "exception");
                Object obj = aqVar.f48105a;
                if (obj == null) {
                    x.j("delegatingCallback");
                    delegatingImageCapturedCallback2 = null;
                } else {
                    delegatingImageCapturedCallback2 = (DelegatingImageCapturedCallback) obj;
                }
                delegatingImageCapturedCallback2.dispose();
                lVar4.resumeWith(c.a(imageCaptureException));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onPostviewBitmapAvailable(Bitmap bitmap) {
                x.f(bitmap, "bitmap");
                l<Bitmap, ab> lVar5 = lVar2;
                if (lVar5 != null) {
                    lVar5.invoke(bitmap);
                }
            }
        });
        lVar4.c(new l<Throwable, ab>() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$2$2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                DelegatingImageCapturedCallback delegatingImageCapturedCallback2;
                Object obj = aqVar.f48105a;
                if (obj == null) {
                    x.j("delegatingCallback");
                    delegatingImageCapturedCallback2 = null;
                } else {
                    delegatingImageCapturedCallback2 = (DelegatingImageCapturedCallback) obj;
                }
                delegatingImageCapturedCallback2.dispose();
            }

            @Override // h.g.a.l
            public /* bridge */ /* synthetic */ ab invoke(Throwable th) {
                invoke2(th);
                return ab.f48028a;
            }
        });
        Object obj = aqVar.f48105a;
        if (obj == null) {
            x.j("delegatingCallback");
        } else {
            delegatingImageCapturedCallback = (DelegatingImageCapturedCallback) obj;
        }
        imageCapture.m1323lambda$takePicture$1$androidxcameracoreImageCapture(executorDirectExecutor, delegatingImageCapturedCallback);
        Object objJ = lVar3.j();
        if (objJ == h.c.a.a.f48038a) {
            b.c(eVar);
        }
        return objJ;
    }
}
