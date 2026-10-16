.class public final Lf8/f;
.super Lc8/f;
.source "SourceFile"


# instance fields
.field public final q:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Lc8/k;Landroid/graphics/RectF;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lc8/f;-><init>(Lc8/k;)V

    .line 2
    iput-object p2, p0, Lf8/f;->q:Landroid/graphics/RectF;

    return-void
.end method

.method public constructor <init>(Lf8/f;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lc8/f;-><init>(Lc8/f;)V

    .line 4
    iget-object p1, p1, Lf8/f;->q:Landroid/graphics/RectF;

    iput-object p1, p0, Lf8/f;->q:Landroid/graphics/RectF;

    return-void
.end method


# virtual methods
.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    new-instance v0, Lf8/g;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lc8/g;-><init>(Lc8/f;)V

    .line 4
    .line 5
    .line 6
    iput-object p0, v0, Lf8/g;->x:Lf8/f;

    .line 7
    .line 8
    invoke-virtual {v0}, Lc8/g;->invalidateSelf()V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
