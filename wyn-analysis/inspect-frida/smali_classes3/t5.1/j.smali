.class public final Lt5/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public a:Ldf/a;

.field public b:LA5/e;

.field public c:Ldf/a;

.field public d:LA5/e;

.field public e:Ldf/a;

.field public f:Ldf/a;


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lt5/j;->e:Ldf/a;

    .line 2
    .line 3
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LA5/d;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    .line 10
    .line 11
    .line 12
    return-void
.end method
