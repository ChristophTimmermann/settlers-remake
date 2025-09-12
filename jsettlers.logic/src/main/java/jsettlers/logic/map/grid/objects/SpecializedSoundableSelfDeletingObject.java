package jsettlers.logic.map.grid.objects;

import jsettlers.common.mapobject.EMapObjectType;
import jsettlers.common.mapobject.ISpecializedMapObject;
import jsettlers.common.position.ShortPoint2D;
import jsettlers.common.sound.ESoundType;
import jsettlers.logic.objects.SoundableSelfDeletingObject;
import jsettlers.logic.player.Player;

class SpecializedSoundableSelfDeletingObject extends SoundableSelfDeletingObject implements ISpecializedMapObject {

	private static final long serialVersionUID = 5929232729004964265L;
    
	private final ESoundType sound;
	private int animation;

	public SpecializedSoundableSelfDeletingObject(ShortPoint2D point, ESoundType sound, int animation, float duration, Player player) {
		super(point, EMapObjectType.SPELL_EFFECT, duration, player);
		this.animation = animation;
		this.sound = sound;
	}

	public ESoundType getSound() {
		return sound;
	}

	public int getAnimation() {
		return animation;
	}
}
