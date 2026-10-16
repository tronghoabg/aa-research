package androidx.compose.ui.platform.coreshims;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.compose.ui.contentcapture.ContentCaptureSessionWrapper;
import androidx.core.content.ContextCompat$$ExternalSyntheticApiModelOutline0;
import j$.util.Objects;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public class ContentCaptureSessionCompat implements ContentCaptureSessionWrapper {
    private static final String KEY_VIEW_TREE_APPEARED = "TREAT_AS_VIEW_TREE_APPEARED";
    private static final String KEY_VIEW_TREE_APPEARING = "TREAT_AS_VIEW_TREE_APPEARING";
    private final View mView;
    private final Object mWrappedObj;

    /* compiled from: WazeSource */
    /* loaded from: classes3.dex */
    class Api23Impl {
        private Api23Impl() {
        }

        static Bundle getExtras(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }
    }

    /* compiled from: WazeSource */
    /* loaded from: classes3.dex */
    class Api29Impl {
        private Api29Impl() {
        }

        static AutofillId newAutofillId(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j2) {
            return contentCaptureSession.newAutofillId(autofillId, j2);
        }

        static ViewStructure newViewStructure(ContentCaptureSession contentCaptureSession, View view) {
            return contentCaptureSession.newViewStructure(view);
        }

        static ViewStructure newVirtualViewStructure(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j2) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j2);
        }

        static void notifyViewAppeared(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        static void notifyViewDisappeared(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
            contentCaptureSession.notifyViewDisappeared(autofillId);
        }

        public static void notifyViewTextChanged(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        static void notifyViewsDisappeared(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    /* compiled from: WazeSource */
    /* loaded from: classes3.dex */
    class Api34Impl {
        private Api34Impl() {
        }

        static void notifyViewsAppeared(ContentCaptureSession contentCaptureSession, List<ViewStructure> list) {
            contentCaptureSession.notifyViewsAppeared(list);
        }
    }

    private ContentCaptureSessionCompat(ContentCaptureSession contentCaptureSession, View view) {
        this.mWrappedObj = contentCaptureSession;
        this.mView = view;
    }

    public static ContentCaptureSessionCompat toContentCaptureSessionCompat(ContentCaptureSession contentCaptureSession, View view) {
        return new ContentCaptureSessionCompat(contentCaptureSession, view);
    }

    @Override // androidx.compose.ui.contentcapture.ContentCaptureSessionWrapper
    public void flush() {
        Api29Impl.notifyViewsDisappeared(ContextCompat$$ExternalSyntheticApiModelOutline0.m11671m(this.mWrappedObj), ((AutofillIdCompat) Objects.requireNonNull(ViewCompatShims.getAutofillId(this.mView))).toAutofillId(), new long[]{Long.MIN_VALUE});
    }

    @Override // androidx.compose.ui.contentcapture.ContentCaptureSessionWrapper
    public AutofillId newAutofillId(long j2) {
        return Api29Impl.newAutofillId(ContextCompat$$ExternalSyntheticApiModelOutline0.m11671m(this.mWrappedObj), ((AutofillIdCompat) Objects.requireNonNull(ViewCompatShims.getAutofillId(this.mView))).toAutofillId(), j2);
    }

    @Override // androidx.compose.ui.contentcapture.ContentCaptureSessionWrapper
    public ViewStructureCompat newVirtualViewStructure(AutofillId autofillId, long j2) {
        return ViewStructureCompat.toViewStructureCompat(Api29Impl.newVirtualViewStructure(ContextCompat$$ExternalSyntheticApiModelOutline0.m11671m(this.mWrappedObj), autofillId, j2));
    }

    @Override // androidx.compose.ui.contentcapture.ContentCaptureSessionWrapper
    public void notifyViewAppeared(ViewStructure viewStructure) {
        Api29Impl.notifyViewAppeared(ContextCompat$$ExternalSyntheticApiModelOutline0.m11671m(this.mWrappedObj), viewStructure);
    }

    @Override // androidx.compose.ui.contentcapture.ContentCaptureSessionWrapper
    public void notifyViewDisappeared(AutofillId autofillId) {
        Api29Impl.notifyViewDisappeared(ContextCompat$$ExternalSyntheticApiModelOutline0.m11671m(this.mWrappedObj), autofillId);
    }

    @Override // androidx.compose.ui.contentcapture.ContentCaptureSessionWrapper
    public void notifyViewTextChanged(AutofillId autofillId, CharSequence charSequence) {
        Api29Impl.notifyViewTextChanged(ContextCompat$$ExternalSyntheticApiModelOutline0.m11671m(this.mWrappedObj), autofillId, charSequence);
    }

    @Override // androidx.compose.ui.contentcapture.ContentCaptureSessionWrapper
    public void notifyViewsAppeared(List<ViewStructure> list) {
        int i2 = Build.VERSION.SDK_INT;
        Object obj = this.mWrappedObj;
        if (i2 >= 34) {
            Api34Impl.notifyViewsAppeared(ContextCompat$$ExternalSyntheticApiModelOutline0.m11671m(obj), list);
            return;
        }
        ViewStructure viewStructureNewViewStructure = Api29Impl.newViewStructure(ContextCompat$$ExternalSyntheticApiModelOutline0.m11671m(obj), this.mView);
        Api23Impl.getExtras(viewStructureNewViewStructure).putBoolean(KEY_VIEW_TREE_APPEARING, true);
        Api29Impl.notifyViewAppeared(ContextCompat$$ExternalSyntheticApiModelOutline0.m11671m(this.mWrappedObj), viewStructureNewViewStructure);
        int i3 = 0;
        while (true) {
            int size = list.size();
            Object obj2 = this.mWrappedObj;
            if (i3 >= size) {
                ViewStructure viewStructureNewViewStructure2 = Api29Impl.newViewStructure(ContextCompat$$ExternalSyntheticApiModelOutline0.m11671m(obj2), this.mView);
                Api23Impl.getExtras(viewStructureNewViewStructure2).putBoolean(KEY_VIEW_TREE_APPEARED, true);
                Api29Impl.notifyViewAppeared(ContextCompat$$ExternalSyntheticApiModelOutline0.m11671m(this.mWrappedObj), viewStructureNewViewStructure2);
                return;
            }
            Api29Impl.notifyViewAppeared(ContextCompat$$ExternalSyntheticApiModelOutline0.m11671m(obj2), list.get(i3));
            i3++;
        }
    }

    @Override // androidx.compose.ui.contentcapture.ContentCaptureSessionWrapper
    public void notifyViewsDisappeared(long[] jArr) {
        int i2 = Build.VERSION.SDK_INT;
        Object obj = this.mWrappedObj;
        if (i2 >= 34) {
            Api29Impl.notifyViewsDisappeared(ContextCompat$$ExternalSyntheticApiModelOutline0.m11671m(obj), ((AutofillIdCompat) Objects.requireNonNull(ViewCompatShims.getAutofillId(this.mView))).toAutofillId(), jArr);
            return;
        }
        ViewStructure viewStructureNewViewStructure = Api29Impl.newViewStructure(ContextCompat$$ExternalSyntheticApiModelOutline0.m11671m(obj), this.mView);
        Api23Impl.getExtras(viewStructureNewViewStructure).putBoolean(KEY_VIEW_TREE_APPEARING, true);
        Api29Impl.notifyViewAppeared(ContextCompat$$ExternalSyntheticApiModelOutline0.m11671m(this.mWrappedObj), viewStructureNewViewStructure);
        Api29Impl.notifyViewsDisappeared(ContextCompat$$ExternalSyntheticApiModelOutline0.m11671m(this.mWrappedObj), ((AutofillIdCompat) Objects.requireNonNull(ViewCompatShims.getAutofillId(this.mView))).toAutofillId(), jArr);
        Object obj2 = this.mWrappedObj;
        ViewStructure viewStructureNewViewStructure2 = Api29Impl.newViewStructure(ContextCompat$$ExternalSyntheticApiModelOutline0.m11671m(obj2), this.mView);
        Api23Impl.getExtras(viewStructureNewViewStructure2).putBoolean(KEY_VIEW_TREE_APPEARED, true);
        Api29Impl.notifyViewAppeared(ContextCompat$$ExternalSyntheticApiModelOutline0.m11671m(this.mWrappedObj), viewStructureNewViewStructure2);
    }

    public ContentCaptureSession toContentCaptureSession() {
        return ContextCompat$$ExternalSyntheticApiModelOutline0.m11671m(this.mWrappedObj);
    }
}
