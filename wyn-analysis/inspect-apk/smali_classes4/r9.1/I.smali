.class public final Lr9/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/database/sqlite/SQLiteTransactionListener;


# instance fields
.field public final synthetic a:Lr9/K;


# direct methods
.method public constructor <init>(Lr9/K;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr9/I;->a:Lr9/K;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onBegin()V
    .locals 1

    .line 1
    iget-object v0, p0, Lr9/I;->a:Lr9/K;

    .line 2
    .line 3
    iget-object v0, v0, Lr9/K;->j:LA7/c0;

    .line 4
    .line 5
    invoke-virtual {v0}, LA7/c0;->j()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onCommit()V
    .locals 1

    .line 1
    iget-object v0, p0, Lr9/I;->a:Lr9/K;

    .line 2
    .line 3
    iget-object v0, v0, Lr9/K;->j:LA7/c0;

    .line 4
    .line 5
    invoke-virtual {v0}, LA7/c0;->i()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onRollback()V
    .locals 0

    .line 1
    return-void
.end method
