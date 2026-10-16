package com.bykv.vk.openvk.uef.uef.uef.ivm;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.uef.uef.uef.ivm.oa;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class yo extends lw implements SurfaceHolder.Callback, oa {
    private static final ArrayList<ivm> yo = new ArrayList<>();
    private oa.uef moa;

    /* renamed from: oa, reason: collision with root package name */
    private ivm f24513oa;
    private WeakReference<uef> uef;

    public yo(Context context) {
        super(context);
        uef();
    }

    private void uef() {
        ivm ivmVar = new ivm(this);
        this.f24513oa = ivmVar;
        yo.add(ivmVar);
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.ivm.oa
    public View getView() {
        return this;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onWindowVisibilityChanged(int i5) {
        super.onWindowVisibilityChanged(i5);
    }

    public void setWindowVisibilityChangedListener(oa.uef uefVar) {
        this.moa = uefVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i5, int i10, int i11) {
        WeakReference<uef> weakReference = this.uef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.uef.get().uef(surfaceHolder, i5, i10, i11);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        WeakReference<uef> weakReference = this.uef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.uef.get().uef(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        WeakReference<uef> weakReference = this.uef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.uef.get().oa(surfaceHolder);
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.ivm.oa
    public void uef(uef uefVar) {
        this.uef = new WeakReference<>(uefVar);
        SurfaceHolder holder = getHolder();
        holder.setFormat(-3);
        Iterator<ivm> it = yo.iterator();
        while (it.hasNext()) {
            ivm next = it.next();
            if (next != null && next.uef() == null) {
                holder.removeCallback(next);
                it.remove();
            }
        }
        holder.addCallback(this.f24513oa);
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.ivm.oa
    public void uef(int i5, int i10) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i10;
        layoutParams.width = i5;
        setLayoutParams(layoutParams);
    }
}
