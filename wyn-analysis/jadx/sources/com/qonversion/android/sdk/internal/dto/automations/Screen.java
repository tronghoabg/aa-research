package com.qonversion.android.sdk.internal.dto.automations;

import A7.AbstractC0279p0;
import N0.a;
import com.qonversion.android.sdk.automations.mvp.ScreenActivity;
import hb.InterfaceC2812o;
import hb.s;
import ka.AbstractC3256n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wg.b;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/automations/Screen;", "", "id", "", ScreenActivity.INTENT_HTML_PAGE, "lang", "background", "obj", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackground", "()Ljava/lang/String;", "getHtmlPage", "getId", "getLang", "getObj", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Screen {

    @NotNull
    private final String background;

    @NotNull
    private final String htmlPage;

    @NotNull
    private final String id;

    @NotNull
    private final String lang;

    @NotNull
    private final String obj;

    public Screen(@InterfaceC2812o(name = "id") @NotNull String id2, @InterfaceC2812o(name = "body") @NotNull String htmlPage, @InterfaceC2812o(name = "lang") @NotNull String lang, @InterfaceC2812o(name = "background") @NotNull String background, @InterfaceC2812o(name = "object") @NotNull String obj) {
        AbstractC3340k.e(id2, "id");
        AbstractC3340k.e(htmlPage, "htmlPage");
        AbstractC3340k.e(lang, "lang");
        AbstractC3340k.e(background, "background");
        AbstractC3340k.e(obj, "obj");
        this.id = id2;
        this.htmlPage = htmlPage;
        this.lang = lang;
        this.background = background;
        this.obj = obj;
    }

    public static /* synthetic */ Screen copy$default(Screen screen, String str, String str2, String str3, String str4, String str5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = screen.id;
        }
        if ((i5 & 2) != 0) {
            str2 = screen.htmlPage;
        }
        if ((i5 & 4) != 0) {
            str3 = screen.lang;
        }
        if ((i5 & 8) != 0) {
            str4 = screen.background;
        }
        if ((i5 & 16) != 0) {
            str5 = screen.obj;
        }
        String str6 = str5;
        String str7 = str3;
        return screen.copy(str, str2, str7, str4, str6);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getHtmlPage() {
        return this.htmlPage;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getLang() {
        return this.lang;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getBackground() {
        return this.background;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getObj() {
        return this.obj;
    }

    @NotNull
    public final Screen copy(@InterfaceC2812o(name = "id") @NotNull String id2, @InterfaceC2812o(name = "body") @NotNull String htmlPage, @InterfaceC2812o(name = "lang") @NotNull String lang, @InterfaceC2812o(name = "background") @NotNull String background, @InterfaceC2812o(name = "object") @NotNull String obj) {
        AbstractC3340k.e(id2, "id");
        AbstractC3340k.e(htmlPage, "htmlPage");
        AbstractC3340k.e(lang, "lang");
        AbstractC3340k.e(background, "background");
        AbstractC3340k.e(obj, "obj");
        return new Screen(id2, htmlPage, lang, background, obj);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Screen)) {
            return false;
        }
        Screen screen = (Screen) other;
        return AbstractC3340k.a(this.id, screen.id) && AbstractC3340k.a(this.htmlPage, screen.htmlPage) && AbstractC3340k.a(this.lang, screen.lang) && AbstractC3340k.a(this.background, screen.background) && AbstractC3340k.a(this.obj, screen.obj);
    }

    @NotNull
    public final String getBackground() {
        return this.background;
    }

    @NotNull
    public final String getHtmlPage() {
        return this.htmlPage;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getLang() {
        return this.lang;
    }

    @NotNull
    public final String getObj() {
        return this.obj;
    }

    public int hashCode() {
        return this.obj.hashCode() + a.c(a.c(a.c(this.id.hashCode() * 31, 31, this.htmlPage), 31, this.lang), 31, this.background);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.htmlPage;
        String str3 = this.lang;
        String str4 = this.background;
        String str5 = this.obj;
        StringBuilder sbR = AbstractC0279p0.r("Screen(id=", str, ", htmlPage=", str2, ", lang=");
        AbstractC3256n.p(sbR, str3, ", background=", str4, ", obj=");
        return b.c(sbR, str5, ")");
    }
}
