.class public final Lx0/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lt0/t;


# direct methods
.method public constructor <init>(Lt0/t;)V
    .locals 1

    .line 1
    const-string v0, "rootNode"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lx0/l;->a:Lt0/t;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()Lx0/k;
    .locals 3

    .line 1
    new-instance v0, Lx0/k;

    .line 2
    .line 3
    iget-object v1, p0, Lx0/l;->a:Lt0/t;

    .line 4
    .line 5
    invoke-static {v1}, LS3/f;->v(Lt0/t;)Lx0/h;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v0, v1, v2}, Lx0/k;-><init>(Lx0/h;Z)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method
