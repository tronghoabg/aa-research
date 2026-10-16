package com.bytedance.adsdk.ugeno.bcc;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class oa {

    /* renamed from: oa, reason: collision with root package name */
    private DataSetObserver f24669oa;
    private final DataSetObservable uef = new DataSetObservable();

    public Parcelable oa() {
        return null;
    }

    public float uef(int i5) {
        return 1.0f;
    }

    public abstract int uef();

    public abstract boolean uef(View view, Object obj);

    public void yo() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.f24669oa;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.uef.notifyChanged();
    }

    public int uef(Object obj) {
        return -1;
    }

    public Object uef(ViewGroup viewGroup, int i5) {
        return uef((View) viewGroup, i5);
    }

    public void uef(ViewGroup viewGroup, int i5, Object obj) {
        uef((View) viewGroup, i5, obj);
    }

    @Deprecated
    public Object uef(View view, int i5) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @Deprecated
    public void uef(View view, int i5, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void uef(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f24669oa = dataSetObserver;
        }
    }
}
