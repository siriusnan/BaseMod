package basemod.abstracts; 

import com.megacrit.cardcrawl.potions.AbstractPotion; 

public abstract class CustomPotion extends AbstractPotion{ 
	@Deprecated
	public CustomPotion(String name, String id, PotionSize size) {
		super(name, id, PotionRarity.COMMON, size, PotionColor.GREEN);
	}

	public CustomPotion(String name, String id, PotionRarity rarity, PotionSize size, PotionColor color) {
		super(name, id, rarity, size, color);
	}
} 