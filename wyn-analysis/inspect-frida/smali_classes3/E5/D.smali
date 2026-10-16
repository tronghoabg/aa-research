.class public final synthetic LE5/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu6/g;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LE5/D;->a:I

    iput-boolean p2, p0, LE5/D;->b:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, LE5/u0;

    .line 2
    .line 3
    iget v0, p0, LE5/D;->a:I

    .line 4
    .line 5
    iget-boolean v1, p0, LE5/D;->b:Z

    .line 6
    .line 7
    invoke-interface {p1, v0, v1}, LE5/u0;->t(IZ)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
