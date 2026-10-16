package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import com.applovin.sdk.AppLovinEventParameters;
import com.wynauto.wyn.R;
import f8.r;
import f8.w;
import ff.AbstractC2641B;
import i.AbstractC2820a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k1.S;
import lf.C3467f;
import md.J;
import o.InterfaceC3621b;
import q.AbstractC3848y0;
import q.C3824m;
import q.C3850z0;
import q.S0;
import q.T0;
import q.U0;
import q.V0;
import q.W0;
import q.X0;
import q.Y0;
import q.Z0;
import q.b1;
import q1.AbstractC3855a;

/* loaded from: classes.dex */
public class SearchView extends AbstractC3848y0 implements InterfaceC3621b {

    /* renamed from: g0, reason: collision with root package name */
    public static final C3467f f17874g0;

    /* renamed from: A, reason: collision with root package name */
    public final Rect f17875A;

    /* renamed from: B, reason: collision with root package name */
    public final int[] f17876B;

    /* renamed from: C, reason: collision with root package name */
    public final int[] f17877C;

    /* renamed from: D, reason: collision with root package name */
    public final ImageView f17878D;

    /* renamed from: E, reason: collision with root package name */
    public final Drawable f17879E;

    /* renamed from: F, reason: collision with root package name */
    public final int f17880F;

    /* renamed from: G, reason: collision with root package name */
    public final int f17881G;

    /* renamed from: H, reason: collision with root package name */
    public final Intent f17882H;

    /* renamed from: I, reason: collision with root package name */
    public final Intent f17883I;

    /* renamed from: J, reason: collision with root package name */
    public final CharSequence f17884J;

    /* renamed from: K, reason: collision with root package name */
    public View.OnFocusChangeListener f17885K;
    public View.OnClickListener L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f17886M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f17887N;

    /* renamed from: O, reason: collision with root package name */
    public AbstractC3855a f17888O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f17889P;

    /* renamed from: Q, reason: collision with root package name */
    public CharSequence f17890Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f17891R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f17892S;

    /* renamed from: T, reason: collision with root package name */
    public int f17893T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f17894U;

    /* renamed from: V, reason: collision with root package name */
    public CharSequence f17895V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f17896W;

    /* renamed from: a0, reason: collision with root package name */
    public int f17897a0;

    /* renamed from: b0, reason: collision with root package name */
    public SearchableInfo f17898b0;

    /* renamed from: c0, reason: collision with root package name */
    public Bundle f17899c0;

    /* renamed from: d0, reason: collision with root package name */
    public final S0 f17900d0;

    /* renamed from: e0, reason: collision with root package name */
    public final S0 f17901e0;

    /* renamed from: f0, reason: collision with root package name */
    public final WeakHashMap f17902f0;

    /* renamed from: p, reason: collision with root package name */
    public final SearchAutoComplete f17903p;

    /* renamed from: q, reason: collision with root package name */
    public final View f17904q;

    /* renamed from: r, reason: collision with root package name */
    public final View f17905r;

    /* renamed from: s, reason: collision with root package name */
    public final View f17906s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f17907t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f17908u;

    /* renamed from: v, reason: collision with root package name */
    public final ImageView f17909v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f17910w;

    /* renamed from: x, reason: collision with root package name */
    public final View f17911x;

    /* renamed from: y, reason: collision with root package name */
    public Z0 f17912y;

    /* renamed from: z, reason: collision with root package name */
    public final Rect f17913z;

    public static class SearchAutoComplete extends C3824m {

        /* renamed from: e, reason: collision with root package name */
        public int f17914e;

        /* renamed from: f, reason: collision with root package name */
        public SearchView f17915f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f17916g;

