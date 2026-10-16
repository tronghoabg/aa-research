.class public final LVa/Q7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/va;


# instance fields
.field public synthetic a:Ljava/util/ArrayList;

.field public synthetic b:LVa/r8;

.field public synthetic c:LVa/x8;

.field public synthetic d:LVa/y7;


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    iget-object v0, p0, LVa/Q7;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iget-object v2, p0, LVa/Q7;->c:LVa/x8;

    .line 8
    .line 9
    iget-object v3, p0, LVa/Q7;->d:LVa/y7;

    .line 10
    .line 11
    iget-object v4, p0, LVa/Q7;->b:LVa/r8;

    .line 12
    .line 13
    invoke-virtual {v4, v2, v3, v0}, LVa/r8;->c(LVa/x8;LVa/y7;Ljava/util/List;)LVa/s8;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-void
.end method
