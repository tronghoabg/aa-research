.class public abstract Lda/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lj9/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lj9/d;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lda/a;->a:Lda/a;

    .line 7
    .line 8
    const-class v2, Lda/e;

    .line 9
    .line 10
    invoke-interface {v0, v2, v1}, Li9/b;->registerEncoder(Ljava/lang/Class;Lh9/e;)Li9/b;

    .line 11
    .line 12
    .line 13
    const-class v2, Lda/c;

    .line 14
    .line 15
    invoke-interface {v0, v2, v1}, Li9/b;->registerEncoder(Ljava/lang/Class;Lh9/e;)Li9/b;

    .line 16
    .line 17
    .line 18
    return-void
.end method
