.class public final Luc/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Luc/f;

.field public final b:Ljava/lang/String;

.field public final c:Luc/s;


# direct methods
.method public constructor <init>(Luc/f;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Luc/x;->b:Luc/x;

    invoke-direct {p0, p1, p2, v0}, Luc/j;-><init>(Luc/f;Ljava/lang/String;Luc/s;)V

    return-void
.end method

.method public constructor <init>(Luc/f;Ljava/lang/String;Luc/s;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Luc/j;->a:Luc/f;

    .line 4
    iput-object p2, p0, Luc/j;->b:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Luc/j;->c:Luc/s;

    return-void
.end method


# virtual methods
.method public final a(Luc/i;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    new-instance v0, Lne/a;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p0, v0, Lne/a;->c:Ljava/lang/Object;

    .line 11
    .line 12
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iput-object v1, v0, Lne/a;->b:Ljava/lang/Object;

    .line 19
    .line 20
    iput-object p1, v0, Lne/a;->a:Ljava/lang/Object;

    .line 21
    .line 22
    move-object p1, v0

    .line 23
    :goto_0
    iget-object v0, p0, Luc/j;->a:Luc/f;

    .line 24
    .line 25
    iget-object v1, p0, Luc/j;->b:Ljava/lang/String;

    .line 26
    .line 27
    invoke-interface {v0, v1, p1}, Luc/f;->l(Ljava/lang/String;Luc/d;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method
