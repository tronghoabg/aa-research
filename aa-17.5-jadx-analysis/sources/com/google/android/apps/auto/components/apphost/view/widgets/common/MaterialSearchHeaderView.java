package com.google.android.apps.auto.components.apphost.view.widgets.common;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.LinearLayout;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarText;
import com.google.android.apps.auto.components.apphost.signin.MaterialCarRestrictedEditText;
import com.google.android.projection.gearhead.R;
import defpackage.afeu;
import defpackage.geu;
import defpackage.kds;
import defpackage.kep;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006B"}, d2 = {"Lcom/google/android/apps/auto/components/apphost/view/widgets/common/MaterialSearchHeaderView;", "Lcom/google/android/apps/auto/components/apphost/view/widgets/common/MaterialHeaderView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "editText", "Landroid/widget/LinearLayout;", "getEditText", "()Landroid/widget/LinearLayout;", "searchBar", "getSearchBar", "microphone", "getMicrophone", "carRestrictedEditText", "Lcom/google/android/apps/auto/components/apphost/signin/MaterialCarRestrictedEditText;", "value", "", "text", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "hint", "getHint", "setHint", "textSelection", "getTextSelection", "()I", "setTextSelection", "(I)V", "setContent", "", "templateContext", "Lcom/android/car/libraries/apphost/common/TemplateContext;", "leadingAction", "Landroidx/car/app/model/Action;", "trailingActions", "", "renderCustomIconAsAppIcon", "", "", "title", "Landroidx/car/app/model/CarText;", "action", "secondaryActions", "contentRefreshDelegate", "Landroidx/car/app/model/OnContentRefreshDelegate;", "setEnabled", "enabled", "useEnabledAlpha", "onCreateInputConnection", "Landroid/view/inputmethod/InputConnection;", "outAttrs", "Landroid/view/inputmethod/EditorInfo;", "addTextChangedListener", "textWatcher", "Landroid/text/TextWatcher;", "setOnEditorActionListener", "listener", "Landroid/widget/TextView$OnEditorActionListener;", "java.com.google.android.apps.auto.components.apphost.view.widgets.common_common"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MaterialSearchHeaderView extends kds {
    public final LinearLayout a;
    public final LinearLayout e;
    public final LinearLayout f;
    public final MaterialCarRestrictedEditText g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialSearchHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.material_search_bar, (ViewGroup) this, false);
        viewInflate.getClass();
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        this.e = linearLayout;
        c(linearLayout);
        View viewFindViewById = linearLayout.findViewById(R.id.edit_text);
        viewFindViewById.getClass();
        LinearLayout linearLayout2 = (LinearLayout) viewFindViewById;
        this.a = linearLayout2;
        View viewFindViewById2 = linearLayout.findViewById(R.id.microphone);
        viewFindViewById2.getClass();
        this.f = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = linearLayout2.findViewById(R.id.car_restricted_edit_text);
        viewFindViewById3.getClass();
        MaterialCarRestrictedEditText materialCarRestrictedEditText = (MaterialCarRestrictedEditText) viewFindViewById3;
        this.g = materialCarRestrictedEditText;
        materialCarRestrictedEditText.setOnClickListener(new kep(this, 1));
    }

    @Override // defpackage.fyv
    public final /* bridge */ /* synthetic */ void a(geu geuVar, CarText carText, Action action, List list) {
        throw new UnsupportedOperationException("Not meant to be used with a search header");
    }

    public final CharSequence b() {
        Editable text = this.g.getText();
        return text != null ? text : "";
    }

    @Override // defpackage.kds
    public final void d(geu geuVar, Action action, List list, boolean z) {
        super.d(geuVar, action, list, true);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        editorInfo.getClass();
        return this.g.onCreateInputConnection(editorInfo);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        this.e.setEnabled(z);
        this.a.setEnabled(z);
        this.g.setEnabled(z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaterialSearchHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaterialSearchHeaderView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaterialSearchHeaderView(Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }

    public /* synthetic */ MaterialSearchHeaderView(Context context, AttributeSet attributeSet, int i, int i2, int i3, afeu afeuVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
