.class public final Lu0/N0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lu0/N0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lu0/N0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lu0/N0;->a:Lu0/N0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lu0/n;)V
    .locals 1
    .param p1    # Lu0/n;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "ownerView"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {v0, p1, p1}, Lorg/apache/tika/utils/a;->r(Landroid/view/ViewParent;Lu0/n;Lu0/n;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method
