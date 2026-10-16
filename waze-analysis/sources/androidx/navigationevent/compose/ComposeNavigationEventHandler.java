package androidx.navigationevent.compose;

import androidx.navigationevent.NavigationEvent;
import androidx.navigationevent.NavigationEventHandler;
import androidx.navigationevent.NavigationEventInfo;
import androidx.navigationevent.NavigationEventTransitionState;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ComposeNavigationEventHandler<T extends NavigationEventInfo> extends NavigationEventHandler<T> {
    private a<ab> currentOnBackCancelled;
    private a<ab> currentOnBackCompleted;
    private a<ab> currentOnForwardCancelled;
    private a<ab> currentOnForwardCompleted;
    private final l<NavigationEventTransitionState, ab> onTransitionStateChanged;

    /* JADX WARN: Multi-variable type inference failed */
    public ComposeNavigationEventHandler(T t, l<? super NavigationEventTransitionState, ab> lVar) {
        super(t, false, false);
        this.onTransitionStateChanged = lVar;
        this.currentOnForwardCancelled = new a() { // from class: androidx.navigationevent.compose.ComposeNavigationEventHandler$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return ab.f48028a;
            }
        };
        this.currentOnForwardCompleted = new a() { // from class: androidx.navigationevent.compose.ComposeNavigationEventHandler$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return ab.f48028a;
            }
        };
        this.currentOnBackCancelled = new a() { // from class: androidx.navigationevent.compose.ComposeNavigationEventHandler$$ExternalSyntheticLambda3
            @Override // h.g.a.a
            public final Object invoke() {
                return ab.f48028a;
            }
        };
        this.currentOnBackCompleted = new a() { // from class: androidx.navigationevent.compose.ComposeNavigationEventHandler$$ExternalSyntheticLambda4
            @Override // h.g.a.a
            public final Object invoke() {
                return ab.f48028a;
            }
        };
    }

    public final a<ab> getCurrentOnBackCancelled() {
        return this.currentOnBackCancelled;
    }

    public final a<ab> getCurrentOnBackCompleted() {
        return this.currentOnBackCompleted;
    }

    public final a<ab> getCurrentOnForwardCancelled() {
        return this.currentOnForwardCancelled;
    }

    public final a<ab> getCurrentOnForwardCompleted() {
        return this.currentOnForwardCompleted;
    }

    @Override // androidx.navigationevent.NavigationEventHandler
    protected void onBackCancelled() {
        this.onTransitionStateChanged.invoke(getTransitionState());
        this.currentOnBackCancelled.invoke();
    }

    @Override // androidx.navigationevent.NavigationEventHandler
    protected void onBackCompleted() {
        this.onTransitionStateChanged.invoke(getTransitionState());
        this.currentOnBackCompleted.invoke();
    }

    @Override // androidx.navigationevent.NavigationEventHandler
    protected void onBackProgressed(NavigationEvent navigationEvent) {
        this.onTransitionStateChanged.invoke(getTransitionState());
    }

    @Override // androidx.navigationevent.NavigationEventHandler
    protected void onBackStarted(NavigationEvent navigationEvent) {
        this.onTransitionStateChanged.invoke(getTransitionState());
    }

    @Override // androidx.navigationevent.NavigationEventHandler
    protected void onForwardCancelled() {
        this.onTransitionStateChanged.invoke(getTransitionState());
        this.currentOnForwardCancelled.invoke();
    }

    @Override // androidx.navigationevent.NavigationEventHandler
    protected void onForwardCompleted() {
        this.onTransitionStateChanged.invoke(getTransitionState());
        this.currentOnForwardCompleted.invoke();
    }

    @Override // androidx.navigationevent.NavigationEventHandler
    protected void onForwardProgressed(NavigationEvent navigationEvent) {
        this.onTransitionStateChanged.invoke(getTransitionState());
    }

    @Override // androidx.navigationevent.NavigationEventHandler
    protected void onForwardStarted(NavigationEvent navigationEvent) {
        this.onTransitionStateChanged.invoke(getTransitionState());
    }

    public final void setCurrentOnBackCancelled(a<ab> aVar) {
        this.currentOnBackCancelled = aVar;
    }

    public final void setCurrentOnBackCompleted(a<ab> aVar) {
        this.currentOnBackCompleted = aVar;
    }

    public final void setCurrentOnForwardCancelled(a<ab> aVar) {
        this.currentOnForwardCancelled = aVar;
    }

    public final void setCurrentOnForwardCompleted(a<ab> aVar) {
        this.currentOnForwardCompleted = aVar;
    }

    public /* synthetic */ ComposeNavigationEventHandler(NavigationEventInfo navigationEventInfo, l lVar, int i2, o oVar) {
        this(navigationEventInfo, (i2 & 2) != 0 ? new l() { // from class: androidx.navigationevent.compose.ComposeNavigationEventHandler$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ab.f48028a;
            }
        } : lVar);
    }
}
