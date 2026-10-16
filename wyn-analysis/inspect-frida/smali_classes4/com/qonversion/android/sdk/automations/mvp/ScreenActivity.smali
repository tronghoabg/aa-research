.class public final Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;
.super Landroidx/fragment/app/FragmentActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u0019\u0010\u0008\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u0003J-\u0010\u0012\u001a\u00020\u00042\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000eH\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u000eH\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168BX\u0082\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0019\u0010\u0003\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;",
        "Landroidx/fragment/app/FragmentActivity;",
        "<init>",
        "()V",
        "Lef/C;",
        "playCloseAnimation",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "finish",
        "",
        "screenId",
        "htmlPage",
        "",
        "addToBackStack",
        "showScreen$sdk_release",
        "(Ljava/lang/String;Ljava/lang/String;Z)V",
        "showScreen",
        "goBack$sdk_release",
        "()Z",
        "goBack",
        "Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;",
        "getPresentationStyle",
        "()Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;",
        "getPresentationStyle$annotations",
        "presentationStyle",
        "Companion",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final INTENT_HTML_PAGE:Ljava/lang/String; = "htmlPage"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final INTENT_SCREEN_ID:Ljava/lang/String; = "screenId"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final INTENT_SCREEN_PRESENTATION_STYLE:Ljava/lang/String; = "screenPresentationStyle"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;->Companion:Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    sget v0, Lcom/qonversion/android/sdk/R$layout;->q_activity_screen:I

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroidx/fragment/app/FragmentActivity;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final getPresentationStyle()Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "screenPresentationStyle"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    instance-of v1, v0, Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    check-cast v0, Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return-object v0
.end method

.method private static synthetic getPresentationStyle$annotations()V
    .locals 0

    return-void
.end method

.method private final playCloseAnimation()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;->getPresentationStyle()Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/qonversion/android/sdk/automations/internal/UtilsKt;->getScreenTransactionAnimations(Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;)Lef/k;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v1, v0, Lef/k;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Ljava/lang/Number;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget-object v0, v0, Lef/k;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/lang/Number;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public static synthetic showScreen$sdk_release$default(Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x1

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;->showScreen$sdk_release(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public finish()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;->playCloseAnimation()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final goBack$sdk_release()Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, Landroidx/fragment/app/e0;->d:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget-object v0, v0, Landroidx/fragment/app/e0;->h:Landroidx/fragment/app/a;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    move v0, v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v0, v3

    .line 20
    :goto_0
    add-int/2addr v1, v0

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move v2, v3

    .line 25
    :goto_1
    if-eqz v2, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;->finish()V

    .line 28
    .line 29
    .line 30
    return v2

    .line 31
    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/e0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    new-instance v1, Landroidx/fragment/app/c0;

    .line 39
    .line 40
    const/4 v4, -0x1

    .line 41
    invoke-direct {v1, v0, v4, v3}, Landroidx/fragment/app/c0;-><init>(Landroidx/fragment/app/e0;II)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1, v3}, Landroidx/fragment/app/e0;->x(Landroidx/fragment/app/b0;Z)V

    .line 45
    .line 46
    .line 47
    return v2
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v0, "screenId"

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "htmlPage"

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-virtual {p0, p1, v0, v1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;->showScreen$sdk_release(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public final showScreen$sdk_release(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    sget-object v0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->Companion:Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$Companion;->getArguments(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance p2, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;

    .line 8
    .line 9
    invoke-direct {p2}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2, p1}, Landroidx/fragment/app/F;->setArguments(Landroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/e0;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    new-instance v0, Landroidx/fragment/app/a;

    .line 23
    .line 24
    invoke-direct {v0, p1}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/e0;)V

    .line 25
    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    if-eqz p3, :cond_1

    .line 29
    .line 30
    sget p3, Lcom/qonversion/android/sdk/R$anim;->q_slide_in_from_left:I

    .line 31
    .line 32
    sget v1, Lcom/qonversion/android/sdk/R$anim;->q_fade_out:I

    .line 33
    .line 34
    sget v2, Lcom/qonversion/android/sdk/R$anim;->q_fade_in:I

    .line 35
    .line 36
    sget v3, Lcom/qonversion/android/sdk/R$anim;->q_slide_out_to_left:I

    .line 37
    .line 38
    iput p3, v0, Landroidx/fragment/app/a;->b:I

    .line 39
    .line 40
    iput v1, v0, Landroidx/fragment/app/a;->c:I

    .line 41
    .line 42
    iput v2, v0, Landroidx/fragment/app/a;->d:I

    .line 43
    .line 44
    iput v3, v0, Landroidx/fragment/app/a;->e:I

    .line 45
    .line 46
    iget-boolean p3, v0, Landroidx/fragment/app/a;->h:Z

    .line 47
    .line 48
    if-eqz p3, :cond_0

    .line 49
    .line 50
    const/4 p3, 0x1

    .line 51
    iput-boolean p3, v0, Landroidx/fragment/app/a;->g:Z

    .line 52
    .line 53
    iput-object p1, v0, Landroidx/fragment/app/a;->i:Ljava/lang/String;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string p2, "This FragmentTransaction is not allowed to be added to the back stack."

    .line 59
    .line 60
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p1

    .line 64
    :cond_1
    :goto_0
    sget p3, Lcom/qonversion/android/sdk/R$id;->fragment_container_view:I

    .line 65
    .line 66
    if-eqz p3, :cond_2

    .line 67
    .line 68
    const/4 v1, 0x2

    .line 69
    invoke-virtual {v0, p3, p2, p1, v1}, Landroidx/fragment/app/a;->e(ILandroidx/fragment/app/F;Ljava/lang/String;I)V

    .line 70
    .line 71
    .line 72
    const/4 p1, 0x0

    .line 73
    invoke-virtual {v0, p1}, Landroidx/fragment/app/a;->d(Z)I

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 78
    .line 79
    const-string p2, "Must use non-zero containerViewId"

    .line 80
    .line 81
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw p1
.end method
