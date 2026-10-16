package com.qonversion.android.sdk.automations.mvp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.C1409a;
import androidx.fragment.app.C1414c0;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e0;
import com.qonversion.android.sdk.R;
import com.qonversion.android.sdk.automations.dto.QScreenPresentationStyle;
import com.qonversion.android.sdk.automations.internal.UtilsKt;
import ef.C2527k;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0003J-\u0010\u0012\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168BX\u0082\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "Lef/C;", "playCloseAnimation", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "finish", "", ScreenActivity.INTENT_SCREEN_ID, ScreenActivity.INTENT_HTML_PAGE, "", "addToBackStack", "showScreen$sdk_release", "(Ljava/lang/String;Ljava/lang/String;Z)V", "showScreen", "goBack$sdk_release", "()Z", "goBack", "Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;", "getPresentationStyle", "()Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;", "getPresentationStyle$annotations", "presentationStyle", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ScreenActivity extends FragmentActivity {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String INTENT_HTML_PAGE = "htmlPage";

    @NotNull
    public static final String INTENT_SCREEN_ID = "screenId";

    @NotNull
    public static final String INTENT_SCREEN_PRESENTATION_STYLE = "screenPresentationStyle";

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002¨\u0006\u0012"}, d2 = {"Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity$Companion;", "", "()V", "INTENT_HTML_PAGE", "", "getINTENT_HTML_PAGE$annotations", "INTENT_SCREEN_ID", "getINTENT_SCREEN_ID$annotations", "INTENT_SCREEN_PRESENTATION_STYLE", "getINTENT_SCREEN_PRESENTATION_STYLE$annotations", "getCallingIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", ScreenActivity.INTENT_SCREEN_ID, ScreenActivity.INTENT_HTML_PAGE, ScreenActivity.INTENT_SCREEN_PRESENTATION_STYLE, "Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getINTENT_HTML_PAGE$annotations() {
        }

        public static /* synthetic */ void getINTENT_SCREEN_ID$annotations() {
        }

        public static /* synthetic */ void getINTENT_SCREEN_PRESENTATION_STYLE$annotations() {
        }

        @NotNull
        public final Intent getCallingIntent(@NotNull Context context, @NotNull String screenId, @NotNull String htmlPage, @NotNull QScreenPresentationStyle screenPresentationStyle) {
            AbstractC3340k.e(context, "context");
            AbstractC3340k.e(screenId, "screenId");
            AbstractC3340k.e(htmlPage, "htmlPage");
            AbstractC3340k.e(screenPresentationStyle, "screenPresentationStyle");
            Intent intent = new Intent(context, (Class<?>) ScreenActivity.class);
            intent.putExtra(ScreenActivity.INTENT_SCREEN_ID, screenId);
            intent.putExtra(ScreenActivity.INTENT_HTML_PAGE, htmlPage);
            intent.putExtra(ScreenActivity.INTENT_SCREEN_PRESENTATION_STYLE, screenPresentationStyle);
            return intent;
        }

        private Companion() {
        }
    }

    public ScreenActivity() {
        super(R.layout.q_activity_screen);
    }

    private final QScreenPresentationStyle getPresentationStyle() {
        Serializable serializableExtra = getIntent().getSerializableExtra(INTENT_SCREEN_PRESENTATION_STYLE);
        if (serializableExtra instanceof QScreenPresentationStyle) {
            return (QScreenPresentationStyle) serializableExtra;
        }
        return null;
    }

    private static /* synthetic */ void getPresentationStyle$annotations() {
    }

    private final void playCloseAnimation() {
        C2527k screenTransactionAnimations = UtilsKt.getScreenTransactionAnimations(getPresentationStyle());
        if (screenTransactionAnimations != null) {
            overridePendingTransition(((Number) screenTransactionAnimations.f34671a).intValue(), ((Number) screenTransactionAnimations.f34672b).intValue());
        }
    }

    public static /* synthetic */ void showScreen$sdk_release$default(ScreenActivity screenActivity, String str, String str2, boolean z2, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            z2 = true;
        }
        screenActivity.showScreen$sdk_release(str, str2, z2);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        playCloseAnimation();
    }

    public final boolean goBack$sdk_release() {
        e0 supportFragmentManager = getSupportFragmentManager();
        boolean z2 = supportFragmentManager.f18411d.size() + (supportFragmentManager.f18415h != null ? 1 : 0) == 0;
        if (z2) {
            finish();
            return z2;
        }
        e0 supportFragmentManager2 = getSupportFragmentManager();
        supportFragmentManager2.getClass();
        supportFragmentManager2.x(new C1414c0(supportFragmentManager2, -1, 0), false);
        return z2;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            showScreen$sdk_release(getIntent().getStringExtra(INTENT_SCREEN_ID), getIntent().getStringExtra(INTENT_HTML_PAGE), false);
        }
    }

    public final void showScreen$sdk_release(@Nullable String screenId, @Nullable String htmlPage, boolean addToBackStack) {
        Bundle arguments = ScreenFragment.INSTANCE.getArguments(screenId, htmlPage);
        ScreenFragment screenFragment = new ScreenFragment();
        screenFragment.setArguments(arguments);
        e0 supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C1409a c1409a = new C1409a(supportFragmentManager);
        if (addToBackStack) {
            int i5 = R.anim.q_slide_in_from_left;
            int i10 = R.anim.q_fade_out;
            int i11 = R.anim.q_fade_in;
            int i12 = R.anim.q_slide_out_to_left;
            c1409a.f18351b = i5;
            c1409a.f18352c = i10;
            c1409a.f18353d = i11;
            c1409a.f18354e = i12;
            if (!c1409a.f18357h) {
                throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
            }
            c1409a.f18356g = true;
            c1409a.f18358i = null;
        }
        int i13 = R.id.fragment_container_view;
        if (i13 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        c1409a.e(i13, screenFragment, null, 2);
        c1409a.d(false);
    }
}
