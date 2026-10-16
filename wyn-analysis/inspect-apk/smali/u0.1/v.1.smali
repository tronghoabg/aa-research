.class public final Lu0/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lu0/v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lu0/v;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lu0/v;->a:Lu0/v;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;IZ)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p2, p1}, Lorg/apache/tika/utils/a;->o(ILandroid/view/View;)V

    .line 7
    .line 8
    .line 9
    invoke-static {p1, p3}, Lorg/apache/tika/utils/a;->q(Landroid/view/View;Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
