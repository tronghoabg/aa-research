.class public final LC8/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/internal/c;


# instance fields
.field public final synthetic a:LC8/h;

.field public final synthetic b:LC8/n;


# direct methods
.method public constructor <init>(LC8/n;LC8/h;Lza/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LC8/m;->b:LC8/n;

    .line 5
    .line 6
    iput-object p2, p0, LC8/m;->a:LC8/h;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, LC8/m;->b:LC8/n;

    .line 2
    .line 3
    iput-boolean p1, v0, LC8/n;->c:Z

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, LC8/m;->a:LC8/h;

    .line 8
    .line 9
    invoke-virtual {p1}, LC8/h;->a()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object p1, p0, LC8/m;->b:LC8/n;

    .line 14
    .line 15
    invoke-virtual {p1}, LC8/n;->b()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    iget-object p1, p0, LC8/m;->a:LC8/h;

    .line 22
    .line 23
    iget-object v0, p0, LC8/m;->b:LC8/n;

    .line 24
    .line 25
    iget-wide v0, v0, LC8/n;->e:J

    .line 26
    .line 27
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 28
    .line 29
    .line 30
    move-result-wide v2

    .line 31
    sub-long/2addr v0, v2

    .line 32
    invoke-virtual {p1, v0, v1}, LC8/h;->b(J)V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void
.end method
