package q;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import c1.InterfaceC1545a;
import i.AbstractC2820a;
import j1.AbstractC3076d;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import y1.C4526g;
import y3.C4552j;

/* renamed from: q.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3845x {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f43938d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43939a = 2;

    /* renamed from: b, reason: collision with root package name */
    public View f43940b;

    /* renamed from: c, reason: collision with root package name */
    public Object f43941c;

    public /* synthetic */ C3845x() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((S3.s) ((C4552j) this.f43941c).f48001b).getClass();
        if (keyListener instanceof A1.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new A1.e(keyListener);
    }

    public void b(AttributeSet attributeSet, int i5) {
        switch (this.f43939a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f43940b;
                md.J jS = md.J.s(absSeekBar.getContext(), attributeSet, f43938d, i5, 0);
                Drawable drawableO = jS.o(0);
                if (drawableO != null) {
                    if (drawableO instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableO;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i10 = 0; i10 < numberOfFrames; i10++) {
                            Drawable drawableE = e(animationDrawable.getFrame(i10), true);
                            drawableE.setLevel(10000);
                            animationDrawable2.addFrame(drawableE, animationDrawable.getDuration(i10));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableO = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableO);
                }
                Drawable drawableO2 = jS.o(1);
                if (drawableO2 != null) {
                    absSeekBar.setProgressDrawable(e(drawableO2, false));
                }
                jS.v();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f43940b).getContext().obtainStyledAttributes(attributeSet, AbstractC2820a.f36446i, i5, 0);
                try {
                    boolean z2 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
                    typedArrayObtainStyledAttributes.recycle();
                    d(z2);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public A1.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        C4552j c4552j = (C4552j) this.f43941c;
        if (inputConnection == null) {
            c4552j.getClass();
            inputConnection = null;
        } else {
            S3.s sVar = (S3.s) c4552j.f48001b;
            sVar.getClass();
            if (!(inputConnection instanceof A1.b)) {
                inputConnection = new A1.b((EditText) sVar.f11009b, inputConnection, editorInfo);
            }
        }
        return (A1.b) inputConnection;
    }

    public void d(boolean z2) {
        A1.i iVar = (A1.i) ((S3.s) ((C4552j) this.f43941c).f48001b).f11010c;
        if (iVar.f253c != z2) {
            if (iVar.f252b != null) {
                C4526g c4526gA = C4526g.a();
                A1.h hVar = iVar.f252b;
                c4526gA.getClass();
                AbstractC3076d.d(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = c4526gA.f47923a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    c4526gA.f47924b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f253c = z2;
            if (z2) {
                A1.i.a(iVar.f251a, C4526g.a().b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable e(Drawable drawable, boolean z2) {
        if (drawable instanceof InterfaceC1545a) {
            ((c1.b) ((InterfaceC1545a) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i5 = 0; i5 < numberOfLayers; i5++) {
                    int id2 = layerDrawable.getId(i5);
                    drawableArr[i5] = e(layerDrawable.getDrawable(i5), id2 == 16908301 || id2 == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    layerDrawable2.setId(i10, layerDrawable.getId(i10));
                    layerDrawable2.setLayerGravity(i10, layerDrawable.getLayerGravity(i10));
                    layerDrawable2.setLayerWidth(i10, layerDrawable.getLayerWidth(i10));
                    layerDrawable2.setLayerHeight(i10, layerDrawable.getLayerHeight(i10));
                    layerDrawable2.setLayerInsetLeft(i10, layerDrawable.getLayerInsetLeft(i10));
                    layerDrawable2.setLayerInsetRight(i10, layerDrawable.getLayerInsetRight(i10));
                    layerDrawable2.setLayerInsetTop(i10, layerDrawable.getLayerInsetTop(i10));
                    layerDrawable2.setLayerInsetBottom(i10, layerDrawable.getLayerInsetBottom(i10));
                    layerDrawable2.setLayerInsetStart(i10, layerDrawable.getLayerInsetStart(i10));
                    layerDrawable2.setLayerInsetEnd(i10, layerDrawable.getLayerInsetEnd(i10));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f43941c) == null) {
                    this.f43941c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z2 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public C3845x(AbsSeekBar absSeekBar) {
        this.f43940b = absSeekBar;
    }

    public C3845x(EditText editText) {
        this.f43940b = editText;
        this.f43941c = new C4552j(editText);
    }
}
