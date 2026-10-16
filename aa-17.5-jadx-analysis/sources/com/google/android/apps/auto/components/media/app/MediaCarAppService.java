package com.google.android.apps.auto.components.media.app;

import androidx.car.app.SessionInfo;
import defpackage.htm;
import defpackage.lke;
import defpackage.ogz;
import defpackage.qg;
import defpackage.qz;
import defpackage.yk;
import defpackage.yob;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u0017B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0018"}, d2 = {"Lcom/google/android/apps/auto/components/media/app/MediaCarAppService;", "Landroidx/car/app/CarAppService;", "<init>", "()V", "browseFactory", "Lcom/google/android/apps/auto/components/media/app/browse/BrowseScreenFactory;", "playbackFactory", "Lcom/google/android/apps/auto/components/media/app/playback/PlaybackScreenFactory;", "searchFactory", "Lcom/google/android/apps/auto/components/media/app/search/SearchScreenFactory;", "errorFactory", "Lcom/google/android/apps/auto/components/media/app/error/ErrorScreenFactory;", "(Lcom/google/android/apps/auto/components/media/app/browse/BrowseScreenFactory;Lcom/google/android/apps/auto/components/media/app/playback/PlaybackScreenFactory;Lcom/google/android/apps/auto/components/media/app/search/SearchScreenFactory;Lcom/google/android/apps/auto/components/media/app/error/ErrorScreenFactory;)V", "browseScreenFactory", "playbackScreenFactory", "searchScreenFactory", "errorScreenFactory", "onCreateSession", "Landroidx/car/app/Session;", "sessionInfo", "Landroidx/car/app/SessionInfo;", "createHostValidator", "Landroidx/car/app/validation/HostValidator;", "Companion", "java.com.google.android.apps.auto.components.media.app_app"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MediaCarAppService extends qg {
    public static final yob c = yob.c("com/google/android/apps/auto/components/media/app/MediaCarAppService");
    public final ogz d;
    public final htm e;

    public MediaCarAppService() {
        ogz ogzVar = new ogz();
        htm htmVar = new htm((short[]) null);
        this.d = ogzVar;
        this.e = htmVar;
    }

    @Override // defpackage.qg
    public final qz c(SessionInfo sessionInfo) {
        return new lke(sessionInfo, this);
    }

    @Override // defpackage.qg
    public final yk d() {
        yk ykVar = yk.a;
        ykVar.getClass();
        return ykVar;
    }
}
