.class public final LI/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lz0/b;

.field public final b:Lz0/p;

.field public final c:I

.field public final d:Z

.field public final e:I

.field public final f:LL0/b;

.field public final g:LE0/e;

.field public h:LVa/Y7;

.field public i:LL0/i;


# direct methods
.method public constructor <init>(Lz0/b;Lz0/p;IZILL0/b;LE0/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LI/j;->a:Lz0/b;

    .line 5
    .line 6
    iput-object p2, p0, LI/j;->b:Lz0/p;

    .line 7
    .line 8
    iput p3, p0, LI/j;->c:I

    .line 9
    .line 10
    iput-boolean p4, p0, LI/j;->d:Z

    .line 11
    .line 12
    iput p5, p0, LI/j;->e:I

    .line 13
    .line 14
    iput-object p6, p0, LI/j;->f:LL0/b;

    .line 15
    .line 16
    iput-object p7, p0, LI/j;->g:LE0/e;

    .line 17
    .line 18
    if-lez p3, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string p2, "Check failed."

    .line 24
    .line 25
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1
.end method
