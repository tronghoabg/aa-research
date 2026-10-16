.class public final Lx6/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Z


# direct methods
.method public constructor <init>(LD6/r1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-boolean v0, p1, LD6/r1;->a:Z

    iput-boolean v0, p0, Lx6/w;->a:Z

    iget-boolean v0, p1, LD6/r1;->b:Z

    iput-boolean v0, p0, Lx6/w;->b:Z

    iget-boolean p1, p1, LD6/r1;->c:Z

    iput-boolean p1, p0, Lx6/w;->c:Z

    return-void
.end method

.method public synthetic constructor <init>(LE4/j;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-boolean v0, p1, LE4/j;->a:Z

    .line 3
    iput-boolean v0, p0, Lx6/w;->a:Z

    .line 4
    iget-boolean v0, p1, LE4/j;->b:Z

    .line 5
    iput-boolean v0, p0, Lx6/w;->b:Z

    .line 6
    iget-boolean p1, p1, LE4/j;->c:Z

    .line 7
    iput-boolean p1, p0, Lx6/w;->c:Z

    return-void
.end method
