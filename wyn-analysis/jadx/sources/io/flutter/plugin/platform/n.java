package io.flutter.plugin.platform;

import A.AbstractC0213f;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.res.AssetFileDescriptor;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import cb.AbstractC1593a;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ka.AbstractC3256n;
import kc.C3288A;
import pc.C3791a;
import tc.EnumC4156b;
import uc.C4281r;

/* loaded from: classes5.dex */
public final class n implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37115a;

    /* renamed from: b, reason: collision with root package name */
    public Object f37116b;

    public /* synthetic */ n(Object obj, int i5) {
        this.f37115a = i5;
        this.f37116b = obj;
    }

    @Override // io.flutter.plugin.platform.g
    public void a(int i5, int i10) {
        ((TextureRegistry$SurfaceProducer) this.f37116b).setSize(i5, i10);
    }

    public void b(int i5) {
        View view;
        switch (this.f37115a) {
            case 0:
                q qVar = (q) this.f37116b;
                if (qVar.c(i5)) {
                    view = ((B) qVar.f37141i.get(Integer.valueOf(i5))).a();
                } else {
                    e eVar = (e) qVar.k.get(i5);
                    if (eVar == null) {
                        AbstractC1593a.q(i5, "Clearing focus on an unknown view with id: ", "PlatformViewsController");
                        break;
                    } else {
                        view = eVar.getView();
                    }
                }
                if (view != null) {
                    view.clearFocus();
                    break;
                } else {
                    AbstractC1593a.q(i5, "Clearing focus on a null view with id: ", "PlatformViewsController");
                    break;
                }
            default:
                e eVar2 = (e) ((p) this.f37116b).f37125i.get(i5);
                if (eVar2 != null) {
                    View view2 = eVar2.getView();
                    if (view2 != null) {
                        view2.clearFocus();
                        break;
                    } else {
                        AbstractC1593a.q(i5, "Clearing focus on a null view with id: ", "PlatformViewsController2");
                        break;
                    }
                } else {
                    AbstractC1593a.q(i5, "Clearing focus on an unknown view with id: ", "PlatformViewsController2");
                    break;
                }
        }
    }

    /* JADX WARN: Type inference failed for: r7v8, types: [io.flutter.plugin.platform.l] */
    public long c(final tc.d dVar) {
        i iVar;
        long j8;
        final int i5 = 0;
        final int i10 = 1;
        final q qVar = (q) this.f37116b;
        q.e(qVar, dVar);
        SparseArray sparseArray = qVar.f37145n;
        int i11 = dVar.f45980a;
        if (sparseArray.get(i11) != null) {
            throw new IllegalStateException(AbstractC3256n.g(i11, "Trying to create an already created platform view, view id: "));
        }
        if (qVar.f37137e == null) {
            throw new IllegalStateException(AbstractC3256n.g(i11, "Texture registry is null. This means that platform views controller was detached, view id: "));
        }
        if (qVar.f37136d == null) {
            throw new IllegalStateException(AbstractC3256n.g(i11, "Flutter view is null. This means the platform views controller doesn't have an attached view, view id: "));
        }
        e eVarF = qVar.f(dVar, true);
        View view = eVarF.getView();
        if (view.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        boolean zP = S3.f.P(view, new com.unity3d.services.core.webview.b(q.f37132w, 18));
        double d3 = dVar.f45983d;
        double d5 = dVar.f45982c;
        if (zP) {
            if (dVar.f45987h == 2) {
                q.h(19);
                return -2L;
            }
            if (!qVar.f37152u) {
                q.h(20);
                g gVarL = q.l(qVar.f37137e);
                int iO = qVar.o(d5);
                int iO2 = qVar.o(d3);
                Activity activity = qVar.f37135c;
                ?? r72 = new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.l
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view2, boolean z2) {
                        switch (i10) {
                            case 0:
                                tc.d dVar2 = dVar;
                                q qVar2 = qVar;
                                int i12 = dVar2.f45980a;
                                if (!z2) {
                                    io.flutter.plugin.editing.i iVar2 = qVar2.f37138f;
                                    if (iVar2 != null) {
                                        iVar2.b(i12);
                                        break;
                                    }
                                } else {
                                    C4281r c4281r = (C4281r) qVar2.f37139g.f45906a;
                                    if (c4281r != null) {
                                        c4281r.a("viewFocused", Integer.valueOf(i12), null);
                                        break;
                                    }
                                }
                                break;
                            default:
                                q qVar3 = qVar;
                                if (!z2) {
                                    qVar3.getClass();
                                    break;
                                } else {
                                    t6.q qVar4 = qVar3.f37139g;
                                    tc.d dVar3 = dVar;
                                    C4281r c4281r2 = (C4281r) qVar4.f45906a;
                                    if (c4281r2 != null) {
                                        c4281r2.a("viewFocused", Integer.valueOf(dVar3.f45980a), null);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                };
                y yVar = B.f37079i;
                B b5 = null;
                if (iO != 0 && iO2 != 0) {
                    DisplayManager displayManager = (DisplayManager) activity.getSystemService("display");
                    DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
                    gVarL.a(iO, iO2);
                    StringBuilder sb2 = new StringBuilder("flutter-vd#");
                    int i12 = dVar.f45980a;
                    sb2.append(i12);
                    VirtualDisplay virtualDisplayCreateVirtualDisplay = displayManager.createVirtualDisplay(sb2.toString(), iO, iO2, displayMetrics.densityDpi, gVarL.getSurface(), 0, B.f37079i, null);
                    if (virtualDisplayCreateVirtualDisplay != null) {
                        b5 = new B(activity, qVar.f37140h, virtualDisplayCreateVirtualDisplay, eVarF, gVarL, r72, i12);
                    }
                }
                if (b5 != null) {
                    qVar.f37141i.put(Integer.valueOf(i11), b5);
                    View view2 = eVarF.getView();
                    qVar.f37142j.put(view2.getContext(), view2);
                    return gVarL.getId();
                }
                throw new IllegalStateException("Failed creating virtual display for a " + dVar.f45981b + " with id: " + i11);
            }
        }
        q.h(23);
        int iO3 = qVar.o(d5);
        int iO4 = qVar.o(d3);
        if (qVar.f37152u) {
            iVar = new i(qVar.f37135c);
            j8 = -1;
        } else {
            g gVarL2 = q.l(qVar.f37137e);
            i iVar2 = new i(qVar.f37135c);
            iVar2.f37103f = gVarL2;
            Surface surface = gVarL2.getSurface();
            if (surface != null) {
                Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
                try {
                    canvasLockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                } finally {
                    surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                }
            }
            long id2 = gVarL2.getId();
            iVar = iVar2;
            j8 = id2;
        }
        iVar.setTouchProcessor(qVar.f37134b);
        g gVar = iVar.f37103f;
        if (gVar != null) {
            gVar.a(iO3, iO4);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iO3, iO4);
        int iO5 = qVar.o(dVar.f45984e);
        int iO6 = qVar.o(dVar.f45985f);
        layoutParams.topMargin = iO5;
        layoutParams.leftMargin = iO6;
        iVar.setLayoutParams(layoutParams);
        View view3 = eVarF.getView();
        view3.setLayoutParams(new FrameLayout.LayoutParams(iO3, iO4));
        view3.setImportantForAccessibility(4);
        iVar.addView(view3);
        iVar.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.l
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view22, boolean z2) {
                switch (i5) {
                    case 0:
                        tc.d dVar2 = dVar;
                        q qVar2 = qVar;
                        int i122 = dVar2.f45980a;
                        if (!z2) {
                            io.flutter.plugin.editing.i iVar22 = qVar2.f37138f;
                            if (iVar22 != null) {
                                iVar22.b(i122);
                                break;
                            }
                        } else {
                            C4281r c4281r = (C4281r) qVar2.f37139g.f45906a;
                            if (c4281r != null) {
                                c4281r.a("viewFocused", Integer.valueOf(i122), null);
                                break;
                            }
                        }
                        break;
                    default:
                        q qVar3 = qVar;
                        if (!z2) {
                            qVar3.getClass();
                            break;
                        } else {
                            t6.q qVar4 = qVar3.f37139g;
                            tc.d dVar3 = dVar;
                            C4281r c4281r2 = (C4281r) qVar4.f45906a;
                            if (c4281r2 != null) {
                                c4281r2.a("viewFocused", Integer.valueOf(dVar3.f45980a), null);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        qVar.f37136d.addView(iVar);
        sparseArray.append(i11, iVar);
        kc.r rVar = qVar.f37136d;
        if (rVar == null) {
            return j8;
        }
        eVarF.onFlutterViewAttached(rVar);
        return j8;
    }

    public void d(M2.d dVar) {
        p pVar = (p) this.f37116b;
        HashMap map = (HashMap) pVar.f37117a.f37116b;
        String str = (String) dVar.f7303d;
        f fVar = (f) map.get(str);
        if (fVar == null) {
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
        }
        ByteBuffer byteBuffer = (ByteBuffer) dVar.f7304e;
        Object objB = byteBuffer != null ? fVar.getCreateArgsCodec().b(byteBuffer) : null;
        Activity activity = pVar.f37119c;
        int i5 = dVar.f7301b;
        e eVarCreate = fVar.create(activity, i5, objB);
        View view = eVarCreate.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        view.setLayoutDirection(dVar.f7302c);
        pVar.f37125i.put(i5, eVarCreate);
        kc.r rVar = pVar.f37120d;
        if (rVar == null) {
            return;
        }
        eVarCreate.onFlutterViewAttached(rVar);
    }

    public void e(int i5) {
        h hVar;
        switch (this.f37115a) {
            case 0:
                q qVar = (q) this.f37116b;
                e eVar = (e) qVar.k.get(i5);
                if (eVar != null) {
                    if (eVar.getView() != null) {
                        View view = eVar.getView();
                        ViewGroup viewGroup = (ViewGroup) view.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(view);
                        }
                    }
                    qVar.k.remove(i5);
                    try {
                        eVar.dispose();
                    } catch (RuntimeException e7) {
                        Log.e("PlatformViewsController", "Disposing platform view threw an exception", e7);
                    }
                    if (!qVar.c(i5)) {
                        SparseArray sparseArray = qVar.f37145n;
                        i iVar = (i) sparseArray.get(i5);
                        if (iVar == null) {
                            SparseArray sparseArray2 = qVar.f37143l;
                            C3791a c3791a = (C3791a) sparseArray2.get(i5);
                            if (c3791a != null) {
                                c3791a.removeAllViews();
                                c3791a.a();
                                ViewGroup viewGroup2 = (ViewGroup) c3791a.getParent();
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(c3791a);
                                }
                                sparseArray2.remove(i5);
                                break;
                            }
                        } else {
                            iVar.removeAllViews();
                            g gVar = iVar.f37103f;
                            if (gVar != null) {
                                gVar.release();
                                iVar.f37103f = null;
                            }
                            ViewTreeObserver viewTreeObserver = iVar.getViewTreeObserver();
                            if (viewTreeObserver.isAlive() && (hVar = iVar.f37104g) != null) {
                                iVar.f37104g = null;
                                viewTreeObserver.removeOnGlobalFocusChangeListener(hVar);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) iVar.getParent();
                            if (viewGroup3 != null) {
                                viewGroup3.removeView(iVar);
                            }
                            sparseArray.remove(i5);
                            break;
                        }
                    } else {
                        HashMap map = qVar.f37141i;
                        B b5 = (B) map.get(Integer.valueOf(i5));
                        View viewA = b5.a();
                        if (viewA != null) {
                            qVar.f37142j.remove(viewA.getContext());
                        }
                        b5.f37080a.cancel();
                        b5.f37080a.detachState();
                        b5.f37087h.release();
                        b5.f37085f.release();
                        map.remove(Integer.valueOf(i5));
                        break;
                    }
                } else {
                    AbstractC1593a.q(i5, "Disposing unknown platform view with id: ", "PlatformViewsController");
                    break;
                }
                break;
            default:
                p pVar = (p) this.f37116b;
                e eVar2 = (e) pVar.f37125i.get(i5);
                if (eVar2 != null) {
                    if (eVar2.getView() != null) {
                        View view2 = eVar2.getView();
                        ViewGroup viewGroup4 = (ViewGroup) view2.getParent();
                        if (viewGroup4 != null) {
                            viewGroup4.removeView(view2);
                        }
                    }
                    pVar.f37125i.remove(i5);
                    try {
                        eVar2.dispose();
                    } catch (RuntimeException e10) {
                        Log.e("PlatformViewsController2", "Disposing platform view threw an exception", e10);
                    }
                    SparseArray sparseArray3 = pVar.f37126j;
                    C3791a c3791a2 = (C3791a) sparseArray3.get(i5);
                    if (c3791a2 != null) {
                        c3791a2.removeAllViews();
                        c3791a2.a();
                        ViewGroup viewGroup5 = (ViewGroup) c3791a2.getParent();
                        if (viewGroup5 != null) {
                            viewGroup5.removeView(c3791a2);
                        }
                        sparseArray3.remove(i5);
                        break;
                    }
                } else {
                    AbstractC1593a.q(i5, "Disposing unknown platform view with id: ", "PlatformViewsController2");
                    break;
                }
                break;
        }
    }

    public CharSequence f(EnumC4156b enumC4156b) {
        Activity activity = (Activity) ((N2.j) this.f37116b).f8380c;
        ClipboardManager clipboardManager = (ClipboardManager) activity.getSystemService("clipboard");
        CharSequence charSequence = null;
        if (clipboardManager.hasPrimaryClip()) {
            try {
                try {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null) {
                        if (enumC4156b != null) {
                            if (enumC4156b == EnumC4156b.f45974a) {
                            }
                        }
                        ClipData.Item itemAt = primaryClip.getItemAt(0);
                        CharSequence text = itemAt.getText();
                        if (text != null) {
                            return text;
                        }
                        try {
                            Uri uri = itemAt.getUri();
                            if (uri == null) {
                                Log.w("PlatformPlugin", "Clipboard item contained no textual content nor a URI to retrieve it from.");
                                return null;
                            }
                            String scheme = uri.getScheme();
                            if (!scheme.equals("content")) {
                                Log.w("PlatformPlugin", "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                                return null;
                            }
                            AssetFileDescriptor assetFileDescriptorOpenTypedAssetFileDescriptor = activity.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                            CharSequence charSequenceCoerceToText = itemAt.coerceToText(activity);
                            if (assetFileDescriptorOpenTypedAssetFileDescriptor == null) {
                                return charSequenceCoerceToText;
                            }
                            try {
                                assetFileDescriptorOpenTypedAssetFileDescriptor.close();
                                return charSequenceCoerceToText;
                            } catch (IOException e7) {
                                charSequence = charSequenceCoerceToText;
                                e = e7;
                                Log.w("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
                                return charSequence;
                            }
                        } catch (IOException e10) {
                            e = e10;
                            charSequence = text;
                        }
                    }
                } catch (IOException e11) {
                    e = e11;
                }
            } catch (FileNotFoundException unused) {
                Log.w("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
                return charSequence;
            } catch (SecurityException e12) {
                Log.w("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e12);
                return charSequence;
            }
        }
        return null;
    }

    public void g(int i5, double d3, double d5) {
        q qVar = (q) this.f37116b;
        if (qVar.c(i5)) {
            return;
        }
        i iVar = (i) qVar.f37145n.get(i5);
        if (iVar == null) {
            AbstractC1593a.q(i5, "Setting offset for unknown platform view with id: ", "PlatformViewsController");
            return;
        }
        int iO = qVar.o(d3);
        int iO2 = qVar.o(d5);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) iVar.getLayoutParams();
        layoutParams.topMargin = iO;
        layoutParams.leftMargin = iO2;
        iVar.setLayoutParams(layoutParams);
    }

    @Override // io.flutter.plugin.platform.g
    public int getHeight() {
        return ((TextureRegistry$SurfaceProducer) this.f37116b).getHeight();
    }

    @Override // io.flutter.plugin.platform.g
    public long getId() {
        return ((TextureRegistry$SurfaceProducer) this.f37116b).id();
    }

    @Override // io.flutter.plugin.platform.g
    public Surface getSurface() {
        return ((TextureRegistry$SurfaceProducer) this.f37116b).getSurface();
    }

    @Override // io.flutter.plugin.platform.g
    public int getWidth() {
        return ((TextureRegistry$SurfaceProducer) this.f37116b).getWidth();
    }

    public void h(tc.f fVar) {
        q qVar = (q) this.f37116b;
        float f10 = qVar.f37135c.getResources().getDisplayMetrics().density;
        int i5 = fVar.f45992a;
        if (qVar.c(i5)) {
            B b5 = (B) qVar.f37141i.get(Integer.valueOf(i5));
            MotionEvent motionEventN = qVar.n(f10, fVar, true);
            SingleViewPresentation singleViewPresentation = b5.f37080a;
            if (singleViewPresentation == null) {
                return;
            }
            singleViewPresentation.dispatchTouchEvent(motionEventN);
            return;
        }
        e eVar = (e) qVar.k.get(i5);
        if (eVar == null) {
            AbstractC1593a.q(i5, "Sending touch to an unknown view with id: ", "PlatformViewsController");
            return;
        }
        View view = eVar.getView();
        if (view == null) {
            AbstractC1593a.q(i5, "Sending touch to a null view with id: ", "PlatformViewsController");
        } else {
            view.dispatchTouchEvent(qVar.n(f10, fVar, false));
        }
    }

    public void i(tc.f fVar) {
        p pVar = (p) this.f37116b;
        float f10 = pVar.f37119c.getResources().getDisplayMetrics().density;
        SparseArray sparseArray = pVar.f37125i;
        int i5 = fVar.f45992a;
        e eVar = (e) sparseArray.get(i5);
        if (eVar == null) {
            AbstractC1593a.q(i5, "Sending touch to an unknown view with id: ", "PlatformViewsController2");
            return;
        }
        View view = eVar.getView();
        if (view == null) {
            AbstractC1593a.q(i5, "Sending touch to a null view with id: ", "PlatformViewsController2");
            return;
        }
        MotionEvent motionEventI = pVar.k.I(new C3288A(fVar.f46006p));
        List<List> list = (List) fVar.f45998g;
        ArrayList arrayList = new ArrayList();
        for (List list2 : list) {
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            pointerCoords.orientation = (float) ((Double) list2.get(0)).doubleValue();
            pointerCoords.pressure = (float) ((Double) list2.get(1)).doubleValue();
            pointerCoords.size = (float) ((Double) list2.get(2)).doubleValue();
            double d3 = f10;
            pointerCoords.toolMajor = (float) (((Double) list2.get(3)).doubleValue() * d3);
            pointerCoords.toolMinor = (float) (((Double) list2.get(4)).doubleValue() * d3);
            pointerCoords.touchMajor = (float) (((Double) list2.get(5)).doubleValue() * d3);
            pointerCoords.touchMinor = (float) (((Double) list2.get(6)).doubleValue() * d3);
            pointerCoords.x = (float) (((Double) list2.get(7)).doubleValue() * d3);
            pointerCoords.y = (float) (((Double) list2.get(8)).doubleValue() * d3);
            arrayList.add(pointerCoords);
        }
        int i10 = fVar.f45996e;
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i10]);
        if (motionEventI == null) {
            List<List> list3 = (List) fVar.f45997f;
            ArrayList arrayList2 = new ArrayList();
            for (List list4 : list3) {
                MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
                pointerProperties.id = ((Integer) list4.get(0)).intValue();
                pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
                arrayList2.add(pointerProperties);
            }
            motionEventI = MotionEvent.obtain(fVar.f45993b.longValue(), fVar.f45994c.longValue(), fVar.f45995d, fVar.f45996e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i10]), pointerCoordsArr, fVar.f45999h, fVar.f46000i, fVar.f46001j, fVar.k, fVar.f46002l, fVar.f46003m, fVar.f46004n, fVar.f46005o);
        } else if (pointerCoordsArr.length >= 1) {
            motionEventI.offsetLocation(pointerCoordsArr[0].x - motionEventI.getX(), pointerCoordsArr[0].y - motionEventI.getY());
        }
        view.dispatchTouchEvent(motionEventI);
    }

    public void j(String str, f fVar) {
        HashMap map = (HashMap) this.f37116b;
        if (map.containsKey(str)) {
            return;
        }
        map.put(str, fVar);
    }

    public void k(tc.e eVar, final Ka.b bVar) {
        g gVar;
        q qVar = (q) this.f37116b;
        int iO = qVar.o(eVar.f45990b);
        int iO2 = qVar.o(eVar.f45991c);
        int i5 = eVar.f45989a;
        if (!qVar.c(i5)) {
            e eVar2 = (e) qVar.k.get(i5);
            i iVar = (i) qVar.f37145n.get(i5);
            if (eVar2 == null || iVar == null) {
                AbstractC1593a.q(i5, "Resizing unknown platform view with id: ", "PlatformViewsController");
                return;
            }
            if ((iO > iVar.getRenderTargetWidth() || iO2 > iVar.getRenderTargetHeight()) && (gVar = iVar.f37103f) != null) {
                gVar.a(iO, iO2);
            }
            ViewGroup.LayoutParams layoutParams = iVar.getLayoutParams();
            layoutParams.width = iO;
            layoutParams.height = iO2;
            iVar.setLayoutParams(layoutParams);
            View view = eVar2.getView();
            if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = iO;
                layoutParams2.height = iO2;
                view.setLayoutParams(layoutParams2);
            }
            int iRound = (int) Math.round(iVar.getRenderTargetWidth() / qVar.j());
            int iRound2 = (int) Math.round(iVar.getRenderTargetHeight() / qVar.j());
            tc.g gVar2 = bVar.f6712b;
            HashMap map = new HashMap();
            map.put("width", Double.valueOf(iRound));
            map.put("height", Double.valueOf(iRound2));
            gVar2.a(map);
            return;
        }
        final float fJ = qVar.j();
        final B b5 = (B) qVar.f37141i.get(Integer.valueOf(i5));
        io.flutter.plugin.editing.i iVar2 = qVar.f37138f;
        if (iVar2 != null) {
            if (iVar2.f37066e.f2592b == 3) {
                iVar2.f37076p = true;
            }
            SingleViewPresentation singleViewPresentation = b5.f37080a;
            if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
                b5.f37080a.getView().onInputConnectionLocked();
            }
        }
        Runnable runnable = new Runnable() { // from class: io.flutter.plugin.platform.m
            @Override // java.lang.Runnable
            public final void run() {
                q qVar2 = (q) this.f37111a.f37116b;
                io.flutter.plugin.editing.i iVar3 = qVar2.f37138f;
                B b10 = b5;
                if (iVar3 != null) {
                    if (iVar3.f37066e.f2592b == 3) {
                        iVar3.f37076p = false;
                    }
                    SingleViewPresentation singleViewPresentation2 = b10.f37080a;
                    if (singleViewPresentation2 != null && singleViewPresentation2.getView() != null) {
                        b10.f37080a.getView().onInputConnectionUnlocked();
                    }
                }
                double dJ = qVar2.f37135c == null ? fJ : qVar2.j();
                int iRound3 = (int) Math.round(b10.f37085f.getWidth() / dJ);
                int iRound4 = (int) Math.round(b10.f37085f.getHeight() / dJ);
                tc.g gVar3 = bVar.f6712b;
                HashMap map2 = new HashMap();
                map2.put("width", Double.valueOf(iRound3));
                map2.put("height", Double.valueOf(iRound4));
                gVar3.a(map2);
            }
        };
        int width = b5.f37085f.getWidth();
        g gVar3 = b5.f37085f;
        if (iO == width && iO2 == gVar3.getHeight()) {
            b5.a().postDelayed(runnable, 0L);
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            View viewA = b5.a();
            gVar3.a(iO, iO2);
            b5.f37087h.resize(iO, iO2, b5.f37083d);
            b5.f37087h.setSurface(gVar3.getSurface());
            viewA.postDelayed(runnable, 0L);
            return;
        }
        boolean zIsFocused = b5.a().isFocused();
        v vVarDetachState = b5.f37080a.detachState();
        b5.f37087h.setSurface(null);
        b5.f37087h.release();
        DisplayManager displayManager = (DisplayManager) b5.f37081b.getSystemService("display");
        gVar3.a(iO, iO2);
        b5.f37087h = displayManager.createVirtualDisplay("flutter-vd#" + b5.f37084e, iO, iO2, b5.f37083d, gVar3.getSurface(), 0, B.f37079i, null);
        View viewA2 = b5.a();
        viewA2.addOnAttachStateChangeListener(new G3.i(viewA2, 1, runnable));
        SingleViewPresentation singleViewPresentation2 = new SingleViewPresentation(b5.f37081b, b5.f37087h.getDisplay(), b5.f37082c, vVarDetachState, b5.f37086g, zIsFocused);
        singleViewPresentation2.show();
        b5.f37080a.cancel();
        b5.f37080a = singleViewPresentation2;
    }

    public void l(int i5, int i10) {
        View view;
        switch (this.f37115a) {
            case 0:
                if (i10 != 0 && i10 != 1) {
                    throw new IllegalStateException(N0.a.e("Trying to set unknown direction value: ", i10, "(view id: ", i5, ")"));
                }
                q qVar = (q) this.f37116b;
                if (qVar.c(i5)) {
                    view = ((B) qVar.f37141i.get(Integer.valueOf(i5))).a();
                } else {
                    e eVar = (e) qVar.k.get(i5);
                    if (eVar == null) {
                        AbstractC1593a.q(i5, "Setting direction to an unknown view with id: ", "PlatformViewsController");
                        return;
                    }
                    view = eVar.getView();
                }
                if (view == null) {
                    AbstractC1593a.q(i5, "Setting direction to a null view with id: ", "PlatformViewsController");
                    return;
                } else {
                    view.setLayoutDirection(i10);
                    return;
                }
            default:
                e eVar2 = (e) ((p) this.f37116b).f37125i.get(i5);
                if (eVar2 == null) {
                    AbstractC1593a.q(i5, "Setting direction to an unknown view with id: ", "PlatformViewsController2");
                    return;
                }
                View view2 = eVar2.getView();
                if (view2 == null) {
                    AbstractC1593a.q(i5, "Setting direction to a null view with id: ", "PlatformViewsController2");
                    return;
                } else {
                    view2.setLayoutDirection(i10);
                    return;
                }
        }
    }

    public void m(ArrayList arrayList) {
        N2.j jVar = (N2.j) this.f37116b;
        jVar.getClass();
        int i5 = arrayList.size() == 0 ? 5894 : 1798;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            int iOrdinal = ((tc.c) arrayList.get(i10)).ordinal();
            if (iOrdinal == 0) {
                i5 &= -5;
            } else if (iOrdinal == 1) {
                i5 &= -515;
            }
        }
        jVar.f8379b = i5;
        jVar.q();
    }

    public void n(int i5) {
        View decorView = ((Activity) ((N2.j) this.f37116b).f8380c).getWindow().getDecorView();
        int iF = AbstractC0213f.f(i5);
        if (iF == 0) {
            decorView.performHapticFeedback(0);
            return;
        }
        if (iF == 1) {
            decorView.performHapticFeedback(1);
            return;
        }
        if (iF == 2) {
            decorView.performHapticFeedback(3);
        } else if (iF == 3) {
            decorView.performHapticFeedback(6);
        } else {
            if (iF != 4) {
                return;
            }
            decorView.performHapticFeedback(4);
        }
    }

    @Override // io.flutter.plugin.platform.g
    public void release() {
        ((TextureRegistry$SurfaceProducer) this.f37116b).release();
        this.f37116b = null;
    }

    @Override // io.flutter.plugin.platform.g
    public void scheduleFrame() {
        ((TextureRegistry$SurfaceProducer) this.f37116b).scheduleFrame();
    }

    public n(int i5) {
        this.f37115a = i5;
        switch (i5) {
            case 4:
                break;
            default:
                this.f37116b = new HashMap();
                break;
        }
    }
}
