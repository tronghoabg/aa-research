.class public final Lz5/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv5/b;


# instance fields
.field public final a:Ldf/a;

.field public final b:Ldf/a;

.field public final c:Lt5/s;

.field public final d:Ldf/a;


# direct methods
.method public constructor <init>(Ldf/a;Ldf/a;Lt5/s;Ldf/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz5/i;->a:Ldf/a;

    .line 5
    .line 6
    iput-object p2, p0, Lz5/i;->b:Ldf/a;

    .line 7
    .line 8
    iput-object p3, p0, Lz5/i;->c:Lt5/s;

    .line 9
    .line 10
    iput-object p4, p0, Lz5/i;->d:Ldf/a;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lz5/i;->a:Ldf/a;

    .line 2
    .line 3
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 8
    .line 9
    iget-object v1, p0, Lz5/i;->b:Ldf/a;

    .line 10
    .line 11
    invoke-interface {v1}, Ldf/a;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, LA5/d;

    .line 16
    .line 17
    iget-object v2, p0, Lz5/i;->c:Lt5/s;

    .line 18
    .line 19
    invoke-virtual {v2}, Lt5/s;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lz5/c;

    .line 24
    .line 25
    iget-object v3, p0, Lz5/i;->d:Ldf/a;

    .line 26
    .line 27
    invoke-interface {v3}, Ldf/a;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, LB5/c;

    .line 32
    .line 33
    new-instance v4, Lz5/h;

    .line 34
    .line 35
    invoke-direct {v4, v0, v1, v2, v3}, Lz5/h;-><init>(Ljava/util/concurrent/Executor;LA5/d;Lz5/c;LB5/c;)V

    .line 36
    .line 37
    .line 38
    return-object v4
.end method
