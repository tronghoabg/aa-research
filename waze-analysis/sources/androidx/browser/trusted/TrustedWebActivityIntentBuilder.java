package androidx.browser.trusted;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.browser.customtabs.TrustedWebUtils;
import androidx.browser.trusted.TrustedWebActivityDisplayMode;
import androidx.browser.trusted.sharing.ShareData;
import androidx.browser.trusted.sharing.ShareTarget;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class TrustedWebActivityIntentBuilder {
    public static final String EXTRA_ADDITIONAL_TRUSTED_ORIGINS = "android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS";
    public static final String EXTRA_DISPLAY_MODE = "androidx.browser.trusted.extra.DISPLAY_MODE";
    public static final String EXTRA_DISPLAY_OVERRIDE = "androidx.browser.trusted.extra.DISPLAY_OVERRIDE";
    public static final String EXTRA_FILE_HANDLING_DATA = "androidx.browser.trusted.extra.FILE_HANDLING_DATA";
    public static final String EXTRA_LAUNCH_HANDLER_CLIENT_MODE = "androidx.browser.trusted.extra.LAUNCH_HANDLER_CLIENT_MODE";
    public static final String EXTRA_ORIGINAL_LAUNCH_URL = "androidx.browser.trusted.extra.ORIGINAL_LAUNCH_URL";
    public static final String EXTRA_SCREEN_ORIENTATION = "androidx.browser.trusted.extra.SCREEN_ORIENTATION";
    public static final String EXTRA_SHARE_DATA = "androidx.browser.trusted.extra.SHARE_DATA";
    public static final String EXTRA_SHARE_TARGET = "androidx.browser.trusted.extra.SHARE_TARGET";
    public static final String EXTRA_SPLASH_SCREEN_PARAMS = "androidx.browser.trusted.EXTRA_SPLASH_SCREEN_PARAMS";
    private List<String> mAdditionalTrustedOrigins;
    private List<TrustedWebActivityDisplayMode> mDisplayOverrideList;
    private FileHandlingData mFileHandlingData;
    private Uri mOriginalLaunchUrl;
    private ShareData mShareData;
    private ShareTarget mShareTarget;
    private Bundle mSplashScreenParams;
    private final Uri mUri;
    private final CustomTabsIntent.Builder mIntentBuilder = new CustomTabsIntent.Builder();
    private int mLaunchHandlerClientMode = 0;
    private TrustedWebActivityDisplayMode mDisplayMode = new TrustedWebActivityDisplayMode.DefaultMode();
    private int mScreenOrientation = 0;

    public TrustedWebActivityIntentBuilder(Uri uri) {
        this.mUri = uri;
    }

    public TrustedWebActivityIntent build(CustomTabsSession customTabsSession) {
        if (customTabsSession == null) {
            throw new NullPointerException("CustomTabsSession is required for launching a TWA");
        }
        this.mIntentBuilder.setSession(customTabsSession);
        Intent intent = this.mIntentBuilder.build().intent;
        intent.setData(this.mUri);
        intent.putExtra(TrustedWebUtils.EXTRA_LAUNCH_AS_TRUSTED_WEB_ACTIVITY, true);
        List<String> list = this.mAdditionalTrustedOrigins;
        if (list != null) {
            intent.putExtra(EXTRA_ADDITIONAL_TRUSTED_ORIGINS, new ArrayList(list));
        }
        Bundle bundle = this.mSplashScreenParams;
        if (bundle != null) {
            intent.putExtra(EXTRA_SPLASH_SCREEN_PARAMS, bundle);
        }
        List<Uri> list2 = Collections.EMPTY_LIST;
        ShareTarget shareTarget = this.mShareTarget;
        if (shareTarget != null && this.mShareData != null) {
            intent.putExtra(EXTRA_SHARE_TARGET, shareTarget.toBundle());
            intent.putExtra(EXTRA_SHARE_DATA, this.mShareData.toBundle());
            List<Uri> list3 = this.mShareData.uris;
            if (list3 != null) {
                list2 = list3;
            }
        }
        List<Uri> list4 = Collections.EMPTY_LIST;
        FileHandlingData fileHandlingData = this.mFileHandlingData;
        if (fileHandlingData != null) {
            intent.putExtra(EXTRA_FILE_HANDLING_DATA, fileHandlingData.toBundle());
            List<Uri> list5 = this.mFileHandlingData.uris;
            if (list5 != null) {
                list4 = list5;
            }
        }
        intent.putExtra(EXTRA_DISPLAY_MODE, this.mDisplayMode.toBundle());
        if (this.mDisplayOverrideList != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<TrustedWebActivityDisplayMode> it = this.mDisplayOverrideList.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toBundle());
            }
            intent.putExtra(EXTRA_DISPLAY_OVERRIDE, arrayList);
        }
        intent.putExtra(EXTRA_SCREEN_ORIENTATION, this.mScreenOrientation);
        Uri uri = this.mOriginalLaunchUrl;
        if (uri != null) {
            intent.putExtra(EXTRA_ORIGINAL_LAUNCH_URL, uri);
        }
        intent.putExtra(EXTRA_LAUNCH_HANDLER_CLIENT_MODE, this.mLaunchHandlerClientMode);
        return new TrustedWebActivityIntent(intent, list2, list4);
    }

    public CustomTabsIntent buildCustomTabsIntent() {
        return this.mIntentBuilder.build();
    }

    public TrustedWebActivityDisplayMode getDisplayMode() {
        return this.mDisplayMode;
    }

    public Uri getUri() {
        return this.mUri;
    }

    public TrustedWebActivityIntentBuilder setAdditionalTrustedOrigins(List<String> list) {
        this.mAdditionalTrustedOrigins = list;
        return this;
    }

    public TrustedWebActivityIntentBuilder setColorScheme(int i2) {
        this.mIntentBuilder.setColorScheme(i2);
        return this;
    }

    public TrustedWebActivityIntentBuilder setColorSchemeParams(int i2, CustomTabColorSchemeParams customTabColorSchemeParams) {
        this.mIntentBuilder.setColorSchemeParams(i2, customTabColorSchemeParams);
        return this;
    }

    public TrustedWebActivityIntentBuilder setDefaultColorSchemeParams(CustomTabColorSchemeParams customTabColorSchemeParams) {
        this.mIntentBuilder.setDefaultColorSchemeParams(customTabColorSchemeParams);
        return this;
    }

    public TrustedWebActivityIntentBuilder setDisplayMode(TrustedWebActivityDisplayMode trustedWebActivityDisplayMode) {
        this.mDisplayMode = trustedWebActivityDisplayMode;
        return this;
    }

    public TrustedWebActivityIntentBuilder setDisplayOverrideList(List<TrustedWebActivityDisplayMode> list) {
        if (list == null) {
            this.mDisplayOverrideList = new ArrayList();
            return this;
        }
        this.mDisplayOverrideList = list;
        return this;
    }

    public TrustedWebActivityIntentBuilder setFileHandlingData(FileHandlingData fileHandlingData) {
        this.mFileHandlingData = fileHandlingData;
        return this;
    }

    public TrustedWebActivityIntentBuilder setLaunchHandlerClientMode(int i2) {
        this.mLaunchHandlerClientMode = i2;
        return this;
    }

    @Deprecated
    public TrustedWebActivityIntentBuilder setNavigationBarColor(int i2) {
        this.mIntentBuilder.setNavigationBarColor(i2);
        return this;
    }

    @Deprecated
    public TrustedWebActivityIntentBuilder setNavigationBarDividerColor(int i2) {
        this.mIntentBuilder.setNavigationBarDividerColor(i2);
        return this;
    }

    public TrustedWebActivityIntentBuilder setOriginalLaunchUrl(Uri uri) {
        this.mOriginalLaunchUrl = uri;
        return this;
    }

    public TrustedWebActivityIntentBuilder setScreenOrientation(int i2) {
        this.mScreenOrientation = i2;
        return this;
    }

    public TrustedWebActivityIntentBuilder setShareParams(ShareTarget shareTarget, ShareData shareData) {
        this.mShareTarget = shareTarget;
        this.mShareData = shareData;
        return this;
    }

    public TrustedWebActivityIntentBuilder setSplashScreenParams(Bundle bundle) {
        this.mSplashScreenParams = bundle;
        return this;
    }

    @Deprecated
    public TrustedWebActivityIntentBuilder setToolbarColor(int i2) {
        this.mIntentBuilder.setToolbarColor(i2);
        return this;
    }
}