        /* renamed from: h, reason: collision with root package name */
        public final d f17917h;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f17917h = new d(this);
            this.f17914e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i5 = configuration.screenWidthDp;
            int i10 = configuration.screenHeightDp;
            if (i5 >= 960 && i10 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i5 < 600) {
                return (i5 < 640 || i10 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final void a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            C3467f c3467f = SearchView.f17874g0;
            c3467f.getClass();
            C3467f.a();
            Method method = c3467f.f40281c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f17914e <= 0 || super.enoughToFilter();
        }

        @Override // q.C3824m, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f17916g) {
                d dVar = this.f17917h;
                removeCallbacks(dVar);
                post(dVar);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z2, int i5, Rect rect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onFocusChanged(z2, i5, rect);
            SearchView searchView = this.f17915f;
            searchView.y(searchView.f17887N);
            searchView.post(searchView.f17900d0);
            if (searchView.f17903p.hasFocus()) {
                searchView.n();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i5, KeyEvent keyEvent) {
            if (i5 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f17915f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i5, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onWindowFocusChanged(z2);
            if (z2 && this.f17915f.hasFocus() && getVisibility() == 0) {
                this.f17916g = true;
                Context context = getContext();
                C3467f c3467f = SearchView.f17874g0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z2) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            d dVar = this.f17917h;
            if (!z2) {
                this.f17916g = false;
                removeCallbacks(dVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f17916g = true;
                    return;
                }
                this.f17916g = false;
                removeCallbacks(dVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f17915f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i5) {
            super.setThreshold(i5);
            this.f17914e = i5;
        }
    }

    static {
        C3467f c3467f = null;
        if (Build.VERSION.SDK_INT < 29) {
            C3467f c3467f2 = new C3467f();
            c3467f2.f40279a = null;
            c3467f2.f40280b = null;
            c3467f2.f40281c = null;
            C3467f.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                c3467f2.f40279a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                c3467f2.f40280b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                c3467f2.f40281c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            c3467f = c3467f2;
        }
        f17874g0 = c3467f;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f17903p;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // o.InterfaceC3621b
    public final void b() {
        if (this.f17896W) {
            return;
        }
        this.f17896W = true;
        SearchAutoComplete searchAutoComplete = this.f17903p;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f17897a0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f17892S = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f17903p;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f17892S = false;
    }

    @Override // o.InterfaceC3621b
    public final void e() {
        SearchAutoComplete searchAutoComplete = this.f17903p;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f17895V = "";
        clearFocus();
        y(true);
        searchAutoComplete.setImeOptions(this.f17897a0);
        this.f17896W = false;
    }

    public int getImeOptions() {
        return this.f17903p.getImeOptions();
    }

    public int getInputType() {
        return this.f17903p.getInputType();
    }

    public int getMaxWidth() {
        return this.f17893T;
    }

    public CharSequence getQuery() {
        return this.f17903p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f17890Q;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f17898b0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f17884J : getContext().getText(this.f17898b0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f17881G;
    }

    public int getSuggestionRowLayout() {
        return this.f17880F;
    }

    public AbstractC3855a getSuggestionsAdapter() {
        return this.f17888O;
    }

    public final Intent l(Uri uri, String str, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f17895V);
        if (str3 != null) {
            intent.putExtra(AppLovinEventParameters.SEARCH_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f17899c0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f17898b0.getSearchActivity());
        return intent;
    }

    public final Intent m(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f17899c0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void n() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i5 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f17903p;
        if (i5 >= 29) {
            c.a(searchAutoComplete);
            return;
        }
        C3467f c3467f = f17874g0;
        c3467f.getClass();
        C3467f.a();
        Method method = c3467f.f40279a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        c3467f.getClass();
        C3467f.a();
        Method method2 = c3467f.f40280b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public final void o() {
        SearchAutoComplete searchAutoComplete = this.f17903p;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f17886M) {
            clearFocus();
            y(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f17900d0);
        post(this.f17901e0);
        super.onDetachedFromWindow();
    }

    @Override // q.AbstractC3848y0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        super.onLayout(z2, i5, i10, i11, i12);
        if (z2) {
            int[] iArr = this.f17876B;
            SearchAutoComplete searchAutoComplete = this.f17903p;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f17877C;
            getLocationInWindow(iArr2);
            int i13 = iArr[1] - iArr2[1];
            int i14 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i14;
            int height = searchAutoComplete.getHeight() + i13;
            Rect rect = this.f17913z;
            rect.set(i14, i13, width, height);
            int i15 = rect.left;
            int i16 = rect.right;
            int i17 = i12 - i10;
            Rect rect2 = this.f17875A;
            rect2.set(i15, 0, i16, i17);
            Z0 z02 = this.f17912y;
            if (z02 == null) {
                Z0 z03 = new Z0(rect2, rect, searchAutoComplete);
                this.f17912y = z03;
                setTouchDelegate(z03);
            } else {
                z02.f43729b.set(rect2);
                Rect rect3 = z02.f43731d;
                rect3.set(rect2);
                int i18 = -z02.f43732e;
                rect3.inset(i18, i18);
                z02.f43730c.set(rect);
            }
        }
    }

    @Override // q.AbstractC3848y0, android.view.View
    public final void onMeasure(int i5, int i10) {
        int i11;
        if (this.f17887N) {
            super.onMeasure(i5, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        if (mode == Integer.MIN_VALUE) {
            int i12 = this.f17893T;
            size = i12 > 0 ? Math.min(i12, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f17893T;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i11 = this.f17893T) > 0) {
            size = Math.min(i11, size);
        }
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Y0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Y0 y02 = (Y0) parcelable;
        super.onRestoreInstanceState(y02.f44826a);
        y(y02.f43727c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Y0 y02 = new Y0(super.onSaveInstanceState());
        y02.f43727c = this.f17887N;
        return y02;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        post(this.f17900d0);
    }

    public final void p(int i5) {
        int position;
        String strH;
        Cursor cursor = this.f17888O.f43966c;
        if (cursor != null && cursor.moveToPosition(i5)) {
            Intent intentL = null;
            try {
                int i10 = b1.f43742y;
                String strH2 = b1.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strH2 == null) {
                    strH2 = this.f17898b0.getSuggestIntentAction();
                }
                if (strH2 == null) {
                    strH2 = "android.intent.action.SEARCH";
                }
                String strH3 = b1.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strH3 == null) {
                    strH3 = this.f17898b0.getSuggestIntentData();
                }
                if (strH3 != null && (strH = b1.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strH3 = strH3 + "/" + Uri.encode(strH);
                }
                intentL = l(strH3 == null ? null : Uri.parse(strH3), strH2, b1.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), b1.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e7) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e7);
            }
            if (intentL != null) {
                try {
                    getContext().startActivity(intentL);
                } catch (RuntimeException e10) {
                    Log.e("SearchView", "Failed launch activity: " + intentL, e10);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f17903p;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void q(int i5) {
        Editable text = this.f17903p.getText();
        Cursor cursor = this.f17888O.f43966c;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i5)) {
            setQuery(text);
            return;
        }
        String strC = this.f17888O.c(cursor);
        if (strC != null) {
            setQuery(strC);
        } else {
            setQuery(text);
        }
    }

    public final void r(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i5, Rect rect) {
        if (this.f17892S || !isFocusable()) {
            return false;
        }
        if (this.f17887N) {
            return super.requestFocus(i5, rect);
        }
        boolean zRequestFocus = this.f17903p.requestFocus(i5, rect);
        if (zRequestFocus) {
            y(false);
        }
        return zRequestFocus;
    }

    public final void s() {
        SearchAutoComplete searchAutoComplete = this.f17903p;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f17898b0 != null) {
            getContext().startActivity(l(null, "android.intent.action.SEARCH", null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public void setAppSearchData(Bundle bundle) {
        this.f17899c0 = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            o();
            return;
        }
        y(false);
        SearchAutoComplete searchAutoComplete = this.f17903p;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.L;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.f17886M == z2) {
            return;
        }
        this.f17886M = z2;
        y(z2);
        v();
    }

    public void setImeOptions(int i5) {
        this.f17903p.setImeOptions(i5);
    }

    public void setInputType(int i5) {
        this.f17903p.setInputType(i5);
    }

    public void setMaxWidth(int i5) {
        this.f17893T = i5;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f17885K = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.L = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f17890Q = charSequence;
        v();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        this.f17891R = z2;
        AbstractC3855a abstractC3855a = this.f17888O;
        if (abstractC3855a instanceof b1) {
            ((b1) abstractC3855a).f43750q = z2 ? 2 : 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.f17898b0 = r7
            r0 = 0
            r1 = 1
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r6.f17903p
            if (r7 == 0) goto L65
            int r7 = r7.getSuggestThreshold()
            r2.setThreshold(r7)
            android.app.SearchableInfo r7 = r6.f17898b0
            int r7 = r7.getImeOptions()
            r2.setImeOptions(r7)
            android.app.SearchableInfo r7 = r6.f17898b0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r1) goto L31
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.f17898b0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L31
            r3 = 589824(0x90000, float:8.2652E-40)
            r7 = r7 | r3
        L31:
            r2.setInputType(r7)
            q1.a r7 = r6.f17888O
            if (r7 == 0) goto L3b
            r7.b(r0)
        L3b:
            android.app.SearchableInfo r7 = r6.f17898b0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L62
            q.b1 r7 = new q.b1
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.f17898b0
            java.util.WeakHashMap r5 = r6.f17902f0
            r7.<init>(r3, r6, r4, r5)
            r6.f17888O = r7
            r2.setAdapter(r7)
            q1.a r7 = r6.f17888O
            q.b1 r7 = (q.b1) r7
            boolean r3 = r6.f17891R
            if (r3 == 0) goto L5f
            r3 = 2
            goto L60
        L5f:
            r3 = r1
        L60:
            r7.f43750q = r3
        L62:
            r6.v()
        L65:
            android.app.SearchableInfo r7 = r6.f17898b0
            r3 = 0
            if (r7 == 0) goto L98
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L98
            android.app.SearchableInfo r7 = r6.f17898b0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L7b
            android.content.Intent r0 = r6.f17882H
            goto L85
        L7b:
            android.app.SearchableInfo r7 = r6.f17898b0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L85
            android.content.Intent r0 = r6.f17883I
        L85:
            if (r0 == 0) goto L98
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            r4 = 65536(0x10000, float:9.1835E-41)
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r0, r4)
            if (r7 == 0) goto L98
            goto L99
        L98:
            r1 = r3
        L99:
            r6.f17894U = r1
            if (r1 == 0) goto La2
            java.lang.String r7 = "nm"
            r2.setPrivateImeOptions(r7)
        La2:
            boolean r7 = r6.f17887N
            r6.y(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.f17889P = z2;
        y(this.f17887N);
    }

    public void setSuggestionsAdapter(AbstractC3855a abstractC3855a) {
        this.f17888O = abstractC3855a;
        this.f17903p.setAdapter(abstractC3855a);
    }

    public final void t() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f17903p.getText());
        int i5 = (!zIsEmpty || (this.f17886M && !this.f17896W)) ? 0 : 8;
        ImageView imageView = this.f17909v;
        imageView.setVisibility(i5);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void u() {
        int[] iArr = this.f17903p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f17905r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f17906s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void v() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z2 = this.f17886M;
        SearchAutoComplete searchAutoComplete = this.f17903p;
        if (z2 && (drawable = this.f17879E) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void w() {
        this.f17906s.setVisibility(((this.f17889P || this.f17894U) && !this.f17887N && (this.f17908u.getVisibility() == 0 || this.f17910w.getVisibility() == 0)) ? 0 : 8);
    }

    public final void x(boolean z2) {
        boolean z10 = this.f17889P;
        this.f17908u.setVisibility((!z10 || !(z10 || this.f17894U) || this.f17887N || !hasFocus() || (!z2 && this.f17894U)) ? 8 : 0);
    }

    public final void y(boolean z2) {
        this.f17887N = z2;
        int i5 = 8;
        int i10 = z2 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f17903p.getText());
        this.f17907t.setVisibility(i10);
        x(!zIsEmpty);
        this.f17904q.setVisibility(z2 ? 8 : 0);
        ImageView imageView = this.f17878D;
        imageView.setVisibility((imageView.getDrawable() == null || this.f17886M) ? 8 : 0);
        t();
        if (this.f17894U && !this.f17887N && zIsEmpty) {
            this.f17908u.setVisibility(8);
            i5 = 0;
        }
        this.f17910w.setVisibility(i5);
        w();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f17913z = new Rect();
        this.f17875A = new Rect();
        this.f17876B = new int[2];
        this.f17877C = new int[2];
        this.f17900d0 = new S0(this, 0);
        this.f17901e0 = new S0(this, 1);
        this.f17902f0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        U0 u02 = new U0(this);
        r rVar = new r(this, 2);
        C3850z0 c3850z0 = new C3850z0(this, 1);
        w wVar = new w(this, 2);
        int[] iArr = AbstractC2820a.f36457u;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i5, 0);
        J j8 = new J(context, typedArrayObtainStyledAttributes);
        S.l(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i5);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(17, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f17903p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f17904q = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.f17905r = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.f17906s = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f17907t = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f17908u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f17909v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f17910w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f17878D = imageView5;
        viewFindViewById.setBackground(j8.n(18));
        viewFindViewById2.setBackground(j8.n(23));
        imageView.setImageDrawable(j8.n(21));
        imageView2.setImageDrawable(j8.n(13));
        imageView3.setImageDrawable(j8.n(10));
        imageView4.setImageDrawable(j8.n(26));
        imageView5.setImageDrawable(j8.n(21));
        this.f17879E = j8.n(20);
        AbstractC2641B.J(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f17880F = typedArrayObtainStyledAttributes.getResourceId(24, R.layout.abc_search_dropdown_item_icons_2line);
        this.f17881G = typedArrayObtainStyledAttributes.getResourceId(11, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(wVar);
        searchAutoComplete.setOnEditorActionListener(u02);
        searchAutoComplete.setOnItemClickListener(rVar);
        searchAutoComplete.setOnItemSelectedListener(c3850z0);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new T0(this));
        setIconifiedByDefault(typedArrayObtainStyledAttributes.getBoolean(16, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f17884J = typedArrayObtainStyledAttributes.getText(12);
        this.f17890Q = typedArrayObtainStyledAttributes.getText(19);
        int i10 = typedArrayObtainStyledAttributes.getInt(6, -1);
        if (i10 != -1) {
            setImeOptions(i10);
        }
        int i11 = typedArrayObtainStyledAttributes.getInt(5, -1);
        if (i11 != -1) {
            setInputType(i11);
        }
        setFocusable(typedArrayObtainStyledAttributes.getBoolean(1, true));
        j8.v();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f17882H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f17883I = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f17911x = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new M7.a(this, 2));
        }
        y(this.f17886M);
        v();
    }

    public void setOnCloseListener(V0 v0) {
    }

    public void setOnQueryTextListener(W0 w02) {
    }

    public void setOnSuggestionListener(X0 x02) {
    }
}
