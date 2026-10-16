package com.qonversion.android.sdk.automations.mvp;

import Bf.r;
import android.net.Uri;
import com.qonversion.android.sdk.automations.dto.QActionResultType;
import com.qonversion.android.sdk.automations.mvp.ScreenContract;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.internal.dto.automations.Screen;
import com.qonversion.android.sdk.internal.logger.ConsoleLogger;
import com.qonversion.android.sdk.internal.repository.QRepository;
import ef.C2515C;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.l;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u000f*\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u000f*\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;", "Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$Presenter;", "Lcom/qonversion/android/sdk/internal/repository/QRepository;", "repository", "Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;", "view", "<init>", "(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;)V", "Landroid/net/Uri;", "Lcom/qonversion/android/sdk/automations/dto/QActionResultType;", "getActionType", "(Landroid/net/Uri;)Lcom/qonversion/android/sdk/automations/dto/QActionResultType;", "", "getData", "(Landroid/net/Uri;)Ljava/lang/String;", "", "shouldOverrideUrlLoading", "(Landroid/net/Uri;)Z", "isQScheme", "isAutomationsHost", ScreenActivity.INTENT_SCREEN_ID, "Lef/C;", "getHtmlPageForScreen", "(Ljava/lang/String;)V", "url", "(Ljava/lang/String;)Z", "confirmScreenView", "Lcom/qonversion/android/sdk/internal/repository/QRepository;", "Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;", "Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;", "logger", "Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ScreenPresenter implements ScreenContract.Presenter {

    @NotNull
    private static final String ACTION = "action";

    @NotNull
    private static final String DATA = "data";

    @NotNull
    private static final String HOST = "automation";

    @NotNull
    private static final String REGEX = "qon-.+";

    @NotNull
    private static final String SCHEMA = "qon-";

    @NotNull
    private final ConsoleLogger logger;

    @NotNull
    private final QRepository repository;

    @NotNull
    private final ScreenContract.View view;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QActionResultType.values().length];
            try {
                iArr[QActionResultType.Url.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QActionResultType.DeepLink.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[QActionResultType.Close.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[QActionResultType.CloseAll.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[QActionResultType.Navigation.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[QActionResultType.Purchase.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[QActionResultType.Restore.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/automations/Screen;", "screen", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/dto/automations/Screen;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.automations.mvp.ScreenPresenter$getHtmlPageForScreen$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements l {
        final /* synthetic */ String $screenId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(1);
            this.$screenId = str;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Screen) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull Screen screen) {
            AbstractC3340k.e(screen, "screen");
            ScreenPresenter.this.view.openScreen(this.$screenId, screen.getHtmlPage());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/dto/QonversionError;", "it", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/dto/QonversionError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.automations.mvp.ScreenPresenter$getHtmlPageForScreen$2, reason: invalid class name */
    public static final class AnonymousClass2 extends AbstractC3343n implements l {
        public AnonymousClass2() {
            super(1);
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((QonversionError) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull QonversionError it) {
            AbstractC3340k.e(it, "it");
            ScreenContract.View.DefaultImpls.onError$default(ScreenPresenter.this.view, it, false, 2, null);
        }
    }

    public ScreenPresenter(@NotNull QRepository repository, @NotNull ScreenContract.View view) {
        AbstractC3340k.e(repository, "repository");
        AbstractC3340k.e(view, "view");
        this.repository = repository;
        this.view = view;
        this.logger = new ConsoleLogger();
    }

    private final QActionResultType getActionType(Uri uri) {
        return QActionResultType.INSTANCE.fromType(uri.getQueryParameter("action"));
    }

    private final String getData(Uri uri) {
        return uri.getQueryParameter("data");
    }

    private final void getHtmlPageForScreen(String screenId) {
        this.repository.screens(screenId, new AnonymousClass1(screenId), new AnonymousClass2());
    }

    private final boolean isAutomationsHost(Uri uri) {
        return r.c0(uri.getHost(), HOST, false);
    }

    private final boolean isQScheme(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme == null) {
            return false;
        }
        Pattern patternCompile = Pattern.compile(REGEX);
        AbstractC3340k.d(patternCompile, "compile(...)");
        return patternCompile.matcher(scheme).matches();
    }

    @Override // com.qonversion.android.sdk.automations.mvp.ScreenContract.Presenter
    public void confirmScreenView(@NotNull String screenId) {
        AbstractC3340k.e(screenId, "screenId");
        this.repository.views(screenId);
    }

    @Override // com.qonversion.android.sdk.automations.mvp.ScreenContract.Presenter
    public boolean shouldOverrideUrlLoading(@Nullable String url) {
        this.logger.debug("shouldOverrideUrlLoading() -> url:" + url);
        if (url == null) {
            return true;
        }
        Uri uri = Uri.parse(url);
        AbstractC3340k.b(uri);
        if (!shouldOverrideUrlLoading(uri)) {
            return true;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[getActionType(uri).ordinal()]) {
            case 1:
                String data = getData(uri);
                if (data != null) {
                    this.view.openLink(data);
                }
                return true;
            case 2:
                String data2 = getData(uri);
                if (data2 != null) {
                    this.view.openDeepLink(data2);
                }
                return true;
            case 3:
                ScreenContract.View.DefaultImpls.close$default(this.view, null, 1, null);
                return true;
            case 4:
                ScreenContract.View.DefaultImpls.closeAll$default(this.view, null, 1, null);
                return true;
            case 5:
                String data3 = getData(uri);
                if (data3 != null) {
                    getHtmlPageForScreen(data3);
                }
                return true;
            case 6:
                String data4 = getData(uri);
                if (data4 != null) {
                    this.view.purchase(data4);
                }
                return true;
            case 7:
                this.view.restore();
                return true;
            default:
                return true;
        }
    }

    private final boolean shouldOverrideUrlLoading(Uri uri) {
        return isAutomationsHost(uri) && isQScheme(uri);
    }
}
