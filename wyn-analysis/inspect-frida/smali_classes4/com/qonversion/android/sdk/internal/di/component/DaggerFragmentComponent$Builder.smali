.class public final Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private appComponent:Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

.field private fragmentModule:Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public appComponent(Lcom/qonversion/android/sdk/internal/di/component/AppComponent;)Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;->appComponent:Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    .line 5
    .line 6
    return-object p0
.end method

.method public build()Lcom/qonversion/android/sdk/internal/di/component/FragmentComponent;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;->fragmentModule:Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;

    .line 2
    .line 3
    const-class v1, Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;

    .line 4
    .line 5
    invoke-static {v1, v0}, Lka/e0;->h(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;->appComponent:Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    .line 9
    .line 10
    const-class v1, Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    .line 11
    .line 12
    invoke-static {v1, v0}, Lka/e0;->h(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;->fragmentModule:Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;

    .line 18
    .line 19
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;->appComponent:Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-direct {v0, v1, v2, v3}, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent;-><init>(Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;Lcom/qonversion/android/sdk/internal/di/component/AppComponent;I)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public fragmentModule(Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;)Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;->fragmentModule:Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;

    .line 5
    .line 6
    return-object p0
.end method
