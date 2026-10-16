package com.waze.reports;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.core.content.ContextCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.ConfigManager;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.mg;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class eb extends android.support.v4.app.ar {
    private boolean A;
    private dz B;
    private int C;
    private int D;
    private int E;
    private int F;
    private final com.waze.shared_infra.o.a G;

    /* renamed from: a, reason: collision with root package name */
    private ImageButton f33890a;

    /* renamed from: b, reason: collision with root package name */
    private ImageButton f33891b;

    /* renamed from: c, reason: collision with root package name */
    private ImageButton f33892c;

    /* renamed from: d, reason: collision with root package name */
    private ImageButton f33893d;

    /* renamed from: e, reason: collision with root package name */
    private PreviewView f33894e;

    /* renamed from: f, reason: collision with root package name */
    private ImageView f33895f;

    /* renamed from: g, reason: collision with root package name */
    private FrameLayout f33896g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f33897h;

    /* renamed from: i, reason: collision with root package name */
    private TextView f33898i;

    /* renamed from: j, reason: collision with root package name */
    private View f33899j;

    /* renamed from: k, reason: collision with root package name */
    private View f33900k;

    /* renamed from: l, reason: collision with root package name */
    private View f33901l;
    private View m;
    private boolean n;
    private final Preview o;
    private final CameraSelector p;
    private com.google.d.m.a.bm q;
    private ImageCapture r;
    private final Executor s;
    private String t;
    private Bundle u;
    private final boolean v;
    private String w;
    private boolean x;
    private String y;
    private String z;

    public eb() {
        h.g.b.x.e(com.waze.shared_infra.i.a.d("TakePhotoFragment"), "create(...)");
        Preview previewBuild = new Preview.Builder().build();
        h.g.b.x.e(previewBuild, "build(...)");
        this.o = previewBuild;
        CameraSelector.Builder builder = new CameraSelector.Builder();
        builder.requireLensFacing(1);
        CameraSelector cameraSelectorBuild = builder.build();
        h.g.b.x.e(cameraSelectorBuild, "build(...)");
        this.p = cameraSelectorBuild;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        h.g.b.x.e(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.s = executorServiceNewSingleThreadExecutor;
        this.v = true;
        this.w = "newPlaceImage.jpg";
        this.y = com.waze.resources.h.d(mg.f29780a.a());
        this.C = R.string.CAMERA_EXPLAIN_TEXT;
        this.D = R.string.CAMERA_POST_CAPTURE;
        this.E = -1;
        this.G = com.waze.shared_infra.o.b.a();
    }

    static final void A(eb ebVar) {
        ebVar.D(new com.waze.car_lib.screens.am(ebVar, 16));
    }

    private final void B(String str, boolean z) {
        D(new dv(this, 0));
        PreviewView previewView = this.f33894e;
        ImageButton imageButton = null;
        if (previewView == null) {
            h.g.b.x.j("cameraPreview");
            previewView = null;
        }
        previewView.setVisibility(4);
        ImageView imageView = this.f33895f;
        if (imageView == null) {
            h.g.b.x.j("reviewImageView");
            imageView = null;
        }
        imageView.setVisibility(0);
        ImageView imageView2 = this.f33895f;
        if (imageView2 == null) {
            h.g.b.x.j("reviewImageView");
            imageView2 = null;
        }
        imageView2.setImageURI(Uri.fromFile(new File(str)));
        int i2 = 3;
        if (z) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setRepeatMode(2);
            alphaAnimation.setRepeatCount(1);
            alphaAnimation.setInterpolator(new AccelerateInterpolator(2.0f));
            alphaAnimation.setDuration(200L);
            View view = this.f33899j;
            if (view == null) {
                h.g.b.x.j("cameraFlashView");
                view = null;
            }
            view.setBackgroundColor(-1);
            alphaAnimation.setAnimationListener(new db(view, 3));
            view.setVisibility(0);
            view.startAnimation(alphaAnimation);
            FrameLayout frameLayout = this.f33896g;
            if (frameLayout == null) {
                h.g.b.x.j("cameraButtonFrame");
                frameLayout = null;
            }
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.8f, 1.0f, 0.8f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(200L);
            scaleAnimation.setRepeatMode(2);
            scaleAnimation.setRepeatCount(1);
            scaleAnimation.setInterpolator(new AnticipateInterpolator());
            frameLayout.startAnimation(scaleAnimation);
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setAnimationListener(new db(this, 2));
            alphaAnimation2.setDuration(100L);
            ImageButton imageButton2 = this.f33890a;
            if (imageButton2 == null) {
                h.g.b.x.j("cameraOk");
                imageButton2 = null;
            }
            imageButton2.startAnimation(alphaAnimation2);
        } else {
            ImageButton imageButton3 = this.f33890a;
            if (imageButton3 == null) {
                h.g.b.x.j("cameraOk");
                imageButton3 = null;
            }
            imageButton3.setOnClickListener(null);
            ImageButton imageButton4 = this.f33890a;
            if (imageButton4 == null) {
                h.g.b.x.j("cameraOk");
                imageButton4 = null;
            }
            imageButton4.setVisibility(8);
            ImageButton imageButton5 = this.f33891b;
            if (imageButton5 == null) {
                h.g.b.x.j("cameraDone");
                imageButton5 = null;
            }
            imageButton5.setVisibility(0);
        }
        int i3 = this.D;
        TextView textView = this.f33897h;
        if (i3 != -1) {
            if (textView == null) {
                h.g.b.x.j("explainText");
                textView = null;
            }
            textView.setText(this.G.c(this.D, new Object[0]));
        } else {
            if (textView == null) {
                h.g.b.x.j("explainText");
                textView = null;
            }
            textView.setText((CharSequence) null);
        }
        ImageButton imageButton6 = this.f33893d;
        if (imageButton6 == null) {
            h.g.b.x.j("cameraRetake");
            imageButton6 = null;
        }
        imageButton6.setEnabled(true);
        ImageButton imageButton7 = this.f33893d;
        if (imageButton7 == null) {
            h.g.b.x.j("cameraRetake");
            imageButton7 = null;
        }
        I(imageButton7, 0.5f, 1.0f);
        ImageButton imageButton8 = this.f33893d;
        if (imageButton8 == null) {
            h.g.b.x.j("cameraRetake");
            imageButton8 = null;
        }
        imageButton8.setOnClickListener(new cv(this, 5));
        ImageButton imageButton9 = this.f33892c;
        if (imageButton9 == null) {
            h.g.b.x.j("cameraFlash");
            imageButton9 = null;
        }
        imageButton9.setEnabled(false);
        ImageButton imageButton10 = this.f33892c;
        if (imageButton10 == null) {
            h.g.b.x.j("cameraFlash");
            imageButton10 = null;
        }
        I(imageButton10, 1.0f, 0.5f);
        ImageButton imageButton11 = this.f33891b;
        if (imageButton11 == null) {
            h.g.b.x.j("cameraDone");
        } else {
            imageButton = imageButton11;
        }
        imageButton.setOnClickListener(new cu(str, this, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void C() {
        PreviewView previewView = this.f33894e;
        Object obj = null;
        if (previewView == null) {
            h.g.b.x.j("cameraPreview");
            previewView = null;
        }
        int height = previewView.getHeight();
        PreviewView previewView2 = this.f33894e;
        if (height == 0) {
            if (previewView2 == null) {
                h.g.b.x.j("cameraPreview");
            } else {
                obj = previewView2;
            }
            com.waze.ad.a.j.c((View) obj, new dx(this, 2));
            return;
        }
        if (previewView2 == null) {
            h.g.b.x.j("cameraPreview");
            previewView2 = null;
        }
        previewView2.setImplementationMode(PreviewView.ImplementationMode.COMPATIBLE);
        Preview preview = this.o;
        PreviewView previewView3 = this.f33894e;
        if (previewView3 == null) {
            h.g.b.x.j("cameraPreview");
            previewView3 = null;
        }
        preview.setSurfaceProvider(previewView3.getSurfaceProvider());
        float configValueInt = ConfigManager.getInstance().getConfigValueInt(ConfigValues.CONFIG_VALUE_PLACES_MAX_IMAGE_SIZE_PX);
        PreviewView previewView4 = this.f33894e;
        if (previewView4 == null) {
            h.g.b.x.j("cameraPreview");
            previewView4 = null;
        }
        float width = previewView4.getWidth();
        PreviewView previewView5 = this.f33894e;
        if (previewView5 == null) {
            h.g.b.x.j("cameraPreview");
            previewView5 = null;
        }
        float fSqrt = (float) Math.sqrt((width / previewView5.getHeight()) * configValueInt);
        Size size = new Size((int) fSqrt, (int) (configValueInt / fSqrt));
        ImageCapture.Builder builder = new ImageCapture.Builder();
        ResolutionSelector.Builder builder2 = new ResolutionSelector.Builder();
        builder2.setResolutionStrategy(new ResolutionStrategy(size, 3));
        builder.setResolutionSelector(builder2.build());
        builder.setFlashMode(2);
        ImageCapture imageCaptureBuild = builder.build();
        h.g.b.x.e(imageCaptureBuild, "build(...)");
        this.r = imageCaptureBuild;
        String str = this.z;
        com.google.d.m.a.bm bmVar = this.q;
        if (str != null) {
            if (bmVar == null) {
                h.g.b.x.j("cameraProviderFuture");
                bmVar = null;
            }
            ProcessCameraProvider processCameraProvider = (ProcessCameraProvider) bmVar.get();
            eb ebVar = this;
            CameraSelector cameraSelector = this.p;
            UseCase[] useCaseArr = new UseCase[1];
            Object obj2 = this.r;
            if (obj2 == null) {
                h.g.b.x.j("imageCapture");
            } else {
                obj = obj2;
            }
            useCaseArr[0] = obj;
            processCameraProvider.bindToLifecycle(ebVar, cameraSelector, useCaseArr);
        } else {
            if (bmVar == null) {
                h.g.b.x.j("cameraProviderFuture");
                bmVar = null;
            }
            ProcessCameraProvider processCameraProvider2 = (ProcessCameraProvider) bmVar.get();
            eb ebVar2 = this;
            CameraSelector cameraSelector2 = this.p;
            UseCase[] useCaseArr2 = new UseCase[2];
            Object obj3 = this.r;
            if (obj3 == null) {
                h.g.b.x.j("imageCapture");
            } else {
                obj = obj3;
            }
            useCaseArr2[0] = obj;
            useCaseArr2[1] = preview;
            processCameraProvider2.bindToLifecycle(ebVar2, cameraSelector2, useCaseArr2);
        }
        this.n = true;
    }

    private final void D(h.g.a.l lVar) {
        if (!this.n) {
            com.waze.shared_infra.i.h.k("TakePhotoFragment", "Ignoring operation, camera not ready");
            return;
        }
        com.google.d.m.a.bm bmVar = this.q;
        if (bmVar == null) {
            h.g.b.x.j("cameraProviderFuture");
            bmVar = null;
        }
        V v = bmVar.get();
        h.g.b.x.e(v, "get(...)");
        lVar.invoke(v);
    }

    private final void E() {
        int i2 = this.E;
        TextView textView = this.f33898i;
        TextView textView2 = null;
        if (i2 != -1) {
            if (textView == null) {
                h.g.b.x.j("commentText");
                textView = null;
            }
            textView.setText(this.G.c(this.E, new Object[0]));
            TextView textView3 = this.f33898i;
            if (textView3 == null) {
                h.g.b.x.j("commentText");
                textView3 = null;
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(this.F, 0, 0, 0);
            TextView textView4 = this.f33898i;
            if (textView4 == null) {
                h.g.b.x.j("commentText");
            } else {
                textView2 = textView4;
            }
            textView2.setVisibility(0);
            return;
        }
        if (textView == null) {
            h.g.b.x.j("commentText");
            textView = null;
        }
        textView.setText((CharSequence) null);
        TextView textView5 = this.f33898i;
        if (textView5 == null) {
            h.g.b.x.j("commentText");
            textView5 = null;
        }
        textView5.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        TextView textView6 = this.f33898i;
        if (textView6 == null) {
            h.g.b.x.j("commentText");
        } else {
            textView2 = textView6;
        }
        textView2.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F() {
        TextView textView = this.f33897h;
        ImageButton imageButton = null;
        if (textView == null) {
            h.g.b.x.j("explainText");
            textView = null;
        }
        textView.setText(this.G.c(this.C, new Object[0]));
        E();
        ImageButton imageButton2 = this.f33891b;
        if (imageButton2 == null) {
            h.g.b.x.j("cameraDone");
            imageButton2 = null;
        }
        imageButton2.setOnClickListener(null);
        ImageButton imageButton3 = this.f33891b;
        if (imageButton3 == null) {
            h.g.b.x.j("cameraDone");
            imageButton3 = null;
        }
        imageButton3.setVisibility(8);
        ImageButton imageButton4 = this.f33890a;
        if (imageButton4 == null) {
            h.g.b.x.j("cameraOk");
            imageButton4 = null;
        }
        imageButton4.setVisibility(0);
        ImageButton imageButton5 = this.f33890a;
        if (imageButton5 == null) {
            h.g.b.x.j("cameraOk");
            imageButton5 = null;
        }
        imageButton5.clearAnimation();
        ImageButton imageButton6 = this.f33890a;
        if (imageButton6 == null) {
            h.g.b.x.j("cameraOk");
            imageButton6 = null;
        }
        imageButton6.setOnClickListener(new cv(this, 3));
        ImageButton imageButton7 = this.f33893d;
        if (imageButton7 == null) {
            h.g.b.x.j("cameraRetake");
            imageButton7 = null;
        }
        imageButton7.setEnabled(false);
        ImageButton imageButton8 = this.f33893d;
        if (imageButton8 == null) {
            h.g.b.x.j("cameraRetake");
            imageButton8 = null;
        }
        I(imageButton8, 1.0f, 0.5f);
        ImageButton imageButton9 = this.f33892c;
        if (imageButton9 == null) {
            h.g.b.x.j("cameraFlash");
            imageButton9 = null;
        }
        imageButton9.setEnabled(true);
        ImageButton imageButton10 = this.f33892c;
        if (imageButton10 == null) {
            h.g.b.x.j("cameraFlash");
            imageButton10 = null;
        }
        imageButton10.clearAnimation();
        ImageButton imageButton11 = this.f33892c;
        if (imageButton11 == null) {
            h.g.b.x.j("cameraFlash");
            imageButton11 = null;
        }
        imageButton11.setOnClickListener(new cv(this, 4));
        ImageButton imageButton12 = this.f33892c;
        if (imageButton12 == null) {
            h.g.b.x.j("cameraFlash");
        } else {
            imageButton = imageButton12;
        }
        imageButton.setImageResource(R.drawable.take_photo_flashoff);
        D(new dv(this, 2));
    }

    private final void G() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new AccelerateInterpolator(2.0f));
        alphaAnimation.setDuration(200L);
        View view = this.f33899j;
        if (view == null) {
            h.g.b.x.j("cameraFlashView");
            view = null;
        }
        view.setBackgroundColor(-16777216);
        alphaAnimation.setAnimationListener(new db(this, 5));
        view.setVisibility(0);
        view.startAnimation(alphaAnimation);
    }

    private final boolean H() {
        android.support.v4.app.av activity = getActivity();
        com.waze.ifs.ui.a aVar = activity instanceof com.waze.ifs.ui.a ? (com.waze.ifs.ui.a) activity : null;
        if (aVar != null) {
            return aVar.aB();
        }
        View viewRequireView = requireView();
        return viewRequireView.getHeight() > viewRequireView.getWidth();
    }

    private static final void I(View view, float f2, float f3) {
        if (view != null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
            alphaAnimation.setInterpolator(new AccelerateInterpolator(2.0f));
            alphaAnimation.setDuration(200L);
            alphaAnimation.setFillAfter(true);
            view.startAnimation(alphaAnimation);
        }
    }

    public static /* synthetic */ h.ab c(final eb ebVar, ProcessCameraProvider processCameraProvider) {
        h.g.b.x.f(processCameraProvider, "it");
        ImageCapture imageCapture = ebVar.r;
        if (imageCapture == null) {
            h.g.b.x.j("imageCapture");
            imageCapture = null;
        }
        int flashMode = imageCapture.getFlashMode();
        final int i2 = 2;
        if (flashMode != 0) {
            if (flashMode == 1) {
                i2 = 0;
            } else if (flashMode == 2) {
                i2 = 1;
            }
        }
        ebVar.D(new h.g.a.l() { // from class: com.waze.reports.dw
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return eb.e(this.f33882a, i2, (ProcessCameraProvider) obj);
            }
        });
        return h.ab.f48028a;
    }

    static final h.ab d(eb ebVar, ProcessCameraProvider processCameraProvider) {
        h.g.b.x.f(processCameraProvider, "it");
        processCameraProvider.bindToLifecycle(ebVar, ebVar.p, ebVar.o);
        return h.ab.f48028a;
    }

    static final h.ab e(eb ebVar, int i2, ProcessCameraProvider processCameraProvider) {
        h.g.b.x.f(processCameraProvider, "it");
        ImageCapture imageCapture = ebVar.r;
        ImageButton imageButton = null;
        if (imageCapture == null) {
            h.g.b.x.j("imageCapture");
            imageCapture = null;
        }
        imageCapture.setFlashMode(i2);
        if (i2 == 0) {
            ImageButton imageButton2 = ebVar.f33892c;
            if (imageButton2 == null) {
                h.g.b.x.j("cameraFlash");
            } else {
                imageButton = imageButton2;
            }
            imageButton.setImageResource(R.drawable.take_photo_autoflash);
        } else if (i2 != 1) {
            ImageButton imageButton3 = ebVar.f33892c;
            if (imageButton3 == null) {
                h.g.b.x.j("cameraFlash");
            } else {
                imageButton = imageButton3;
            }
            imageButton.setImageResource(R.drawable.take_photo_flashoff);
        } else {
            ImageButton imageButton4 = ebVar.f33892c;
            if (imageButton4 == null) {
                h.g.b.x.j("cameraFlash");
            } else {
                imageButton = imageButton4;
            }
            imageButton.setImageResource(R.drawable.take_photo_flash);
        }
        return h.ab.f48028a;
    }

    static final h.ab f(eb ebVar, ProcessCameraProvider processCameraProvider) {
        h.g.b.x.f(processCameraProvider, "it");
        ImageCapture imageCapture = ebVar.r;
        if (imageCapture == null) {
            h.g.b.x.j("imageCapture");
            imageCapture = null;
        }
        imageCapture.setFlashMode(2);
        return h.ab.f48028a;
    }

    static final h.ab g(eb ebVar, ProcessCameraProvider processCameraProvider) {
        h.g.b.x.f(processCameraProvider, "it");
        processCameraProvider.unbind(ebVar.o);
        return h.ab.f48028a;
    }

    static final h.ab h(eb ebVar, ProcessCameraProvider processCameraProvider) {
        h.g.b.x.f(processCameraProvider, "it");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ImageCapture.OutputFileOptions outputFileOptionsBuild = new ImageCapture.OutputFileOptions.Builder(byteArrayOutputStream).build();
        ImageCapture imageCapture = ebVar.r;
        if (imageCapture == null) {
            h.g.b.x.j("imageCapture");
            imageCapture = null;
        }
        imageCapture.m1324lambda$takePicture$2$androidxcameracoreImageCapture(outputFileOptionsBuild, ebVar.s, new ea(ebVar, byteArrayOutputStream));
        return h.ab.f48028a;
    }

    public static /* synthetic */ void j(eb ebVar) {
        Bundle bundle = ebVar.u;
        if (bundle != null) {
            int i2 = bundle.getInt(TtmlNode.LEFT);
            int i3 = bundle.getInt("top");
            int i4 = bundle.getInt("width");
            int i5 = bundle.getInt("height");
            int[] iArr = new int[2];
            ImageButton imageButton = ebVar.f33890a;
            View view = null;
            if (imageButton == null) {
                h.g.b.x.j("cameraOk");
                imageButton = null;
            }
            imageButton.getLocationInWindow(iArr);
            AnimationSet animationSet = new AnimationSet(false);
            ImageButton imageButton2 = ebVar.f33890a;
            if (imageButton2 == null) {
                h.g.b.x.j("cameraOk");
                imageButton2 = null;
            }
            int width = imageButton2.getWidth();
            ImageButton imageButton3 = ebVar.f33890a;
            if (imageButton3 == null) {
                h.g.b.x.j("cameraOk");
                imageButton3 = null;
            }
            ScaleAnimation scaleAnimation = new ScaleAnimation(i4 / width, 1.0f, i5 / imageButton3.getHeight(), 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(825L);
            scaleAnimation.setInterpolator(new OvershootInterpolator(2.0f));
            animationSet.addAnimation(scaleAnimation);
            TranslateAnimation translateAnimation = new TranslateAnimation(0, (i2 + (i4 / 2)) - (iArr[0] + (width / 2)), 1, 0.0f, 0, (i3 + (i5 / 2)) - (iArr[1] + (r12 / 2)), 1, 0.0f);
            translateAnimation.setDuration(550L);
            translateAnimation.setInterpolator(new AnticipateInterpolator(0.875f));
            animationSet.addAnimation(translateAnimation);
            ImageButton imageButton4 = ebVar.f33890a;
            if (imageButton4 == null) {
                h.g.b.x.j("cameraOk");
                imageButton4 = null;
            }
            imageButton4.startAnimation(animationSet);
            View view2 = ebVar.f33901l;
            if (view2 == null) {
                h.g.b.x.j("curtains");
                view2 = null;
            }
            View view3 = ebVar.m;
            if (view3 == null) {
                h.g.b.x.j("bottomCurtains");
            } else {
                view = view3;
            }
            boolean z = ebVar.v;
            int i6 = !z ? 1 : 0;
            float f2 = z ? 1.0f : 0.0f;
            float f3 = i6;
            ScaleAnimation scaleAnimation2 = new ScaleAnimation(f2, 1.0f, f3, 1.0f, 1, 0.0f, 1, 0.0f);
            ScaleAnimation scaleAnimation3 = new ScaleAnimation(f2, 1.0f, f3, 1.0f, 1, 1.0f, 1, 1.0f);
            scaleAnimation2.setDuration(550L);
            scaleAnimation2.setStartOffset(275L);
            scaleAnimation2.setFillBefore(true);
            scaleAnimation3.setDuration(550L);
            scaleAnimation3.setStartOffset(275L);
            scaleAnimation3.setFillBefore(true);
            view2.startAnimation(scaleAnimation2);
            view.startAnimation(scaleAnimation3);
        }
    }

    public static final /* synthetic */ void k(eb ebVar) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setInterpolator(new AccelerateInterpolator(2.0f));
        alphaAnimation.setDuration(200L);
        View view = ebVar.f33899j;
        if (view == null) {
            h.g.b.x.j("cameraFlashView");
            view = null;
        }
        view.setBackgroundColor(-16777216);
        view.setVisibility(0);
        alphaAnimation.setAnimationListener(new db(view, 4));
        view.startAnimation(alphaAnimation);
    }

    public static final /* synthetic */ void l(eb ebVar) {
        ebVar.D(new dv(ebVar, 4));
        PreviewView previewView = ebVar.f33894e;
        if (previewView == null) {
            h.g.b.x.j("cameraPreview");
            previewView = null;
        }
        previewView.setVisibility(0);
        ImageView imageView = ebVar.f33895f;
        if (imageView == null) {
            h.g.b.x.j("reviewImageView");
            imageView = null;
        }
        imageView.setVisibility(8);
        ImageView imageView2 = ebVar.f33895f;
        if (imageView2 == null) {
            h.g.b.x.j("reviewImageView");
            imageView2 = null;
        }
        imageView2.setImageURI(null);
        ebVar.z = null;
    }

    static final void o(eb ebVar, String str) {
        ebVar.B(str, true);
        ebVar.z = str;
    }

    static final void p(eb ebVar) {
        ebVar.G();
    }

    static final void q(eb ebVar) {
        ebVar.C();
    }

    static final void r(eb ebVar) {
        Size size;
        View viewRequireView = ebVar.requireView();
        if (ebVar.H()) {
            size = new Size(viewRequireView.getWidth(), (int) ((viewRequireView.getWidth() / 1600.0f) * 1200.0f));
        } else {
            size = new Size((int) ((viewRequireView.getHeight() / 1200.0f) * 1600.0f), viewRequireView.getHeight());
        }
        View view = ebVar.f33900k;
        View view2 = null;
        if (view == null) {
            h.g.b.x.j("cameraCropWindow");
            view = null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = size.getWidth();
        layoutParams.height = size.getHeight();
        View view3 = ebVar.f33900k;
        if (view3 == null) {
            h.g.b.x.j("cameraCropWindow");
        } else {
            view2 = view3;
        }
        view2.setLayoutParams(layoutParams);
    }

    static final void v(eb ebVar) {
        ImageButton imageButton = ebVar.f33893d;
        if (imageButton == null) {
            h.g.b.x.j("cameraRetake");
            imageButton = null;
        }
        imageButton.setEnabled(false);
        ebVar.G();
    }

    static final void w(String str, eb ebVar) {
        File file = new File(str);
        dz dzVar = ebVar.B;
        if (dzVar != null) {
            Uri.fromFile(file);
            dzVar.G(file.getAbsolutePath());
        }
    }

    static final void z(eb ebVar) {
        ImageButton imageButton = ebVar.f33890a;
        ImageButton imageButton2 = null;
        if (imageButton == null) {
            h.g.b.x.j("cameraOk");
            imageButton = null;
        }
        imageButton.setOnClickListener(null);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.8f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setRepeatMode(2);
        alphaAnimation.setRepeatCount(100);
        alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        ImageButton imageButton3 = ebVar.f33890a;
        if (imageButton3 == null) {
            h.g.b.x.j("cameraOk");
        } else {
            imageButton2 = imageButton3;
        }
        imageButton2.startAnimation(alphaAnimation);
        ebVar.D(new dv(ebVar, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(java.io.ByteArrayOutputStream r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports.eb.n(java.io.ByteArrayOutputStream):void");
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.g.b.x.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View viewInflate = layoutInflater.inflate(R.layout.camera_preview, viewGroup, false);
        h.g.b.x.e(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // android.support.v4.app.ar
    /* renamed from: onSaveInstanceState */
    public final void m47x22bc4f96(Bundle bundle) {
        h.g.b.x.f(bundle, "outState");
        String str = this.z;
        if (str != null) {
            bundle.putString("key_photo_path", str);
        }
    }

    @Override // android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        h.g.b.x.f(view, "view");
        View viewFindViewById = view.findViewById(R.id.cameraOk);
        h.g.b.x.e(viewFindViewById, "findViewById(...)");
        this.f33890a = (ImageButton) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.cameraDone);
        h.g.b.x.e(viewFindViewById2, "findViewById(...)");
        this.f33891b = (ImageButton) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.cameraFlash);
        h.g.b.x.e(viewFindViewById3, "findViewById(...)");
        this.f33892c = (ImageButton) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.cameraRetake);
        h.g.b.x.e(viewFindViewById4, "findViewById(...)");
        this.f33893d = (ImageButton) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.cameraPreview);
        h.g.b.x.e(viewFindViewById5, "findViewById(...)");
        this.f33894e = (PreviewView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.reviewImageView);
        h.g.b.x.e(viewFindViewById6, "findViewById(...)");
        this.f33895f = (ImageView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.cameraButtonFrame);
        h.g.b.x.e(viewFindViewById7, "findViewById(...)");
        this.f33896g = (FrameLayout) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.explainText);
        h.g.b.x.e(viewFindViewById8, "findViewById(...)");
        this.f33897h = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.commentText);
        h.g.b.x.e(viewFindViewById9, "findViewById(...)");
        this.f33898i = (TextView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.cameraFlashView);
        h.g.b.x.e(viewFindViewById10, "findViewById(...)");
        this.f33899j = viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.cameraCropWindow);
        h.g.b.x.e(viewFindViewById11, "findViewById(...)");
        this.f33900k = viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.curtains);
        h.g.b.x.e(viewFindViewById12, "findViewById(...)");
        this.f33901l = viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R.id.bottomCurtains);
        h.g.b.x.e(viewFindViewById13, "findViewById(...)");
        this.m = viewFindViewById13;
        int i2 = getResources().getDisplayMetrics().heightPixels;
        int i3 = getResources().getDisplayMetrics().widthPixels;
        File file = new File(this.y + File.separator + this.w);
        if (!this.x) {
            int i4 = 0;
            while (file.exists()) {
                i4++;
                file = new File(this.y + File.separator + this.w + i4);
            }
            if (i4 > 0) {
                this.w = this.w + i4;
            }
        }
        this.t = this.y + File.separator + this.w;
        if (bundle != null) {
            this.z = bundle.getString("key_photo_path");
        }
        String str = this.z;
        TextView textView = null;
        if (str != null) {
            E();
            B(str, false);
        } else {
            if (this.A) {
                this.A = false;
                ImageButton imageButton = this.f33890a;
                if (imageButton == null) {
                    h.g.b.x.j("cameraOk");
                    imageButton = null;
                }
                com.waze.ad.a.j.c(imageButton, new com.waze.g.f(this, 9));
            }
            F();
        }
        PreviewView previewView = this.f33894e;
        if (previewView == null) {
            h.g.b.x.j("cameraPreview");
            previewView = null;
        }
        com.waze.ad.a.j.c(previewView, new dx(this, 0));
        ProcessCameraProvider.Companion companion = ProcessCameraProvider.Companion;
        Context contextRequireContext = requireContext();
        h.g.b.x.e(contextRequireContext, "requireContext(...)");
        com.google.d.m.a.bm<ProcessCameraProvider> companion2 = companion.getInstance(contextRequireContext);
        companion2.addListener(new com.waze.g.f(this, 10), ContextCompat.getMainExecutor(requireContext()));
        this.q = companion2;
        View viewFindViewById14 = requireView().findViewById(R.id.captureButtons);
        if (!H()) {
            View viewFindViewById15 = requireView().findViewById(R.id.mainView);
            h.g.b.x.c(viewFindViewById15);
            com.waze.shared_infra.g.e.c(viewFindViewById15);
            h.g.b.x.c(viewFindViewById14);
            com.waze.shared_infra.g.e.e(viewFindViewById14, false, false, true, false);
            return;
        }
        TextView textView2 = this.f33897h;
        if (textView2 == null) {
            h.g.b.x.j("explainText");
        } else {
            textView = textView2;
        }
        com.waze.shared_infra.g.e.e(textView, false, true, false, false);
        h.g.b.x.c(viewFindViewById14);
        com.waze.shared_infra.g.e.e(viewFindViewById14, false, false, false, true);
    }

    public final void s(Bundle bundle) {
        this.A = bundle != null;
        this.u = bundle;
    }

    public final void t(dz dzVar) {
        this.B = dzVar;
    }

    public final void u(String str) {
        h.g.b.x.f(str, "absolutePath");
        File file = new File(str);
        String name = file.getName();
        h.g.b.x.e(name, "getName(...)");
        this.w = name;
        String parent = file.getParent();
        if (parent == null) {
            parent = "";
        }
        this.y = parent;
    }

    public final void x() {
        this.C = R.string.PARKED_TAKE_PHOTO_DESCRIPTION;
        this.D = -1;
        this.E = R.string.PARKED_TAKE_PHOTO_COMMENT;
        this.F = R.drawable.camera_view_eye_icon;
    }

    public final void y() {
        this.x = true;
    }
}
